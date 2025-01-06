package com.samuelr.sec05.parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.InvalidProtocolBufferException;
import com.samuelr.models.sec05.v2.Television;
import com.samuelr.sec03.Lec01Scalar;

public class V2Parser {

	private static final Logger LOGGER = LoggerFactory.getLogger(Lec01Scalar.class);

	public static void parse(byte[] bytes) throws InvalidProtocolBufferException {
		var tv = Television.parseFrom(bytes);
		LOGGER.info("brand: {}", tv.getBrand());
		LOGGER.info("model: {}", tv.getModel());
		LOGGER.info("type: {}", tv.getType());
	}
}
