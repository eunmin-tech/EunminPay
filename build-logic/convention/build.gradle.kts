import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "io.eunmin.pay.convention"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    implementation(libs.plugin.kotlin.gradle)
}

gradlePlugin {
    plugins {
        register("SpringApplication") {
            id = "eunmin.spring.application"
            implementationClass = "SpringApplicationConvention"
        }
        register("SpringWebflux") {
            id = "eunmin.spring.webflux"
            implementationClass = "SpringWebfluxConvention"
        }
        register("SpringLibrary") {
            id = "eunmin.spring.library"
            implementationClass = "SpringLibraryConvention"
        }
        register("Domain") {
            id = "eunmin.domain"
            implementationClass = "DomainConvention"
        }
        register("R2dbc") {
            id = "eunmin.r2dbc"
            implementationClass = "R2dbcConvention"
        }
    }
}