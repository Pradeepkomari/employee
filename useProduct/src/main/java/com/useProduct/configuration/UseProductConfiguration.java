package com.useProduct.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class UseProductConfiguration {

	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}

}
