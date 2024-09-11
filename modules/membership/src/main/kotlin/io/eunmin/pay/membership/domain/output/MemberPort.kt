package io.eunmin.pay.membership.domain.output

import io.eunmin.pay.membership.domain.model.Member
import io.eunmin.pay.membership.domain.model.command.MemberCommand
import io.eunmin.pay.membership.domain.model.query.MemberQuery


interface MemberPort {
    suspend fun findMemberById(request: MemberQuery.FindById): Member?
    suspend fun create(member: MemberCommand.Register): Member
}