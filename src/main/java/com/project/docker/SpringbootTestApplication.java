package com.project.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootTestApplication {

	@GetMapping("/hi")
	public String getMethod() {
		return "welcome to Dockerized SpringBoot_docker project..!!";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootTestApplication.class, args);
	}

}
