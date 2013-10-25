# Android Gradle Examples

To be able to execute the examples you will need to point your environment to the Android SDK installation directory. This can be achieved by setting the environment variable `ANDROID_HOME` or by adding a properties file (named `local.properties`) to each of the projects.

## Setting the environment variable

    export ANDROID_HOME=/Users/benjamin/dev/tools/adt-bundle-mac-x86_64-20130917/sdk

## Adding the properties files

    sdk.dir=/Users/benjamin/dev/tools/adt-bundle-mac-x86_64-20130917/sdk

## Signing

### Creating signing keys

    cd signing
    mkdir keys
    cd keys
    keytool -genkey -v -keystore debug.keystore -alias AndroidDebugKey -keyalg RSA -keysize 2048 -validity 10000
    keytool -genkey -v -keystore release.keystore -alias AndroidReleaseKey -keyalg RSA -keysize 2048 -validity 10000