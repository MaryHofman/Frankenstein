FROM openjdk:22-jdk
WORKDIR /app
COPY ./fileMicroservice/target/fileMicroservice-0.0.1-SNAPSHOT.jar /app/fileMicroservice.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "fileMicroservice.jar"]



