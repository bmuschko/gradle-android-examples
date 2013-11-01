# Signing

By default, there is a `debug` configuration that is setup to use a debug keystore, with a known password and a default key with a known password. The debug keystore is located in `$HOME/.android/debug.keystore`, and is created if not present.

### Creating custom signing keys

    cd signing
    mkdir keys
    cd keys
    keytool -genkey -v -keystore debug.keystore -alias AndroidDebugKey -keyalg RSA -keysize 2048 -validity 10000
    keytool -genkey -v -keystore release.keystore -alias AndroidReleaseKey -keyalg RSA -keysize 2048 -validity 10000

## Configuration for custom signing keys

    android {    
        signingConfigs {
            debug {
                storeFile file('keys/debug.keystore')
                storePassword 'android'                   <--- Externalize password
                keyAlias 'AndroidDebugKey'
                keyPassword 'android'                     <--- Externalize password
            }
        
            release {
                storeFile file('keys/release.keystore')
                storePassword 'android'
                keyAlias 'AndroidReleaseKey'
                keyPassword 'android'
            }
        }
    }
    
## Checking the signing configuration

* `signingReport`: Renders the configured signing configuration for each build type.

    $ ./gradlew signingReport
    :signingReport
    Variant: Release
    Config: none
    ----------
    Variant: Test
    Config: debug
    Store: /Users/benjamin/dev/projects/gradle-android-examples/signing/keys/debug.keystore
    Alias: AndroidDebugKey
    MD5: F1:BD:FA:09:A4:E6:FC:F1:3A:76:2C:73:6F:4A:60:E1
    SHA1: CE:82:FC:ED:0A:37:3F:75:44:2E:85:4F:E0:52:08:29:A9:78:1F:DC
    Valid until: Saturday, March 9, 2041
    ----------
    Variant: Debug
    Config: debug
    Store: /Users/benjamin/dev/projects/gradle-android-examples/signing/keys/debug.keystore
    Alias: AndroidDebugKey
    MD5: F1:BD:FA:09:A4:E6:FC:F1:3A:76:2C:73:6F:4A:60:E1
    SHA1: CE:82:FC:ED:0A:37:3F:75:44:2E:85:4F:E0:52:08:29:A9:78:1F:DC
    Valid until: Saturday, March 9, 2041
    ----------