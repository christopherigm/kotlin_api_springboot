FROM openjdk:18-jdk
WORKDIR /app
COPY . .
ENTRYPOINT ["java", "-jar", "build/libs/kotlin_api_springboot-0.0.1-SNAPSHOT.jar"]
