plugins {
    `java-library`
    `maven-publish`
    kotlin("jvm") version "1.9.0"
}

kotlin {
    jvmToolchain(17)
}

afterEvaluate {
    val sourceJar = tasks.register<Jar>("sourceJar") {
        archiveClassifier.set("sources")
        from(sourceSets["main"].allSource)
    }

    publishing {
        publications {
            create<MavenPublication>("default") {
                from(components["java"])
                artifact(sourceJar)
                groupId = "ru.cusxy.gradle.library"
                artifactId = "gradle-library"
                version = "1.1.0"
            }
        }
    }

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
