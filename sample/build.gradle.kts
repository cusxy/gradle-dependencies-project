buildscript {
    repositories {
        maven(url = "../.m2")
    }
    dependencies {
        classpath("ru.cusxy.gradle.library:gradle-library:1.0.0")
    }
}

plugins {
    kotlin("jvm") version "1.9.10" apply false
}
