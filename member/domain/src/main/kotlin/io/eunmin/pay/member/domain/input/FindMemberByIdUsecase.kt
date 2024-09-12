package io.eunmin.pay.member.domain.input

import io.eunmin.pay.common.usecase.Usecase
import io.eunmin.pay.member.domain.model.Member
import io.eunmin.pay.member.domain.model.query.MemberQuery

abstract class FindMemberByIdUsecase: Usecase<MemberQuery.FindById, Member>()