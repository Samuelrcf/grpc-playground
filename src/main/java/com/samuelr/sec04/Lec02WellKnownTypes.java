package com.samuelr.sec04;

import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Int32Value;
import com.google.protobuf.Timestamp;
import com.samuelr.models.sec04.Sample;
import com.samuelr.sec03.Lec01Scalar;

public class Lec02WellKnownTypes {

	private static final Logger LOGGER = LoggerFactory.getLogger(Lec01Scalar.class);

	public static void main(String[] args) {
		var sample = Sample.newBuilder()
				.setAge(Int32Value.of(12))
				.setLoginTime(Timestamp.newBuilder().setSeconds(Instant.now().getEpochSecond())
						.build());
		
		LOGGER.info("{}", Instant.ofEpochSecond(sample.getLoginTime().getSeconds()));
	}

}
