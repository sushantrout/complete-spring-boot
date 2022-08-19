package com.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class OrmMappingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrmMappingDemoApplication.class, args);
	}

}
