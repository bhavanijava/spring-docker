FROM eclipse-temurin:21-jdk

WORKDIR /appContainer

COPY target/spring-docker.jar spring-docker.jar

EXPOSE 8092

ENTRYPOINT ["java","-jar","spring-docker.jar"]