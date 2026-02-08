# FROM openjdk:8-jre-alpine

# EXPOSE 8080

# COPY ./target/java-maven-app-*.jar /usr/app/
# WORKDIR /usr/app

# CMD java -jar java-maven-app-*.jar
FROM eclipse-temurin:8-jre-alpine

WORKDIR /usr/app

COPY target/java-maven-app-*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
