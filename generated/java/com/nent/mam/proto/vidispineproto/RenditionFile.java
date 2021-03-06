// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vidispine.proto

package com.nent.mam.proto.vidispineproto;

/**
 * Protobuf type {@code vidispineproto.RenditionFile}
 */
public  final class RenditionFile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:vidispineproto.RenditionFile)
    RenditionFileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RenditionFile.newBuilder() to construct.
  private RenditionFile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RenditionFile() {
    dir_ = "";
    filename_ = "";
    mediaType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RenditionFile(
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

            dir_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            filename_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            mediaType_ = s;
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
    return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_RenditionFile_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_RenditionFile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.nent.mam.proto.vidispineproto.RenditionFile.class, com.nent.mam.proto.vidispineproto.RenditionFile.Builder.class);
  }

  public static final int DIR_FIELD_NUMBER = 1;
  private volatile java.lang.Object dir_;
  /**
   * <code>string dir = 1;</code>
   */
  public java.lang.String getDir() {
    java.lang.Object ref = dir_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dir_ = s;
      return s;
    }
  }
  /**
   * <code>string dir = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDirBytes() {
    java.lang.Object ref = dir_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dir_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object filename_;
  /**
   * <code>string filename = 2;</code>
   */
  public java.lang.String getFilename() {
    java.lang.Object ref = filename_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filename_ = s;
      return s;
    }
  }
  /**
   * <code>string filename = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFilenameBytes() {
    java.lang.Object ref = filename_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filename_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEDIA_TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object mediaType_;
  /**
   * <code>string media_type = 3;</code>
   */
  public java.lang.String getMediaType() {
    java.lang.Object ref = mediaType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mediaType_ = s;
      return s;
    }
  }
  /**
   * <code>string media_type = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMediaTypeBytes() {
    java.lang.Object ref = mediaType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mediaType_ = b;
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
    if (!getDirBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dir_);
    }
    if (!getFilenameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filename_);
    }
    if (!getMediaTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mediaType_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDirBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dir_);
    }
    if (!getFilenameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filename_);
    }
    if (!getMediaTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mediaType_);
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
    if (!(obj instanceof com.nent.mam.proto.vidispineproto.RenditionFile)) {
      return super.equals(obj);
    }
    com.nent.mam.proto.vidispineproto.RenditionFile other = (com.nent.mam.proto.vidispineproto.RenditionFile) obj;

    boolean result = true;
    result = result && getDir()
        .equals(other.getDir());
    result = result && getFilename()
        .equals(other.getFilename());
    result = result && getMediaType()
        .equals(other.getMediaType());
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
    hash = (37 * hash) + DIR_FIELD_NUMBER;
    hash = (53 * hash) + getDir().hashCode();
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFilename().hashCode();
    hash = (37 * hash) + MEDIA_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMediaType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.nent.mam.proto.vidispineproto.RenditionFile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.vidispineproto.RenditionFile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.RenditionFile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.vidispineproto.RenditionFile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.RenditionFile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.vidispineproto.RenditionFile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.RenditionFile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.vidispineproto.RenditionFile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.RenditionFile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.vidispineproto.RenditionFile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.RenditionFile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.vidispineproto.RenditionFile parseFrom(
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
  public static Builder newBuilder(com.nent.mam.proto.vidispineproto.RenditionFile prototype) {
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
   * Protobuf type {@code vidispineproto.RenditionFile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:vidispineproto.RenditionFile)
      com.nent.mam.proto.vidispineproto.RenditionFileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_RenditionFile_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_RenditionFile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nent.mam.proto.vidispineproto.RenditionFile.class, com.nent.mam.proto.vidispineproto.RenditionFile.Builder.class);
    }

    // Construct using com.nent.mam.proto.vidispineproto.RenditionFile.newBuilder()
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
      dir_ = "";

      filename_ = "";

      mediaType_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_RenditionFile_descriptor;
    }

    public com.nent.mam.proto.vidispineproto.RenditionFile getDefaultInstanceForType() {
      return com.nent.mam.proto.vidispineproto.RenditionFile.getDefaultInstance();
    }

    public com.nent.mam.proto.vidispineproto.RenditionFile build() {
      com.nent.mam.proto.vidispineproto.RenditionFile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.nent.mam.proto.vidispineproto.RenditionFile buildPartial() {
      com.nent.mam.proto.vidispineproto.RenditionFile result = new com.nent.mam.proto.vidispineproto.RenditionFile(this);
      result.dir_ = dir_;
      result.filename_ = filename_;
      result.mediaType_ = mediaType_;
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
      if (other instanceof com.nent.mam.proto.vidispineproto.RenditionFile) {
        return mergeFrom((com.nent.mam.proto.vidispineproto.RenditionFile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.nent.mam.proto.vidispineproto.RenditionFile other) {
      if (other == com.nent.mam.proto.vidispineproto.RenditionFile.getDefaultInstance()) return this;
      if (!other.getDir().isEmpty()) {
        dir_ = other.dir_;
        onChanged();
      }
      if (!other.getFilename().isEmpty()) {
        filename_ = other.filename_;
        onChanged();
      }
      if (!other.getMediaType().isEmpty()) {
        mediaType_ = other.mediaType_;
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
      com.nent.mam.proto.vidispineproto.RenditionFile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.nent.mam.proto.vidispineproto.RenditionFile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dir_ = "";
    /**
     * <code>string dir = 1;</code>
     */
    public java.lang.String getDir() {
      java.lang.Object ref = dir_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dir_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dir = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDirBytes() {
      java.lang.Object ref = dir_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dir_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dir = 1;</code>
     */
    public Builder setDir(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dir_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dir = 1;</code>
     */
    public Builder clearDir() {
      
      dir_ = getDefaultInstance().getDir();
      onChanged();
      return this;
    }
    /**
     * <code>string dir = 1;</code>
     */
    public Builder setDirBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dir_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filename_ = "";
    /**
     * <code>string filename = 2;</code>
     */
    public java.lang.String getFilename() {
      java.lang.Object ref = filename_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filename_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string filename = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFilenameBytes() {
      java.lang.Object ref = filename_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string filename = 2;</code>
     */
    public Builder setFilename(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filename_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string filename = 2;</code>
     */
    public Builder clearFilename() {
      
      filename_ = getDefaultInstance().getFilename();
      onChanged();
      return this;
    }
    /**
     * <code>string filename = 2;</code>
     */
    public Builder setFilenameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filename_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object mediaType_ = "";
    /**
     * <code>string media_type = 3;</code>
     */
    public java.lang.String getMediaType() {
      java.lang.Object ref = mediaType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mediaType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string media_type = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMediaTypeBytes() {
      java.lang.Object ref = mediaType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mediaType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string media_type = 3;</code>
     */
    public Builder setMediaType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mediaType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string media_type = 3;</code>
     */
    public Builder clearMediaType() {
      
      mediaType_ = getDefaultInstance().getMediaType();
      onChanged();
      return this;
    }
    /**
     * <code>string media_type = 3;</code>
     */
    public Builder setMediaTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mediaType_ = value;
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


    // @@protoc_insertion_point(builder_scope:vidispineproto.RenditionFile)
  }

  // @@protoc_insertion_point(class_scope:vidispineproto.RenditionFile)
  private static final com.nent.mam.proto.vidispineproto.RenditionFile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.nent.mam.proto.vidispineproto.RenditionFile();
  }

  public static com.nent.mam.proto.vidispineproto.RenditionFile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RenditionFile>
      PARSER = new com.google.protobuf.AbstractParser<RenditionFile>() {
    public RenditionFile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RenditionFile(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RenditionFile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RenditionFile> getParserForType() {
    return PARSER;
  }

  public com.nent.mam.proto.vidispineproto.RenditionFile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

