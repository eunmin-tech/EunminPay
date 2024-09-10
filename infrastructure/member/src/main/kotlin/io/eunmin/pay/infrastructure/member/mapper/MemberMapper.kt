package io.eunmin.pay.infrastructure.member.mapper

import io.eunmin.pay.database.member.entities.MemberEntity
import io.eunmin.pay.domain.member.model.Member
import io.eunmin.pay.domain.member.model.command.MemberCommand

internal fun MemberCommand.Register.toCreateEntity() = MemberEntity.create(username, password, name, email)

internal fun MemberEntity.toMember(): Member = Member(id!!, username, name, email, createdAt, updatedAt, deletedAt)