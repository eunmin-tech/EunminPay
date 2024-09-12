package io.eunmin.pay.member.domain.model.query

sealed interface MemberQuery {
    data class FindById(val memberId: Long): MemberQuery
}