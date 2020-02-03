package com.ci.simple.app.com.ci.simple.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Running simple app");
		SpringApplication.run(Application.class, args);
	}

}
