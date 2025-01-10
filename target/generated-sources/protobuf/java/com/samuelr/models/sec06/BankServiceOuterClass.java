// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec06/bank-service.proto

// Protobuf Java Version: 3.25.5
package com.samuelr.models.sec06;

public final class BankServiceOuterClass {
  private BankServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec06_BalanceCheckRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec06_BalanceCheckRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec06_AccountBalance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec06_AccountBalance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec06_AllAccountsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec06_AllAccountsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec06_WithdrawRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec06_WithdrawRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec06_Money_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec06_Money_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec06_DepositRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec06_DepositRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec06_TransferResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec06_TransferResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec06_TransferRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec06_TransferRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030sec06/bank-service.proto\022\005sec06\032\033googl" +
      "e/protobuf/empty.proto\"-\n\023BalanceCheckRe" +
      "quest\022\026\n\016account_number\030\001 \001(\005\"9\n\016Account" +
      "Balance\022\026\n\016account_number\030\001 \001(\005\022\017\n\007balan" +
      "ce\030\002 \001(\005\">\n\023AllAccountsResponse\022\'\n\010accou" +
      "nts\030\001 \003(\0132\025.sec06.AccountBalance\"9\n\017With" +
      "drawRequest\022\026\n\016account_number\030\001 \001(\005\022\016\n\006a" +
      "mount\030\002 \001(\005\"\027\n\005Money\022\016\n\006amount\030\001 \001(\005\"T\n\016" +
      "DepositRequest\022\030\n\016account_number\030\001 \001(\005H\000" +
      "\022\035\n\005money\030\002 \001(\0132\014.sec06.MoneyH\000B\t\n\007reque" +
      "st\"\221\001\n\020TransferResponse\022%\n\006status\030\001 \001(\0162" +
      "\025.sec06.TransferStatus\022+\n\014from_account\030\002" +
      " \001(\0132\025.sec06.AccountBalance\022)\n\nto_accoun" +
      "t\030\003 \001(\0132\025.sec06.AccountBalance\"K\n\017Transf" +
      "erRequest\022\024\n\014from_account\030\001 \001(\005\022\022\n\nto_ac" +
      "count\030\002 \001(\005\022\016\n\006amount\030\003 \001(\005*-\n\016TransferS" +
      "tatus\022\014\n\010REJECTED\020\000\022\r\n\tCOMPLETED\020\0012\212\002\n\013B" +
      "ankService\022F\n\021GetAccountBalance\022\032.sec06." +
      "BalanceCheckRequest\032\025.sec06.AccountBalan" +
      "ce\022D\n\016GetAllAccounts\022\026.google.protobuf.E" +
      "mpty\032\032.sec06.AllAccountsResponse\0222\n\010With" +
      "draw\022\026.sec06.WithdrawRequest\032\014.sec06.Mon" +
      "ey0\001\0229\n\007Deposit\022\025.sec06.DepositRequest\032\025" +
      ".sec06.AccountBalance(\0012R\n\017TransferServi" +
      "ce\022?\n\010Transfer\022\026.sec06.TransferRequest\032\027" +
      ".sec06.TransferResponse(\0010\001B\034\n\030com.samue" +
      "lr.models.sec06P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_sec06_BalanceCheckRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sec06_BalanceCheckRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec06_BalanceCheckRequest_descriptor,
        new java.lang.String[] { "AccountNumber", });
    internal_static_sec06_AccountBalance_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sec06_AccountBalance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec06_AccountBalance_descriptor,
        new java.lang.String[] { "AccountNumber", "Balance", });
    internal_static_sec06_AllAccountsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sec06_AllAccountsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec06_AllAccountsResponse_descriptor,
        new java.lang.String[] { "Accounts", });
    internal_static_sec06_WithdrawRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sec06_WithdrawRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec06_WithdrawRequest_descriptor,
        new java.lang.String[] { "AccountNumber", "Amount", });
    internal_static_sec06_Money_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_sec06_Money_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec06_Money_descriptor,
        new java.lang.String[] { "Amount", });
    internal_static_sec06_DepositRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_sec06_DepositRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec06_DepositRequest_descriptor,
        new java.lang.String[] { "AccountNumber", "Money", "Request", });
    internal_static_sec06_TransferResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_sec06_TransferResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec06_TransferResponse_descriptor,
        new java.lang.String[] { "Status", "FromAccount", "ToAccount", });
    internal_static_sec06_TransferRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_sec06_TransferRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec06_TransferRequest_descriptor,
        new java.lang.String[] { "FromAccount", "ToAccount", "Amount", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
