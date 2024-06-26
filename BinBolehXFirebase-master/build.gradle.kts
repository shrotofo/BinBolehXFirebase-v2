// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral() // Add this line if it's not already there
        maven(url = "https://jitpack.io")

    }
    dependencies {
        // Add this line
        classpath ("com.google.gms:google-services:4.4.1")

    }
}
plugins {
    id("com.android.application") version "8.2.1" apply false
    id("com.google.gms.google-services") version "4.4.1" apply false

}