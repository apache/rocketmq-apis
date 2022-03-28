// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

/**
 * Protobuf enum {@code apache.rocketmq.v2.MessageType}
 */
public enum MessageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MESSAGE_TYPE_UNSPECIFIED = 0;</code>
   */
  MESSAGE_TYPE_UNSPECIFIED(0),
  /**
   * <code>NORMAL = 1;</code>
   */
  NORMAL(1),
  /**
   * <pre>
   * Sequenced message
   * </pre>
   *
   * <code>FIFO = 2;</code>
   */
  FIFO(2),
  /**
   * <pre>
   * Messages that are delivered after the specified duration.
   * </pre>
   *
   * <code>DELAY = 3;</code>
   */
  DELAY(3),
  /**
   * <pre>
   * Messages that are transactional. Only committed messages are delivered to
   * subscribers.
   * </pre>
   *
   * <code>TRANSACTION = 4;</code>
   */
  TRANSACTION(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MESSAGE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int MESSAGE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>NORMAL = 1;</code>
   */
  public static final int NORMAL_VALUE = 1;
  /**
   * <pre>
   * Sequenced message
   * </pre>
   *
   * <code>FIFO = 2;</code>
   */
  public static final int FIFO_VALUE = 2;
  /**
   * <pre>
   * Messages that are delivered after the specified duration.
   * </pre>
   *
   * <code>DELAY = 3;</code>
   */
  public static final int DELAY_VALUE = 3;
  /**
   * <pre>
   * Messages that are transactional. Only committed messages are delivered to
   * subscribers.
   * </pre>
   *
   * <code>TRANSACTION = 4;</code>
   */
  public static final int TRANSACTION_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MessageType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MessageType forNumber(int value) {
    switch (value) {
      case 0: return MESSAGE_TYPE_UNSPECIFIED;
      case 1: return NORMAL;
      case 2: return FIFO;
      case 3: return DELAY;
      case 4: return TRANSACTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MessageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MessageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MessageType>() {
          public MessageType findValueByNumber(int number) {
            return MessageType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return apache.rocketmq.v2.MQDomain.getDescriptor().getEnumTypes().get(7);
  }

  private static final MessageType[] VALUES = values();

  public static MessageType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MessageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:apache.rocketmq.v2.MessageType)
}

