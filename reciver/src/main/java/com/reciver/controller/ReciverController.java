package com.reciver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/reciver")
public class ReciverController {

	@Autowired
	RestTemplate rt;

	@GetMapping("/get")
	public String get() {

		String url = "http://localhost:8081/sender/get";
		ResponseEntity<String> val = rt.exchange(url, HttpMethod.GET, null, String.class);
		String value = val.getBody();
		return value;
	}

}
