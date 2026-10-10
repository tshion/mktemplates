plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "io.github.tshion.androidview"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "io.github.tshion.androidview"
        minSdk = 29
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            optimization {
                enable = true
                packageScope = setOf("androidx.**", "kotlin.**", "kotlinx.**")
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    // AndroidX
    implementation(libs.androidx.activity)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core)

    // Leak Canary
    debugImplementation(libs.leakcanary)

    // Material Design
    implementation(libs.material)

    // Timber
    implementation(libs.timber)
}
