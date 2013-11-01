# Build Types

* By default, the Android plugin automatically sets up the project to build both a `debug` and a `release` version of the application. 
* These differ mostly around the ability to debug the application on a secure (non dev) devices, and how the APK is signed.
* New build types can be added with an arbitrary name.
* Build types can inherit configuration from another, existing build type.
* Each build type generates a new APK.

## Configuring a new Build Type

The following example demonstrates how to add a new build type named `releaseProguard`. ProGuard is a free Java class file shrinker, optimizer, obfuscator, and preverifier. If configuraed the Gradle plugin for ProGuard is added to the project.

    android {
        buildTypes {
            releaseProguard.initWith(buildTypes.release)  <--- Introduces new build type (extends release)
        
            releaseProguard {
                runProguard true                          <--- Enables ProGuard
            }
        }
    }
    
## Additional tasks

* `assembleReleaseProguard`: Assembles release build and runs ProGuard.
* `uninstallReleaseProguard`: Uninstalls release application obfuscated with ProGuard.