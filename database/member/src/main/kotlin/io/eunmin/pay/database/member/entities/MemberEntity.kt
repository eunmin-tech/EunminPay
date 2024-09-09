package io.eunmin.pay.database.member.entities

import io.eunmin.pay.database.member.entities.base.BaseEntity
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table(name = "member")
data class MemberEntity(
    @Id val id: Long,
    val username: String,
    val password: String,
    val name: String,
    val email: String,
    val deletedAt: LocalDateTime?
): BaseEntity()
