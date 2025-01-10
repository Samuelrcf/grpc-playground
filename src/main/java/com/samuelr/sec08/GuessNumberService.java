package com.samuelr.sec08;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samuelr.models.sec08.GuessNumberGrpc.GuessNumberImplBase;
import com.samuelr.models.sec08.GuessRequest;
import com.samuelr.models.sec08.GuessResponse;
import com.samuelr.models.sec08.Result;

import io.grpc.stub.StreamObserver;

public class GuessNumberService extends GuessNumberImplBase {

	private static final Logger LOGGER = LoggerFactory.getLogger(GuessNumberService.class);

	@Override
	public StreamObserver<GuessRequest> makeGuess(StreamObserver<GuessResponse> responseObserver) {
		return new RequestHandler(responseObserver);
	}

	public static class RequestHandler implements StreamObserver<GuessRequest> {

		private StreamObserver<GuessResponse> responseObserver;
		private Integer pickedNumber = 0;
		private Integer attempts = 0;
		
		public RequestHandler(StreamObserver<GuessResponse> responseObserver) {
			this.responseObserver = responseObserver;
			this.pickedNumber = pickNumber();
		}

		@Override
		public void onNext(GuessRequest value) {
			attempts++;
			if(value.getGuess() == pickedNumber) {
				var response = GuessResponse.newBuilder().setAttempt(attempts).setResult(Result.CORRECT).build();
				responseObserver.onNext(response);
				LOGGER.info("Guessed!");
				onCompleted();
			}else if(value.getGuess() < pickedNumber) {
				var response = GuessResponse.newBuilder().setAttempt(attempts).setResult(Result.TOO_LOW).build();
				responseObserver.onNext(response);
			}else {
			var response = GuessResponse.newBuilder().setAttempt(attempts).setResult(Result.TOO_HIGH).build();
			responseObserver.onNext(response);
			}
		}

		@Override
		public void onError(Throwable t) {
			LOGGER.info("An error ocurred: {}", t.getMessage());
			responseObserver.onError(t);
		}

		@Override
		public void onCompleted() {
			responseObserver.onCompleted();
		}
		
		private Integer pickNumber() {
			Random random = new Random();
			Integer pickedNumber = random.nextInt(1, 101);
			return pickedNumber;
		}
	}
}