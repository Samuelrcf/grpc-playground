// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec03/map.proto

// Protobuf Java Version: 3.25.5
package com.samuelr.models.sec03;

public interface DealerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sec03.Dealer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;int32, .sec03.Car&gt; inventory = 1;</code>
   */
  int getInventoryCount();
  /**
   * <code>map&lt;int32, .sec03.Car&gt; inventory = 1;</code>
   */
  boolean containsInventory(
      int key);
  /**
   * Use {@link #getInventoryMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, com.samuelr.models.sec03.Car>
  getInventory();
  /**
   * <code>map&lt;int32, .sec03.Car&gt; inventory = 1;</code>
   */
  java.util.Map<java.lang.Integer, com.samuelr.models.sec03.Car>
  getInventoryMap();
  /**
   * <code>map&lt;int32, .sec03.Car&gt; inventory = 1;</code>
   */
  /* nullable */
com.samuelr.models.sec03.Car getInventoryOrDefault(
      int key,
      /* nullable */
com.samuelr.models.sec03.Car defaultValue);
  /**
   * <code>map&lt;int32, .sec03.Car&gt; inventory = 1;</code>
   */
  com.samuelr.models.sec03.Car getInventoryOrThrow(
      int key);
}
