plugins {
    id("eunmin.spring.application")
}

dependencies {
    implementation(projects.domain.member)

    implementation(libs.springboot.webflux)
}