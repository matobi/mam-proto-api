// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vidispine.proto

package com.nent.mam.proto.vidispineproto;

public interface ItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:vidispineproto.Item)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string item_id = 1;</code>
   */
  java.lang.String getItemId();
  /**
   * <code>string item_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getItemIdBytes();

  /**
   * <code>string asset_id = 2;</code>
   */
  java.lang.String getAssetId();
  /**
   * <code>string asset_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getAssetIdBytes();

  /**
   * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
   */
  java.util.List<com.nent.mam.proto.vidispineproto.ShapeHeader> 
      getShapeHeadersList();
  /**
   * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
   */
  com.nent.mam.proto.vidispineproto.ShapeHeader getShapeHeaders(int index);
  /**
   * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
   */
  int getShapeHeadersCount();
  /**
   * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
   */
  java.util.List<? extends com.nent.mam.proto.vidispineproto.ShapeHeaderOrBuilder> 
      getShapeHeadersOrBuilderList();
  /**
   * <code>repeated .vidispineproto.ShapeHeader shape_headers = 3;</code>
   */
  com.nent.mam.proto.vidispineproto.ShapeHeaderOrBuilder getShapeHeadersOrBuilder(
      int index);
}
