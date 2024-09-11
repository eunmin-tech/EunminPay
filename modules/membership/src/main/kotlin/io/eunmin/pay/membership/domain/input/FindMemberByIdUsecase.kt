package io.eunmin.pay.membership.domain.input

import io.eunmin.pay.common.usecase.Usecase
import io.eunmin.pay.membership.domain.model.Member
import io.eunmin.pay.membership.domain.model.query.MemberQuery

abstract class FindMemberByIdUsecase: Usecase<MemberQuery.FindById, Member>()