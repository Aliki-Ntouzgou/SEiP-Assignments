# SEiP Assignments 2020
This repository includes all the assignments assigned by <a href="https://github.com/AntonisGkortzis">Antonis Gkortzis</a>, during the lab workshops for the needs of the Software Eningineering in Practice (SEiP) course offered by the <a href="https://www.dept.aueb.gr/en/dmst">Department of Management Science & Technology</a> of the Athens University of Economics and Business.

The goal of this repository is twofold:

1. To present the structure of a multi-module Maven project and,
2. to provide different settings that customize the output result of the build process.

## Project Structure

This repository consists of a parent Maven project and one sub-project (modules), that handles a dependency.

1. Grades Histogram - generates and presents a histogram based on an array of integers.

Execute the following command in the repository root directory in order to build all modules:

```
mvn package
```

This command generates a seperate jar file in each module's corresponding target (module/target) directory.

# Grades Histogram

This modulerequires one runtime dependency which is placed in a ```lib/``` directory in the target directory where the jar is generated. To create a jar and place the dependencies in the lib directory you need to use the ```maven-jar-plugin``` and the ```maven-dependency-plugin``` plugins and also define the class that is the main entry point of the system (the class that contains the main method).

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

## How to ...
 1. Setup Maven in Windows - <a href="https://mkyong.com/maven/how-to-install-maven-in-windows/">tutorial</a>
 2. Setupa Maven in Linux. Execute: ```sudo apt update && sudo apt install maven``` in terminal
 3. Install Maven in Eclipse - <a href="https://www.eclipse.org/m2e/">link</a>
