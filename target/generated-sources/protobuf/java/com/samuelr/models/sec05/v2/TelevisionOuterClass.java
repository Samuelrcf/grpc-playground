// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec05/v2/television.proto

// Protobuf Java Version: 3.25.5
package com.samuelr.models.sec05.v2;

public final class TelevisionOuterClass {
  private TelevisionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec05_v2_Television_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec05_v2_Television_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031sec05/v2/television.proto\022\010sec05.v2\"H\n" +
      "\nTelevision\022\r\n\005brand\030\001 \001(\t\022\r\n\005model\030\002 \001(" +
      "\005\022\034\n\004type\030\003 \001(\0162\016.sec05.v2.Type*!\n\004Type\022" +
      "\006\n\002HD\020\000\022\007\n\003UHD\020\001\022\010\n\004OLED\020\002B\037\n\033com.samuel" +
      "r.models.sec05.v2P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sec05_v2_Television_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sec05_v2_Television_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec05_v2_Television_descriptor,
        new java.lang.String[] { "Brand", "Model", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
