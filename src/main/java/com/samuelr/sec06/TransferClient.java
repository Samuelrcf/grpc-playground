package com.samuelr.sec06;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.InvalidProtocolBufferException;
import com.samuelr.models.sec06.TransferRequest;
import com.samuelr.models.sec06.TransferResponse;
import com.samuelr.models.sec06.TransferServiceGrpc;

import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class TransferClient {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TransferClient.class);

	public static void main(String[] args) throws InvalidProtocolBufferException, InterruptedException {
		var channel = ManagedChannelBuilder.forAddress("localhost", 6565)
		.usePlaintext()
		.build();

		var stub = TransferServiceGrpc.newStub(channel);
		
		CountDownLatch latch = new CountDownLatch(1);
		
		var responseObserver = new StreamObserver<TransferResponse>() {
            @Override
            public void onNext(TransferResponse value) {
            	LOGGER.info("From account: {}", value.getFromAccount());
            	LOGGER.info("To account: {}", value.getToAccount());
            	LOGGER.info("Status: {}", value.getStatus());
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
		
		StreamObserver<TransferRequest> requestObserver = stub.transfer(responseObserver);
		
		try {
			requestObserver.onNext(TransferRequest.newBuilder().setFromAccount(1).setToAccount(2).setAmount(50).build());
			requestObserver.onNext(TransferRequest.newBuilder().setFromAccount(1).setToAccount(2).setAmount(50).build());
			requestObserver.onNext(TransferRequest.newBuilder().setFromAccount(2).setToAccount(1).setAmount(100).build());
			requestObserver.onCompleted();
		}catch (Exception e){
            LOGGER.error("Error while sending requests: {}", e.getMessage());
			requestObserver.onError(e);
		};
		
		latch.await();
		
		channel.shutdown();
		
	}
	
}
