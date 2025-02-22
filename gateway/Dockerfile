FROM openjdk:22-jdk
WORKDIR /app
COPY ./gateway/target/getaway-0.0.1-SNAPSHOT.jar /app/getaway.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "getaway.jar"]



