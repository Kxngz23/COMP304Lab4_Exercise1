// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) // Make sure 'android.application' is correctly aliased
    alias(libs.plugins.kotlin.android) // Ensure 'kotlin.android' alias exists
    alias(libs.plugins.kotlin.compose) // Ensure 'kotlin.compose' alias exists
    alias(libs.plugins.google.android.libraries.mapsplatform.secrets.gradle.plugin) // Secrets plugin alias
}

