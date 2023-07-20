FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
WORKDIR /usr/app
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/usr/app/app.jar"]