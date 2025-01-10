// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec08/game.proto

// Protobuf Java Version: 3.25.5
package com.samuelr.models.sec08;

/**
 * Protobuf enum {@code sec08.Result}
 */
public enum Result
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CORRECT = 0;</code>
   */
  CORRECT(0),
  /**
   * <code>TOO_LOW = 1;</code>
   */
  TOO_LOW(1),
  /**
   * <code>TOO_HIGH = 2;</code>
   */
  TOO_HIGH(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CORRECT = 0;</code>
   */
  public static final int CORRECT_VALUE = 0;
  /**
   * <code>TOO_LOW = 1;</code>
   */
  public static final int TOO_LOW_VALUE = 1;
  /**
   * <code>TOO_HIGH = 2;</code>
   */
  public static final int TOO_HIGH_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Result valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Result forNumber(int value) {
    switch (value) {
      case 0: return CORRECT;
      case 1: return TOO_LOW;
      case 2: return TOO_HIGH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Result>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Result> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Result>() {
          public Result findValueByNumber(int number) {
            return Result.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.samuelr.models.sec08.Game.getDescriptor().getEnumTypes().get(0);
  }

  private static final Result[] VALUES = values();

  public static Result valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Result(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:sec08.Result)
}

