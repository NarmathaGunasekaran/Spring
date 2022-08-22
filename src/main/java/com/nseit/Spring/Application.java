package com.nseit.Spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		BinaryaSearchImpl binaryaSearch = new BinaryaSearchImpl();
		int result = binaryaSearch.binarySearch(new int[]{3,7,9,12},8);
		System.out.println(result);

//		SpringApplication.run(Application.class, args);
	}

}
