
        # Build Stage
        FROM maven:3.8.3-openjdk-17 AS build
        COPY . .
        RUN mvn clean install -DskipTests

        # Package Stage
        FROM eclipse-temurin:17-jre
        COPY --from=build /target/myFirstProject-0.0.1-SNAPSHOT.jar app.jar
        EXPOSE 8080 # Or your application's port
        ENTRYPOINT ["java","-jar","/app.jar"]