package io.eunmin.pay.domain.base.error

import io.eunmin.pay.domain.base.error.base.BaseException
import io.eunmin.pay.domain.base.error.enums.ErrorCode

class ConflictException private constructor(code: Int, message: String): BaseException(409, code, message) {
    constructor(errorCode: ErrorCode, vararg args: Any): this(errorCode.code, String.format(errorCode.message, *args))
}