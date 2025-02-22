FROM openjdk:22-jdk
WORKDIR /app
COPY ./products/target/products-0.0.1-SNAPSHOT.jar /app/products.jar
EXPOSE 8080
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "products.jar"]



