=============
android-utils
=============

.. image:: https://travis-ci.org/iweinzierl/android-utils.svg?branch=master
   :target: https://travis-ci.org/iweinzierl/android-utils
   :alt: Build Status

A library that provides some nice to have utilities when developing Android applications.

Installation
============

Maven
-----

The library is deployed on central maven repository:

.. code-block:: xml

    <dependency>
        <groupId>com.github.iweinzierl</groupId>
        <artifactId>android-utils</artifactId>
        <version>1.0</version>
    </dependency>

Gradle
------

.. code-block:: gradle

    compile 'com.github.iweinzierl:android-utils:1.0'

Manual Build
------------

.. code-block:: bash

    $ mvn package

The resulting jar file can be integrated in your project. The jar is located here: target/android-utils-${version}.jar

License
=======

Copyright 2013-2015 Ingo Weinzierl

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
