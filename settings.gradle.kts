@file:Suppress("UnstableApiUsage")

include(":onboarding:presentation")


include(":core:design_system")



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
include(":onboarding")
includeBuild("build-logic")
