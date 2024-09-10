plugins {
    id("eunmin.spring.application")
    id("eunmin.spring.webflux")
}

dependencies {
    implementation(projects.domain.member)
    implementation(projects.infrastructure.member)
}