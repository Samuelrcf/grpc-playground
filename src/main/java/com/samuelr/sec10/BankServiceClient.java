package com.samuelr.sec10;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec10.BalanceCheckRequest;
import com.samuelr.models.sec10.BankServiceGrpc;
import com.samuelr.models.sec10.Money;
import com.samuelr.models.sec10.WithdrawRequest;

import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class BankServiceClient {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BankServiceClient.class);

	public static void main(String[] args) throws InterruptedException {
		var channel = ManagedChannelBuilder.forAddress("localhost", 6565)
		.usePlaintext()
		.build();
		
		CountDownLatch latch = new CountDownLatch(1);
		
		var getAccountBalanceStub = BankServiceGrpc.newBlockingStub(channel);
		
		var accountBalance = getAccountBalanceStub.getAccountBalance(BalanceCheckRequest.newBuilder().setAccountNumber(10).build());
		
		LOGGER.info("account balance: {}", accountBalance);
		
		var withdrawStub = BankServiceGrpc.newStub(channel);
		
		var responseObserver = new StreamObserver<Money>() {

			@Override
			public void onNext(Money value) {
				LOGGER.info("money received: {}", value.getAmount());
			}

			@Override
			public void onError(Throwable t) {
				LOGGER.info("an error occurred: {}", t.getMessage());
				latch.countDown();
			}

			@Override
			public void onCompleted() {
				LOGGER.info("withdraw completed");
				latch.countDown();
			}
			
		};
		
		withdrawStub.withdraw(WithdrawRequest.newBuilder().setAccountNumber(1).setAmount(20).build(), responseObserver);
		
		latch.await();;
		
		channel.shutdown();

	}

}
