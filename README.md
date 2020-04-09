# SEiP Assignments 2020
This repository includes all the assignments assigned by <a href="https://github.com/AntonisGkortzis">Antonis Gkortzis</a>, during the lab workshops for the needs of the Software Eningineering in Practice (SEiP) course offered by the <a href="https://www.dept.aueb.gr/en/dmst">Department of Management Science & Technology</a> of the Athens University of Economics and Business.

The goal of this repository is twofold:

1. To present the structure of a multi-module Maven project and,
2. to provide different settings that customize the output result of the build process.

## Project Structure

This repository consists of a parent Maven project and three sub-project (modules), that handle the dependencies in a different way.

1. Grades Histogram - generates and presents a histogram based on an array of integers

Execute the following command in the repository root directory in order to build all modules.

```
mvn package
```

This command generates a seperate jar file in each module's corresponding target (`module/target`) directory.


