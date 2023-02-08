package com.radustavila.usercarservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserCarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCarServiceApplication.class, args);
	}

}
