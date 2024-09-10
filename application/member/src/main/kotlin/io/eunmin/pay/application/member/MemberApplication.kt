package io.eunmin.pay.application.member

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["io.eunmin.pay"])
class MemberApplication

fun main(args: Array<String>) {
    runApplication<MemberApplication>(*args)
}