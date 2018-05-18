Example Java Spring Boot Application
-------------------------------------

To build, you need Java and Maven installed. 

To build:

```
git clone https://github.com/hansenms/SpringBootTest.git
cd SpringBootTest
mvn package
```

To run locally:

```
java -jar target/gs-spring-boot-0.1.0.jar
```

To run on an Azure Web App:

1. Create a new Web App.
2. Enable Java (8) in App Settings
3. Copy `target/gs-spring-boot-0.1.0.jar` and `web.config` to `D:\Home\site\wwwroot\` (using Kudu console)

Log will be available in `D:\Home\LogFiles\boot.log`