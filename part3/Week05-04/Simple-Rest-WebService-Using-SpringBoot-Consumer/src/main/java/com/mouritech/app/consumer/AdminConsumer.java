package com.mouritech.app.consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AdminConsumer implements CommandLineRunner {

	public void run(String... args) throws Exception {

		RestTemplate template = new RestTemplate();
		ResponseEntity<String> responseEntity = template.getForEntity("http://localhost:2022/adminprovider/displaymessage", String.class);
		System.out.println(responseEntity.getBody());
		System.exit(0);
	}

}
