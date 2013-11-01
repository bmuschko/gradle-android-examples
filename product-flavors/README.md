# Product Flavors

* A product flavor defines a customized version of the application build by the project.
* Typical example: A free and a paid version of the application.
* Build Type + Product Flavor = Build Variant

## Configuring new product flavors

    android {
        productFlavors {
            free {
                buildConfig 'public final static org.gradle.examples.android.MonetizationType monetizationType = org.gradle.examples.android.MonetizationType.FREE;'
                versionCode 20
            }

            pro {
                buildConfig 'public final static org.gradle.examples.android.MonetizationType monetizationType = org.gradle.examples.android.MonetizationType.PRO;'        
                minSdkVersion 14
            }
        }
    }

## Project structure

    .
    ├── build.gradle
    ├── gradle
    │   └── wrapper
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    ├── gradlew
    ├── gradlew.bat
    └── src
        ├── free
        │   └── java                        <--- Source code for "free" product flavor
        ├── main
        │   ├── AndroidManifest.xml
        │   ├── java
        │   └── res
        └── pro
            └── java                        <--- Source code for "pro" product flavor

## Dependencies for product flavors

    repositories {
        mavenCentral()
    }

    dependencies {
        compile 'commons-lang:commons-lang:2.6'         <--- Dependency for regular source code
        proCompile 'commons-codec:commons-codec:1.8'    <--- Dependency for "pro" product flavor
    }

For each product flavor new configurations are added: 

* `<productFlavor>Compile`: Dependencies for compiling code of product flavor.
* `<productFlavor>Apk`: Dependencies packaged for product flavor APK.

## Generated tasks

Build variants provide tasks as combination of build types and product flavors. Example for `assemble` tasks:

* `assembleFreeDebug`: Assembles the Debug build for flavor Free
* `assembleFreeRelease`: Assembles the Release build for flavor Free
* `assembleProDebug`: Assembles the Debug build for flavor Pro
* `assembleProRelease`: Assembles the Release build for flavor Pro