package io.eunmin.pay.common.error.base

open class BaseException(val statusCode: Int, val code: Int, override val message: String): RuntimeException()