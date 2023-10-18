rootProject.name = "sample"

pluginManagement {
    includeBuild("../gradle-cp")
    includeBuild("../gradle-plugin")
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven(url = "${rootProject.projectDir}/../.m2")
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":app")
