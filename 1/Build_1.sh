#!/bin/bash

# We need to do--
# >> javac Hello_World.java
# >> java Hello_Word

# The below command outputs the corresponding class after compiling the .java file of the class
javac $1;

# This replaces the .java name with the empty string, which can be run by using the command java
java `echo $1 | sed 's/.java//'`;
