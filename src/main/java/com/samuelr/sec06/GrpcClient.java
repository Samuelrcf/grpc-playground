package com.samuelr.sec06;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.google.protobuf.InvalidProtocolBufferException;
import com.samuelr.models.sec06.BalanceCheckRequest;
import com.samuelr.models.sec06.BankServiceGrpc;

import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GrpcClient.class);

	public static void main(String[] args) throws InvalidProtocolBufferException, InterruptedException {
		var channel = ManagedChannelBuilder.forAddress("localhost", 6565)
		.usePlaintext()
		.build();

		var stub = BankServiceGrpc.newBlockingStub(channel);
		
		var accountBalance = stub.getAccountBalance(BalanceCheckRequest.newBuilder().setAccountNumber(1).build());
		
		Empty empty = null;
		var accountBalances = stub.getAllAccounts(empty);
		
		LOGGER.info("accountNumber: {}, accountBalance: {}", accountBalance.getAccountNumber(), accountBalance.getBalance());
		LOGGER.info("accountBalances: {}", accountBalances.toString());
	}
	
}
