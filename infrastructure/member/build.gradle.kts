plugins {
    id("eunmin.spring.library")
}

dependencies {
    implementation(projects.domain.member)
    implementation(projects.database.member)
}