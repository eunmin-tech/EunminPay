package io.eunmin.pay.member.application.mapper

import io.eunmin.pay.member.application.dto.request.RegisterMemberRequest
import io.eunmin.pay.member.application.dto.response.MemberResponse
import io.eunmin.pay.member.domain.model.Member
import io.eunmin.pay.member.domain.model.command.MemberCommand
import io.eunmin.pay.member.domain.model.query.MemberQuery

internal fun makeFindByIdQuery(memberId: Long): MemberQuery.FindById = MemberQuery.FindById(memberId)
internal fun RegisterMemberRequest.toCommand() = MemberCommand.Register(username, password, name, email)
internal fun Member.toResponse() = MemberResponse(memberId, username, name, email, isDelete, createdAt, updatedAt, deletedAt)