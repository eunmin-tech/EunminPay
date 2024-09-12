package io.eunmin.pay.member.application.query.dto.response

import java.time.LocalDateTime

internal data class MemberResponse(
    val memberId: Long,
    val username: String,
    val name: String,
    val email: String,
    val isDelete: Boolean,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val deletedAt: LocalDateTime?
)