package com.reciver.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ReciverConfiguration {
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}

}
