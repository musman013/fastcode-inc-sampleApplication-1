package com.fastcode.fastcodetest4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.fastcode.fastcodetest4"})
public class Fastcodetest4Application {

	public static void main(String[] args) {
		SpringApplication.run(Fastcodetest4Application.class, args);
	}

}

