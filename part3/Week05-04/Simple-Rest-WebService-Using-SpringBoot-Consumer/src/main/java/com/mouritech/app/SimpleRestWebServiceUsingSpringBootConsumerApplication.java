package com.mouritech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRestWebServiceUsingSpringBootConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestWebServiceUsingSpringBootConsumerApplication.class, args);
		System.out.println("Consumer Application Is being Executed!!!");
	}

}
