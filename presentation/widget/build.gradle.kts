plugins {
    alias(androidx.plugins.library)
    alias(kotlinx.plugins.android)
    alias(kotlinx.plugins.compose.compiler)
}

android {
    namespace = "yokai.presentation.widget"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(projects.core)
    implementation(projects.data)
    implementation(projects.domain)
    implementation(projects.i18n)
    implementation(projects.presentation.core)

    implementation(androidx.glance.appwidget)

    implementation(libs.coil3)
}
