# Customized Layout

## Project structure

    .
    ├── build.gradle
    ├── gradle
    │   └── wrapper
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    ├── gradlew
    ├── gradlew.bat
    ├── src
    │   ├── AndroidManifest.xml
    │   ├── java
    │   └── res
    └── tests
    
## Re-configuring the source set

    android {    
        sourceSets {
            main {
                manifest.srcFile 'src/AndroidManifest.xml'

                java {
                    srcDirs = ['src/java']
                }

                resources {
                    srcDirs = ['src/resources']
                }

                res {
                    srcDirs = ['src/res'] 
                }
            }
        
            instrumentTest.setRoot('tests')
        }
    }