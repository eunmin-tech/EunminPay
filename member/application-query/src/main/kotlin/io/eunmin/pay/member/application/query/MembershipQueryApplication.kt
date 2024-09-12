package io.eunmin.pay.member.application.query

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("io.eunmin.pay.member")
class memberQueryApplication

fun main(args: Array<String>) {
    runApplication<memberQueryApplication>(*args)
}