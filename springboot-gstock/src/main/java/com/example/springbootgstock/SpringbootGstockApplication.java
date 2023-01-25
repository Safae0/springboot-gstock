package com.example.springbootgstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringbootGstockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGstockApplication.class, args);
	}

}
