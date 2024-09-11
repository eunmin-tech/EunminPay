package io.eunmin.pay.common.error.enums

enum class ErrorCode(val code: Int, val message: String) {
    UNAUTHORIZED(ErrorCodes.UNAUTHORIZED_CODE, "로그인 되어 있지 않습니다."),
    FORBIDDEN(ErrorCodes.FORBIDDEN_CODE, "점근 권한이 없습니다."),

    MEMBER_NOT_FOUND(ErrorCodes.MEMBER_NOT_FOUND_BY_ID_CODE, "해당 ID로 된 Member가 존재하지 않습니다."),
    ;

    companion object {
        fun of(code: Int): ErrorCode? = ErrorCode.entries.firstOrNull { it.code == code }
    }
}

object ErrorCodes {
    const val UNAUTHORIZED_CODE: Int = 401
    const val FORBIDDEN_CODE: Int = 403

    const val MEMBER_NOT_FOUND_BY_ID_CODE: Int = 10000
}
