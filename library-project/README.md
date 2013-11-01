# Library Projects

* Purpose: share code that accesses Android APIs or uses Android-style resources.
* A Library project is very similar to a regular Android project with a few differences.
    * Library projects do not generate an APK, they generate a `.aar` package (which stands for Android archive).
    * Also, because only one APK is generated, there is only one `SigningConfig` object. This is used to sign the test APK.
* Requires to apply a different Android plugin: `android-library`.

## Applying the Gradle Library Android plugin

    buildscript {
        repositories {
            mavenCentral()
        }

        dependencies {
            classpath 'com.android.tools.build:gradle:0.6.3'
        }
    }

    apply plugin: 'android-library'

## Referencing a library project

    dependencies {
        compile project(':lib')     <--- Same as project dependency in Java project
    }