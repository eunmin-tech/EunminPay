package io.eunmin.pay.member.application.command.dto.response.base

internal data class BaseResponse<T>(
    val data: T
) {
    companion object {
        fun <T> success(data: T): BaseResponse<T> = BaseResponse(data)
    }
}
