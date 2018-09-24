package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Dockerdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Dockerdemo1Application.class, args);
	}
	@GetMapping("/")
	public String display() {
		return "hello BG";
		
	}
}
