plugins {
    id("eunmin.spring.library")
}

dependencies {
    implementation(projects.member.domain)
    implementation(projects.member.database)
}