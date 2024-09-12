package io.eunmin.pay.member.application.command

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["io.eunmin.pay.member"])
internal class memberCommandApplication

internal fun main(args: Array<String>) {
    runApplication<memberCommandApplication>(*args)
}