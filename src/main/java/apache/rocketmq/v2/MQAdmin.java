// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/admin.proto

package apache.rocketmq.v2;

public final class MQAdmin {
  private MQAdmin() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_ChangeLogLevelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_ChangeLogLevelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apache_rocketmq_v2_ChangeLogLevelResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apache_rocketmq_v2_ChangeLogLevelResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036apache/rocketmq/v2/admin.proto\022\022apache" +
      ".rocketmq.v2\"\225\001\n\025ChangeLogLevelRequest\022>" +
      "\n\005level\030\001 \001(\0162/.apache.rocketmq.v2.Chang" +
      "eLogLevelRequest.Level\"<\n\005Level\022\t\n\005TRACE" +
      "\020\000\022\t\n\005DEBUG\020\001\022\010\n\004INFO\020\002\022\010\n\004WARN\020\003\022\t\n\005ERR" +
      "OR\020\004\"(\n\026ChangeLogLevelResponse\022\016\n\006remark" +
      "\030\001 \001(\t2r\n\005Admin\022i\n\016ChangeLogLevel\022).apac" +
      "he.rocketmq.v2.ChangeLogLevelRequest\032*.a" +
      "pache.rocketmq.v2.ChangeLogLevelResponse" +
      "\"\000B=\n\022apache.rocketmq.v2B\007MQAdminP\001\240\001\001\330\001" +
      "\001\370\001\001\252\002\022Apache.Rocketmq.V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_apache_rocketmq_v2_ChangeLogLevelRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_apache_rocketmq_v2_ChangeLogLevelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_ChangeLogLevelRequest_descriptor,
        new java.lang.String[] { "Level", });
    internal_static_apache_rocketmq_v2_ChangeLogLevelResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_apache_rocketmq_v2_ChangeLogLevelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apache_rocketmq_v2_ChangeLogLevelResponse_descriptor,
        new java.lang.String[] { "Remark", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}