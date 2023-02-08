package com.radustavila.carinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CarInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarInfoServiceApplication.class, args);
	}

}
