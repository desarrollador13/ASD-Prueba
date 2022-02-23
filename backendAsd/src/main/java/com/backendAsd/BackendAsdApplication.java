package com.backendAsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.backendAsd"})

public class BackendAsdApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendAsdApplication.class, args);
	}

}
