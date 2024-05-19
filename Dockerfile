FROM maven:3.9.6-amazoncorretto-21 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk
COPY --from=build /target/SurgeHacksProject-0.0.1=SNAPSHOT.jar SurgeHacksProject.jar
EXPOSE 8080
ENTRYPOINT {"java", "-jar", "SurgeHacksProject.jar"}
