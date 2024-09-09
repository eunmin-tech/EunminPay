import io.eunmin.pay.convention.configureKotlin
import io.eunmin.pay.convention.configureSpringBootLibrary
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.configure

class SpringLibraryConvention: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            configureSpringBootLibrary()

            extensions.configure<JavaPluginExtension> {
                configureKotlin(this)
            }
        }
    }
}