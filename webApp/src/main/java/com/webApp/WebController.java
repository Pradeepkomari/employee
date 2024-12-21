package com.webApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WebController {

	@GetMapping("/hello")
	public String get() {
		return "hello world";
	}

	@GetMapping("/greet/{a}")
	public String getGreet(@PathVariable String a) {
		return "hello " + a;
	}

	@GetMapping("/add/{a}/{b}")
	public int getAdd(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	@GetMapping("/maximum/{a}/{b}")
	public int getMaximum(@PathVariable int a, @PathVariable int b) {
		if (a > b) {

			return a;
		} else {
			return b;
		}
	}

	@GetMapping("/prime/{a}")
	public String getPrime(@PathVariable int a) {
		boolean isPrime = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime == true) {
			return "Prime";
		} else {
			return "Not Prime";
		}

	}

	@GetMapping("/sub")
	public String getParam(@RequestParam String a) {
		return "Hello " + a;
	}

	/*
	 * @GetMapping("/login") public String login(@RequestParam String
	 * a, @RequestParam String b) {
	 * 
	 * if (a.equals("Admin") && b.equals("Admin@123")) { return "Welcome"; } else {
	 * return "InCorrect Password or Mail"; }
	 * 
	 * }
	 */

	@GetMapping("/login/{a}/{b}")
	public String login(@PathVariable String a, @PathVariable String b) {

		if (a.equals("Admin") && b.equals("Admin@123")) {
			return "Welcome";
		} else {
			return "InCorrect Password or Mail";
		}

	}

}
