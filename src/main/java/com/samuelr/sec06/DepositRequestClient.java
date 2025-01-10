package com.samuelr.sec06;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.InvalidProtocolBufferException;
import com.samuelr.models.sec06.AccountBalance;
import com.samuelr.models.sec06.BankServiceGrpc;
import com.samuelr.models.sec06.DepositRequest;
import com.samuelr.models.sec06.Money;

import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class DepositRequestClient {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepositRequestClient.class);

	public static void main(String[] args) throws InvalidProtocolBufferException, InterruptedException {
		var channel = ManagedChannelBuilder.forAddress("localhost", 6565)
		.usePlaintext()
		.build();

		var stub = BankServiceGrpc.newStub(channel);
		
		CountDownLatch latch = new CountDownLatch(1);
		
		var responseObserver = new StreamObserver<AccountBalance>() {
            @Override
            public void onNext(AccountBalance value) {
            	LOGGER.info("AccountNumber: {}", value.getAccountNumber());
                LOGGER.info("Balance: {}", value.getBalance());
            }

            @Override
            public void onError(Throwable t) {
                LOGGER.error("Error occurred: {}", t.getMessage());
                latch.countDown(); 
            }

            @Override
            public void onCompleted() {
                LOGGER.info("Transaction completed.");
                latch.countDown(); 
            }
        };
		
        StreamObserver<DepositRequest> requestObserver = stub.deposit(responseObserver);

        try {
            requestObserver.onNext(DepositRequest.newBuilder()
                    .setAccountNumber(1)
                    .build());
            requestObserver.onNext(DepositRequest.newBuilder()
                    .setMoney(Money.newBuilder().setAmount(50).build())
                    .build());
            requestObserver.onNext(DepositRequest.newBuilder()
                    .setMoney(Money.newBuilder().setAmount(30).build())
                    .build());

            requestObserver.onCompleted();
        } catch (Exception e) {
            LOGGER.error("Error while sending requests: {}", e.getMessage());
            requestObserver.onError(e);
        }

        latch.await();
		
        channel.shutdown();
	}
	
}
