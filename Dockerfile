COPY . .
RUN mvn clean package -DskipTests

COPY --from=build /target/SurgeHacksProject-0.0.1=SNAPSHOT.jar SurgeHacksProject.jar
EXPOSE 8080
ENTRYPOINT {"java", "-jar", "SurgeHacksProject.jar"}