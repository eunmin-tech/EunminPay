package io.eunmin.pay.membership.domain.input

import io.eunmin.pay.common.usecase.Usecase
import io.eunmin.pay.membership.domain.model.query.MemberQuery
import java.lang.reflect.Member

abstract class FindMemberByIdUsecase: Usecase<MemberQuery.FindById, Member>()