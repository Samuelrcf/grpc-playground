// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec03/person.proto

// Protobuf Java Version: 3.25.5
package com.samuelr.models.sec03;

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec03_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec03_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022sec03/person.proto\022\005sec03\"\207\001\n\006Person\022\021" +
      "\n\tlast_name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\r\n\005email\030" +
      "\003 \001(\t\022\020\n\010employed\030\004 \001(\010\022\016\n\006salary\030\005 \001(\001\022" +
      "\033\n\023bank_account_number\030\006 \001(\003\022\017\n\007balance\030" +
      "\007 \001(\021B\034\n\030com.samuelr.models.sec03P\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sec03_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sec03_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec03_Person_descriptor,
        new java.lang.String[] { "LastName", "Age", "Email", "Employed", "Salary", "BankAccountNumber", "Balance", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
