// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hybrik.proto

package com.nent.mam.proto.hybrikproto;

/**
 * Protobuf type {@code hybrikproto.JobOut}
 */
public  final class JobOut extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:hybrikproto.JobOut)
    JobOutOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobOut.newBuilder() to construct.
  private JobOut(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobOut() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobOut(
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
            com.nent.mam.proto.hybrikproto.Job.Builder subBuilder = null;
            if (job_ != null) {
              subBuilder = job_.toBuilder();
            }
            job_ = input.readMessage(com.nent.mam.proto.hybrikproto.Job.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(job_);
              job_ = subBuilder.buildPartial();
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
    return com.nent.mam.proto.hybrikproto.HybrikProto.internal_static_hybrikproto_JobOut_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.nent.mam.proto.hybrikproto.HybrikProto.internal_static_hybrikproto_JobOut_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.nent.mam.proto.hybrikproto.JobOut.class, com.nent.mam.proto.hybrikproto.JobOut.Builder.class);
  }

  public static final int JOB_FIELD_NUMBER = 1;
  private com.nent.mam.proto.hybrikproto.Job job_;
  /**
   * <code>.hybrikproto.Job job = 1;</code>
   */
  public boolean hasJob() {
    return job_ != null;
  }
  /**
   * <code>.hybrikproto.Job job = 1;</code>
   */
  public com.nent.mam.proto.hybrikproto.Job getJob() {
    return job_ == null ? com.nent.mam.proto.hybrikproto.Job.getDefaultInstance() : job_;
  }
  /**
   * <code>.hybrikproto.Job job = 1;</code>
   */
  public com.nent.mam.proto.hybrikproto.JobOrBuilder getJobOrBuilder() {
    return getJob();
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
    if (job_ != null) {
      output.writeMessage(1, getJob());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (job_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getJob());
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
    if (!(obj instanceof com.nent.mam.proto.hybrikproto.JobOut)) {
      return super.equals(obj);
    }
    com.nent.mam.proto.hybrikproto.JobOut other = (com.nent.mam.proto.hybrikproto.JobOut) obj;

    boolean result = true;
    result = result && (hasJob() == other.hasJob());
    if (hasJob()) {
      result = result && getJob()
          .equals(other.getJob());
    }
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
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.nent.mam.proto.hybrikproto.JobOut parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.hybrikproto.JobOut parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.hybrikproto.JobOut parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.hybrikproto.JobOut parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.hybrikproto.JobOut parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.hybrikproto.JobOut parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.hybrikproto.JobOut parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.hybrikproto.JobOut parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nent.mam.proto.hybrikproto.JobOut parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.hybrikproto.JobOut parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nent.mam.proto.hybrikproto.JobOut parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.hybrikproto.JobOut parseFrom(
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
  public static Builder newBuilder(com.nent.mam.proto.hybrikproto.JobOut prototype) {
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
   * Protobuf type {@code hybrikproto.JobOut}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:hybrikproto.JobOut)
      com.nent.mam.proto.hybrikproto.JobOutOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nent.mam.proto.hybrikproto.HybrikProto.internal_static_hybrikproto_JobOut_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nent.mam.proto.hybrikproto.HybrikProto.internal_static_hybrikproto_JobOut_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nent.mam.proto.hybrikproto.JobOut.class, com.nent.mam.proto.hybrikproto.JobOut.Builder.class);
    }

    // Construct using com.nent.mam.proto.hybrikproto.JobOut.newBuilder()
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
      if (jobBuilder_ == null) {
        job_ = null;
      } else {
        job_ = null;
        jobBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.nent.mam.proto.hybrikproto.HybrikProto.internal_static_hybrikproto_JobOut_descriptor;
    }

    public com.nent.mam.proto.hybrikproto.JobOut getDefaultInstanceForType() {
      return com.nent.mam.proto.hybrikproto.JobOut.getDefaultInstance();
    }

    public com.nent.mam.proto.hybrikproto.JobOut build() {
      com.nent.mam.proto.hybrikproto.JobOut result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.nent.mam.proto.hybrikproto.JobOut buildPartial() {
      com.nent.mam.proto.hybrikproto.JobOut result = new com.nent.mam.proto.hybrikproto.JobOut(this);
      if (jobBuilder_ == null) {
        result.job_ = job_;
      } else {
        result.job_ = jobBuilder_.build();
      }
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
      if (other instanceof com.nent.mam.proto.hybrikproto.JobOut) {
        return mergeFrom((com.nent.mam.proto.hybrikproto.JobOut)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.nent.mam.proto.hybrikproto.JobOut other) {
      if (other == com.nent.mam.proto.hybrikproto.JobOut.getDefaultInstance()) return this;
      if (other.hasJob()) {
        mergeJob(other.getJob());
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
      com.nent.mam.proto.hybrikproto.JobOut parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.nent.mam.proto.hybrikproto.JobOut) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.nent.mam.proto.hybrikproto.Job job_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.nent.mam.proto.hybrikproto.Job, com.nent.mam.proto.hybrikproto.Job.Builder, com.nent.mam.proto.hybrikproto.JobOrBuilder> jobBuilder_;
    /**
     * <code>.hybrikproto.Job job = 1;</code>
     */
    public boolean hasJob() {
      return jobBuilder_ != null || job_ != null;
    }
    /**
     * <code>.hybrikproto.Job job = 1;</code>
     */
    public com.nent.mam.proto.hybrikproto.Job getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? com.nent.mam.proto.hybrikproto.Job.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     * <code>.hybrikproto.Job job = 1;</code>
     */
    public Builder setJob(com.nent.mam.proto.hybrikproto.Job value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
        onChanged();
      } else {
        jobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.hybrikproto.Job job = 1;</code>
     */
    public Builder setJob(
        com.nent.mam.proto.hybrikproto.Job.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
        onChanged();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.hybrikproto.Job job = 1;</code>
     */
    public Builder mergeJob(com.nent.mam.proto.hybrikproto.Job value) {
      if (jobBuilder_ == null) {
        if (job_ != null) {
          job_ =
            com.nent.mam.proto.hybrikproto.Job.newBuilder(job_).mergeFrom(value).buildPartial();
        } else {
          job_ = value;
        }
        onChanged();
      } else {
        jobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.hybrikproto.Job job = 1;</code>
     */
    public Builder clearJob() {
      if (jobBuilder_ == null) {
        job_ = null;
        onChanged();
      } else {
        job_ = null;
        jobBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.hybrikproto.Job job = 1;</code>
     */
    public com.nent.mam.proto.hybrikproto.Job.Builder getJobBuilder() {
      
      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     * <code>.hybrikproto.Job job = 1;</code>
     */
    public com.nent.mam.proto.hybrikproto.JobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ?
            com.nent.mam.proto.hybrikproto.Job.getDefaultInstance() : job_;
      }
    }
    /**
     * <code>.hybrikproto.Job job = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.nent.mam.proto.hybrikproto.Job, com.nent.mam.proto.hybrikproto.Job.Builder, com.nent.mam.proto.hybrikproto.JobOrBuilder> 
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.nent.mam.proto.hybrikproto.Job, com.nent.mam.proto.hybrikproto.Job.Builder, com.nent.mam.proto.hybrikproto.JobOrBuilder>(
                getJob(),
                getParentForChildren(),
                isClean());
        job_ = null;
      }
      return jobBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:hybrikproto.JobOut)
  }

  // @@protoc_insertion_point(class_scope:hybrikproto.JobOut)
  private static final com.nent.mam.proto.hybrikproto.JobOut DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.nent.mam.proto.hybrikproto.JobOut();
  }

  public static com.nent.mam.proto.hybrikproto.JobOut getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobOut>
      PARSER = new com.google.protobuf.AbstractParser<JobOut>() {
    public JobOut parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JobOut(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobOut> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobOut> getParserForType() {
    return PARSER;
  }

  public com.nent.mam.proto.hybrikproto.JobOut getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

