// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec03/map.proto

// Protobuf Java Version: 3.25.5
package com.samuelr.models.sec03;

public final class Map {
  private Map() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec03_Car_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec03_Car_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec03_Dealer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec03_Dealer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sec03_Dealer_InventoryEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sec03_Dealer_InventoryEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017sec03/map.proto\022\005sec03\"V\n\003Car\022\014\n\004make\030" +
      "\001 \001(\t\022\r\n\005model\030\002 \001(\t\022\014\n\004year\030\003 \001(\005\022$\n\nbo" +
      "dy_style\030\004 \001(\0162\020.sec03.BodyStyle\"w\n\006Deal" +
      "er\022/\n\tinventory\030\001 \003(\0132\034.sec03.Dealer.Inv" +
      "entoryEntry\032<\n\016InventoryEntry\022\013\n\003key\030\001 \001" +
      "(\005\022\031\n\005value\030\002 \001(\0132\n.sec03.Car:\0028\001*7\n\tBod" +
      "yStyle\022\013\n\007UNKNOWN\020\000\022\t\n\005SEDAN\020\001\022\t\n\005COUPE\020" +
      "\002\022\007\n\003SUV\020\003B\034\n\030com.samuelr.models.sec03P\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sec03_Car_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sec03_Car_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec03_Car_descriptor,
        new java.lang.String[] { "Make", "Model", "Year", "BodyStyle", });
    internal_static_sec03_Dealer_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sec03_Dealer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec03_Dealer_descriptor,
        new java.lang.String[] { "Inventory", });
    internal_static_sec03_Dealer_InventoryEntry_descriptor =
      internal_static_sec03_Dealer_descriptor.getNestedTypes().get(0);
    internal_static_sec03_Dealer_InventoryEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sec03_Dealer_InventoryEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
