rootProject.name = "sample"

pluginManagement {
    includeBuild("../gradle-cp")
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":app")
