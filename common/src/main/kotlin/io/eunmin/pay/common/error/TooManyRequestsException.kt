package io.eunmin.pay.common.error

import io.eunmin.pay.common.error.base.BaseException
import io.eunmin.pay.common.error.enums.ErrorCode

class TooManyRequestsException private constructor(code: Int, message: String): BaseException(429, code, message) {
    constructor(errorCode: ErrorCode, vararg args: Any): this(errorCode.code, String.format(errorCode.message, *args))
}