FROM openjdk:11.0.9-oracle
ARG JAR_FILE

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]