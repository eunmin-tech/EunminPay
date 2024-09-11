package io.eunmin.pay.membership.domain.usecase

import io.eunmin.pay.common.annotation.Usecase
import io.eunmin.pay.membership.domain.input.RegisterMemberUsecase
import io.eunmin.pay.membership.domain.model.Member
import io.eunmin.pay.membership.domain.model.command.MemberCommand
import io.eunmin.pay.membership.domain.output.MemberPort

@Usecase
internal class RegisterMemberUsecaseImpl(
    private val memberPort: MemberPort
): RegisterMemberUsecase() {
    override suspend fun execute(params: MemberCommand.Register): Member = memberPort.create(params)
}