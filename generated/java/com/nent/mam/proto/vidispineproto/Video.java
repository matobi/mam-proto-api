// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vidispine.proto

package com.nent.mam.proto.vidispineproto;

/**
 * Protobuf type {@code vidispineproto.Video}
 */
public  final class Video extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:vidispineproto.Video)
    VideoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Video.newBuilder() to construct.
  private Video(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Video() {
    id_ = "";
    bitrate_ = 0L;
    codec_ = "";
    files_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Video(
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

            id_ = s;
            break;
          }
          case 16: {

            bitrate_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            codec_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              files_ = new java.util.ArrayList<com.nent.mam.proto.vidispineproto.File>();
              mutable_bitField0_ |= 0x00000008;
            }
            files_.add(
                input.readMessage(com.nent.mam.proto.vidispineproto.File.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        files_ = java.util.Collections.unmodifiableList(files_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_Video_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_Video_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.nent.mam.proto.vidispineproto.Video.class, com.nent.mam.proto.vidispineproto.Video.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BITRATE_FIELD_NUMBER = 2;
  private long bitrate_;
  /**
   * <code>int64 bitrate = 2;</code>
   */
  public long getBitrate() {
    return bitrate_;
  }

  public static final int CODEC_FIELD_NUMBER = 3;
  private volatile java.lang.Object codec_;
  /**
   * <code>string codec = 3;</code>
   */
  public java.lang.String getCodec() {
    java.lang.Object ref = codec_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codec_ = s;
      return s;
    }
  }
  /**
   * <code>string codec = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCodecBytes() {
    java.lang.Object ref = codec_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      codec_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILES_FIELD_NUMBER = 4;
  private java.util.List<com.nent.mam.proto.vidispineproto.File> files_;
  /**
   * <code>repeated .vidispineproto.File files = 4;</code>
   */
  public java.util.List<com.nent.mam.proto.vidispineproto.File> getFilesList() {
    return files_;
  }
  /**
   * <code>repeated .vidispineproto.File files = 4;</code>
   */
  public java.util.List<? extends com.nent.mam.proto.vidispineproto.FileOrBuilder> 
      getFilesOrBuilderList() {
    return files_;
  }
  /**
   * <code>repeated .vidispineproto.File files = 4;</code>
   */
  public int getFilesCount() {
    return files_.size();
  }
  /**
   * <code>repeated .vidispineproto.File files = 4;</code>
   */
  public com.nent.mam.proto.vidispineproto.File getFiles(int index) {
    return files_.get(index);
  }
  /**
   * <code>repeated .vidispineproto.File files = 4;</code>
   */
  public com.nent.mam.proto.vidispineproto.FileOrBuilder getFilesOrBuilder(
      int index) {
    return files_.get(index);
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (bitrate_ != 0L) {
      output.writeInt64(2, bitrate_);
    }
    if (!getCodecBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, codec_);
    }
    for (int i = 0; i < files_.size(); i++) {
      output.writeMessage(4, files_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (bitrate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, bitrate_);
    }
    if (!getCodecBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, codec_);
    }
    for (int i = 0; i < files_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, files_.get(i));
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
    if (!(obj instanceof com.nent.mam.proto.vidispineproto.Video)) {
      return super.equals(obj);
    }
    com.nent.mam.proto.vidispineproto.Video other = (com.nent.mam.proto.vidispineproto.Video) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && (getBitrate()
        == other.getBitrate());
    result = result && getCodec()
        .equals(other.getCodec());
    result = result && getFilesList()
        .equals(other.getFilesList());
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + BITRATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBitrate());
    hash = (37 * hash) + CODEC_FIELD_NUMBER;
    hash = (53 * hash) + getCodec().hashCode();
    if (getFilesCount() > 0) {
      hash = (37 * hash) + FILES_FIELD_NUMBER;
      hash = (53 * hash) + getFilesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.nent.mam.proto.vidispineproto.Video parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.vidispineproto.Video parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.Video parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.vidispineproto.Video parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.Video parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.vidispineproto.Video parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.Video parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.vidispineproto.Video parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.Video parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.vidispineproto.Video parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.Video parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.vidispineproto.Video parseFrom(
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
  public static Builder newBuilder(com.nent.mam.proto.vidispineproto.Video prototype) {
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
   * Protobuf type {@code vidispineproto.Video}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:vidispineproto.Video)
      com.nent.mam.proto.vidispineproto.VideoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_Video_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_Video_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nent.mam.proto.vidispineproto.Video.class, com.nent.mam.proto.vidispineproto.Video.Builder.class);
    }

    // Construct using com.nent.mam.proto.vidispineproto.Video.newBuilder()
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
        getFilesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      id_ = "";

      bitrate_ = 0L;

      codec_ = "";

      if (filesBuilder_ == null) {
        files_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        filesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_Video_descriptor;
    }

    public com.nent.mam.proto.vidispineproto.Video getDefaultInstanceForType() {
      return com.nent.mam.proto.vidispineproto.Video.getDefaultInstance();
    }

    public com.nent.mam.proto.vidispineproto.Video build() {
      com.nent.mam.proto.vidispineproto.Video result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.nent.mam.proto.vidispineproto.Video buildPartial() {
      com.nent.mam.proto.vidispineproto.Video result = new com.nent.mam.proto.vidispineproto.Video(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.bitrate_ = bitrate_;
      result.codec_ = codec_;
      if (filesBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          files_ = java.util.Collections.unmodifiableList(files_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.files_ = files_;
      } else {
        result.files_ = filesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.nent.mam.proto.vidispineproto.Video) {
        return mergeFrom((com.nent.mam.proto.vidispineproto.Video)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.nent.mam.proto.vidispineproto.Video other) {
      if (other == com.nent.mam.proto.vidispineproto.Video.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.getBitrate() != 0L) {
        setBitrate(other.getBitrate());
      }
      if (!other.getCodec().isEmpty()) {
        codec_ = other.codec_;
        onChanged();
      }
      if (filesBuilder_ == null) {
        if (!other.files_.isEmpty()) {
          if (files_.isEmpty()) {
            files_ = other.files_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureFilesIsMutable();
            files_.addAll(other.files_);
          }
          onChanged();
        }
      } else {
        if (!other.files_.isEmpty()) {
          if (filesBuilder_.isEmpty()) {
            filesBuilder_.dispose();
            filesBuilder_ = null;
            files_ = other.files_;
            bitField0_ = (bitField0_ & ~0x00000008);
            filesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFilesFieldBuilder() : null;
          } else {
            filesBuilder_.addAllMessages(other.files_);
          }
        }
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
      com.nent.mam.proto.vidispineproto.Video parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.nent.mam.proto.vidispineproto.Video) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private long bitrate_ ;
    /**
     * <code>int64 bitrate = 2;</code>
     */
    public long getBitrate() {
      return bitrate_;
    }
    /**
     * <code>int64 bitrate = 2;</code>
     */
    public Builder setBitrate(long value) {
      
      bitrate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 bitrate = 2;</code>
     */
    public Builder clearBitrate() {
      
      bitrate_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object codec_ = "";
    /**
     * <code>string codec = 3;</code>
     */
    public java.lang.String getCodec() {
      java.lang.Object ref = codec_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codec_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string codec = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCodecBytes() {
      java.lang.Object ref = codec_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codec_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string codec = 3;</code>
     */
    public Builder setCodec(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      codec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string codec = 3;</code>
     */
    public Builder clearCodec() {
      
      codec_ = getDefaultInstance().getCodec();
      onChanged();
      return this;
    }
    /**
     * <code>string codec = 3;</code>
     */
    public Builder setCodecBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      codec_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.nent.mam.proto.vidispineproto.File> files_ =
      java.util.Collections.emptyList();
    private void ensureFilesIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        files_ = new java.util.ArrayList<com.nent.mam.proto.vidispineproto.File>(files_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.nent.mam.proto.vidispineproto.File, com.nent.mam.proto.vidispineproto.File.Builder, com.nent.mam.proto.vidispineproto.FileOrBuilder> filesBuilder_;

    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public java.util.List<com.nent.mam.proto.vidispineproto.File> getFilesList() {
      if (filesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(files_);
      } else {
        return filesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public int getFilesCount() {
      if (filesBuilder_ == null) {
        return files_.size();
      } else {
        return filesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public com.nent.mam.proto.vidispineproto.File getFiles(int index) {
      if (filesBuilder_ == null) {
        return files_.get(index);
      } else {
        return filesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public Builder setFiles(
        int index, com.nent.mam.proto.vidispineproto.File value) {
      if (filesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilesIsMutable();
        files_.set(index, value);
        onChanged();
      } else {
        filesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public Builder setFiles(
        int index, com.nent.mam.proto.vidispineproto.File.Builder builderForValue) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.set(index, builderForValue.build());
        onChanged();
      } else {
        filesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public Builder addFiles(com.nent.mam.proto.vidispineproto.File value) {
      if (filesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilesIsMutable();
        files_.add(value);
        onChanged();
      } else {
        filesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public Builder addFiles(
        int index, com.nent.mam.proto.vidispineproto.File value) {
      if (filesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilesIsMutable();
        files_.add(index, value);
        onChanged();
      } else {
        filesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public Builder addFiles(
        com.nent.mam.proto.vidispineproto.File.Builder builderForValue) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.add(builderForValue.build());
        onChanged();
      } else {
        filesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public Builder addFiles(
        int index, com.nent.mam.proto.vidispineproto.File.Builder builderForValue) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.add(index, builderForValue.build());
        onChanged();
      } else {
        filesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public Builder addAllFiles(
        java.lang.Iterable<? extends com.nent.mam.proto.vidispineproto.File> values) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, files_);
        onChanged();
      } else {
        filesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public Builder clearFiles() {
      if (filesBuilder_ == null) {
        files_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        filesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public Builder removeFiles(int index) {
      if (filesBuilder_ == null) {
        ensureFilesIsMutable();
        files_.remove(index);
        onChanged();
      } else {
        filesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public com.nent.mam.proto.vidispineproto.File.Builder getFilesBuilder(
        int index) {
      return getFilesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public com.nent.mam.proto.vidispineproto.FileOrBuilder getFilesOrBuilder(
        int index) {
      if (filesBuilder_ == null) {
        return files_.get(index);  } else {
        return filesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public java.util.List<? extends com.nent.mam.proto.vidispineproto.FileOrBuilder> 
         getFilesOrBuilderList() {
      if (filesBuilder_ != null) {
        return filesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(files_);
      }
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public com.nent.mam.proto.vidispineproto.File.Builder addFilesBuilder() {
      return getFilesFieldBuilder().addBuilder(
          com.nent.mam.proto.vidispineproto.File.getDefaultInstance());
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public com.nent.mam.proto.vidispineproto.File.Builder addFilesBuilder(
        int index) {
      return getFilesFieldBuilder().addBuilder(
          index, com.nent.mam.proto.vidispineproto.File.getDefaultInstance());
    }
    /**
     * <code>repeated .vidispineproto.File files = 4;</code>
     */
    public java.util.List<com.nent.mam.proto.vidispineproto.File.Builder> 
         getFilesBuilderList() {
      return getFilesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.nent.mam.proto.vidispineproto.File, com.nent.mam.proto.vidispineproto.File.Builder, com.nent.mam.proto.vidispineproto.FileOrBuilder> 
        getFilesFieldBuilder() {
      if (filesBuilder_ == null) {
        filesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.nent.mam.proto.vidispineproto.File, com.nent.mam.proto.vidispineproto.File.Builder, com.nent.mam.proto.vidispineproto.FileOrBuilder>(
                files_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        files_ = null;
      }
      return filesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:vidispineproto.Video)
  }

  // @@protoc_insertion_point(class_scope:vidispineproto.Video)
  private static final com.nent.mam.proto.vidispineproto.Video DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.nent.mam.proto.vidispineproto.Video();
  }

  public static com.nent.mam.proto.vidispineproto.Video getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Video>
      PARSER = new com.google.protobuf.AbstractParser<Video>() {
    public Video parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Video(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Video> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Video> getParserForType() {
    return PARSER;
  }

  public com.nent.mam.proto.vidispineproto.Video getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

