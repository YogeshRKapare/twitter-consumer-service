package com.yogesh.microservices.twitter.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TwitterClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterClientServiceApplication.class, args);
	}

}
