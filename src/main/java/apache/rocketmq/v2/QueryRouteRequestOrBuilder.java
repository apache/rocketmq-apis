// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

public interface QueryRouteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.QueryRouteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.apache.rocketmq.v2.Resource topic = 1;</code>
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   * <code>.apache.rocketmq.v2.Resource topic = 1;</code>
   * @return The topic.
   */
  apache.rocketmq.v2.Resource getTopic();
  /**
   * <code>.apache.rocketmq.v2.Resource topic = 1;</code>
   */
  apache.rocketmq.v2.ResourceOrBuilder getTopicOrBuilder();

  /**
   * <code>.apache.rocketmq.v2.Endpoints endpoints = 2;</code>
   * @return Whether the endpoints field is set.
   */
  boolean hasEndpoints();
  /**
   * <code>.apache.rocketmq.v2.Endpoints endpoints = 2;</code>
   * @return The endpoints.
   */
  apache.rocketmq.v2.Endpoints getEndpoints();
  /**
   * <code>.apache.rocketmq.v2.Endpoints endpoints = 2;</code>
   */
  apache.rocketmq.v2.EndpointsOrBuilder getEndpointsOrBuilder();
}
