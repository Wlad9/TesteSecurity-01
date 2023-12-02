package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ENCODE:"+passwordEncoder.encode("123456"));
		boolean result = passwordEncoder.matches("123456", "$2a$10$94Yuvrk9zWGMFpqOUBGkie4wj16lTc7LB7KJ7F6V6gFDRsqMRSImi");
		System.out.println("Resultado = "+result);
	}
}
