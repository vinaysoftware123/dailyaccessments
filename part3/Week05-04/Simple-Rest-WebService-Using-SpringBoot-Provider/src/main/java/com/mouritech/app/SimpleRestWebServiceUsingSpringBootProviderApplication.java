package com.mouritech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRestWebServiceUsingSpringBootProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestWebServiceUsingSpringBootProviderApplication.class, args);
		System.out.println("ProviderServerWorking!!!");
	}

}
