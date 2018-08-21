// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vidispine.proto

package com.nent.mam.proto.vidispineproto;

public interface ShapeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:vidispineproto.Shape)
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
   * <code>string shape_id = 2;</code>
   */
  java.lang.String getShapeId();
  /**
   * <code>string shape_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getShapeIdBytes();

  /**
   * <code>int32 version = 3;</code>
   */
  int getVersion();

  /**
   * <code>string title = 4;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 4;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string org_filename = 5;</code>
   */
  java.lang.String getOrgFilename();
  /**
   * <code>string org_filename = 5;</code>
   */
  com.google.protobuf.ByteString
      getOrgFilenameBytes();

  /**
   * <code>repeated string tags = 6;</code>
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 6;</code>
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 6;</code>
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 6;</code>
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <code>repeated .vidispineproto.Video videos = 7;</code>
   */
  java.util.List<com.nent.mam.proto.vidispineproto.Video> 
      getVideosList();
  /**
   * <code>repeated .vidispineproto.Video videos = 7;</code>
   */
  com.nent.mam.proto.vidispineproto.Video getVideos(int index);
  /**
   * <code>repeated .vidispineproto.Video videos = 7;</code>
   */
  int getVideosCount();
  /**
   * <code>repeated .vidispineproto.Video videos = 7;</code>
   */
  java.util.List<? extends com.nent.mam.proto.vidispineproto.VideoOrBuilder> 
      getVideosOrBuilderList();
  /**
   * <code>repeated .vidispineproto.Video videos = 7;</code>
   */
  com.nent.mam.proto.vidispineproto.VideoOrBuilder getVideosOrBuilder(
      int index);

  /**
   * <code>repeated .vidispineproto.Audio audios = 8;</code>
   */
  java.util.List<com.nent.mam.proto.vidispineproto.Audio> 
      getAudiosList();
  /**
   * <code>repeated .vidispineproto.Audio audios = 8;</code>
   */
  com.nent.mam.proto.vidispineproto.Audio getAudios(int index);
  /**
   * <code>repeated .vidispineproto.Audio audios = 8;</code>
   */
  int getAudiosCount();
  /**
   * <code>repeated .vidispineproto.Audio audios = 8;</code>
   */
  java.util.List<? extends com.nent.mam.proto.vidispineproto.AudioOrBuilder> 
      getAudiosOrBuilderList();
  /**
   * <code>repeated .vidispineproto.Audio audios = 8;</code>
   */
  com.nent.mam.proto.vidispineproto.AudioOrBuilder getAudiosOrBuilder(
      int index);

  /**
   * <code>repeated .vidispineproto.Subtitle subtitles = 9;</code>
   */
  java.util.List<com.nent.mam.proto.vidispineproto.Subtitle> 
      getSubtitlesList();
  /**
   * <code>repeated .vidispineproto.Subtitle subtitles = 9;</code>
   */
  com.nent.mam.proto.vidispineproto.Subtitle getSubtitles(int index);
  /**
   * <code>repeated .vidispineproto.Subtitle subtitles = 9;</code>
   */
  int getSubtitlesCount();
  /**
   * <code>repeated .vidispineproto.Subtitle subtitles = 9;</code>
   */
  java.util.List<? extends com.nent.mam.proto.vidispineproto.SubtitleOrBuilder> 
      getSubtitlesOrBuilderList();
  /**
   * <code>repeated .vidispineproto.Subtitle subtitles = 9;</code>
   */
  com.nent.mam.proto.vidispineproto.SubtitleOrBuilder getSubtitlesOrBuilder(
      int index);
}
