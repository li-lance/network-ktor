plugins {
    alias(libs.plugins.seraphim.android.library)
}
android {
    namespace = "com.seraphim.core.network.ktor"
    buildFeatures {
        viewBinding = true
    }
}
dependencies {
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.content.negotiation)
    implementation(libs.ktor.serialization.json)
    implementation(libs.ktor.client.logging)
    implementation(libs.ktor.client.auth)
    implementation(libs.ktor.client.okhttp)
    implementation(libs.chucker.library)
    implementation(libs.koin.core)
}