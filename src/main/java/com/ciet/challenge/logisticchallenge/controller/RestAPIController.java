package com.ciet.challenge.logisticchallenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/")
@RestController
public class RestAPIController {
	
	@PostMapping(value="/delivery")
	public Object getDelivery() {
		
	}
	
	@GetMapping(value = "/delivery/{deliveryId}/step")
	public Object delivery() {
		
	}

}
