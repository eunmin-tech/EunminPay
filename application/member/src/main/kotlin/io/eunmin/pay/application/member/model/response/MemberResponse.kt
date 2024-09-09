package io.eunmin.pay.application.member.model.response

import java.time.LocalDateTime

data class MemberResponse(
    val memberId: Long,
    val username: String,
    val name: String,
    val email: String,
    val isDelete: Boolean,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val deletedAt: LocalDateTime?
)