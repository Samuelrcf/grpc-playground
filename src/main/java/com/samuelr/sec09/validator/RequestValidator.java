package com.samuelr.sec09.validator;

import java.util.Optional;

import io.grpc.Status;

public class RequestValidator {

	public static Optional<Status> validateAccount(int accountNumber){
		if(accountNumber > 0 && accountNumber < 11) {
			return Optional.empty();
		}
		return Optional.of(Status.NOT_FOUND.withDescription("account number does not exists"));
	}
	
	public static Optional<Status> isAmountDivisibleBy10(int amount){
		if(amount > 0 && amount % 10 == 0) {
			return Optional.empty();
		}
		return Optional.of(Status.INVALID_ARGUMENT.withDescription("requested amount should be 10 multiples"));
	}
	
	public static Optional<Status> hasSufficientBalance(int amount, int balance){
		if(amount <= balance) {
			return Optional.empty();
		}
		return Optional.of(Status.FAILED_PRECONDITION.withDescription("insufficiente balance"));
	}
}
