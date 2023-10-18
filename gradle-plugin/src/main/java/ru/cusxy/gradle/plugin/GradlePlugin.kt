package ru.cusxy.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import ru.cusxy.gradle.library.Sample
import java.util.UUID

class GradlePlugin : Plugin<Project> {

    override fun apply(target: Project) {
        val sample = Sample(
            id = UUID.randomUUID().toString(),
            text = "Hello, World!"
        )
    }
}
