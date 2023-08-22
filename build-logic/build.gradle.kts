plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "calorietracker.android.application"
            implementationClass = "AndroidApplicationPlugin"
        }
        register("androidApplicationCompose") {
            id = "calorietracker.android.application.compose"
            implementationClass = "AndroidApplicationComposePlugin"
        }
        register("androidLibrary") {
            id = "calorietracker.android.library"
            implementationClass = "AndroidLibraryPlugin"
        }
        register("androidLibraryCompose") {
            id = "calorietracker.android.library.compose"
            implementationClass = "AndroidLibraryComposePlugin"
        }

    }

}