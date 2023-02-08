package com.radustavila.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerApplication.class, args);
	}

}

/*

http://localhost:8761/ - discovery
http://localhost:8081/catalog/1 - catalog
http://localhost:8082/cars/1 - info
http://localhost:8083/user-cars/users/1 - user cars

 */
