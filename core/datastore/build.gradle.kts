plugins {
    id("calorietracker.android.library")
}

android {
    namespace = "com.learning.core.datastore"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
}

dependencies {
    implementation(libs.androidx.dataStore.core)
    testImplementation(libs.junit)
}