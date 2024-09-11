package io.eunmin.pay.membership.domain.usecase

import io.eunmin.pay.common.annotation.Usecase
import io.eunmin.pay.common.error.NotFoundException
import io.eunmin.pay.common.error.enums.ErrorCode
import io.eunmin.pay.membership.domain.input.FindMemberByIdUsecase
import io.eunmin.pay.membership.domain.model.Member
import io.eunmin.pay.membership.domain.model.query.MemberQuery
import io.eunmin.pay.membership.domain.output.MemberPort

@Usecase
internal class FindByMemberByIdUsecaseImpl(
    private val memberPort: MemberPort
): FindMemberByIdUsecase() {
    override suspend fun execute(params: MemberQuery.FindById): Member =
        memberPort.findMemberById(params)?: throw NotFoundException(ErrorCode.MEMBER_NOT_FOUND)
}