package com.samuelr.sec03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec03.School;

public class Lec07DefaultValues {

	private static final Logger LOGGER = LoggerFactory.getLogger(Lec01Scalar.class);
	
	public static void main(String[] args) {
		var school = School.newBuilder().build();
		
		LOGGER.info("{}", school.getId());
		LOGGER.info("{}", school.getName());
		LOGGER.info("{}", school.getAddress().getCity());
		
		LOGGER.info("has address? {}", school.hasAddress());

	}
}
