// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vidispine.proto

package com.nent.mam.proto.vidispineproto;

public final class VidispineProto {
  private VidispineProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_ImportRenditionIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_ImportRenditionIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_ImportRenditionOut_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_ImportRenditionOut_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_RenditionFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_RenditionFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_ItemIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_ItemIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_ItemOut_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_ItemOut_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_Item_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_Item_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_ShapeHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_ShapeHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_KeyValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_KeyValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_ShapeIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_ShapeIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_ShapeOut_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_ShapeOut_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_Shape_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_Shape_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_Audio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_Audio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_Video_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_Video_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_Subtitle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_Subtitle_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_File_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_File_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_DeleteShapeOut_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_DeleteShapeOut_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_JobIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_JobIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_JobOut_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_JobOut_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_Job_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_Job_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_ExportIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_ExportIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vidispineproto_ExportOut_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vidispineproto_ExportOut_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017vidispine.proto\022\016vidispineproto\"\230\001\n\021Im" +
      "portRenditionIn\022\023\n\013org_item_id\030\001 \001(\t\022\024\n\014" +
      "org_shape_id\030\002 \001(\t\022\023\n\013org_version\030\003 \001(\005\022" +
      "\025\n\rshape_package\030\004 \001(\t\022,\n\005files\030\005 \003(\0132\035." +
      "vidispineproto.RenditionFile\"G\n\022ImportRe" +
      "nditionOut\022\017\n\007item_id\030\001 \001(\t\022\020\n\010shape_id\030" +
      "\002 \001(\t\022\016\n\006job_id\030\003 \001(\t\"B\n\rRenditionFile\022\013" +
      "\n\003dir\030\001 \001(\t\022\020\n\010filename\030\002 \001(\t\022\022\n\nmedia_t" +
      "ype\030\003 \001(\t\"\031\n\006ItemIn\022\017\n\007item_id\030\001 \001(\t\"-\n\007" +
      "ItemOut\022\"\n\004item\030\001 \001(\0132\024.vidispineproto.I" +
      "tem\"]\n\004Item\022\017\n\007item_id\030\001 \001(\t\022\020\n\010asset_id" +
      "\030\002 \001(\t\0222\n\rshape_headers\030\003 \003(\0132\033.vidispin" +
      "eproto.ShapeHeader\"j\n\013ShapeHeader\022\020\n\010sha" +
      "pe_id\030\001 \001(\t\022\017\n\007version\030\002 \001(\005\022\014\n\004tags\030\003 \003" +
      "(\t\022*\n\010metadata\030\004 \003(\0132\030.vidispineproto.Ke" +
      "yValue\"&\n\010KeyValue\022\013\n\003key\030\001 \001(\t\022\r\n\005value" +
      "\030\002 \001(\t\",\n\007ShapeIn\022\017\n\007item_id\030\001 \001(\t\022\020\n\010sh" +
      "ape_id\030\002 \001(\t\"0\n\010ShapeOut\022$\n\005shape\030\001 \001(\0132" +
      "\025.vidispineproto.Shape\"\227\002\n\005Shape\022\017\n\007item" +
      "_id\030\001 \001(\t\022\020\n\010shape_id\030\002 \001(\t\022\017\n\007version\030\003" +
      " \001(\005\022\r\n\005title\030\004 \001(\t\022\026\n\016shape_filename\030\005 " +
      "\001(\t\022\014\n\004tags\030\006 \003(\t\022*\n\010metadata\030\007 \003(\0132\030.vi" +
      "dispineproto.KeyValue\022%\n\006videos\030\010 \003(\0132\025." +
      "vidispineproto.Video\022%\n\006audios\030\t \003(\0132\025.v" +
      "idispineproto.Audio\022+\n\tsubtitles\030\n \003(\0132\030" +
      ".vidispineproto.Subtitle\"\201\001\n\005Audio\022\n\n\002id" +
      "\030\001 \001(\t\022\017\n\007bitrate\030\002 \001(\005\022\r\n\005codec\030\003 \001(\t\022\020" +
      "\n\010language\030\004 \001(\t\022\025\n\rchannel_count\030\005 \001(\005\022" +
      "#\n\005files\030\006 \003(\0132\024.vidispineproto.File\"X\n\005" +
      "Video\022\n\n\002id\030\001 \001(\t\022\017\n\007bitrate\030\002 \001(\005\022\r\n\005co" +
      "dec\030\003 \001(\t\022#\n\005files\030\004 \003(\0132\024.vidispineprot" +
      "o.File\"M\n\010Subtitle\022\n\n\002id\030\001 \001(\t\022\020\n\010langua" +
      "ge\030\002 \001(\t\022#\n\005files\030\003 \003(\0132\024.vidispineproto" +
      ".File\"w\n\004File\022\n\n\002id\030\001 \001(\t\022\022\n\nstorage_id\030" +
      "\002 \001(\t\022\013\n\003uri\030\003 \001(\t\022\020\n\010filename\030\004 \001(\t\022\024\n\014" +
      "org_filename\030\005 \001(\t\022\014\n\004size\030\006 \001(\003\022\014\n\004hash" +
      "\030\007 \001(\t\"\020\n\016DeleteShapeOut\"\027\n\005JobIn\022\016\n\006job" +
      "_id\030\001 \001(\t\"*\n\006JobOut\022 \n\003job\030\001 \001(\0132\023.vidis" +
      "pineproto.Job\"n\n\003Job\022\n\n\002id\030\001 \001(\t\022\014\n\004user" +
      "\030\002 \001(\t\022\016\n\006status\030\003 \001(\t\022\014\n\004type\030\004 \001(\t\022\014\n\004" +
      "prio\030\005 \001(\t\022\017\n\007started\030\006 \001(\003\022\020\n\010finished\030" +
      "\007 \001(\003\";\n\010ExportIn\022\017\n\007item_id\030\001 \001(\t\022\020\n\010sh" +
      "ape_id\030\002 \001(\t\022\014\n\004path\030\003 \001(\t\"\033\n\tExportOut\022" +
      "\016\n\006job_id\030\001 \001(\t2\257\003\n\tVidispine\0229\n\006GetJob\022" +
      "\025.vidispineproto.JobIn\032\026.vidispineproto." +
      "JobOut\"\000\022<\n\007GetItem\022\026.vidispineproto.Ite" +
      "mIn\032\027.vidispineproto.ItemOut\"\000\022?\n\010GetSha" +
      "pe\022\027.vidispineproto.ShapeIn\032\030.vidispinep" +
      "roto.ShapeOut\"\000\022H\n\013DeleteShape\022\027.vidispi" +
      "neproto.ShapeIn\032\036.vidispineproto.DeleteS" +
      "hapeOut\"\000\022B\n\tExportIMF\022\030.vidispineproto." +
      "ExportIn\032\031.vidispineproto.ExportOut\"\000\022Z\n" +
      "\017ImportRendition\022!.vidispineproto.Import" +
      "RenditionIn\032\".vidispineproto.ImportRendi" +
      "tionOut\"\000B5\n!com.nent.mam.proto.vidispin" +
      "eprotoB\016VidispineProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_vidispineproto_ImportRenditionIn_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_vidispineproto_ImportRenditionIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_ImportRenditionIn_descriptor,
        new java.lang.String[] { "OrgItemId", "OrgShapeId", "OrgVersion", "ShapePackage", "Files", });
    internal_static_vidispineproto_ImportRenditionOut_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_vidispineproto_ImportRenditionOut_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_ImportRenditionOut_descriptor,
        new java.lang.String[] { "ItemId", "ShapeId", "JobId", });
    internal_static_vidispineproto_RenditionFile_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_vidispineproto_RenditionFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_RenditionFile_descriptor,
        new java.lang.String[] { "Dir", "Filename", "MediaType", });
    internal_static_vidispineproto_ItemIn_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_vidispineproto_ItemIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_ItemIn_descriptor,
        new java.lang.String[] { "ItemId", });
    internal_static_vidispineproto_ItemOut_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_vidispineproto_ItemOut_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_ItemOut_descriptor,
        new java.lang.String[] { "Item", });
    internal_static_vidispineproto_Item_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_vidispineproto_Item_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_Item_descriptor,
        new java.lang.String[] { "ItemId", "AssetId", "ShapeHeaders", });
    internal_static_vidispineproto_ShapeHeader_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_vidispineproto_ShapeHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_ShapeHeader_descriptor,
        new java.lang.String[] { "ShapeId", "Version", "Tags", "Metadata", });
    internal_static_vidispineproto_KeyValue_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_vidispineproto_KeyValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_KeyValue_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_vidispineproto_ShapeIn_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_vidispineproto_ShapeIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_ShapeIn_descriptor,
        new java.lang.String[] { "ItemId", "ShapeId", });
    internal_static_vidispineproto_ShapeOut_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_vidispineproto_ShapeOut_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_ShapeOut_descriptor,
        new java.lang.String[] { "Shape", });
    internal_static_vidispineproto_Shape_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_vidispineproto_Shape_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_Shape_descriptor,
        new java.lang.String[] { "ItemId", "ShapeId", "Version", "Title", "ShapeFilename", "Tags", "Metadata", "Videos", "Audios", "Subtitles", });
    internal_static_vidispineproto_Audio_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_vidispineproto_Audio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_Audio_descriptor,
        new java.lang.String[] { "Id", "Bitrate", "Codec", "Language", "ChannelCount", "Files", });
    internal_static_vidispineproto_Video_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_vidispineproto_Video_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_Video_descriptor,
        new java.lang.String[] { "Id", "Bitrate", "Codec", "Files", });
    internal_static_vidispineproto_Subtitle_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_vidispineproto_Subtitle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_Subtitle_descriptor,
        new java.lang.String[] { "Id", "Language", "Files", });
    internal_static_vidispineproto_File_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_vidispineproto_File_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_File_descriptor,
        new java.lang.String[] { "Id", "StorageId", "Uri", "Filename", "OrgFilename", "Size", "Hash", });
    internal_static_vidispineproto_DeleteShapeOut_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_vidispineproto_DeleteShapeOut_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_DeleteShapeOut_descriptor,
        new java.lang.String[] { });
    internal_static_vidispineproto_JobIn_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_vidispineproto_JobIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_JobIn_descriptor,
        new java.lang.String[] { "JobId", });
    internal_static_vidispineproto_JobOut_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_vidispineproto_JobOut_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_JobOut_descriptor,
        new java.lang.String[] { "Job", });
    internal_static_vidispineproto_Job_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_vidispineproto_Job_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_Job_descriptor,
        new java.lang.String[] { "Id", "User", "Status", "Type", "Prio", "Started", "Finished", });
    internal_static_vidispineproto_ExportIn_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_vidispineproto_ExportIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_ExportIn_descriptor,
        new java.lang.String[] { "ItemId", "ShapeId", "Path", });
    internal_static_vidispineproto_ExportOut_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_vidispineproto_ExportOut_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vidispineproto_ExportOut_descriptor,
        new java.lang.String[] { "JobId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
