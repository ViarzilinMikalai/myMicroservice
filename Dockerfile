FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} myNumberApp.jar
ENTRYPOINT ["java","-jar","/myNumberApp.jar"]