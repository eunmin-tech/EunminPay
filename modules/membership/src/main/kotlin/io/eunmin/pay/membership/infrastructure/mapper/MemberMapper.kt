package io.eunmin.pay.membership.infrastructure.mapper

import io.eunmin.pay.membership.database.entity.MemberEntity
import io.eunmin.pay.membership.domain.model.Member
import io.eunmin.pay.membership.domain.model.command.MemberCommand

internal fun MemberCommand.Register.toCreateEntity() = MemberEntity.create(username, password, name, email)

internal fun MemberEntity.toMember(): Member = Member(id!!, username, name, email, createdAt, updatedAt, deletedAt)