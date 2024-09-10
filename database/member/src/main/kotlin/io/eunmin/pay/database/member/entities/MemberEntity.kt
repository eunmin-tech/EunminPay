package io.eunmin.pay.database.member.entities

import io.eunmin.pay.database.member.entities.base.BaseEntity
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
}
