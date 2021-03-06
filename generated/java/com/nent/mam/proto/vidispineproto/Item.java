// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vidispine.proto

package com.nent.mam.proto.vidispineproto;

/**
 * Protobuf type {@code vidispineproto.Item}
 */
public  final class Item extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:vidispineproto.Item)
    ItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Item.newBuilder() to construct.
  private Item(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Item() {
    itemId_ = "";
    assetId_ = "";
    shapeHeaders_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Item(
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

            itemId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            assetId_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              shapeHeaders_ = new java.util.ArrayList<com.nent.mam.proto.vidispineproto.ShapeHeader>();
              mutable_bitField0_ |= 0x00000004;
            }
            shapeHeaders_.add(
                input.readMessage(com.nent.mam.proto.vidispineproto.ShapeHeader.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        shapeHeaders_ = java.util.Collections.unmodifiableList(shapeHeaders_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_Item_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_Item_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.nent.mam.proto.vidispineproto.Item.class, com.nent.mam.proto.vidispineproto.Item.Builder.class);
  }

  private int bitField0_;
  public static final int ITEM_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object itemId_;
  /**
   * <code>string item_id = 1;</code>
   */
  public java.lang.String getItemId() {
    java.lang.Object ref = itemId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemId_ = s;
      return s;
    }
  }
  /**
   * <code>string item_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getItemIdBytes() {
    java.lang.Object ref = itemId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object assetId_;
  /**
   * <code>string asset_id = 2;</code>
   */
  public java.lang.String getAssetId() {
    java.lang.Object ref = assetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetId_ = s;
      return s;
    }
  }
  /**
   * <code>string asset_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAssetIdBytes() {
    java.lang.Object ref = assetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHAPE_HEADERS_FIELD_NUMBER = 3;
  private java.util.List<com.nent.mam.proto.vidispineproto.ShapeHeader> shapeHeaders_;
  /**
   * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
   */
  public java.util.List<com.nent.mam.proto.vidispineproto.ShapeHeader> getShapeHeadersList() {
    return shapeHeaders_;
  }
  /**
   * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
   */
  public java.util.List<? extends com.nent.mam.proto.vidispineproto.ShapeHeaderOrBuilder> 
      getShapeHeadersOrBuilderList() {
    return shapeHeaders_;
  }
  /**
   * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
   */
  public int getShapeHeadersCount() {
    return shapeHeaders_.size();
  }
  /**
   * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
   */
  public com.nent.mam.proto.vidispineproto.ShapeHeader getShapeHeaders(int index) {
    return shapeHeaders_.get(index);
  }
  /**
   * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
   */
  public com.nent.mam.proto.vidispineproto.ShapeHeaderOrBuilder getShapeHeadersOrBuilder(
      int index) {
    return shapeHeaders_.get(index);
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
    if (!getItemIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, itemId_);
    }
    if (!getAssetIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, assetId_);
    }
    for (int i = 0; i < shapeHeaders_.size(); i++) {
      output.writeMessage(3, shapeHeaders_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getItemIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, itemId_);
    }
    if (!getAssetIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, assetId_);
    }
    for (int i = 0; i < shapeHeaders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, shapeHeaders_.get(i));
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
    if (!(obj instanceof com.nent.mam.proto.vidispineproto.Item)) {
      return super.equals(obj);
    }
    com.nent.mam.proto.vidispineproto.Item other = (com.nent.mam.proto.vidispineproto.Item) obj;

    boolean result = true;
    result = result && getItemId()
        .equals(other.getItemId());
    result = result && getAssetId()
        .equals(other.getAssetId());
    result = result && getShapeHeadersList()
        .equals(other.getShapeHeadersList());
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
    hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getItemId().hashCode();
    hash = (37 * hash) + ASSET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAssetId().hashCode();
    if (getShapeHeadersCount() > 0) {
      hash = (37 * hash) + SHAPE_HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getShapeHeadersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.nent.mam.proto.vidispineproto.Item parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.vidispineproto.Item parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.Item parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.vidispineproto.Item parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.Item parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nent.mam.proto.vidispineproto.Item parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.Item parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.vidispineproto.Item parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.Item parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.vidispineproto.Item parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nent.mam.proto.vidispineproto.Item parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nent.mam.proto.vidispineproto.Item parseFrom(
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
  public static Builder newBuilder(com.nent.mam.proto.vidispineproto.Item prototype) {
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
   * Protobuf type {@code vidispineproto.Item}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:vidispineproto.Item)
      com.nent.mam.proto.vidispineproto.ItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_Item_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_Item_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nent.mam.proto.vidispineproto.Item.class, com.nent.mam.proto.vidispineproto.Item.Builder.class);
    }

    // Construct using com.nent.mam.proto.vidispineproto.Item.newBuilder()
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
        getShapeHeadersFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      itemId_ = "";

      assetId_ = "";

      if (shapeHeadersBuilder_ == null) {
        shapeHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        shapeHeadersBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.nent.mam.proto.vidispineproto.VidispineProto.internal_static_vidispineproto_Item_descriptor;
    }

    public com.nent.mam.proto.vidispineproto.Item getDefaultInstanceForType() {
      return com.nent.mam.proto.vidispineproto.Item.getDefaultInstance();
    }

    public com.nent.mam.proto.vidispineproto.Item build() {
      com.nent.mam.proto.vidispineproto.Item result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.nent.mam.proto.vidispineproto.Item buildPartial() {
      com.nent.mam.proto.vidispineproto.Item result = new com.nent.mam.proto.vidispineproto.Item(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.itemId_ = itemId_;
      result.assetId_ = assetId_;
      if (shapeHeadersBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          shapeHeaders_ = java.util.Collections.unmodifiableList(shapeHeaders_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.shapeHeaders_ = shapeHeaders_;
      } else {
        result.shapeHeaders_ = shapeHeadersBuilder_.build();
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
      if (other instanceof com.nent.mam.proto.vidispineproto.Item) {
        return mergeFrom((com.nent.mam.proto.vidispineproto.Item)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.nent.mam.proto.vidispineproto.Item other) {
      if (other == com.nent.mam.proto.vidispineproto.Item.getDefaultInstance()) return this;
      if (!other.getItemId().isEmpty()) {
        itemId_ = other.itemId_;
        onChanged();
      }
      if (!other.getAssetId().isEmpty()) {
        assetId_ = other.assetId_;
        onChanged();
      }
      if (shapeHeadersBuilder_ == null) {
        if (!other.shapeHeaders_.isEmpty()) {
          if (shapeHeaders_.isEmpty()) {
            shapeHeaders_ = other.shapeHeaders_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureShapeHeadersIsMutable();
            shapeHeaders_.addAll(other.shapeHeaders_);
          }
          onChanged();
        }
      } else {
        if (!other.shapeHeaders_.isEmpty()) {
          if (shapeHeadersBuilder_.isEmpty()) {
            shapeHeadersBuilder_.dispose();
            shapeHeadersBuilder_ = null;
            shapeHeaders_ = other.shapeHeaders_;
            bitField0_ = (bitField0_ & ~0x00000004);
            shapeHeadersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getShapeHeadersFieldBuilder() : null;
          } else {
            shapeHeadersBuilder_.addAllMessages(other.shapeHeaders_);
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
      com.nent.mam.proto.vidispineproto.Item parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.nent.mam.proto.vidispineproto.Item) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object itemId_ = "";
    /**
     * <code>string item_id = 1;</code>
     */
    public java.lang.String getItemId() {
      java.lang.Object ref = itemId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string item_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getItemIdBytes() {
      java.lang.Object ref = itemId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string item_id = 1;</code>
     */
    public Builder setItemId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string item_id = 1;</code>
     */
    public Builder clearItemId() {
      
      itemId_ = getDefaultInstance().getItemId();
      onChanged();
      return this;
    }
    /**
     * <code>string item_id = 1;</code>
     */
    public Builder setItemIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object assetId_ = "";
    /**
     * <code>string asset_id = 2;</code>
     */
    public java.lang.String getAssetId() {
      java.lang.Object ref = assetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string asset_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAssetIdBytes() {
      java.lang.Object ref = assetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string asset_id = 2;</code>
     */
    public Builder setAssetId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      assetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string asset_id = 2;</code>
     */
    public Builder clearAssetId() {
      
      assetId_ = getDefaultInstance().getAssetId();
      onChanged();
      return this;
    }
    /**
     * <code>string asset_id = 2;</code>
     */
    public Builder setAssetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      assetId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.nent.mam.proto.vidispineproto.ShapeHeader> shapeHeaders_ =
      java.util.Collections.emptyList();
    private void ensureShapeHeadersIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        shapeHeaders_ = new java.util.ArrayList<com.nent.mam.proto.vidispineproto.ShapeHeader>(shapeHeaders_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.nent.mam.proto.vidispineproto.ShapeHeader, com.nent.mam.proto.vidispineproto.ShapeHeader.Builder, com.nent.mam.proto.vidispineproto.ShapeHeaderOrBuilder> shapeHeadersBuilder_;

    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public java.util.List<com.nent.mam.proto.vidispineproto.ShapeHeader> getShapeHeadersList() {
      if (shapeHeadersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(shapeHeaders_);
      } else {
        return shapeHeadersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public int getShapeHeadersCount() {
      if (shapeHeadersBuilder_ == null) {
        return shapeHeaders_.size();
      } else {
        return shapeHeadersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public com.nent.mam.proto.vidispineproto.ShapeHeader getShapeHeaders(int index) {
      if (shapeHeadersBuilder_ == null) {
        return shapeHeaders_.get(index);
      } else {
        return shapeHeadersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public Builder setShapeHeaders(
        int index, com.nent.mam.proto.vidispineproto.ShapeHeader value) {
      if (shapeHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShapeHeadersIsMutable();
        shapeHeaders_.set(index, value);
        onChanged();
      } else {
        shapeHeadersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public Builder setShapeHeaders(
        int index, com.nent.mam.proto.vidispineproto.ShapeHeader.Builder builderForValue) {
      if (shapeHeadersBuilder_ == null) {
        ensureShapeHeadersIsMutable();
        shapeHeaders_.set(index, builderForValue.build());
        onChanged();
      } else {
        shapeHeadersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public Builder addShapeHeaders(com.nent.mam.proto.vidispineproto.ShapeHeader value) {
      if (shapeHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShapeHeadersIsMutable();
        shapeHeaders_.add(value);
        onChanged();
      } else {
        shapeHeadersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public Builder addShapeHeaders(
        int index, com.nent.mam.proto.vidispineproto.ShapeHeader value) {
      if (shapeHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShapeHeadersIsMutable();
        shapeHeaders_.add(index, value);
        onChanged();
      } else {
        shapeHeadersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public Builder addShapeHeaders(
        com.nent.mam.proto.vidispineproto.ShapeHeader.Builder builderForValue) {
      if (shapeHeadersBuilder_ == null) {
        ensureShapeHeadersIsMutable();
        shapeHeaders_.add(builderForValue.build());
        onChanged();
      } else {
        shapeHeadersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public Builder addShapeHeaders(
        int index, com.nent.mam.proto.vidispineproto.ShapeHeader.Builder builderForValue) {
      if (shapeHeadersBuilder_ == null) {
        ensureShapeHeadersIsMutable();
        shapeHeaders_.add(index, builderForValue.build());
        onChanged();
      } else {
        shapeHeadersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public Builder addAllShapeHeaders(
        java.lang.Iterable<? extends com.nent.mam.proto.vidispineproto.ShapeHeader> values) {
      if (shapeHeadersBuilder_ == null) {
        ensureShapeHeadersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, shapeHeaders_);
        onChanged();
      } else {
        shapeHeadersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public Builder clearShapeHeaders() {
      if (shapeHeadersBuilder_ == null) {
        shapeHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        shapeHeadersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public Builder removeShapeHeaders(int index) {
      if (shapeHeadersBuilder_ == null) {
        ensureShapeHeadersIsMutable();
        shapeHeaders_.remove(index);
        onChanged();
      } else {
        shapeHeadersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public com.nent.mam.proto.vidispineproto.ShapeHeader.Builder getShapeHeadersBuilder(
        int index) {
      return getShapeHeadersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public com.nent.mam.proto.vidispineproto.ShapeHeaderOrBuilder getShapeHeadersOrBuilder(
        int index) {
      if (shapeHeadersBuilder_ == null) {
        return shapeHeaders_.get(index);  } else {
        return shapeHeadersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public java.util.List<? extends com.nent.mam.proto.vidispineproto.ShapeHeaderOrBuilder> 
         getShapeHeadersOrBuilderList() {
      if (shapeHeadersBuilder_ != null) {
        return shapeHeadersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(shapeHeaders_);
      }
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public com.nent.mam.proto.vidispineproto.ShapeHeader.Builder addShapeHeadersBuilder() {
      return getShapeHeadersFieldBuilder().addBuilder(
          com.nent.mam.proto.vidispineproto.ShapeHeader.getDefaultInstance());
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public com.nent.mam.proto.vidispineproto.ShapeHeader.Builder addShapeHeadersBuilder(
        int index) {
      return getShapeHeadersFieldBuilder().addBuilder(
          index, com.nent.mam.proto.vidispineproto.ShapeHeader.getDefaultInstance());
    }
    /**
     * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
     */
    public java.util.List<com.nent.mam.proto.vidispineproto.ShapeHeader.Builder> 
         getShapeHeadersBuilderList() {
      return getShapeHeadersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.nent.mam.proto.vidispineproto.ShapeHeader, com.nent.mam.proto.vidispineproto.ShapeHeader.Builder, com.nent.mam.proto.vidispineproto.ShapeHeaderOrBuilder> 
        getShapeHeadersFieldBuilder() {
      if (shapeHeadersBuilder_ == null) {
        shapeHeadersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.nent.mam.proto.vidispineproto.ShapeHeader, com.nent.mam.proto.vidispineproto.ShapeHeader.Builder, com.nent.mam.proto.vidispineproto.ShapeHeaderOrBuilder>(
                shapeHeaders_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        shapeHeaders_ = null;
      }
      return shapeHeadersBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:vidispineproto.Item)
  }

  // @@protoc_insertion_point(class_scope:vidispineproto.Item)
  private static final com.nent.mam.proto.vidispineproto.Item DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.nent.mam.proto.vidispineproto.Item();
  }

  public static com.nent.mam.proto.vidispineproto.Item getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Item>
      PARSER = new com.google.protobuf.AbstractParser<Item>() {
    public Item parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Item(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Item> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Item> getParserForType() {
    return PARSER;
  }

  public com.nent.mam.proto.vidispineproto.Item getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

