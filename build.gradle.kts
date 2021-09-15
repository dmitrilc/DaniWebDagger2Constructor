import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.30"
    kotlin("kapt") version "1.5.30"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

dependencies {
    kapt("com.google.dagger:dagger-compiler:2.38.1")
    implementation("com.google.dagger:dagger:2.38.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.21")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}