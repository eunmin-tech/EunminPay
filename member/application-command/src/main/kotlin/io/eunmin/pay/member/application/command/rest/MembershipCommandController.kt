package io.eunmin.pay.member.application.command.rest

import io.eunmin.pay.member.application.command.dto.request.RegisterMemberRequest
import io.eunmin.pay.member.application.command.dto.response.MemberResponse
import io.eunmin.pay.member.application.command.dto.response.base.BaseResponse
import io.eunmin.pay.member.application.command.mapper.toCommand
import io.eunmin.pay.member.application.command.mapper.toResponse
import io.eunmin.pay.member.domain.input.RegisterMemberUsecase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/member")
internal class memberCommandController(
    private val registerMemberUsecase: RegisterMemberUsecase
) {
    @PostMapping
    suspend fun registerMember(@RequestBody member: RegisterMemberRequest): ResponseEntity<BaseResponse<MemberResponse>> =
        ResponseEntity.ok(BaseResponse.success(registerMemberUsecase(member.toCommand()).toResponse()))
}