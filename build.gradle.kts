plugins {
    kotlin("jvm") version "2.0.20"
}

group = "com.qaautomation.techery"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.seleniumhq.selenium:selenium-java:4.25.0")
    testImplementation("org.testng:testng:7.10.2")
    implementation("io.github.bonigarcia:webdrivermanager:5.9.2")
}

tasks.test {
    useTestNG()
}
kotlin {
    jvmToolchain(20)
}