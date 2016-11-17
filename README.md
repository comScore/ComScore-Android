# comScore Analytics SDK for Android

Usage
=====

This repository provides a HelloWorld example with the ComScore SDK for tagging the application.

Installation
============

Gradle
---------

In order to add the ComScore android SDK add the following lines in your `gradle.build`: 


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