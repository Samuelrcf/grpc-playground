package com.samuelr.common;

import com.samuelr.sec06.BankService;
import com.samuelr.sec06.TransferService;
import com.samuelr.sec07.FlowControlService;

public class Demo {

	public static void main(String[] args) {
		GrpcServer.create(new BankService(), new TransferService(), new FlowControlService())
		.start()
		.await();
	}
}
