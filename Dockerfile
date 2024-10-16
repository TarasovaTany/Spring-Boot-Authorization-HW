FROM adoptopenjdk/openjdk21:alpine-jre

EXPOSE 8080

COPY build/libs/springbootauthorization-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]