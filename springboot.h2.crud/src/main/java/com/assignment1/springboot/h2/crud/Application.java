package com.assignment1.springboot.h2.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.assignment1.springboot.h2.crud.*")
@Configuration
@EnableJpaRepositories(basePackages = "com.assignment1.springboot.h2.crud.*")

public class Application {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(Application.class, args);
	}

}
