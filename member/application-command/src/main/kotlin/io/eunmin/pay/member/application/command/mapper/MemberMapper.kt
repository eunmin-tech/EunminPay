package io.eunmin.pay.member.application.command.mapper

import io.eunmin.pay.member.application.command.dto.request.RegisterMemberRequest
import io.eunmin.pay.member.application.command.dto.response.MemberResponse
import io.eunmin.pay.member.domain.model.Member
import io.eunmin.pay.member.domain.model.command.MemberCommand

internal fun RegisterMemberRequest.toCommand() = MemberCommand.Register(username, password, name, email, address, isCorp)
internal fun Member.toResponse() = MemberResponse(memberId, username, name, email, isDelete, createdAt, updatedAt, deletedAt)