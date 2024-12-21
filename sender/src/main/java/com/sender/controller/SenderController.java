package com.sender.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sender")
public class SenderController {

	@GetMapping("/get")
	public String get(){
		return "Hello";
	}
}
