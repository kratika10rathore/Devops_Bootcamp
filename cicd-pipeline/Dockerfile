FROM openjdk:8-jdk-alpine

EXPOSE 8888

ARG JAR_FILE=target/cicd-pipeline-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

RUN echo "Creating docker image"

MAINTAINER "kratirathore104@gmail.com"

ENTRYPOINT ["java" , "-jar", "app.jar"]
