# comScore Analytics SDK for Android

License
=======

Copyright (c) 2021 comScore, Inc.

Use of this SDK is subject to the licenses and other terms and conditions set forth herein, including the materials provided in the SDK deliverables. Your use of this SDK and/or transmission of data to Comscore constitutes your agreement to these licenses and other terms and conditions, including the Data Sharing Agreement.

Usage
=====

To run the example project, clone this repository and then open the project from within Android Studio IDE.

Installation
============

Gradle
---------

In order to add the ComScore android library to your project add the following lines in your `build.gradle` file: 


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
    compile 'com.comscore:android-analytics:5.+'
}

```

Manual
------

There is separate implementation documentation which contains instructions for adding the library to your project, configuring the comScore library and tagging your project.

Please contact your comScore client services representative to acquire the implementation documentation appropriate for your reporting needs. 
If you do not know who your comScore client services representative is, then please send an e-mail to tagsupport@comscore.com mentioning your client name, comScore client ID and a description of your project and/or reporting needs.

Author
======

comScore, Inc.
