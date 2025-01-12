package com.samuelr.sec09;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.util.concurrent.Uninterruptibles;
import com.samuelr.models.sec09.AccountBalance;
import com.samuelr.models.sec09.BalanceCheckRequest;
import com.samuelr.models.sec09.BankServiceGrpc.BankServiceImplBase;
import com.samuelr.models.sec09.Money;
import com.samuelr.models.sec09.WithdrawRequest;
import com.samuelr.sec09.repository.AccountRepository;
import com.samuelr.sec09.validator.RequestValidator;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceImplBase {

	private static final Logger LOGGER = LoggerFactory.getLogger(BankService.class);

	@Override
	public void getAccountBalance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
		Optional<Status> status = RequestValidator.validateAccount(request.getAccountNumber());
		if(status.isEmpty()) {
			sendAccountBalance(request, responseObserver);
		}else {
			responseObserver.onError(status.get().asRuntimeException());
		}
	}
	
	private void sendAccountBalance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
		var accountNumber = request.getAccountNumber();
		var balance = AccountRepository.getBalance(accountNumber);
		var accountBalance = AccountBalance.newBuilder()
				.setAccountNumber(accountNumber)
				.setBalance(balance)
				.build();
		
		responseObserver.onNext(accountBalance);
		responseObserver.onCompleted();
	}

	@Override
	public void withdraw(WithdrawRequest request, StreamObserver<Money> responseObserver) {
		Optional<Status> status = 
			    RequestValidator.validateAccount(request.getAccountNumber())
			        .or(() -> RequestValidator.isAmountDivisibleBy10(request.getAmount()))
			        .or(() -> RequestValidator.hasSufficientBalance(request.getAmount(), AccountRepository.getBalance(request.getAccountNumber())));
		
		if(status.isEmpty()) {
			sendMoney(request, responseObserver);
		}else {
			responseObserver.onError(status.get().asRuntimeException());
		}
	}
	
	private void sendMoney(WithdrawRequest request, StreamObserver<Money> responseObserver) {
		var accountNumber = request.getAccountNumber();
		var requestedAmount = request.getAmount();
		var accountBalance = AccountRepository.getBalance(accountNumber);
		
		if(requestedAmount > accountBalance) {
			responseObserver.onCompleted();
			return;
		}
		
		for(int i = 0; i < (requestedAmount / 10); i++) {
			var money = Money.newBuilder().setAmount(10).build();
			responseObserver.onNext(money);
			LOGGER.info("money sent {}", money.getAmount());
			AccountRepository.deductAmount(accountNumber, 10);
			Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
		}
		
		responseObserver.onCompleted();
	}
	
}
