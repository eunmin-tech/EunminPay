package io.eunmin.pay.application.member.mapper

import io.eunmin.pay.application.member.model.request.RegisterMemberRequest
import io.eunmin.pay.application.member.model.response.MemberResponse
import io.eunmin.pay.domain.member.model.Member
import io.eunmin.pay.domain.member.model.command.MemberCommand
import io.eunmin.pay.domain.member.model.query.MemberQuery

fun makeFindByIdQuery(memberId: Long): MemberQuery.FindById = MemberQuery.FindById(memberId)

fun RegisterMemberRequest.toCommand() = MemberCommand.Register(username, password, name, email, address, isCorp)

fun Member.toResponse() = MemberResponse(memberId, username, name, email, isDelete, createdAt, updatedAt, deletedAt)