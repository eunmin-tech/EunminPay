package io.eunmin.pay.infrastructure.member.adapter

import io.eunmin.pay.common.Adapter
import io.eunmin.pay.database.member.repositories.MemberRepository
import io.eunmin.pay.domain.member.model.Member
import io.eunmin.pay.domain.member.model.command.MemberCommand
import io.eunmin.pay.domain.member.model.query.MemberQuery
import io.eunmin.pay.domain.member.output.MemberPort
import io.eunmin.pay.infrastructure.member.mapper.toCreateEntity
import io.eunmin.pay.infrastructure.member.mapper.toMember

@Adapter
internal class MemberAdapter(
    private val memberRepository: MemberRepository
): MemberPort {

    override suspend fun findMemberById(request: MemberQuery.FindById): Member? =
        memberRepository.findById(request.memberId)?.toMember()

    override suspend fun create(member: MemberCommand.Register): Member =
        memberRepository.save(member.toCreateEntity()).toMember()
}