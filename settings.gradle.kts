@file:Suppress("UnstableApiUsage")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CaloryTracker"
include(":app")
include(":core")
include(":core:design_system")
include(":core:ui")
include(":onboarding")
include(":onboarding:presentation")
includeBuild("build-logic")
