package com.iteesoft.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmsWebApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8082");
		SpringApplication.run(EmsWebApplication.class, args);
	}

}
