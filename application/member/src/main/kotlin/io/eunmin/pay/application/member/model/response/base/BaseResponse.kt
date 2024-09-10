package io.eunmin.pay.application.member.model.response.base

internal data class BaseResponse<T>(
    val data: T
) {
    companion object {
        fun <T> success(data: T): BaseResponse<T> = BaseResponse(data)
    }
}
