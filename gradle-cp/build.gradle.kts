plugins {
    `kotlin-dsl`
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation("ru.cusxy.gradle.library:gradle-library:1.1.0")
}
