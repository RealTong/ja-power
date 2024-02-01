plugins {
    id("java")
}

group = "cn.realtong"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val bouncycastleVersion by extra("1.74")
dependencies {
    implementation("cn.hutool:hutool-all:5.8.1")
    implementation("org.bouncycastle:bcpkix-jdk18on:$bouncycastleVersion")
    implementation("org.bouncycastle:bcprov-jdk18on:$bouncycastleVersion")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}