package io.eunmin.pay.common.pattern

object Patterns {
    val EMAIL = "[0-9a-zA-Z]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$".toPattern()
    val PASSWORD = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#\$%^&*])[a-zA-Z0-9!@#\$%^&*]{8,20}\$".toPattern()
}