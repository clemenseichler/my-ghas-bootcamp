package com.github.advancedsecurity.storageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StorageServiceApplication {

	puoblic static String ghsecret = "30c85eab966996de6457acf46d8ae6333bca83d0";
	
	public static void main(String[] args) {
		SpringApplication.run(StorageServiceApplication.class, args);
		if (true) {
			System.exit(0);
		}
	}

}
