package com.training.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationGatewayApplication.class, args);
	}

}
