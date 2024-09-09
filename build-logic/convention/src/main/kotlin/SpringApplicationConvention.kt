import io.eunmin.pay.convention.configureKotlin
import io.eunmin.pay.convention.configureSpringBootApplication
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.configure

class SpringApplicationConvention: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            configureSpringBootApplication()

            extensions.configure<JavaPluginExtension> {
                configureKotlin(this)
            }
        }
    }
}