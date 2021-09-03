package com.github.advancedsecurity.storageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StorageServiceApplication {

	public static final String gh_ac_token = "30c85efc997886df0457ace44b8ae6231bca83d0";
	
	public static void main(String[] args) {
		SpringApplication.run(StorageServiceApplication.class, args);
	}

}
