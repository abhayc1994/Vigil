FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY */target/*.jar app.jar
ENTRYPOINT ["java","-jar","/automation-0.0.1-SNAPSHOT.jar"]