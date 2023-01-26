#!/bin/bash

cd src/java

# generate Lib.java
java -jar ../../javacpp.jar datalevin/javacpp/Config.java

# compile native library
java -jar ../../javacpp.jar datalevin/javacpp/Lib.java
