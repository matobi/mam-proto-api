// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vidispine.proto

package com.nent.mam.proto.vidispineproto;

public interface ShapeHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:vidispineproto.ShapeHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string shape_id = 1;</code>
   */
  java.lang.String getShapeId();
  /**
   * <code>string shape_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getShapeIdBytes();

  /**
   * <code>int32 version = 2;</code>
   */
  int getVersion();

  /**
   * <code>repeated string tags = 3;</code>
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 3;</code>
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 3;</code>
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 3;</code>
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <code>repeated .vidispineproto.KeyValue metadata = 4;</code>
   */
  java.util.List<com.nent.mam.proto.vidispineproto.KeyValue> 
      getMetadataList();
  /**
   * <code>repeated .vidispineproto.KeyValue metadata = 4;</code>
   */
  com.nent.mam.proto.vidispineproto.KeyValue getMetadata(int index);
  /**
   * <code>repeated .vidispineproto.KeyValue metadata = 4;</code>
   */
  int getMetadataCount();
  /**
   * <code>repeated .vidispineproto.KeyValue metadata = 4;</code>
   */
  java.util.List<? extends com.nent.mam.proto.vidispineproto.KeyValueOrBuilder> 
      getMetadataOrBuilderList();
  /**
   * <code>repeated .vidispineproto.KeyValue metadata = 4;</code>
   */
  com.nent.mam.proto.vidispineproto.KeyValueOrBuilder getMetadataOrBuilder(
      int index);
}
