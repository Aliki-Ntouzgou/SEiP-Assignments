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

# Grades Histogram

This module requires one runtime dependency which is placed in a ```lib/``` directory in the target directory where the jar is generated. To create a jar and place the dependencies in the lib directory you need to use the ```maven-jar-plugin``` and the ```maven-dependency-plugin``` plugins and also define the class that is the main entry point of the system (the class that contains the main method).

```
	<plugin>
    	<artifactId>maven-assembly-plugin</artifactId>
    	<configuration>
    	    <archive>
        	    <manifest>
            	    <mainClass>gradeshistogram.HistogramGenerator</mainClass> 
            	</manifest>
        	</archive>
        	<descriptorRefs>
            	<descriptorRef>jar-with-dependencies</descriptorRef>
        	</descriptorRefs>
    	</configuration>
    	<executions>
        	<execution>
            	<id>make-assembly</id> 
            	<phase>package</phase> 
            	<goals>
                	<goal>single</goal>
            	</goals>
        	</execution>
    	</executions>
	</plugin>
  ```

The produced jar is located in the target directory and can be executed as following:

```
java -jar gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar gradeshistogram/src/main/resources/grades.txt
```

# Unit Testing

This module requires a junit dependency which is placed in the module pom.xml. You can find the junit dependency <a href="https://mvnrepository.com/artifact/junit/junit/4.12">here</a> or just copy the text below:

```
<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
	<groupId>junit</groupId>
    	<artifactId>junit</artifactId>
    	<version>4.12</version>
    	<scope>test</scope>
</dependency>
```

## Build Unit Testing

In order to build the unittesting project execute the following Maven command:

```
mvn clean package jacoco:report
```

This command will also generate a report of the code coverage produced by JaCoCo. The report will be located in the following path for each module:

```
target/site/jacoco
```

## Test unittesting
To simply run the unit tests of the project, execute the following Maven command:

```
mvn test
````

<b><i>Important:</i></b> Note that only classes with a ```Test``` suffix located in the ```src/test``` will be executed and reported as Tests.

## Generate Test-coverage report

To simply run the unit tests of the project, execute the following Maven command:

```
mvn test jacoco:report
```

## Continuous Integration Service

This projects utilizes TravisCI services in other to test and build the application upon each ```git-push``` in the remote repository. All the information about the the build and test environments of the application is located in the ```.travis.yml``` file.

After each build, the badge is updated with the corresponding build status, ```green``` for passes and ```red``` for failures.

## How to ...
 1. Setup Maven in Windows - <a href="https://mkyong.com/maven/how-to-install-maven-in-windows/">tutorial</a>
 2. Setupa Maven in Linux. Execute: ```sudo apt update && sudo apt install maven``` in terminal
 3. Install Maven in Eclipse - <a href="https://www.eclipse.org/m2e/">link</a>
 4. Java JDK <a href="https://www.oracle.com/java/technologies/javase-jdk8-downloads.html">version 1.7</a> (or later)
 
