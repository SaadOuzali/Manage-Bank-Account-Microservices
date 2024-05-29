package com.example.customer_microservises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class CustomerMicroservisesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerMicroservisesApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
