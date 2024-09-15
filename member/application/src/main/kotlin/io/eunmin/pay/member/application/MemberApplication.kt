package io.eunmin.pay.member.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["io.eunmin.pay.member"])
internal class MemberApplication

internal fun main(args: Array<String>) {
    runApplication<MemberApplication>(*args)
}