plugins {
    id("calorietracker.android.library")
    id("calorietracker.android.hilt")

}

android {
    namespace = "com.learning.core.datastore"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
}




dependencies {
    testImplementation(libs.junit)
    implementation(libs.androidx.dataStore.preferences)


}