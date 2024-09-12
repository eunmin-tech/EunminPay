package io.eunmin.pay.member.infrastructure.adapter

import io.eunmin.pay.common.annotation.Adapter
import io.eunmin.pay.member.database.repository.MemberRepository
import io.eunmin.pay.member.domain.model.Member
import io.eunmin.pay.member.domain.model.command.MemberCommand
import io.eunmin.pay.member.domain.model.query.MemberQuery
import io.eunmin.pay.member.domain.output.MemberPort
import io.eunmin.pay.member.infrastructure.mapper.toCreateEntity
import io.eunmin.pay.member.infrastructure.mapper.toMember

@Adapter
internal class MemberAdapter(
    private val memberRepository: MemberRepository
): MemberPort {

    override suspend fun findMemberById(request: MemberQuery.FindById): Member? =
        memberRepository.findById(request.memberId)?.toMember()

    override suspend fun create(member: MemberCommand.Register): Member =
        memberRepository.save(member.toCreateEntity()).toMember()
}