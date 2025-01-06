package com.samuelr.sec05;

import com.google.protobuf.InvalidProtocolBufferException;
import com.samuelr.models.sec05.v1.Television;
import com.samuelr.sec05.parser.V1Parser;
import com.samuelr.sec05.parser.V2Parser;
import com.samuelr.sec05.parser.V3Parser;

public class V1VersionCompatibility {

	public static void main(String[] args) throws InvalidProtocolBufferException {
		var tv = Television.newBuilder()
				.setBrand("Samsung")
				.setYear(2019)
				.build();
		
		V1Parser.parse(tv.toByteArray());
		V2Parser.parse(tv.toByteArray());
		V3Parser.parse(tv.toByteArray());

	}

}
