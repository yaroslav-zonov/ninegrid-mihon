plugins {
    id("com.android.application") version "8.9.1"
    id("org.jetbrains.kotlin.android") version "2.3.0"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.3.0"
}

android {
    namespace = "eu.kanade.tachiyomi.extension.ru.ninegrid"
    compileSdk = 35

    defaultConfig {
        applicationId = "eu.kanade.tachiyomi.extension.ru.ninegrid"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"

        manifestPlaceholders["appName"] = "Tachiyomi: NineGrid"
        manifestPlaceholders["extClass"] = ".NineGrid"
        manifestPlaceholders["extFactory"] = ""
        manifestPlaceholders["nsfw"] = "0"
        manifestPlaceholders["isConfigurable"] = "1"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    dependenciesInfo {
        includeInApk = false
        includeInBundle = false
    }
}

kotlin {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
    }
}

dependencies {
    // Mihon extension library (provides HttpSource, SManga, etc.)
    compileOnly("com.github.keiyoushi:extensions-lib:d81081f0f4")

    // Kotlin serialization for JSON parsing
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")

    // AndroidX preferences (for ConfigurableSource)
    compileOnly("androidx.preference:preference-ktx:1.2.1")

    // OkHttp (provided by Mihon at runtime)
    compileOnly("com.squareup.okhttp3:okhttp:5.0.0-alpha.14")

    // Injekt (dependency injection used by Mihon)
    compileOnly("com.github.null2264.injekt:injekt-core:4135455a2a")
}
