package com.samuelr.sec06.requesthandlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec06.AccountBalance;
import com.samuelr.models.sec06.DepositRequest;
import com.samuelr.sec06.repository.AccountRepository;

import io.grpc.stub.StreamObserver;
public class DepositRequestHandler implements StreamObserver<DepositRequest>{

	private static final Logger LOGGER = LoggerFactory.getLogger(DepositRequestHandler.class);

	private final StreamObserver<AccountBalance> responseObserver;
	private int accountNumber;
	
	public DepositRequestHandler(StreamObserver<AccountBalance> responseObserver) {
		this.responseObserver = responseObserver;
	}

	@Override
	public void onNext(DepositRequest value) {
		switch(value.getRequestCase()) {
		case ACCOUNT_NUMBER -> this.accountNumber = value.getAccountNumber();
		case MONEY -> AccountRepository.addAmount(this.accountNumber, value.getMoney().getAmount());
		default -> throw new IllegalArgumentException("Unexpected value: " + value.getRequestCase());
		}
		
	}

	@Override
	public void onError(Throwable t) {
		LOGGER.info("client erro {}", t.getMessage());
		
	}

	@Override
	public void onCompleted() {
		var accountBalance = AccountBalance.newBuilder()
				.setAccountNumber(this.accountNumber)
				.setBalance(AccountRepository.getBalance(this.accountNumber))
				.build();
		this.responseObserver.onNext(accountBalance); 
		this.responseObserver.onCompleted();
	}

}
