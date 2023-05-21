package com.matheusproencaz.microsservicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication( scanBasePackages = "com.matheusproencaz")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
