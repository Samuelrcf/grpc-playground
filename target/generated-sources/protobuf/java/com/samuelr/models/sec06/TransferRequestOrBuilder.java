// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec06/bank-service.proto

// Protobuf Java Version: 3.25.5
package com.samuelr.models.sec06;

public interface TransferRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sec06.TransferRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 from_account = 1;</code>
   * @return The fromAccount.
   */
  int getFromAccount();

  /**
   * <code>int32 to_account = 2;</code>
   * @return The toAccount.
   */
  int getToAccount();

  /**
   * <code>int32 amount = 3;</code>
   * @return The amount.
   */
  int getAmount();
}
