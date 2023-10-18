plugins {
    application
    kotlin("jvm") version "1.9.10"
    //Fixme: Uncomment to get configuration error
    //id("gradle-cp")
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass = "ru.cusxy.sample.Main"
}
