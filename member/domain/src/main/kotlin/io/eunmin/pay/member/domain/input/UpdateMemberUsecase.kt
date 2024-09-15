package io.eunmin.pay.member.domain.input

import io.eunmin.pay.common.usecase.Usecase
import io.eunmin.pay.member.domain.model.Member
import io.eunmin.pay.member.domain.model.command.MemberCommand

abstract class UpdateMemberUsecase: Usecase<MemberCommand.Update, Member>()