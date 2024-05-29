package com.example.account_microservises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class  AccountMicroservisesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMicroservisesApplication.class, args);
	}

}
