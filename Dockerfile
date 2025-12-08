FROM eclipse-temurin:21
LABEL maintainer="contato@guilherme.dev"
WORKDIR /app
COPY target/mcgauto-0.0.1-SNAPSHOT.jar /app/docker.jar
ENTRYPOINT ["java", "-jar", "docker.jar"]


FROM maven:3.8.4-jdk-8 AS build

COPY src /app/src