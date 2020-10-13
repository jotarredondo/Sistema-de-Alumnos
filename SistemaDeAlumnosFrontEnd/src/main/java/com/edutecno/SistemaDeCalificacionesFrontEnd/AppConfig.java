package com.edutecno.SistemaDeCalificacionesFrontEnd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.edutecno.SistemaDeCalificacionesFrontEnd")
public class AppConfig {
	
	@Bean
	RestTemplate restTemplate () {
		return new RestTemplate();
	}

}
