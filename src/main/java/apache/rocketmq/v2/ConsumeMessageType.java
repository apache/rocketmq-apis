// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

/**
 * Protobuf enum {@code apache.rocketmq.v2.ConsumeMessageType}
 */
public enum ConsumeMessageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CONSUME_MESSAGE_TYPE_UNSPECIFIED = 0;</code>
   */
  CONSUME_MESSAGE_TYPE_UNSPECIFIED(0),
  /**
   * <code>ACTIVE = 1;</code>
   */
  ACTIVE(1),
  /**
   * <code>PASSIVE = 2;</code>
   */
  PASSIVE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CONSUME_MESSAGE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int CONSUME_MESSAGE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>ACTIVE = 1;</code>
   */
  public static final int ACTIVE_VALUE = 1;
  /**
   * <code>PASSIVE = 2;</code>
   */
  public static final int PASSIVE_VALUE = 2;


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
  public static ConsumeMessageType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ConsumeMessageType forNumber(int value) {
    switch (value) {
      case 0: return CONSUME_MESSAGE_TYPE_UNSPECIFIED;
      case 1: return ACTIVE;
      case 2: return PASSIVE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ConsumeMessageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ConsumeMessageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ConsumeMessageType>() {
          public ConsumeMessageType findValueByNumber(int number) {
            return ConsumeMessageType.forNumber(number);
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
    return apache.rocketmq.v2.MQDomain.getDescriptor().getEnumTypes().get(4);
  }

  private static final ConsumeMessageType[] VALUES = values();

  public static ConsumeMessageType valueOf(
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

  private ConsumeMessageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:apache.rocketmq.v2.ConsumeMessageType)
}

