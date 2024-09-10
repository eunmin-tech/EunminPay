package io.eunmin.pay.domain.member.input

import io.eunmin.pay.domain.base.usecase.Usecase
import io.eunmin.pay.domain.member.model.Member
import io.eunmin.pay.domain.member.model.command.MemberCommand

abstract class RegisterMemberUsecase: Usecase<MemberCommand.Register, Member>()