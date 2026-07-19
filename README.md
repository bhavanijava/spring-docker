# Spring Boot Docker Demo

A simple Spring Boot REST API containerized using Docker. This project demonstrates how to package a Spring Boot application into a Docker image, run it as a Docker container, and push/pull the image from Docker Hub.

## 🚀 Technologies Used

- Java 21
- Spring Boot
- Maven
- Docker
- Docker Hub

## 📂 Project Structure

```
spring-docker
│── src/
│── target/
│── Dockerfile
│── pom.xml
│── README.md
```

## 📌 REST Endpoint

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/welcome` | Returns a welcome message |

Example:

```
GET http://localhost:8092/welcome
```

Response:

```
Welcome to Docker with Spring Boot!
```

---

## 🐳 Dockerfile

```dockerfile
FROM eclipse-temurin:21-jdk

WORKDIR /appContainer

COPY target/spring-docker.jar spring-docker.jar

EXPOSE 8092

ENTRYPOINT ["java","-jar","spring-docker.jar"]
```

---

## ⚙️ Build the Application

Build the executable JAR using Maven.

```bash
mvn clean package
```

---

## 🏗️ Build Docker Image

```bash
docker build -t spring-docker-app:1.0 .
```

Verify the image:

```bash
docker images
```

---

## ▶️ Run Docker Container

```bash
docker run --name spring-container -p 8092:8092 spring-docker-app:1.0
```

Run in detached mode:

```bash
docker run -d --name spring-container -p 8092:8092 spring-docker-app:1.0
```

---

## 🌐 Test the Application

Open your browser:

```
http://localhost:8092/welcome
```

Expected Output:

```
Welcome to Docker with Spring Boot!
```

---

## 📋 Useful Docker Commands

### List Images

```bash
docker images
```

### List Running Containers

```bash
docker ps
```

### List All Containers

```bash
docker ps -a
```

### View Container Logs

```bash
docker logs spring-container
```

### Stop Container

```bash
docker stop spring-container
```

### Start Container

```bash
docker start spring-container
```

### Remove Container

```bash
docker rm spring-container
```

### Remove Image

```bash
docker rmi spring-docker-app:1.0
```

---

## ☁️ Push Image to Docker Hub

Login:

```bash
docker login
```

Tag the image:

```bash
docker tag spring-docker-app:1.0 <dockerhub-username>/spring-docker-app:1.0
```

Push:

```bash
docker push <dockerhub-username>/spring-docker-app:1.0
```

---

## 📥 Pull Image from Docker Hub

```bash
docker pull <dockerhub-username>/spring-docker-app:1.0
```

Run the pulled image:

```bash
docker run -p 8092:8092 <dockerhub-username>/spring-docker-app:1.0
```

---

## 📚 Concepts Covered

- Docker Installation
- Docker Images
- Docker Containers
- Dockerfile
- Base Image
- WORKDIR
- COPY
- EXPOSE
- ENTRYPOINT
- Build Docker Image
- Run Docker Container
- Docker Hub
- Docker Push
- Docker Pull
- Port Mapping

---

## 👨‍💻 Author

**Bhavani Sankar Botula**

GitHub: https://github.com/<your-github-username>

Docker Hub: https://hub.docker.com/u/<your-dockerhub-username>
