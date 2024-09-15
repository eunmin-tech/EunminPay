package io.eunmin.pay.member.domain.model.command

import io.eunmin.pay.common.pattern.Patterns

sealed interface MemberCommand {
    data class Register(
        val username: String,
        val password: String,
        val name: String,
        val email: String
    ): MemberCommand {
        init {
            require(username.isNotBlank()) { "Username must not be blank" }
            require(password.isNotBlank()) { "Password must not be blank" }
            require(Patterns.PASSWORD.matcher(password).matches()) { "Password must match Password" }
            require(name.isNotBlank()) { "Name must not be blank" }
            require(email.isNotBlank()) { "Email must not be blank" }
            require(Patterns.EMAIL.matcher(email).matches()) { "Email must match Email" }
        }
    }

    data class Update(
        val id: Long,
        val username: String,
        val name: String,
        val email: String
    ): MemberCommand {
        init {
            require(username.isNotBlank()) { "Username must not be blank" }
            require(name.isNotBlank()) { "Name must not be blank" }
            require(email.isNotBlank()) { "Email must not be blank" }
            require(Patterns.EMAIL.matcher(email).matches()) { "Email must match Email" }
        }
    }

    data class UpdatePassword(
        val id: Long,
        val oldPassword: String,
        val newPassword: String
    ): MemberCommand {
        init {
            require(oldPassword.isNotBlank()) { "Password must not be blank" }
            require(newPassword.isNotBlank()) { "Password must not be blank" }
            require(Patterns.PASSWORD.matcher(newPassword).matches()) { "Password must match Password" }
        }
    }

    data class Delete(val id: Long): MemberCommand
}