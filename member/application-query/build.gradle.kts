plugins {
    id("eunmin.spring.application")
    id("eunmin.spring.webflux")
}

dependencies {
    implementation(projects.member.domain)
    implementation(projects.member.infrastructure)
}