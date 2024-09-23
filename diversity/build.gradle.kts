plugins {
    java
    jacoco
    application
    `java-library`
    id("hu.bme.mit.ase.shingler.gradle.java")

}



dependencies {
    implementation(libs.slf4j.api)
    implementation(libs.picocli)

    runtimeOnly(libs.slf4j.log4j.impl)

    testImplementation(libs.junit.jupiter.core)
    testRuntimeOnly(libs.junit.jupiter.engine)

    api(project(":lib"))
    api(project(":logic"))
}


application {
    mainClass = "hu.bme.mit.ase.shingler.similarity.SimilarityApp"
}
