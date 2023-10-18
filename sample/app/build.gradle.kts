plugins {
    application
    kotlin("jvm") version "1.9.10"
    //Fixme: Uncomment any line to get a configuration error
    //id("gradle-cp")
    //id("ru.cusxy.gradle.plugin") version "1.0.0"
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass = "ru.cusxy.sample.Main"
}
