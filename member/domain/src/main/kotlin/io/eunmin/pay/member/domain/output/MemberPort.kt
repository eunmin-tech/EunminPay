package io.eunmin.pay.member.domain.output

import io.eunmin.pay.member.domain.model.Member
import io.eunmin.pay.member.domain.model.command.MemberCommand
import io.eunmin.pay.member.domain.model.query.MemberQuery

interface MemberPort {
    suspend fun findMemberById(request: MemberQuery.FindById): Member?
    suspend fun create(member: MemberCommand.Register): Member
}