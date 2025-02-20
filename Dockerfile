# Use a builder stage to compile the project
FROM eclipse-temurin:17-jdk-alpine AS builder
WORKDIR /app

# Copy the source code and build it
COPY . .
RUN chmod +x mvnw   # ✅ Fix: Make mvnw executable
RUN ./mvnw clean package -DskipTests

# Use a smaller image for the final runtime
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy the built JAR from the builder stage
COPY --from=builder /app/target/game-crud-backend-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
