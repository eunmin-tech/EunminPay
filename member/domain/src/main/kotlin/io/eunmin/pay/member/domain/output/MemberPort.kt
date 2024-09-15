package io.eunmin.pay.member.domain.output

import io.eunmin.pay.member.domain.model.Member
import io.eunmin.pay.member.domain.model.command.MemberCommand
import io.eunmin.pay.member.domain.model.query.MemberQuery

interface MemberPort {
    suspend fun findMemberById(query: MemberQuery.FindById): Member
    suspend fun create(command: MemberCommand.Register): Member
    suspend fun update(command: MemberCommand.Update): Member
    suspend fun updatePassword(command: MemberCommand.UpdatePassword): Member
    suspend fun delete(command: MemberCommand.Delete)
}