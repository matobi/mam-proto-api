// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hybrik.proto

package com.nent.mam.proto.hybrikproto;

public final class HybrikProto {
  private HybrikProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hybrikproto_JobIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hybrikproto_JobIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hybrikproto_JobOut_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hybrikproto_JobOut_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hybrikproto_Job_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hybrikproto_Job_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hybrikproto_CreateJobIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hybrikproto_CreateJobIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hybrikproto_CreateJobOut_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hybrikproto_CreateJobOut_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014hybrik.proto\022\013hybrikproto\"\027\n\005JobIn\022\016\n\006" +
      "job_id\030\001 \001(\t\"\'\n\006JobOut\022\035\n\003job\030\001 \001(\0132\020.hy" +
      "brikproto.Job\"d\n\003Job\022\n\n\002id\030\001 \001(\t\022\014\n\004name" +
      "\030\002 \001(\t\022\016\n\006status\030\003 \001(\t\022\017\n\007started\030\004 \001(\003\022" +
      "\020\n\010finished\030\005 \001(\003\022\020\n\010progress\030\006 \001(\005\"(\n\013C" +
      "reateJobIn\022\013\n\003dir\030\001 \001(\t\022\014\n\004file\030\002 \001(\t\"\036\n" +
      "\014CreateJobOut\022\016\n\006job_id\030\001 \001(\t2\201\001\n\006Hybrik" +
      "\0223\n\006GetJob\022\022.hybrikproto.JobIn\032\023.hybrikp" +
      "roto.JobOut\"\000\022B\n\tCreateJob\022\030.hybrikproto" +
      ".CreateJobIn\032\031.hybrikproto.CreateJobOut\"" +
      "\000B/\n\036com.nent.mam.proto.hybrikprotoB\013Hyb" +
      "rikProtoP\001b\006proto3"
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
    internal_static_hybrikproto_JobIn_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hybrikproto_JobIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hybrikproto_JobIn_descriptor,
        new java.lang.String[] { "JobId", });
    internal_static_hybrikproto_JobOut_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hybrikproto_JobOut_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hybrikproto_JobOut_descriptor,
        new java.lang.String[] { "Job", });
    internal_static_hybrikproto_Job_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hybrikproto_Job_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hybrikproto_Job_descriptor,
        new java.lang.String[] { "Id", "Name", "Status", "Started", "Finished", "Progress", });
    internal_static_hybrikproto_CreateJobIn_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hybrikproto_CreateJobIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hybrikproto_CreateJobIn_descriptor,
        new java.lang.String[] { "Dir", "File", });
    internal_static_hybrikproto_CreateJobOut_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hybrikproto_CreateJobOut_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hybrikproto_CreateJobOut_descriptor,
        new java.lang.String[] { "JobId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
