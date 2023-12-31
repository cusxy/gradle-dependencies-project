rootProject.name = "gradle-cp"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven(url = "${rootProject.projectDir}/../.m2")
    }
}
