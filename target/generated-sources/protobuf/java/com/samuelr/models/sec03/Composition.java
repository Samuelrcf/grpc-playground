// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec03/composition.proto

// Protobuf Java Version: 3.25.5
package com.samuelr.models.sec03;

public final class Composition {
  private Composition() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec03_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec03_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec03_Student_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec03_Student_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec03_School_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec03_School_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027sec03/composition.proto\022\005sec03\"6\n\007Addr" +
      "ess\022\016\n\006street\030\001 \001(\t\022\014\n\004city\030\002 \001(\t\022\r\n\005sta" +
      "te\030\003 \001(\t\"8\n\007Student\022\014\n\004name\030\001 \001(\t\022\037\n\007add" +
      "ress\030\002 \001(\0132\016.sec03.Address\"C\n\006School\022\n\n\002" +
      "id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\037\n\007address\030\003 \001(\0132" +
      "\016.sec03.AddressB\034\n\030com.samuelr.models.se" +
      "c03P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sec03_Address_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sec03_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec03_Address_descriptor,
        new java.lang.String[] { "Street", "City", "State", });
    internal_static_sec03_Student_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sec03_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec03_Student_descriptor,
        new java.lang.String[] { "Name", "Address", });
    internal_static_sec03_School_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sec03_School_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec03_School_descriptor,
        new java.lang.String[] { "Id", "Name", "Address", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
