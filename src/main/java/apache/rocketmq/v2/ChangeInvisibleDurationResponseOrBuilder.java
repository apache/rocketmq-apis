// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

public interface ChangeInvisibleDurationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.ChangeInvisibleDurationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.apache.rocketmq.v2.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.apache.rocketmq.v2.Status status = 1;</code>
   * @return The status.
   */
  apache.rocketmq.v2.Status getStatus();
  /**
   * <code>.apache.rocketmq.v2.Status status = 1;</code>
   */
  apache.rocketmq.v2.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Server may generate a new receipt handle for the message.
   * </pre>
   *
   * <code>string receipt_handle = 2;</code>
   * @return The receiptHandle.
   */
  java.lang.String getReceiptHandle();
  /**
   * <pre>
   * Server may generate a new receipt handle for the message.
   * </pre>
   *
   * <code>string receipt_handle = 2;</code>
   * @return The bytes for receiptHandle.
   */
  com.google.protobuf.ByteString
      getReceiptHandleBytes();
}