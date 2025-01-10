package com.samuelr.sec06.requesthandlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec06.AccountBalance;
import com.samuelr.models.sec06.TransferRequest;
import com.samuelr.models.sec06.TransferResponse;
import com.samuelr.models.sec06.TransferStatus;
import com.samuelr.sec06.repository.AccountRepository;

import io.grpc.stub.StreamObserver;

public class TransferRequestHandler implements StreamObserver<TransferRequest>{

	private static final Logger LOGGER = LoggerFactory.getLogger(TransferRequestHandler.class);

	private final StreamObserver<TransferResponse> responseObserver;
	
	public TransferRequestHandler(StreamObserver<TransferResponse> responseObserver) {
		this.responseObserver = responseObserver;
	}

	@Override
	public void onNext(TransferRequest value) {
		var status = this.transfer(value);
		var response = TransferResponse.newBuilder()
				.setFromAccount(this.toAccountBalance(value.getFromAccount()))
				.setToAccount(this.toAccountBalance(value.getToAccount()))
				.setStatus(status)
				.build();
		this.responseObserver.onNext(response);
	}

	@Override
	public void onError(Throwable t) {
		LOGGER.info("client error {}", t.getMessage());
	}

	@Override
	public void onCompleted() {
		LOGGER.info("transfer request stream completed");
		this.responseObserver.onCompleted();
	}

	private TransferStatus transfer(TransferRequest request) {
		var amount = request.getAmount();
		var fromAccount = request.getFromAccount();
		var toAccount = request.getToAccount();
		var status = TransferStatus.REJECTED;
		if(AccountRepository.getBalance(fromAccount) >= amount && (fromAccount != toAccount)) {
			AccountRepository.deductAmount(fromAccount, amount);
			AccountRepository.addAmount(toAccount, amount);
			status = TransferStatus.COMPLETED;
		}
		return status;
	}
	
	private AccountBalance toAccountBalance(int accountNumber) {
		return AccountBalance.newBuilder()
				.setAccountNumber(accountNumber)
				.setBalance(AccountRepository.getBalance(accountNumber))
				.build();
	}
}
