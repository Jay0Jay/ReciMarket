package com.co;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class AppRecimarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppRecimarketApplication.class, args);
	}

}
