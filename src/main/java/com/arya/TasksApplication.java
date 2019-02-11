package com.arya;

import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@SpringBootApplication
public class TasksApplication implements CommandLineRunner{

	/*@Autowired
	MongoRepo mongoRepo;*/
	
	@Autowired
	MongoTemplate mongoTemplate;
	
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
		List<User> list = mongoTemplate.findAll(User.class);
		System.out.println(list);
		Query query = new Query();
		query.addCriteria(Criteria.where("tags").is("mongodb"));
		list = mongoTemplate.find(query, User.class);
		System.out.println(list);
	}
}
