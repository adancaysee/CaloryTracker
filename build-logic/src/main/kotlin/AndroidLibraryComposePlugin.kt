import com.android.build.gradle.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidLibraryComposePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            extensions.configure<LibraryExtension> {
                configureAndroidCompose(this)
            }
        }
    }
}