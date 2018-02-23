# sample
Sample Spring Boot Project for testing SPR-16526

This is a small sample project for testing https://jira.spring.io/browse/SPR-16526

How to test:

Would recommend you disable browser cache temporarily for testing.  To avoid any confusion.

Build:
./gradlew build

Start:
java -jar build/libs/sample-1.0-SNAPSHOT.jar

Access the CSS via 
http://localhost:8080/project-setup-management/css/screen.css

You will now see the string index out of bounds error as specified on SPR-16526.

Now change the context path variable server.context-path to 'project-setup' instead of 'project-setup-management' in application.properties.

Save, rebuild and restart:

./gradlew build
java -jar build/libs/sample-1.0-SNAPSHOT.jar

Try
http://localhost:8080/project-setup/css/screen.css

and it will load fine. 

