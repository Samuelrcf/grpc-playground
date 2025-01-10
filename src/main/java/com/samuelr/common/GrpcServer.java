package com.samuelr.common;

import java.io.IOException;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;
import io.grpc.ServiceDescriptor;

public class GrpcServer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GrpcServer.class);

	private final Server server;
	
	private GrpcServer(Server server) {
		this.server = server;
	}
	
	public static GrpcServer create(BindableService... services) {
		return create(6565, services);
	}
	
	public static GrpcServer create(int port, BindableService... services) {
		var builder = ServerBuilder.forPort(port);
		Arrays.asList(services).forEach(builder::addService);;
		return new GrpcServer(builder.build());
	}
	
	public GrpcServer start() {
		var services = server.getServices()
				.stream()
				.map(ServerServiceDefinition::getServiceDescriptor)
				.map(ServiceDescriptor::getName)
				.toList();
		try {
			server.start();
			LOGGER.info("server started. listening on port {}, services {}", server.getPort(), services);
			return this;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void await() {
		try {
			server.awaitTermination();
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void stop() {
		server.shutdown();
		LOGGER.info("server stopped");
	}
}
