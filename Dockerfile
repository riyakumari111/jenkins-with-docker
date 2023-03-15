FROM openjdk:11-jdk-alpine
EXPOSE 8082
ARG JAR_FILE=target/*.jar
COPY ./target/docker-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
