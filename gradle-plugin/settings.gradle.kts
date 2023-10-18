rootProject.name = "gradle-plugin"

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
