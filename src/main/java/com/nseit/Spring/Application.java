package com.nseit.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		BinaryaSearchImpl binaryaSearch = new BinaryaSearchImpl();
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		BinaryaSearchImpl binaryaSearch = applicationContext.getBean(BinaryaSearchImpl.class);

		int result = binaryaSearch.binarySearch(new int[]{3,7,9,12},8);
		System.out.println(result);
	}

}
