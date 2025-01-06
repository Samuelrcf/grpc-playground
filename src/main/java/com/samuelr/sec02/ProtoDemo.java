package com.samuelr.sec02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec02.Person;

public class ProtoDemo {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProtoDemo.class);
	
	public static void main(String[] args) {
		Person person1 = createPerson();
		Person person2 = createPerson();
		
		LOGGER.info("equals {}", person1.equals(person2));
		LOGGER.info("== {}", (person1 == person2));
		
		Person person3 = person1.toBuilder().setName("mike").build();
		
		LOGGER.info("equals {}", person1.equals(person3));
		LOGGER.info("== {}", (person1 == person3));
		
		Person person4 = person1.toBuilder().clearName().build();
		LOGGER.info("person4: {}", person4);
	}
	
	private static Person createPerson() {
		return Person.newBuilder()
				.setName("Samuel")
				.setAge(23)
				.build();
	}
}
