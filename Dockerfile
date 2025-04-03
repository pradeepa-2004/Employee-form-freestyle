FROM openjdk:21-jdk-slim
WORKDIR /apps
COPY target/Devops-0.0.1-SNAPSHOT.jar employeeform.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "employeeform.jar"]