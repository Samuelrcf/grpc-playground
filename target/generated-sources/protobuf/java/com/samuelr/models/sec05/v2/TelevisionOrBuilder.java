// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec05/v2/television.proto

// Protobuf Java Version: 3.25.5
package com.samuelr.models.sec05.v2;

public interface TelevisionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sec05.v2.Television)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string brand = 1;</code>
   * @return The brand.
   */
  java.lang.String getBrand();
  /**
   * <code>string brand = 1;</code>
   * @return The bytes for brand.
   */
  com.google.protobuf.ByteString
      getBrandBytes();

  /**
   * <code>int32 model = 2;</code>
   * @return The model.
   */
  int getModel();

  /**
   * <code>.sec05.v2.Type type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.sec05.v2.Type type = 3;</code>
   * @return The type.
   */
  com.samuelr.models.sec05.v2.Type getType();
}
