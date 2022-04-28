// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

public interface SettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.Settings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Configurations for all clients.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.ClientType client_type = 1;</code>
   * @return Whether the clientType field is set.
   */
  boolean hasClientType();
  /**
   * <pre>
   * Configurations for all clients.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.ClientType client_type = 1;</code>
   * @return The enum numeric value on the wire for clientType.
   */
  int getClientTypeValue();
  /**
   * <pre>
   * Configurations for all clients.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.ClientType client_type = 1;</code>
   * @return The clientType.
   */
  apache.rocketmq.v2.ClientType getClientType();

  /**
   * <code>optional .apache.rocketmq.v2.Endpoints access_point = 2;</code>
   * @return Whether the accessPoint field is set.
   */
  boolean hasAccessPoint();
  /**
   * <code>optional .apache.rocketmq.v2.Endpoints access_point = 2;</code>
   * @return The accessPoint.
   */
  apache.rocketmq.v2.Endpoints getAccessPoint();
  /**
   * <code>optional .apache.rocketmq.v2.Endpoints access_point = 2;</code>
   */
  apache.rocketmq.v2.EndpointsOrBuilder getAccessPointOrBuilder();

  /**
   * <pre>
   * If publishing of messages encounters throttling or server internal errors,
   * publishers should implement automatic retries after progressive longer
   * back-offs for consecutive errors.
   * When processing message fails, `backoff_policy` describes an interval
   * after which the message should be available to consume again.
   * For FIFO messages, the interval should be relatively small because
   * messages of the same message group would not be readily available utill
   * the prior one depletes its lifecycle.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.RetryPolicy backoff_policy = 3;</code>
   * @return Whether the backoffPolicy field is set.
   */
  boolean hasBackoffPolicy();
  /**
   * <pre>
   * If publishing of messages encounters throttling or server internal errors,
   * publishers should implement automatic retries after progressive longer
   * back-offs for consecutive errors.
   * When processing message fails, `backoff_policy` describes an interval
   * after which the message should be available to consume again.
   * For FIFO messages, the interval should be relatively small because
   * messages of the same message group would not be readily available utill
   * the prior one depletes its lifecycle.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.RetryPolicy backoff_policy = 3;</code>
   * @return The backoffPolicy.
   */
  apache.rocketmq.v2.RetryPolicy getBackoffPolicy();
  /**
   * <pre>
   * If publishing of messages encounters throttling or server internal errors,
   * publishers should implement automatic retries after progressive longer
   * back-offs for consecutive errors.
   * When processing message fails, `backoff_policy` describes an interval
   * after which the message should be available to consume again.
   * For FIFO messages, the interval should be relatively small because
   * messages of the same message group would not be readily available utill
   * the prior one depletes its lifecycle.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.RetryPolicy backoff_policy = 3;</code>
   */
  apache.rocketmq.v2.RetryPolicyOrBuilder getBackoffPolicyOrBuilder();

  /**
   * <pre>
   * Request timeout for RPCs excluding long-polling.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration request_timeout = 4;</code>
   * @return Whether the requestTimeout field is set.
   */
  boolean hasRequestTimeout();
  /**
   * <pre>
   * Request timeout for RPCs excluding long-polling.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration request_timeout = 4;</code>
   * @return The requestTimeout.
   */
  com.google.protobuf.Duration getRequestTimeout();
  /**
   * <pre>
   * Request timeout for RPCs excluding long-polling.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration request_timeout = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getRequestTimeoutOrBuilder();

  /**
   * <code>.apache.rocketmq.v2.Publishing publishing = 5;</code>
   * @return Whether the publishing field is set.
   */
  boolean hasPublishing();
  /**
   * <code>.apache.rocketmq.v2.Publishing publishing = 5;</code>
   * @return The publishing.
   */
  apache.rocketmq.v2.Publishing getPublishing();
  /**
   * <code>.apache.rocketmq.v2.Publishing publishing = 5;</code>
   */
  apache.rocketmq.v2.PublishingOrBuilder getPublishingOrBuilder();

  /**
   * <code>.apache.rocketmq.v2.Subscription subscription = 6;</code>
   * @return Whether the subscription field is set.
   */
  boolean hasSubscription();
  /**
   * <code>.apache.rocketmq.v2.Subscription subscription = 6;</code>
   * @return The subscription.
   */
  apache.rocketmq.v2.Subscription getSubscription();
  /**
   * <code>.apache.rocketmq.v2.Subscription subscription = 6;</code>
   */
  apache.rocketmq.v2.SubscriptionOrBuilder getSubscriptionOrBuilder();

  public apache.rocketmq.v2.Settings.PubSubCase getPubSubCase();
}
