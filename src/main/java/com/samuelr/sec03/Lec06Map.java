package com.samuelr.sec03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec03.BodyStyle;
import com.samuelr.models.sec03.Car;
import com.samuelr.models.sec03.Dealer;

public class Lec06Map {
	private static final Logger LOGGER = LoggerFactory.getLogger(Lec01Scalar.class);
	
	public static void main(String[] args) {
		var car1 = Car.newBuilder()
				.setMake("Honda")
				.setModel("Civic")
				.setYear(2000)
				.setBodyStyle(BodyStyle.SEDAN)
				.build();
		
		var car2 = Car.newBuilder()
				.setMake("Honda")
				.setModel("Accord")
				.setYear(2002)
				.setBodyStyle(BodyStyle.COUPE)
				.build();
		
		var dealer = Dealer.newBuilder()
				.putInventory(car1.getYear(), car1)
				.putInventory(car2.getYear(), car2)
				.build();
		
		LOGGER.info("{}", dealer);
		LOGGER.info("{}", car1.getBodyStyle());
	}
}
