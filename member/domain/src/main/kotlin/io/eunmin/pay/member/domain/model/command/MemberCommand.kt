package io.eunmin.pay.member.domain.model.command

import io.eunmin.pay.common.pattern.Patterns

sealed interface MemberCommand {
    data class Register(
        val username: String,
        val password: String,
        val name: String,
        val email: String,
        val address: String,
        val isCorp: Boolean,
    ): MemberCommand {
        init {
            require(username.isNotBlank()) { "Username must not be blank" }
            require(password.isNotBlank()) { "Password must not be blank" }
            require(Patterns.PASSWORD.matcher(password).matches()) { "Password must match Password" }
            require(name.isNotBlank()) { "Name must not be blank" }
            require(email.isNotBlank()) { "Email must not be blank" }
            require(Patterns.EMAIL.matcher(email).matches()) { "Email must match Email" }
            require(address.isNotBlank()) { "Address must not be blank" }
        }
    }
}