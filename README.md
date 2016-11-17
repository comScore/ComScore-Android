# comScore Analytics SDK for Android

Usage
=====

To run the example project, clone this repository and then open the project from within Android Studio IDE.

Installation
============

Gradle
---------

In order to add the ComScore android library to your project add the following lines in your `gradle.build` file: 


```
allprojects {
    repositories {
    	...
        maven {
            url  "http://comscore.bintray.com/Analytics"
        }
    }
}

...

dependencies {
	...
    compile 'com.comscore:android-analytics:5.0.4'
}

```

Manual
------

Refer to the implementation guides for information on how to manually add the library to your project.

Author
======

comScore, Inc.

License
=======

Copyright (c) 2016 comScore, Inc.
FOR MORE INFORMATION, PLEASE VISIT [DIRECT.COMSCORE.COM](http://direct.comscore.com).