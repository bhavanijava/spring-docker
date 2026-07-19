package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerApplication {
	
	@GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to Docker with Spring Boot!";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}

}
