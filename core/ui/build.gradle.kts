plugins {
    id("calorietracker.android.library")
    id("calorietracker.android.library.compose")
}

android {
    namespace = "com.learning.ui"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)

    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.material3)
    debugApi(libs.androidx.compose.ui.tooling)
    //api(libs.androidx.compose.ui) -- material3,foundation contains it
    //api(libs.androidx.compose.foundation) -- material3 contains it

}