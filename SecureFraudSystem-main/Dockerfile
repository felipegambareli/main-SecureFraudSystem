FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY . .

EXPOSE 8080

VOLUME /app

CMD ["./mvnw", "spring-boot:run", "-Dspring-boot.run.profiles=dev"]