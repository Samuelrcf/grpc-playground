// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec03/collection.proto

// Protobuf Java Version: 3.25.5
package com.samuelr.models.sec03;

public interface LibraryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sec03.Library)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *na perspectiva do proto, isso é uma coleção, podendo ser uma Lista, um Set...
   * </pre>
   *
   * <code>repeated .sec03.Book books = 2;</code>
   */
  java.util.List<com.samuelr.models.sec03.Book> 
      getBooksList();
  /**
   * <pre>
   *na perspectiva do proto, isso é uma coleção, podendo ser uma Lista, um Set...
   * </pre>
   *
   * <code>repeated .sec03.Book books = 2;</code>
   */
  com.samuelr.models.sec03.Book getBooks(int index);
  /**
   * <pre>
   *na perspectiva do proto, isso é uma coleção, podendo ser uma Lista, um Set...
   * </pre>
   *
   * <code>repeated .sec03.Book books = 2;</code>
   */
  int getBooksCount();
  /**
   * <pre>
   *na perspectiva do proto, isso é uma coleção, podendo ser uma Lista, um Set...
   * </pre>
   *
   * <code>repeated .sec03.Book books = 2;</code>
   */
  java.util.List<? extends com.samuelr.models.sec03.BookOrBuilder> 
      getBooksOrBuilderList();
  /**
   * <pre>
   *na perspectiva do proto, isso é uma coleção, podendo ser uma Lista, um Set...
   * </pre>
   *
   * <code>repeated .sec03.Book books = 2;</code>
   */
  com.samuelr.models.sec03.BookOrBuilder getBooksOrBuilder(
      int index);
}
