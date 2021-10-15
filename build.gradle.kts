import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32"
    application
}

group = "com.planies.client"
version = "1.0-SNAPSHOT"

val tornadofx_version: String by rootProject

repositories {
    mavenCentral()
}

application {
    mainClassName = "com.planies.client.MainKt"
}

dependencies {
    implementation("no.tornado:tornadofx:$tornadofx_version")
    testImplementation(kotlin("test-junit"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}