# Android Gradle Examples

## Prerequisites 

* [Download Android SDK](http://developer.android.com/sdk/index.html).
* Unzip SDK Zip file into directory of your choice (for example `/Users/benjamin/dev/tools/adt-bundle-mac-x86_64-20130917/sdk`).

## Setup

To be able to execute the examples you will need to point your environment to the Android SDK installation directory. This can be achieved by setting the environment variable `ANDROID_HOME` or by adding a properties file (named `local.properties`) to each of the projects.

### Adding the properties files

    sdk.dir=/Users/benjamin/dev/tools/adt-bundle-mac-x86_64-20130917/sdk

### Setting the environment variable

    export ANDROID_HOME=/Users/benjamin/dev/tools/adt-bundle-mac-x86_64-20130917/sdk

## Gotchas

* Never apply the Gradle Java plugin in conjunction with the Android plugin in the same project.
