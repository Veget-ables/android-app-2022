plugins {
    `kotlin-dsl`
}

group = "com.example.buildlogic"

repositories {
    google()
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation(libs.android.gradle.plugin)
    implementation(libs.kotlin.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "example.android.application"
            implementationClass = "com.example.plugins.AndroidApplicationConventionPlugin"
        }
        register("androidLibrary") {
            id = "example.android.library"
            implementationClass = "com.example.plugins.AndroidLibraryConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "example.android.application.compose"
            implementationClass = "com.example.plugins.AndroidApplicationComposeConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "example.android.library.compose"
            implementationClass = "com.example.plugins.AndroidLibraryComposeConventionPlugin"
        }
    }
}
