/*package com.arya;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepo {

	@Autowired
	private MongoTemplate mongoTemplate;

	public List<Model> getAllUsers() {
		return mongoTemplate.findAll(Model.class);
	}
}
*/