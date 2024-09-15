package io.eunmin.pay.member.domain.usecase

import io.eunmin.pay.common.annotation.Usecase
import io.eunmin.pay.member.domain.input.UpdateMemberUsecase
import io.eunmin.pay.member.domain.model.Member
import io.eunmin.pay.member.domain.model.command.MemberCommand
import io.eunmin.pay.member.domain.output.MemberPort

@Usecase
class UpdateMemberUsecaseImpl(
    private val memberPort: MemberPort
): UpdateMemberUsecase() {
    override suspend fun execute(params: MemberCommand.Update): Member = memberPort.update(params)
}