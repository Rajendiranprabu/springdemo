package com.manipal.microservicedemo.eurekadmo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekadmoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekadmoApplication.class, args);
	}

}
