package io.eunmin.pay.domain.base.error.base

open class BaseException(val statusCode: Int, val code: Int, override val message: String): RuntimeException()