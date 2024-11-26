FROM openjdk:21

WORKDIR /app

COPY build/libs/GCTesting-0.0.1-SNAPSHOT.jar Gctesting.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "Gctesting.jar"]