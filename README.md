# Android Gradle Examples

## Signing

### Creating signing keys

    cd signing
    mkdir keys
    cd keys
    keytool -genkey -v -keystore debug.keystore -alias AndroidDebugKey -keyalg RSA -keysize 2048 -validity 10000
    keytool -genkey -v -keystore release.keystore -alias AndroidReleaseKey -keyalg RSA -keysize 2048 -validity 10000