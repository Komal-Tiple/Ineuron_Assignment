package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
	}

	/*
	 * public WebMvcConfigurer corsConfigurer() { return new WebMvcConfigurer() {
	 * public void addCorsMApping(CorsRegistry registry) {
	 * registry.addMapping("/**").allowedOrigins("http://localhost:3000"); } }; }
	 */
}