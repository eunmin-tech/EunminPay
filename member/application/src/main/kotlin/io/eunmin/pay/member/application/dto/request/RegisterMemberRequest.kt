package io.eunmin.pay.member.application.dto.request

internal data class RegisterMemberRequest(
    val username: String,
    val password: String,
    val name: String,
    val email: String
)
