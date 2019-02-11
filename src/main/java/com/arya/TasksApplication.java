package com.arya;

import java.util.TimeZone;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TasksApplication implements CommandLineRunner{

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC")); 
		SpringApplication app = new SpringApplication(TasksApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}
	
	@Override
	public void run(String... args) {
		// write your code
		
	}
}
