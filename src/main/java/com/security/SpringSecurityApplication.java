package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
		System.out.println("------ SpringSecurityApplication running on : 8080 port ------");
		System.out.println("1 , 2 , 3, 4, 5  :: Complete");
	}

}
