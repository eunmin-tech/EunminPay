package io.eunmin.pay.domain.member.model

import java.time.LocalDateTime

data class Member(
    val memberId: Long,
    val username: String,
    val name: String,
    val email: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val deletedAt: LocalDateTime?
) {
    val isDelete: Boolean = deletedAt != null
}