// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

public interface VerifyMessageCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.VerifyMessageCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string nonce = 1;</code>
   * @return The nonce.
   */
  java.lang.String getNonce();
  /**
   * <code>string nonce = 1;</code>
   * @return The bytes for nonce.
   */
  com.google.protobuf.ByteString
      getNonceBytes();

  /**
   * <code>.apache.rocketmq.v2.MessageQueue message_queue = 2;</code>
   * @return Whether the messageQueue field is set.
   */
  boolean hasMessageQueue();
  /**
   * <code>.apache.rocketmq.v2.MessageQueue message_queue = 2;</code>
   * @return The messageQueue.
   */
  apache.rocketmq.v2.MessageQueue getMessageQueue();
  /**
   * <code>.apache.rocketmq.v2.MessageQueue message_queue = 2;</code>
   */
  apache.rocketmq.v2.MessageQueueOrBuilder getMessageQueueOrBuilder();

  /**
   * <code>.apache.rocketmq.v2.Message message = 3;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>.apache.rocketmq.v2.Message message = 3;</code>
   * @return The message.
   */
  apache.rocketmq.v2.Message getMessage();
  /**
   * <code>.apache.rocketmq.v2.Message message = 3;</code>
   */
  apache.rocketmq.v2.MessageOrBuilder getMessageOrBuilder();
}