package com.pranav.e_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EServicesApplication.class, args);
	}

}
