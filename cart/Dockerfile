FROM openjdk:22-jdk
WORKDIR /app
COPY ./cart/target/cart-0.0.1-SNAPSHOT.jar /app/cart.jar
EXPOSE 8080
EXPOSE 9091
ENTRYPOINT ["java", "-jar", "cart.jar"]



