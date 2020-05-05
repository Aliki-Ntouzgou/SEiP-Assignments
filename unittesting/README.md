# Unit Testing

This project is created for the purposes of applying and testing <b>unit testing</b> and <b>code coverage</b> utilities on a simple java 
project that consists of some mathematical methods.

More spesifically, this module requires a junit dependency which is placed in the module pom.xml. You can find the junit dependency <a href="https://mvnrepository.com/artifact/junit/junit/4.12">here</a> or just copy the text below:

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
