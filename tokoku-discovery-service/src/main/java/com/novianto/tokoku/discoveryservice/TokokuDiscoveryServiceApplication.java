package com.novianto.tokoku.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.TimeZone;

@SpringBootApplication
@EnableEurekaServer
public class TokokuDiscoveryServiceApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT +0:00"));
		SpringApplication.run(TokokuDiscoveryServiceApplication.class, args);
	}

}
