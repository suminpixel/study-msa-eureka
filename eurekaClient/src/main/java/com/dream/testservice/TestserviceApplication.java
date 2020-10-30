package com.dream.testservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class TestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestserviceApplication.class, args);
	}

}
