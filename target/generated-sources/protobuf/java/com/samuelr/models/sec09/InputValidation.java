// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec09/input-validation.proto

// Protobuf Java Version: 3.25.5
package com.samuelr.models.sec09;

public final class InputValidation {
  private InputValidation() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec09_BalanceCheckRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec09_BalanceCheckRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec09_AccountBalance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec09_AccountBalance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec09_AllAccountsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec09_AllAccountsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec09_WithdrawRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec09_WithdrawRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec09_Money_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec09_Money_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034sec09/input-validation.proto\022\005sec09\"-\n" +
      "\023BalanceCheckRequest\022\026\n\016account_number\030\001" +
      " \001(\005\"9\n\016AccountBalance\022\026\n\016account_number" +
      "\030\001 \001(\005\022\017\n\007balance\030\002 \001(\005\">\n\023AllAccountsRe" +
      "sponse\022\'\n\010accounts\030\001 \003(\0132\025.sec09.Account" +
      "Balance\"9\n\017WithdrawRequest\022\026\n\016account_nu" +
      "mber\030\001 \001(\005\022\016\n\006amount\030\002 \001(\005\"\027\n\005Money\022\016\n\006a" +
      "mount\030\001 \001(\0052\211\001\n\013BankService\022F\n\021GetAccoun" +
      "tBalance\022\032.sec09.BalanceCheckRequest\032\025.s" +
      "ec09.AccountBalance\0222\n\010Withdraw\022\026.sec09." +
      "WithdrawRequest\032\014.sec09.Money0\001B\034\n\030com.s" +
      "amuelr.models.sec09P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sec09_BalanceCheckRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sec09_BalanceCheckRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec09_BalanceCheckRequest_descriptor,
        new java.lang.String[] { "AccountNumber", });
    internal_static_sec09_AccountBalance_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sec09_AccountBalance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec09_AccountBalance_descriptor,
        new java.lang.String[] { "AccountNumber", "Balance", });
    internal_static_sec09_AllAccountsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sec09_AllAccountsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec09_AllAccountsResponse_descriptor,
        new java.lang.String[] { "Accounts", });
    internal_static_sec09_WithdrawRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sec09_WithdrawRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec09_WithdrawRequest_descriptor,
        new java.lang.String[] { "AccountNumber", "Amount", });
    internal_static_sec09_Money_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_sec09_Money_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec09_Money_descriptor,
        new java.lang.String[] { "Amount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
