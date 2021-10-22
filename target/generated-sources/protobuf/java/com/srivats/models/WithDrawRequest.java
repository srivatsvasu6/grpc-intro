// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bank-service.proto

package com.srivats.models;

/**
 * Protobuf type {@code WithDrawRequest}
 */
public final class WithDrawRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:WithDrawRequest)
    WithDrawRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WithDrawRequest.newBuilder() to construct.
  private WithDrawRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WithDrawRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WithDrawRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WithDrawRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
            break;
          }
          case 16: {

            amount_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.srivats.models.BankServiceOuterClass.internal_static_WithDrawRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.srivats.models.BankServiceOuterClass.internal_static_WithDrawRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.srivats.models.WithDrawRequest.class, com.srivats.models.WithDrawRequest.Builder.class);
  }

  public static final int ACCOUNT_NUMBER_FIELD_NUMBER = 1;
  private int accountNumber_;
  /**
   * <code>int32 account_number = 1;</code>
   * @return The accountNumber.
   */
  @java.lang.Override
  public int getAccountNumber() {
    return accountNumber_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private int amount_;
  /**
   * <code>int32 amount = 2;</code>
   * @return The amount.
   */
  @java.lang.Override
  public int getAmount() {
    return amount_;
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
    if (amount_ != 0) {
      output.writeInt32(2, amount_);
    }
    unknownFields.writeTo(output);
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
    if (amount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, amount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.srivats.models.WithDrawRequest)) {
      return super.equals(obj);
    }
    com.srivats.models.WithDrawRequest other = (com.srivats.models.WithDrawRequest) obj;

    if (getAccountNumber()
        != other.getAccountNumber()) return false;
    if (getAmount()
        != other.getAmount()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.srivats.models.WithDrawRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.srivats.models.WithDrawRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.srivats.models.WithDrawRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.srivats.models.WithDrawRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.srivats.models.WithDrawRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.srivats.models.WithDrawRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.srivats.models.WithDrawRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.srivats.models.WithDrawRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.srivats.models.WithDrawRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.srivats.models.WithDrawRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.srivats.models.WithDrawRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.srivats.models.WithDrawRequest parseFrom(
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
  public static Builder newBuilder(com.srivats.models.WithDrawRequest prototype) {
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
   * Protobuf type {@code WithDrawRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:WithDrawRequest)
      com.srivats.models.WithDrawRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.srivats.models.BankServiceOuterClass.internal_static_WithDrawRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.srivats.models.BankServiceOuterClass.internal_static_WithDrawRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.srivats.models.WithDrawRequest.class, com.srivats.models.WithDrawRequest.Builder.class);
    }

    // Construct using com.srivats.models.WithDrawRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      accountNumber_ = 0;

      amount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.srivats.models.BankServiceOuterClass.internal_static_WithDrawRequest_descriptor;
    }

    @java.lang.Override
    public com.srivats.models.WithDrawRequest getDefaultInstanceForType() {
      return com.srivats.models.WithDrawRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.srivats.models.WithDrawRequest build() {
      com.srivats.models.WithDrawRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.srivats.models.WithDrawRequest buildPartial() {
      com.srivats.models.WithDrawRequest result = new com.srivats.models.WithDrawRequest(this);
      result.accountNumber_ = accountNumber_;
      result.amount_ = amount_;
      onBuilt();
      return result;
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
      if (other instanceof com.srivats.models.WithDrawRequest) {
        return mergeFrom((com.srivats.models.WithDrawRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.srivats.models.WithDrawRequest other) {
      if (other == com.srivats.models.WithDrawRequest.getDefaultInstance()) return this;
      if (other.getAccountNumber() != 0) {
        setAccountNumber(other.getAccountNumber());
      }
      if (other.getAmount() != 0) {
        setAmount(other.getAmount());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.srivats.models.WithDrawRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.srivats.models.WithDrawRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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
      onChanged();
      return this;
    }
    /**
     * <code>int32 account_number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountNumber() {
      
      accountNumber_ = 0;
      onChanged();
      return this;
    }

    private int amount_ ;
    /**
     * <code>int32 amount = 2;</code>
     * @return The amount.
     */
    @java.lang.Override
    public int getAmount() {
      return amount_;
    }
    /**
     * <code>int32 amount = 2;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(int value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 amount = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:WithDrawRequest)
  }

  // @@protoc_insertion_point(class_scope:WithDrawRequest)
  private static final com.srivats.models.WithDrawRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.srivats.models.WithDrawRequest();
  }

  public static com.srivats.models.WithDrawRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WithDrawRequest>
      PARSER = new com.google.protobuf.AbstractParser<WithDrawRequest>() {
    @java.lang.Override
    public WithDrawRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WithDrawRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WithDrawRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WithDrawRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.srivats.models.WithDrawRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

