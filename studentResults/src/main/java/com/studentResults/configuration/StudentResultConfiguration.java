package com.studentResults.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration

public class StudentResultConfiguration {

	@Bean
	RestTemplate rest() {
		return new RestTemplate();
	}
}
