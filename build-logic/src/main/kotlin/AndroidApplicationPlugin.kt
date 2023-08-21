import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

/**
 * AGP DSL objects = application extension,build type
 * 1. Well apply plugins on module build gradle file.
 *    - id("com.android.application") = Tells gradle I'm creating an android application module
 *    - id("com.android.library") = Tells gradle I'm creating an android library module
 *    - in android {} = We customize confugration and gradle makes it available for task during build phase
 *    - in dependencies {} = We defines our module dependencies.Gralde depencendy management support maven and IP compatible repositories
 * 2. Build lifecycle = Initialization,Configration,Execution
 * 3. Gradle uses Grovy DSL script or Kotlin script
 * 4. With AGP APIs we communicate with gradle
 */

class AndroidApplicationPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            //Added plugins in the project
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }
            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)
                defaultConfig.targetSdk = 34
            }
        }
    }
}

