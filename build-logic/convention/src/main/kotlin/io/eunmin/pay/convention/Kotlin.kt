package io.eunmin.pay.convention

import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

internal fun Project.configureKotlin(
    javaExtension: JavaPluginExtension
) {
    configureKotlinCommon(javaExtension)

    dependencies {
        "implementation"(libs.findBundle("kotlin").get())
    }
}

private fun Project.configureKotlinCommon(
    javaExtension: JavaPluginExtension
) {
    javaExtension.apply {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            freeCompilerArgs += "-Xjsr305=strict"
            jvmTarget = JavaVersion.VERSION_17.toString()
        }
    }
}