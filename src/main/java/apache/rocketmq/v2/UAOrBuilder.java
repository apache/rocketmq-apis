// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

public interface UAOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.UA)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * SDK language
   * </pre>
   *
   * <code>.apache.rocketmq.v2.Language language = 1;</code>
   * @return The enum numeric value on the wire for language.
   */
  int getLanguageValue();
  /**
   * <pre>
   * SDK language
   * </pre>
   *
   * <code>.apache.rocketmq.v2.Language language = 1;</code>
   * @return The language.
   */
  apache.rocketmq.v2.Language getLanguage();

  /**
   * <pre>
   * SDK version
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * SDK version
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * Platform details, including OS name, version, arch etc.
   * </pre>
   *
   * <code>string platform = 3;</code>
   * @return The platform.
   */
  java.lang.String getPlatform();
  /**
   * <pre>
   * Platform details, including OS name, version, arch etc.
   * </pre>
   *
   * <code>string platform = 3;</code>
   * @return The bytes for platform.
   */
  com.google.protobuf.ByteString
      getPlatformBytes();

  /**
   * <pre>
   * Hostname of the node
   * </pre>
   *
   * <code>string hostname = 4;</code>
   * @return The hostname.
   */
  java.lang.String getHostname();
  /**
   * <pre>
   * Hostname of the node
   * </pre>
   *
   * <code>string hostname = 4;</code>
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString
      getHostnameBytes();
}