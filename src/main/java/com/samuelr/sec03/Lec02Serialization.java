package com.samuelr.sec03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec03.Person;

public class Lec02Serialization {

	private static final Logger LOGGER = LoggerFactory.getLogger(Lec02Serialization.class);
	private static final Path PATH = Path.of("person.out");

	public static void main(String[] args) throws IOException {
		var person = Person.newBuilder()
//				.setLastName("Samuel")
//				.setAge(23)
//				.setEmail("blabla@gmail.com")
				.setEmployed(true)
//				.setSalary(1000.1234)
//				.setBankAccountNumber(123456789012L)
//				.setBalance(-10000)
				.build();

		serialize(person);
		LOGGER.info("{}", deserialize());
		LOGGER.info("{}", person.equals(deserialize()));
		LOGGER.info("bytes length: {}", person.toByteArray().length);
	}

	private static void serialize(Person person) throws IOException {
		try (var stream = Files.newOutputStream(PATH)) {
			person.writeTo(stream);
		}
	}

	private static Person deserialize() throws IOException {
		try (var stream = Files.newInputStream(PATH)) {
			return Person.parseFrom(stream);
		}
	}
}
