// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sec06/bank-service.proto

// Protobuf Java Version: 3.25.5
package com.samuelr.models.sec06;

/**
 * Protobuf type {@code sec06.AccountBalance}
 */
public final class AccountBalance extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sec06.AccountBalance)
    AccountBalanceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccountBalance.newBuilder() to construct.
  private AccountBalance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccountBalance() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AccountBalance();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.samuelr.models.sec06.BankServiceOuterClass.internal_static_sec06_AccountBalance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.samuelr.models.sec06.BankServiceOuterClass.internal_static_sec06_AccountBalance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.samuelr.models.sec06.AccountBalance.class, com.samuelr.models.sec06.AccountBalance.Builder.class);
  }

  public static final int ACCOUNT_NUMBER_FIELD_NUMBER = 1;
  private int accountNumber_ = 0;
  /**
   * <code>int32 account_number = 1;</code>
   * @return The accountNumber.
   */
  @java.lang.Override
  public int getAccountNumber() {
    return accountNumber_;
  }

  public static final int BALANCE_FIELD_NUMBER = 2;
  private int balance_ = 0;
  /**
   * <code>int32 balance = 2;</code>
   * @return The balance.
   */
  @java.lang.Override
  public int getBalance() {
    return balance_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (accountNumber_ != 0) {
      output.writeInt32(1, accountNumber_);
    }
    if (balance_ != 0) {
      output.writeInt32(2, balance_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, accountNumber_);
    }
    if (balance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, balance_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.samuelr.models.sec06.AccountBalance)) {
      return super.equals(obj);
    }
    com.samuelr.models.sec06.AccountBalance other = (com.samuelr.models.sec06.AccountBalance) obj;

    if (getAccountNumber()
        != other.getAccountNumber()) return false;
    if (getBalance()
        != other.getBalance()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ACCOUNT_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getAccountNumber();
    hash = (37 * hash) + BALANCE_FIELD_NUMBER;
    hash = (53 * hash) + getBalance();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.samuelr.models.sec06.AccountBalance parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samuelr.models.sec06.AccountBalance parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samuelr.models.sec06.AccountBalance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samuelr.models.sec06.AccountBalance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samuelr.models.sec06.AccountBalance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samuelr.models.sec06.AccountBalance parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samuelr.models.sec06.AccountBalance parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.samuelr.models.sec06.AccountBalance parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.samuelr.models.sec06.AccountBalance parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.samuelr.models.sec06.AccountBalance parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.samuelr.models.sec06.AccountBalance parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.samuelr.models.sec06.AccountBalance parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.samuelr.models.sec06.AccountBalance prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code sec06.AccountBalance}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sec06.AccountBalance)
      com.samuelr.models.sec06.AccountBalanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.samuelr.models.sec06.BankServiceOuterClass.internal_static_sec06_AccountBalance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.samuelr.models.sec06.BankServiceOuterClass.internal_static_sec06_AccountBalance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.samuelr.models.sec06.AccountBalance.class, com.samuelr.models.sec06.AccountBalance.Builder.class);
    }

    // Construct using com.samuelr.models.sec06.AccountBalance.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      accountNumber_ = 0;
      balance_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.samuelr.models.sec06.BankServiceOuterClass.internal_static_sec06_AccountBalance_descriptor;
    }

    @java.lang.Override
    public com.samuelr.models.sec06.AccountBalance getDefaultInstanceForType() {
      return com.samuelr.models.sec06.AccountBalance.getDefaultInstance();
    }

    @java.lang.Override
    public com.samuelr.models.sec06.AccountBalance build() {
      com.samuelr.models.sec06.AccountBalance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.samuelr.models.sec06.AccountBalance buildPartial() {
      com.samuelr.models.sec06.AccountBalance result = new com.samuelr.models.sec06.AccountBalance(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.samuelr.models.sec06.AccountBalance result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accountNumber_ = accountNumber_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.balance_ = balance_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.samuelr.models.sec06.AccountBalance) {
        return mergeFrom((com.samuelr.models.sec06.AccountBalance)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.samuelr.models.sec06.AccountBalance other) {
      if (other == com.samuelr.models.sec06.AccountBalance.getDefaultInstance()) return this;
      if (other.getAccountNumber() != 0) {
        setAccountNumber(other.getAccountNumber());
      }
      if (other.getBalance() != 0) {
        setBalance(other.getBalance());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              accountNumber_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              balance_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int accountNumber_ ;
    /**
     * <code>int32 account_number = 1;</code>
     * @return The accountNumber.
     */
    @java.lang.Override
    public int getAccountNumber() {
      return accountNumber_;
    }
    /**
     * <code>int32 account_number = 1;</code>
     * @param value The accountNumber to set.
     * @return This builder for chaining.
     */
    public Builder setAccountNumber(int value) {

      accountNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 account_number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountNumber() {
      bitField0_ = (bitField0_ & ~0x00000001);
      accountNumber_ = 0;
      onChanged();
      return this;
    }

    private int balance_ ;
    /**
     * <code>int32 balance = 2;</code>
     * @return The balance.
     */
    @java.lang.Override
    public int getBalance() {
      return balance_;
    }
    /**
     * <code>int32 balance = 2;</code>
     * @param value The balance to set.
     * @return This builder for chaining.
     */
    public Builder setBalance(int value) {

      balance_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 balance = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBalance() {
      bitField0_ = (bitField0_ & ~0x00000002);
      balance_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sec06.AccountBalance)
  }

  // @@protoc_insertion_point(class_scope:sec06.AccountBalance)
  private static final com.samuelr.models.sec06.AccountBalance DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.samuelr.models.sec06.AccountBalance();
  }

  public static com.samuelr.models.sec06.AccountBalance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountBalance>
      PARSER = new com.google.protobuf.AbstractParser<AccountBalance>() {
    @java.lang.Override
    public AccountBalance parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AccountBalance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountBalance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.samuelr.models.sec06.AccountBalance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

