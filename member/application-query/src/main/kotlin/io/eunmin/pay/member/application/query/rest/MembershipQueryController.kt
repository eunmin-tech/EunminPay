package io.eunmin.pay.member.application.query.rest

import io.eunmin.pay.member.application.query.dto.response.MemberResponse
import io.eunmin.pay.member.application.query.dto.response.base.BaseResponse
import io.eunmin.pay.member.application.query.mapper.makeFindByIdQuery
import io.eunmin.pay.member.application.query.mapper.toResponse
import io.eunmin.pay.member.domain.input.FindMemberByIdUsecase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/member")
internal class memberQueryController(
    private val findMemberByIdUsecase: FindMemberByIdUsecase
) {
    @GetMapping("/{memberId}")
    suspend fun findMemberById(@PathVariable("memberId") memberId: Long): ResponseEntity<BaseResponse<MemberResponse>> =
        ResponseEntity.ok(BaseResponse.success(findMemberByIdUsecase(makeFindByIdQuery(memberId)).toResponse()))
}