package io.eunmin.pay.domain.member.usecase

import io.eunmin.pay.common.Usecase
import io.eunmin.pay.domain.base.error.NotFoundException
import io.eunmin.pay.domain.base.error.enums.ErrorCode
import io.eunmin.pay.domain.member.input.FindMemberByIdUsecase
import io.eunmin.pay.domain.member.model.Member
import io.eunmin.pay.domain.member.model.query.MemberQuery
import io.eunmin.pay.domain.member.output.MemberPort

@Usecase
internal class FindByMemberByIdUsecaseImpl(
    private val memberPort: MemberPort
): FindMemberByIdUsecase() {

    // TODO: Error (Elvis)
    override suspend fun execute(params: MemberQuery.FindById): Member =
        memberPort.findMemberById(params)?: throw NotFoundException(ErrorCode.MEMBER_NOT_FOUND)
}