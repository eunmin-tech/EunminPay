package io.eunmin.pay.application.member.model.request

data class RegisterMemberRequest(
    val username: String,
    val password: String,
    val name: String,
    val email: String
)
