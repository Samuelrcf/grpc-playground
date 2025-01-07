package com.samuelr.sec06;

import com.google.protobuf.Empty;
import com.samuelr.models.sec06.AccountBalance;
import com.samuelr.models.sec06.AllAccountsResponse;
import com.samuelr.models.sec06.BalanceCheckRequest;
import com.samuelr.models.sec06.BankServiceGrpc.BankServiceImplBase;
import com.samuelr.sec06.repository.AccountRepository;

import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceImplBase {

	@Override
	public void getAccountBalance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
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
	public void getAllAccounts(Empty request, StreamObserver<AllAccountsResponse> responseObserver) {
		var accounts = AccountRepository.getAllAccounts()
			.entrySet()
			.stream()
			.map(e -> AccountBalance.newBuilder().setAccountNumber(e.getKey()).setBalance(e.getValue()).build())
			.toList();
		
		var response = AllAccountsResponse.newBuilder().addAllAccounts(accounts).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
}
