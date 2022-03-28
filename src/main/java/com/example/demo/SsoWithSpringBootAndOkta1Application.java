package com.example.demo;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Client
public class SsoWithSpringBootAndOkta1Application {
	@GetMapping("/")
	public String welcome2User(Principal principal) {
		return "Hi"+principal.getName()+"Welcome to Ravi Adda";
	}

	public static void main(String[] args) {
		SpringApplication.run(SsoWithSpringBootAndOkta1Application.class, args);
	}

}
