package io.eunmin.pay.member.application.query.mapper

import io.eunmin.pay.member.application.query.dto.response.MemberResponse
import io.eunmin.pay.member.domain.model.Member
import io.eunmin.pay.member.domain.model.query.MemberQuery

fun makeFindByIdQuery(memberId: Long): MemberQuery.FindById = MemberQuery.FindById(memberId)
internal fun Member.toResponse() = MemberResponse(memberId, username, name, email, isDelete, createdAt, updatedAt, deletedAt)