// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hybrik.proto

package com.nent.mam.proto.hybrikproto;

/**
 * Protobuf type {@code hybrikproto.CreateJobIn}
 */
public  final class CreateJobIn extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hybrikproto.CreateJobIn)
    CreateJobInOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateJobIn.newBuilder() to construct.
  private CreateJobIn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateJobIn() {
    jobSpec_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateJobIn(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            jobSpec_ = s;
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
    return com.nent.mam.proto.hybrikproto.HybrikProto.internal_static_hybrikproto_CreateJobIn_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.nent.mam.proto.hybrikproto.HybrikProto.internal_static_hybrikproto_CreateJobIn_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.nent.mam.proto.hybrikproto.CreateJobIn.class, com.nent.mam.proto.hybrikproto.CreateJobIn.Builder.class);
  }

  public static final int JOB_SPEC_FIELD_NUMBER = 1;
  private volatile java.lang.Object jobSpec_;
  /**
   * <pre>
   *string dir = 1;
   *string file = 2;
   *string house_id = 3;
   * </pre>
   *
   * <code>string job_spec = 1;</code>
   */
  public java.lang.String getJobSpec() {
    java.lang.Object ref = jobSpec_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobSpec_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *string dir = 1;
   *string file = 2;
   *string house_id = 3;
   * </pre>
   *
   * <code>string job_spec = 1;</code>
   */
  public com.google.protobuf.ByteString
      getJobSpecBytes() {
    java.lang.Object ref = jobSpec_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobSpec_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getJobSpecBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, jobSpec_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getJobSpecBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, jobSpec_);
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
    if (!(obj instanceof com.nent.mam.proto.hybrikproto.CreateJobIn)) {
      return super.equals(obj);
    }
    com.nent.mam.proto.hybrikproto.CreateJobIn other = (com.nent.mam.proto.hybrikproto.CreateJobIn) obj;

    boolean result = true;
    result = result && getJobSpec()
        .equals(other.getJobSpec());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + JOB_SPEC_FIELD_NUMBER;
    hash = (53 * hash) + getJobSpec().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.nent.mam.proto.hybrikproto.CreateJobIn parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.hybrikproto.CreateJobIn parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.hybrikproto.CreateJobIn parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.hybrikproto.CreateJobIn parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.hybrikproto.CreateJobIn parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.hybrikproto.CreateJobIn parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.hybrikproto.CreateJobIn parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.hybrikproto.CreateJobIn parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nent.mam.proto.hybrikproto.CreateJobIn parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.hybrikproto.CreateJobIn parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nent.mam.proto.hybrikproto.CreateJobIn parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.hybrikproto.CreateJobIn parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.nent.mam.proto.hybrikproto.CreateJobIn prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code hybrikproto.CreateJobIn}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hybrikproto.CreateJobIn)
      com.nent.mam.proto.hybrikproto.CreateJobInOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nent.mam.proto.hybrikproto.HybrikProto.internal_static_hybrikproto_CreateJobIn_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nent.mam.proto.hybrikproto.HybrikProto.internal_static_hybrikproto_CreateJobIn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nent.mam.proto.hybrikproto.CreateJobIn.class, com.nent.mam.proto.hybrikproto.CreateJobIn.Builder.class);
    }

    // Construct using com.nent.mam.proto.hybrikproto.CreateJobIn.newBuilder()
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
    public Builder clear() {
      super.clear();
      jobSpec_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.nent.mam.proto.hybrikproto.HybrikProto.internal_static_hybrikproto_CreateJobIn_descriptor;
    }

    public com.nent.mam.proto.hybrikproto.CreateJobIn getDefaultInstanceForType() {
      return com.nent.mam.proto.hybrikproto.CreateJobIn.getDefaultInstance();
    }

    public com.nent.mam.proto.hybrikproto.CreateJobIn build() {
      com.nent.mam.proto.hybrikproto.CreateJobIn result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.nent.mam.proto.hybrikproto.CreateJobIn buildPartial() {
      com.nent.mam.proto.hybrikproto.CreateJobIn result = new com.nent.mam.proto.hybrikproto.CreateJobIn(this);
      result.jobSpec_ = jobSpec_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.nent.mam.proto.hybrikproto.CreateJobIn) {
        return mergeFrom((com.nent.mam.proto.hybrikproto.CreateJobIn)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.nent.mam.proto.hybrikproto.CreateJobIn other) {
      if (other == com.nent.mam.proto.hybrikproto.CreateJobIn.getDefaultInstance()) return this;
      if (!other.getJobSpec().isEmpty()) {
        jobSpec_ = other.jobSpec_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.nent.mam.proto.hybrikproto.CreateJobIn parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.nent.mam.proto.hybrikproto.CreateJobIn) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object jobSpec_ = "";
    /**
     * <pre>
     *string dir = 1;
     *string file = 2;
     *string house_id = 3;
     * </pre>
     *
     * <code>string job_spec = 1;</code>
     */
    public java.lang.String getJobSpec() {
      java.lang.Object ref = jobSpec_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobSpec_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *string dir = 1;
     *string file = 2;
     *string house_id = 3;
     * </pre>
     *
     * <code>string job_spec = 1;</code>
     */
    public com.google.protobuf.ByteString
        getJobSpecBytes() {
      java.lang.Object ref = jobSpec_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobSpec_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *string dir = 1;
     *string file = 2;
     *string house_id = 3;
     * </pre>
     *
     * <code>string job_spec = 1;</code>
     */
    public Builder setJobSpec(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jobSpec_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *string dir = 1;
     *string file = 2;
     *string house_id = 3;
     * </pre>
     *
     * <code>string job_spec = 1;</code>
     */
    public Builder clearJobSpec() {
      
      jobSpec_ = getDefaultInstance().getJobSpec();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *string dir = 1;
     *string file = 2;
     *string house_id = 3;
     * </pre>
     *
     * <code>string job_spec = 1;</code>
     */
    public Builder setJobSpecBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jobSpec_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:hybrikproto.CreateJobIn)
  }

  // @@protoc_insertion_point(class_scope:hybrikproto.CreateJobIn)
  private static final com.nent.mam.proto.hybrikproto.CreateJobIn DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.nent.mam.proto.hybrikproto.CreateJobIn();
  }

  public static com.nent.mam.proto.hybrikproto.CreateJobIn getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateJobIn>
      PARSER = new com.google.protobuf.AbstractParser<CreateJobIn>() {
    public CreateJobIn parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateJobIn(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateJobIn> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateJobIn> getParserForType() {
    return PARSER;
  }

  public com.nent.mam.proto.hybrikproto.CreateJobIn getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

