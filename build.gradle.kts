plugins {
    kotlin("jvm") version "1.9.0"
    `maven-publish`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

java {
    withSourcesJar()
    withJavadocJar()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            groupId = "com.github.jeniasaigak"
            artifactId = "temp-balance-kt"
            version = "0.1.0"
        }
    }
}
