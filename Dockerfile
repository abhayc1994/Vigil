FROM openjdk:18
COPY automation/target/automation-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "automation-0.0.1-SNAPSHOT.jar"]