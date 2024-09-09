import io.eunmin.pay.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class R2dbcConvention: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            dependencies {
                "implementation"(libs.findLibrary("springboot-r2dbc").get())
                "runtimeOnly"(libs.findLibrary("mysql-connector").get())
                "runtimeOnly"(libs.findLibrary("mysql-r2dbc").get())
            }
        }
    }
}