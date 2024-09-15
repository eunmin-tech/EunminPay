package io.eunmin.pay.member.database.entity

import io.eunmin.pay.member.database.entity.base.BaseEntity
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table(name = "member")
data class MemberEntity(
    val username: String,
    val password: String,
    val name: String,
    val email: String,
    val deletedAt: LocalDateTime?,
    @Id val id: Long? = null,
): BaseEntity() {
    companion object {
        fun create(username: String, password: String, name: String, email: String): MemberEntity =
            MemberEntity(username, password, name, email, null, null)
    }

    fun update(username: String, name: String, email: String): MemberEntity =
        copy(username = username, name = name, email = email)

    fun updatePassword(password: String): MemberEntity =
        copy(password = password)
}
