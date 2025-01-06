package com.samuelr.sec03;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.samuelr.models.sec03.Person;

public class Lec03PerformanceTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(Lec03PerformanceTest.class);
	private static final ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) throws IOException {
		var protoPerson = Person.newBuilder()
				.setLastName("Samuel")
				.setAge(23)
				.setEmail("blabla@gmail.com")
				.setEmployed(true)
				.setSalary(1000.1234)
				.setBankAccountNumber(123456789012L)
				.setBalance(-10000)
				.build();
		
		var jsonPerson = new JsonPerson();
		jsonPerson.setLastName("Samuel");
		jsonPerson.setAge(23);
		jsonPerson.setEmail("blabla@gmail.com");
		jsonPerson.setEmployed(true);
		jsonPerson.setSalary(1000.1234);
		jsonPerson.setBankAccountNumber(123456789012L);
		jsonPerson.setBalance(-10000);
		
		for (int i = 0; i < 5; i++) {
			runTest("json", () -> json(jsonPerson));
			runTest("proto", () -> proto(protoPerson));
		}
	}

	private static void proto(Person person){
		var bytes = person.toByteArray();
		try {
			Person.parseFrom(bytes);
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}

	private static void json(JsonPerson person){
		try {
			var bytes = mapper.writeValueAsBytes(person);
			mapper.readValue(bytes, JsonPerson.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void runTest(String testName, Runnable runnable){
		var start = System.currentTimeMillis();
		for(int i = 0; i < 1_000_000; i++) {
			runnable.run();
		}
		var end = System.currentTimeMillis();
		LOGGER.info("time taken for {} - {} ms", testName, (end- start));
	}
}
