Basketball Counter App
===================================

Keeps track of basketball scores for two teams. This is a sample app to test how to use ViewModel class in Kotlin. 

Pre-requisites
--------------

- Android SDK v27
- Android Build Tools v27.1.1
- Android Support Repository v27.1.1

Getting Started
---------------

This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.

Issue to Resolve in this Sample
-------------------------------
Rotating a device is one of a few configuration changes that an app can go through during its lifetime, including keyboard availability and changing the device’s language. All of these configuration changes cause the Activity to be torn down and recreated.

This behavior allows us to do things like use a landscape orientation specific layout when the device is rotated on its’ side. Unfortunately it can be a headache for new (and sometimes not so new) engineers to wrap their head around.

At Google I/O 2017, the Android Framework team introduced a new set of Architecture Components, one of which deals with this exact rotation issue.

The ViewModel class is designed to hold and manage UI-related data in a life-cycle conscious way. This allows data to survive configuration changes such as screen rotations.

Check out the original project in this article: https://medium.com/google-developers/viewmodels-a-simple-example-ed5ac416317e 