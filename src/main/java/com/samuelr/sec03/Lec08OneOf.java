package com.samuelr.sec03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec03.Credentials;
import com.samuelr.models.sec03.Email;
import com.samuelr.models.sec03.Phone;

public class Lec08OneOf {

	private static final Logger LOGGER = LoggerFactory.getLogger(Lec01Scalar.class);
	
	public static void main(String[] args) {
		var email = Email.newBuilder()
				.setAddress("unknown@gmail.com")
				.setPassword("root")
				.build();
		
		var phone = Phone.newBuilder()
				.setNumber(1234567889)
				.setCode(123)
				.build();

		login(Credentials.newBuilder().setEmail(email).build());
		login(Credentials.newBuilder().setPhone(phone).build());
	}
	
	public static void login(Credentials credentials) {
		switch (credentials.getLoginTypeCase()){
			case EMAIL -> LOGGER.info("email -> {}", credentials.getEmail());
			case PHONE -> LOGGER.info("phone -> {}", credentials.getPhone());
		}
	}

}
