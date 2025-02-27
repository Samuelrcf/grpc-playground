package com.samuelr.sec03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec03.Person;

public class Lec01Scalar {

	private static final Logger LOGGER = LoggerFactory.getLogger(Lec01Scalar.class);
	
	public static void main(String[] args) {
		var person = Person.newBuilder()
			.setLastName("Samuel")
			.setAge(23)
			.setEmail("blabla@gmail.com")
			.setEmployed(true)
			.setSalary(1000.1234)
			.setBankAccountNumber(123456789012L)
			.setBalance(-10000)
			.build();
		
		LOGGER.info("{}", person);
	}
	
}
