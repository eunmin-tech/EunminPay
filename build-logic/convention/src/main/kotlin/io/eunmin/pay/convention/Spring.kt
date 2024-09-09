package io.eunmin.pay.convention

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureSpringBootApplication() {
    configureSpringCommon()
}

internal fun Project.configureSpringBootLibrary() {
    configureSpringCommon()
    tasks.named("bootJar") { enabled = false }
    tasks.named("jar") { enabled = true }
}

private fun Project.configureSpringCommon() {
    with(pluginManager) {
        apply("org.springframework.boot")
        apply("io.spring.dependency-management")
        apply("org.jetbrains.kotlin.jvm")
        apply("org.jetbrains.kotlin.plugin.spring")
    }

    dependencies {
        "implementation"(libs.findLibrary("springboot-starter").get())

        if (!name.contains("common", ignoreCase = true)) {
            "implementation"(project(":common"))
        }
    }
}