import java.util.Properties

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    // ❌ Supprimé : kotlin.compose inutile sans Compose
}

val localProperties = Properties()
val localPropertiesFile = rootProject.file("local.properties")
if (localPropertiesFile.exists()) {
    localPropertiesFile.inputStream().use { stream ->
        localProperties.load(stream)
    }
}
val apiKey: String = localProperties.getProperty("MY_API_KEY") ?: ""

android {
    namespace = "com.app.lango"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.app.lango"
        minSdk = 24
        targetSdk = 35 // ✅ idem
        versionCode = 10
        versionName = "1.10"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        buildConfig = true
        // ❌ Supprimé : compose = true inutile
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            buildConfigField("String", "MY_API_KEY", "\"$apiKey\"")
        }
        debug {
            buildConfigField("String", "MY_API_KEY", "\"$apiKey\"")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    // ❌ Toutes les dépendances Compose supprimées
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation("androidx.test:core:1.5.0") // ou une version plus récente
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}