package io.eunmin.pay.domain.member.output

import io.eunmin.pay.domain.member.model.Member
import io.eunmin.pay.domain.member.model.command.MemberCommand
import io.eunmin.pay.domain.member.model.query.MemberQuery

interface MemberPort {
    suspend fun findMembers(request: MemberQuery.Find): List<Member>
    suspend fun findMemberById(request: MemberQuery.FindById): Member?

    suspend fun create(member: MemberCommand.Register): Member
}