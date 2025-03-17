FROM openjdk:24-ea-17-slim
WORKDIR /app
COPY target/*.jar /app/spring-microservice-kafka.jar
EXPOSE 8080
CMD ["java", "-jar", "spring-microservice-kafka.jar"]