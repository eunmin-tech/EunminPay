package io.eunmin.pay.member.infrastructure.adapter

import io.eunmin.pay.common.annotation.Adapter
import io.eunmin.pay.common.error.NotFoundException
import io.eunmin.pay.common.error.enums.ErrorCode
import io.eunmin.pay.member.database.repository.MemberRepository
import io.eunmin.pay.member.domain.model.Member
import io.eunmin.pay.member.domain.model.command.MemberCommand
import io.eunmin.pay.member.domain.model.query.MemberQuery
import io.eunmin.pay.member.domain.output.MemberPort
import io.eunmin.pay.member.infrastructure.mapper.toCreateEntity
import io.eunmin.pay.member.infrastructure.mapper.toMember
import org.springframework.transaction.annotation.Transactional

@Adapter
internal class MemberAdapter(
    private val memberRepository: MemberRepository
): MemberPort {
    @Transactional(readOnly = true)
    override suspend fun findMemberById(query: MemberQuery.FindById): Member = findMemberById(query.memberId).toMember()

    @Transactional
    override suspend fun create(command: MemberCommand.Register): Member =
        memberRepository.save(command.toCreateEntity()).toMember()

    @Transactional
    override suspend fun update(command: MemberCommand.Update): Member {
        val updatedMember = with(command) { findMemberById(id).update(username, name, email) }
        return memberRepository.save(updatedMember).toMember()
    }

    @Transactional
    override suspend fun updatePassword(command: MemberCommand.UpdatePassword): Member {
        val member = findMemberById(command.id)
        if (member.password != command.oldPassword) {
            TODO("Throw Exception")
        }
        val updatedMember = member.updatePassword(command.newPassword)
        return memberRepository.save(updatedMember).toMember()
    }

    @Transactional
    override suspend fun delete(command: MemberCommand.Delete) {
        memberRepository.deleteById(command.id)
    }

    private suspend fun findMemberById(memberId: Long) =
        memberRepository.findById(memberId)?: throw NotFoundException(ErrorCode.MEMBER_NOT_FOUND)
}