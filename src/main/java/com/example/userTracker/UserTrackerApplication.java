package com.example.userTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//		(exclude = {DataSourceAutoConfiguration.class })
public class UserTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserTrackerApplication.class, args);
	}

}
