buildscript{
    dependencies{
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.40.5")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication)  apply false
    alias(libs.plugins.jetbrainsKotlin) apply false
}