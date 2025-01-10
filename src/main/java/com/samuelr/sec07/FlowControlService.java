package com.samuelr.sec07;

import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec07.FlowControlServiceGrpc.FlowControlServiceImplBase;
import com.samuelr.models.sec07.Output;
import com.samuelr.models.sec07.RequestSize;

import io.grpc.stub.StreamObserver;

public class FlowControlService extends FlowControlServiceImplBase{

	private static final Logger LOGGER = LoggerFactory.getLogger(FlowControlService.class);

	@Override
	public StreamObserver<RequestSize> getMessages(StreamObserver<Output> responseObserver) {
		return new RequestHandler(responseObserver);
	}

	private static class RequestHandler implements StreamObserver<RequestSize>{

		private final StreamObserver<Output> responseObserver;
		private Integer emitted;
		
		public RequestHandler(StreamObserver<Output> responseObserver) {
			this.responseObserver = responseObserver;
			this.emitted = 0;
		}

		@Override
		public void onNext(RequestSize value) {
			IntStream.rangeClosed(emitted + 1, 100)
				.limit(value.getSize())
				.forEach(i -> {
					LOGGER.info("emitting {}", i);
					responseObserver.onNext(Output.newBuilder().setValue(i).build());
				});
			emitted = emitted + value.getSize();
			if(emitted >= 100) {
				responseObserver.onCompleted();
			}
		}

		@Override
		public void onError(Throwable t) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onCompleted() {
			this.responseObserver.onCompleted();
			
		}
		
	}
}
