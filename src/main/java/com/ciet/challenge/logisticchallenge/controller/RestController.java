package com.ciet.challenge.logisticchallenge.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/")
public class RestController {
	
	@PostMapping(value="/delivery")
	public Object getDelivery() {
		
	}
	
	@GetMapping(value = "/delivery/{deliveryId}/step")
	public Object delivery() {
		
	}

}
