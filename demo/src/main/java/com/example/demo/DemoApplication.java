package com.example.demo;

import com.example.demo.model.College;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		College clg = College.builder().id(1).collegeName("TGP").city("city").build();
	}

}
