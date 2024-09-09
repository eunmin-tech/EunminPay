package io.eunmin.pay.database.member.entities.base

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

open class BaseEntity {
    @CreatedDate
    val createdAt: LocalDateTime = LocalDateTime.now()
    @LastModifiedDate
    val updatedAt: LocalDateTime = LocalDateTime.now()
}