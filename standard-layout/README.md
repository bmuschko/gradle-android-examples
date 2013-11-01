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

## Configuring manifest entries

    android {                       <--- Android plugin extension object
        compileSdkVersion 18        <--- Android SDK version
        buildToolsVersion '18.1.0'  <--- Build tools version

        defaultConfig {
            versionCode 12          <--- Represents the version of the application code
            versionName '2.0'       <--- Application version label shown to the user
            minSdkVersion 10        <--- Minimum API Level required for the application to run
            targetSdkVersion 10     <--- API Level that the application targets
        }
    }
    
If a property is not set through the DSL, a default value from the manifest will be used.
    
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

The plugin creates install/uninstall tasks for all build types (debug, release), as long as they can be installed (which requires signing).

## Testing

* The plugin builds a test APK that can be deployed to a device for testing the application.
* The test `AndroidManifest.xml` as it is automatically generated.
* By default the test app uses the `debug` build type.
* Test dependencies can be added by using the configuration `instrumentTestCompile`.
* The test app is built by the task `assembleTest`.
* Execute tests with `connectedInstrumentTest`.