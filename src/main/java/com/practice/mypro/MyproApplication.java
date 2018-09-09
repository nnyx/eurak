package com.practice.mypro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyproApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyproApplication.class, args);
	}
}
