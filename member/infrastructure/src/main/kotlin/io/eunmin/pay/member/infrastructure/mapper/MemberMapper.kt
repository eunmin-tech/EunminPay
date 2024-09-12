package io.eunmin.pay.member.infrastructure.mapper

import io.eunmin.pay.member.database.entity.MemberEntity
import io.eunmin.pay.member.domain.model.Member
import io.eunmin.pay.member.domain.model.command.MemberCommand

internal fun MemberCommand.Register.toCreateEntity() = MemberEntity.create(username, password, name, email)

internal fun MemberEntity.toMember(): Member = Member(id!!, username, name, email, createdAt, updatedAt, deletedAt)