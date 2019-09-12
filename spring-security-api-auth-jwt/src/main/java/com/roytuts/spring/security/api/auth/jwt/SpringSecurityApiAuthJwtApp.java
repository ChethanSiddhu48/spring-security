package com.roytuts.spring.security.api.auth.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.roytuts.spring.security.api.auth.jwt")
public class SpringSecurityApiAuthJwtApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApiAuthJwtApp.class, args);
	}

}
