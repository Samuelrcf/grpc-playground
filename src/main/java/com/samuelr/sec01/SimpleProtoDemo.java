package com.samuelr.sec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec01.PersonOuterClass;

public class SimpleProtoDemo {

	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleProtoDemo.class);
	
	public static void main(String[] args) {
		var person = PersonOuterClass.Person.newBuilder()
			.setName("Samuel")
			.setAge(23)
			.build();
		
		LOGGER.info("{}", person);
	}

}
