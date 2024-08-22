# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the project files into the container
COPY . .

# Package the application
RUN ./mvnw package

# Run the application
CMD ["java", "-jar", "target/SmartHealthcareSystem-0.0.1-SNAPSHOT.jar"]