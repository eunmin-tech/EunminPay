package io.eunmin.pay.membership.domain.model.query

sealed interface MemberQuery {
    data class FindById(val memberId: Long): MemberQuery
}