package io.eunmin.pay.membership.infrastructure.adapter

import io.eunmin.pay.common.annotation.Adapter
import io.eunmin.pay.membership.database.repository.MemberRepository
import io.eunmin.pay.membership.domain.model.Member
import io.eunmin.pay.membership.domain.model.command.MemberCommand
import io.eunmin.pay.membership.domain.model.query.MemberQuery
import io.eunmin.pay.membership.domain.output.MemberPort
import io.eunmin.pay.membership.infrastructure.mapper.toCreateEntity
import io.eunmin.pay.membership.infrastructure.mapper.toMember

@Adapter
internal class MemberAdapter(
    private val memberRepository: MemberRepository
): MemberPort {

    override suspend fun findMemberById(request: MemberQuery.FindById): Member? =
        memberRepository.findById(request.memberId)?.toMember()

    override suspend fun create(member: MemberCommand.Register): Member =
        memberRepository.save(member.toCreateEntity()).toMember()
}