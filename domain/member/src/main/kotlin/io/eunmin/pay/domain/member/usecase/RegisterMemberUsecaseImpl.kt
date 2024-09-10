package io.eunmin.pay.domain.member.usecase

import io.eunmin.pay.common.Usecase
import io.eunmin.pay.domain.member.input.RegisterMemberUsecase
import io.eunmin.pay.domain.member.model.Member
import io.eunmin.pay.domain.member.model.command.MemberCommand
import io.eunmin.pay.domain.member.output.MemberPort

@Usecase
internal class RegisterMemberUsecaseImpl(
    private val memberPort: MemberPort
): RegisterMemberUsecase() {
    override suspend fun execute(params: MemberCommand.Register): Member = memberPort.create(params)
}