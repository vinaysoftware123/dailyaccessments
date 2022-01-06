package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
/*
 *  here @EnableEurekaClient(given by netflix) 
 *  or @EnableDiscoveryClient{Annotation to enable a DiscoveryClient implementation.}(given by spring cloud) 
 *  both are optional.
 */
@EnableEurekaClient    

public class StudentServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceProviderApplication.class, args);
		System.out.println("Student Service Provider");
	}

}
