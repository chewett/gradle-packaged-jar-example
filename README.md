Gradle Packaged Jar Example
===========================

This simple repository shows how you can package external gradle dependencies
into your own Jarfile.

How to build
============

On linux replace `gradlew.bat` with `./gradlew`. 

`gradlew.bat jar` will produce a jar file lacking Google GSON and will not run.

`gradlew.bat goodjar` will produce a jar file including Google GSON and will run.


