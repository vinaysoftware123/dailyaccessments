package com.mouritech.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adminprovider")
public class AdminServiceProvider {
    
	@GetMapping("/displaymessage")
	public String showMsg() {
		return "Hello I am vinay Using First Time Micro Services Working Application";
	}
}
