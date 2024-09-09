package io.eunmin.pay.domain.member.model.command

sealed interface MemberCommand {
    data class Register(
        val username: String,
        val password: String,
        val name: String,
        val email: String,
        val address: String,
        val isCorp: Boolean,
    ): MemberCommand
}