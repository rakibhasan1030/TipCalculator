plugins {
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("org.sonarqube") version "4.4.1.3373"
}
sonarqube {
    properties {
        property("sonar.sources", "./src/main")
        property("sonar.host.url", "https://sonarcloud.io/")
        property("sonar.organization", "rakibhasan1030")
        property("sonar.projectKey", "rakibhasan1030_TipCalculator")
        property("sonar.projectName", "TipCalculator")
        property("sonar.gradle.skipCompile", "true")
    }
}

