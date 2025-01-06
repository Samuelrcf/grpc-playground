package com.samuelr.sec03;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec03.Address;
import com.samuelr.models.sec03.School;
import com.samuelr.models.sec03.Student;

public class Lec04Composition {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Lec03PerformanceTest.class);
	
	public static void main(String[] args) throws IOException {
		var address = Address.newBuilder()
				.setStreet("123 main st")
				.setCity("Upanema")
				.setState("RN")
				.build();
		
		var student = Student.newBuilder()
				.setName("Samuel")
				.setAddress(address)
				.build();
		
		var school = School.newBuilder()
				.setId(1)
				.setName("UFERSA")
				.setAddress(address.toBuilder().setStreet("234 main st"))
				.build();
		
		LOGGER.info("school: {}", school);
		LOGGER.info("student: {}", student);
	}
	
}
