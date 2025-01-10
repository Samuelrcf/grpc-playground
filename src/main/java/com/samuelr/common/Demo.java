package com.samuelr.common;

import com.samuelr.sec06.BankService;
import com.samuelr.sec06.TransferService;
import com.samuelr.sec07.FlowControlService;
import com.samuelr.sec08.GuessNumberService;

public class Demo {

	public static void main(String[] args) {
		GrpcServer.create(new BankService(), new TransferService(), new FlowControlService(), new GuessNumberService())
		.start()
		.await();
	}
}
