package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@Disable
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hello.class, args);
	}
}
