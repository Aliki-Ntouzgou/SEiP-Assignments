# SEiP Assignments 2020

[![Build Status](https://travis-ci.com/Aliki-Ntouzgou/SEiP-Assignments-2020.svg?token=KGQ4yLReetURUiSy9Bt9&branch=development)](https://travis-ci.com/Aliki-Ntouzgou/SEiP-Assignments-2020)

This repository includes all the assignments assigned by <a href="https://github.com/AntonisGkortzis">Antonis Gkortzis</a>, during the lab workshops for the needs of the Software Eningineering in Practice (SEiP) course offered by the <a href="https://www.dept.aueb.gr/en/dmst">Department of Management Science & Technology</a> of the Athens University of Economics and Business.

The goal of this repository is twofold:

1. To present the structure of a multi-module Maven project and,
2. to provide different settings that customize the output result of the build process.

## Requirements

The project requires:

1. Java JDK <a href="https://www.oracle.com/java/technologies/javase-jdk8-downloads.html">version 1.7</a> (or later) and
2. Maven <a href="https://maven.apache.org/download.cgi">3.3</a> (or later)

## Project Structure

This repository consists of a parent Maven project and one sub-project (modules), that handles a dependency.

1. Grades Histogram - generates and presents a histogram based on an array of integers.

2. Unit Testing - implements unit testing and code coverage on simple mathematic methods. 

Execute the following command in the repository root directory in order to build all modules:

```
mvn package
```

This command generates a seperate jar file in each module's corresponding target (module/target) directory.

## Grades Histogram

For more information about building and running the gradeshistogram project visit the <a href="./gradeshistogram/README.md"><b>gradeshistogram documentation</b></a>.

## Unit Testing

For more information about building, testing and running the unittesting project visit the <a href="./unittesting/README.md"><b>unittesting documentation</b></a>.

## How to ...
 1. Setup Maven in Windows - <a href="https://mkyong.com/maven/how-to-install-maven-in-windows/">tutorial</a>
 2. Setup Maven in Linux. Execute:  ```sudo apt update && sudo apt install maven``` in terminal
 3. Install Maven in Eclipse - <a href="https://www.eclipse.org/m2e/">link</a>
 4. Java JDK <a href="https://www.oracle.com/java/technologies/javase-jdk8-downloads.html">version 1.7</a> (or later)
 
