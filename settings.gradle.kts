/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 * For more detailed information on multi-project builds, please refer to https://docs.gradle.org/8.10/userguide/multi_project_builds.html in the Gradle documentation.
 * This project uses @Incubating APIs which are subject to change.
 */

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
    }
}

rootProject.name = "EunminPay"

include(":common")

include(
    ":msa:config",
    ":msa:eureka",
    ":msa:gateway",
)

//include(
//    ":authentication:application-command",
//    ":authentication:application-query",
//    ":authentication:domain",
//    ":authentication:infrastructure",
//    ":authentication:database"
//)

include(
    ":member:application-command",
    ":member:application-query",
    ":member:domain",
    ":member:infrastructure",
    ":member:database"
)