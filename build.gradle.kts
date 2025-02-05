plugins {
    kotlin("jvm") version "1.9.0"
    java
    `maven-publish`
}

group = "com.github.jitpack"
version = "2.0"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(8)) // Java 8
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:29.0-jre")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

tasks.wrapper {
    gradleVersion = "7.3.3"
    distributionType = Wrapper.DistributionType.ALL
}
