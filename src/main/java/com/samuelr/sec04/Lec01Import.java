package com.samuelr.sec04;

import com.samuelr.models.sec04.common.*;
import com.samuelr.sec03.Lec01Scalar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec04.Person;

public class Lec01Import {

	private static final Logger LOGGER = LoggerFactory.getLogger(Lec01Scalar.class);
	
	public static void main(String[] args) {
		var address = Address.newBuilder()
				.setCity("Upanema")
				.build();
		
		var car = Car.newBuilder()
				.setBodyStyle(BodyStyle.COUPE)
				.build();
		
		var person = Person.newBuilder()
				.setName("Samuel")
				.setAge(23)
				.setCar(car)
				.setAddress(address)
				.build();
				
		LOGGER.info("{}", person);
	}

}
