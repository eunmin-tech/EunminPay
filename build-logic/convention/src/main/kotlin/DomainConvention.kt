import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class DomainConvention: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            dependencies {
                "api"(project(":common"))
            }
        }
    }
}