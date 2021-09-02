package com.github.advancedsecurity.storageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StorageServiceApplication {

	public static final String password = "123456";
	
	public static void main(String[] args) {
		SpringApplication.run(StorageServiceApplication.class, args);
	}

}
