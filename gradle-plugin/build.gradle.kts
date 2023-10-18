plugins {
    `java-gradle-plugin`
    `maven-publish`
    kotlin("jvm") version "1.9.10"
}

kotlin {
    jvmToolchain(17)
}

group = "ru.cusxy.gradle.plugin"
version = "1.0.0"

gradlePlugin {
    plugins {
        create("default") {
            id = "ru.cusxy.gradle.plugin"
            displayName = "gradle-plugin"
            implementationClass = "ru.cusxy.gradle.plugin.GradlePlugin"
        }
    }
}

dependencies {
    implementation("ru.cusxy.gradle.library:gradle-library:1.1.0")
}


afterEvaluate {
    repositories {
        publishing {
            repositories {
                maven {
                    name = "projectLocal"
                    url = uri("${rootProject.projectDir}/../.m2")
                }
            }
        }
    }
}
