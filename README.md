# Spring Boot Seed
A small Spring Boot app that contains everything you should need to start a new  command line based app.

## Setup
Clone the project, providing the name of the new directory, and remove the .git folder:

`git clone --depth 1 --branch master https://github.com/kenpritchard/spring-boot-seed.git new_directory && rm -rf new_directory/.git`

or

`git clone --depth 1 --branch master git@github.com:kenpritchard/spring-boot-seed.git new_directory && rm -rf new_directory/.git`

If you are planning to import the project into STS, edit the .project file to set the projectDescription.name correctly.

Edit the pom to reflect your group and artifact ID's.

Modify the package structure to reflect your organization's standards.

## Build & Run
Run it thru STS or using Maven: `mvn spring-boot:run`


