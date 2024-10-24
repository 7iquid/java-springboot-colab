# Use a base image with OpenJDK 22
FROM openjdk:22-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Maven/Gradle build artifact (make sure the path is correct)
COPY target/myapp.jar myapp.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "myapp.jar"]
