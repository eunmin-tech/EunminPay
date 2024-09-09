package io.eunmin.pay.domain.member.model.query

sealed interface MemberQuery {
    data object Find: MemberQuery
    data class FindById(val memberId: Long): MemberQuery
}