# Grades Histogram

This project is created for the purposes of getting more familiar with how build automation tools work and, more specifically, how to work with <a href="https://maven.apache.org/">Maven</a>, applied in a simple java project that reads a file with integers and generates a diagram, using the <a href="https://mvnrepository.com/artifact/jfree/jfreechart">jfreechart</a> dependency.

More specifically, this module requires one runtime dependency which is placed in a ```lib/``` directory in the target directory where the jar is generated. To create a jar and place the dependencies in the lib directory you need to use the ```maven-jar-plugin``` and the ```maven-dependency-plugin``` plugins and also define the class that is the main entry point of the system (the class that contains the main method).

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


