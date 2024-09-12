package io.eunmin.pay.member.domain.usecase

import io.eunmin.pay.common.annotation.Usecase
import io.eunmin.pay.member.domain.input.RegisterMemberUsecase
import io.eunmin.pay.member.domain.model.Member
import io.eunmin.pay.member.domain.model.command.MemberCommand
import io.eunmin.pay.member.domain.output.MemberPort

@Usecase
internal class RegisterMemberUsecaseImpl(
    private val memberPort: MemberPort
): RegisterMemberUsecase() {
    override suspend fun execute(params: MemberCommand.Register): Member = memberPort.create(params)
}