package io.eunmin.pay.application.member.controller

import io.eunmin.pay.application.member.mapper.toCommand
import io.eunmin.pay.application.member.mapper.toResponse
import io.eunmin.pay.application.member.model.request.RegisterMemberRequest
import io.eunmin.pay.application.member.model.response.MemberResponse
import io.eunmin.pay.application.member.model.response.base.BaseResponse
import io.eunmin.pay.domain.member.input.RegisterMemberUsecase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/members")
internal class MemberController(
    private val registerMemberUsecase: RegisterMemberUsecase
) {
//    @GetMapping("/{memberId}")
//    suspend fun findMemberById(@PathVariable("memberId") memberId: String): ResponseEntity<BaseResponse<MemberResponse>> {
//
//    }

    @PostMapping
    suspend fun create(@RequestBody member: RegisterMemberRequest): ResponseEntity<BaseResponse<MemberResponse>> =
        ResponseEntity.ok(BaseResponse.success(
            registerMemberUsecase(member.toCommand()).toResponse()
        ))
}