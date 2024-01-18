FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/automation/target/*.jar
COPY ${JAR_FILE} automation-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/automation-0.0.1-SNAPSHOT.jar"]