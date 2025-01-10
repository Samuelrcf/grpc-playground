package com.samuelr.sec06;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec06.BankServiceGrpc;
import com.samuelr.models.sec06.Money;
import com.samuelr.models.sec06.WithdrawRequest;

import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class WithdrawClient {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(WithdrawClient.class);

    public static void main(String[] args) throws InterruptedException {
        var channel = ManagedChannelBuilder.forAddress("localhost", 6565)
            .usePlaintext()
            .build();

        var stub = BankServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);
        
        var responseObserver = new StreamObserver<Money>() {
            @Override
            public void onNext(Money money) {
                LOGGER.info("Received money: {}", money.getAmount());
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

        stub.withdraw(
            WithdrawRequest.newBuilder().setAccountNumber(1).setAmount(50).build(), responseObserver);

        latch.await();
        
        channel.shutdown();
    }
}
