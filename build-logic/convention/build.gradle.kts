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
        register("Library") {
            id = "eunmin.spring.library"
            implementationClass = "SpringLibraryConvention"
        }
        register("R2dbc") {
            id = "eunmin.spring.r2dbc"
            implementationClass = "R2dbcConvention"
        }
    }
}