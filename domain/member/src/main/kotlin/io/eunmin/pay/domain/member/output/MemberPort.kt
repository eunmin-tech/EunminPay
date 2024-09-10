package io.eunmin.pay.domain.member.output

import io.eunmin.pay.domain.member.model.Member
import io.eunmin.pay.domain.member.model.command.MemberCommand
import io.eunmin.pay.domain.member.model.query.MemberQuery
import kotlinx.coroutines.flow.Flow

interface MemberPort {
    suspend fun findMemberById(request: MemberQuery.FindById): Member?

    suspend fun create(member: MemberCommand.Register): Member
}