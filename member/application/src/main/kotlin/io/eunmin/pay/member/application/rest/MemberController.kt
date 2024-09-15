package io.eunmin.pay.member.application.rest

import io.eunmin.pay.member.application.dto.request.RegisterMemberRequest
import io.eunmin.pay.member.application.dto.response.MemberResponse
import io.eunmin.pay.member.application.dto.response.base.BaseResponse
import io.eunmin.pay.member.application.mapper.makeFindByIdQuery
import io.eunmin.pay.member.application.mapper.toCommand
import io.eunmin.pay.member.application.mapper.toResponse
import io.eunmin.pay.member.domain.input.FindMemberByIdUsecase
import io.eunmin.pay.member.domain.input.RegisterMemberUsecase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping("/api/v1/members")
internal class MemberController(
    private val findMemberByIdUsecase: FindMemberByIdUsecase,
    private val registerMemberUsecase: RegisterMemberUsecase
) {
    @GetMapping("/{memberId}")
    suspend fun findById(@PathVariable("memberId") memberId: Long): ResponseEntity<BaseResponse<MemberResponse>> =
        ResponseEntity.ok(BaseResponse.success(findMemberByIdUsecase(makeFindByIdQuery(memberId)).toResponse()))

    @PostMapping
    suspend fun register(@RequestBody member: RegisterMemberRequest): ResponseEntity<BaseResponse<MemberResponse>> {
        val registeredMember = registerMemberUsecase(member.toCommand()).toResponse()
        val uri = URI.create("/members/${registeredMember.memberId}")
        return ResponseEntity.created(uri).body(BaseResponse.success(registeredMember))
    }

    @PutMapping
    suspend fun update() {

    }

    @PatchMapping("/password")
    suspend fun updatePassword() {

    }

    @DeleteMapping
    suspend fun delete() {

    }

}