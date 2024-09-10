package io.eunmin.pay.application.member.model.request

internal data class RegisterMemberRequest(
    val username: String,
    val password: String,
    val name: String,
    val email: String,
    val address: String,
    val isCorp: Boolean
)
