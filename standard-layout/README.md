# Standard Layout

## Project structure

    .
    ├── build.gradle                       <--- Gradle build script
    ├── gradle
    │   └── wrapper
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    ├── gradlew
    ├── gradlew.bat
    ├── local.properties                   <--- Set path to Android SDK (optional)
    └── src
        ├── instrumentTest
        │   └── java                       <--- Test directory for instrumented tests
        └── main
            ├── AndroidManifest.xml
            ├── java                       <--- Java source directory
            ├── resources                  <--- Resource files directory
            ├── res                        <--- Android resource directory (application resources, drawable files, layout files, string values)
            ├── assets                     <--- Raw asset files
            ├── aidl                       <--- Android Interface Definition Language files
            ├── rs                         <--- RenderScript files
            └── jni                        <--- Java Native Interface files

## Applying the Gradle Android plugin

    buildscript {
        repositories {
            mavenCentral()
        }

        dependencies {
            classpath 'com.android.tools.build:gradle:0.6.3'
        }
    }

    apply plugin: 'android'

## Basic Android configuration

    android {
        compileSdkVersion 18        <--- Android SDK version
        buildToolsVersion '18.1.0'  <--- Build tools version

        defaultConfig {
            versionCode 12
            versionName '2.0'
            minSdkVersion 10
            targetSdkVersion 10
        }
    }
    
## Android tasks

* `assemble`: Create APK for two different build types by default (debug, release). Each build type can have different configuration.
    * `assembleDebug`: Creates debug APK.
    * `assembleRelease`: Creates release APK.
* `connectedInstrumentTest`: Runs instrumented tests on connected device.
    * Ensure the app is built.
    * Install app.
    * Run the tests.
    * Uninstall app.
* `installDebug`: Installs debug application on connected device.
* `uninstallDebug`: Deinstalls deployed debug application on connected device.
