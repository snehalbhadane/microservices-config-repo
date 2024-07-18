package com.yash.eurserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurserverApplication.class, args);
	}

}
//https://www.vinsguru.com/circuit-breaker-pattern/