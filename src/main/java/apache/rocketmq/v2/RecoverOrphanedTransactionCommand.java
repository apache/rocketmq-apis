// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

/**
 * Protobuf type {@code apache.rocketmq.v2.RecoverOrphanedTransactionCommand}
 */
public final class RecoverOrphanedTransactionCommand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v2.RecoverOrphanedTransactionCommand)
    RecoverOrphanedTransactionCommandOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecoverOrphanedTransactionCommand.newBuilder() to construct.
  private RecoverOrphanedTransactionCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecoverOrphanedTransactionCommand() {
    transactionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecoverOrphanedTransactionCommand();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecoverOrphanedTransactionCommand(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            apache.rocketmq.v2.MessageQueue.Builder subBuilder = null;
            if (messageQueue_ != null) {
              subBuilder = messageQueue_.toBuilder();
            }
            messageQueue_ = input.readMessage(apache.rocketmq.v2.MessageQueue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(messageQueue_);
              messageQueue_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            apache.rocketmq.v2.Message.Builder subBuilder = null;
            if (orphanedTransactionalMessage_ != null) {
              subBuilder = orphanedTransactionalMessage_.toBuilder();
            }
            orphanedTransactionalMessage_ = input.readMessage(apache.rocketmq.v2.Message.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(orphanedTransactionalMessage_);
              orphanedTransactionalMessage_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            transactionId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_RecoverOrphanedTransactionCommand_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_RecoverOrphanedTransactionCommand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v2.RecoverOrphanedTransactionCommand.class, apache.rocketmq.v2.RecoverOrphanedTransactionCommand.Builder.class);
  }

  public static final int MESSAGE_QUEUE_FIELD_NUMBER = 1;
  private apache.rocketmq.v2.MessageQueue messageQueue_;
  /**
   * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
   * @return Whether the messageQueue field is set.
   */
  @java.lang.Override
  public boolean hasMessageQueue() {
    return messageQueue_ != null;
  }
  /**
   * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
   * @return The messageQueue.
   */
  @java.lang.Override
  public apache.rocketmq.v2.MessageQueue getMessageQueue() {
    return messageQueue_ == null ? apache.rocketmq.v2.MessageQueue.getDefaultInstance() : messageQueue_;
  }
  /**
   * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v2.MessageQueueOrBuilder getMessageQueueOrBuilder() {
    return getMessageQueue();
  }

  public static final int ORPHANED_TRANSACTIONAL_MESSAGE_FIELD_NUMBER = 2;
  private apache.rocketmq.v2.Message orphanedTransactionalMessage_;
  /**
   * <code>.apache.rocketmq.v2.Message orphaned_transactional_message = 2;</code>
   * @return Whether the orphanedTransactionalMessage field is set.
   */
  @java.lang.Override
  public boolean hasOrphanedTransactionalMessage() {
    return orphanedTransactionalMessage_ != null;
  }
  /**
   * <code>.apache.rocketmq.v2.Message orphaned_transactional_message = 2;</code>
   * @return The orphanedTransactionalMessage.
   */
  @java.lang.Override
  public apache.rocketmq.v2.Message getOrphanedTransactionalMessage() {
    return orphanedTransactionalMessage_ == null ? apache.rocketmq.v2.Message.getDefaultInstance() : orphanedTransactionalMessage_;
  }
  /**
   * <code>.apache.rocketmq.v2.Message orphaned_transactional_message = 2;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v2.MessageOrBuilder getOrphanedTransactionalMessageOrBuilder() {
    return getOrphanedTransactionalMessage();
  }

  public static final int TRANSACTION_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object transactionId_;
  /**
   * <code>string transaction_id = 3;</code>
   * @return The transactionId.
   */
  @java.lang.Override
  public java.lang.String getTransactionId() {
    java.lang.Object ref = transactionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transactionId_ = s;
      return s;
    }
  }
  /**
   * <code>string transaction_id = 3;</code>
   * @return The bytes for transactionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTransactionIdBytes() {
    java.lang.Object ref = transactionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      transactionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (messageQueue_ != null) {
      output.writeMessage(1, getMessageQueue());
    }
    if (orphanedTransactionalMessage_ != null) {
      output.writeMessage(2, getOrphanedTransactionalMessage());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transactionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, transactionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (messageQueue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMessageQueue());
    }
    if (orphanedTransactionalMessage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOrphanedTransactionalMessage());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transactionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, transactionId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof apache.rocketmq.v2.RecoverOrphanedTransactionCommand)) {
      return super.equals(obj);
    }
    apache.rocketmq.v2.RecoverOrphanedTransactionCommand other = (apache.rocketmq.v2.RecoverOrphanedTransactionCommand) obj;

    if (hasMessageQueue() != other.hasMessageQueue()) return false;
    if (hasMessageQueue()) {
      if (!getMessageQueue()
          .equals(other.getMessageQueue())) return false;
    }
    if (hasOrphanedTransactionalMessage() != other.hasOrphanedTransactionalMessage()) return false;
    if (hasOrphanedTransactionalMessage()) {
      if (!getOrphanedTransactionalMessage()
          .equals(other.getOrphanedTransactionalMessage())) return false;
    }
    if (!getTransactionId()
        .equals(other.getTransactionId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMessageQueue()) {
      hash = (37 * hash) + MESSAGE_QUEUE_FIELD_NUMBER;
      hash = (53 * hash) + getMessageQueue().hashCode();
    }
    if (hasOrphanedTransactionalMessage()) {
      hash = (37 * hash) + ORPHANED_TRANSACTIONAL_MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getOrphanedTransactionalMessage().hashCode();
    }
    hash = (37 * hash) + TRANSACTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTransactionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v2.RecoverOrphanedTransactionCommand parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.RecoverOrphanedTransactionCommand parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.RecoverOrphanedTransactionCommand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.RecoverOrphanedTransactionCommand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.RecoverOrphanedTransactionCommand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.RecoverOrphanedTransactionCommand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.RecoverOrphanedTransactionCommand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.RecoverOrphanedTransactionCommand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.RecoverOrphanedTransactionCommand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.RecoverOrphanedTransactionCommand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.RecoverOrphanedTransactionCommand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.RecoverOrphanedTransactionCommand parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(apache.rocketmq.v2.RecoverOrphanedTransactionCommand prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code apache.rocketmq.v2.RecoverOrphanedTransactionCommand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v2.RecoverOrphanedTransactionCommand)
      apache.rocketmq.v2.RecoverOrphanedTransactionCommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_RecoverOrphanedTransactionCommand_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_RecoverOrphanedTransactionCommand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v2.RecoverOrphanedTransactionCommand.class, apache.rocketmq.v2.RecoverOrphanedTransactionCommand.Builder.class);
    }

    // Construct using apache.rocketmq.v2.RecoverOrphanedTransactionCommand.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (messageQueueBuilder_ == null) {
        messageQueue_ = null;
      } else {
        messageQueue_ = null;
        messageQueueBuilder_ = null;
      }
      if (orphanedTransactionalMessageBuilder_ == null) {
        orphanedTransactionalMessage_ = null;
      } else {
        orphanedTransactionalMessage_ = null;
        orphanedTransactionalMessageBuilder_ = null;
      }
      transactionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_RecoverOrphanedTransactionCommand_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v2.RecoverOrphanedTransactionCommand getDefaultInstanceForType() {
      return apache.rocketmq.v2.RecoverOrphanedTransactionCommand.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v2.RecoverOrphanedTransactionCommand build() {
      apache.rocketmq.v2.RecoverOrphanedTransactionCommand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v2.RecoverOrphanedTransactionCommand buildPartial() {
      apache.rocketmq.v2.RecoverOrphanedTransactionCommand result = new apache.rocketmq.v2.RecoverOrphanedTransactionCommand(this);
      if (messageQueueBuilder_ == null) {
        result.messageQueue_ = messageQueue_;
      } else {
        result.messageQueue_ = messageQueueBuilder_.build();
      }
      if (orphanedTransactionalMessageBuilder_ == null) {
        result.orphanedTransactionalMessage_ = orphanedTransactionalMessage_;
      } else {
        result.orphanedTransactionalMessage_ = orphanedTransactionalMessageBuilder_.build();
      }
      result.transactionId_ = transactionId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof apache.rocketmq.v2.RecoverOrphanedTransactionCommand) {
        return mergeFrom((apache.rocketmq.v2.RecoverOrphanedTransactionCommand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v2.RecoverOrphanedTransactionCommand other) {
      if (other == apache.rocketmq.v2.RecoverOrphanedTransactionCommand.getDefaultInstance()) return this;
      if (other.hasMessageQueue()) {
        mergeMessageQueue(other.getMessageQueue());
      }
      if (other.hasOrphanedTransactionalMessage()) {
        mergeOrphanedTransactionalMessage(other.getOrphanedTransactionalMessage());
      }
      if (!other.getTransactionId().isEmpty()) {
        transactionId_ = other.transactionId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      apache.rocketmq.v2.RecoverOrphanedTransactionCommand parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v2.RecoverOrphanedTransactionCommand) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private apache.rocketmq.v2.MessageQueue messageQueue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.MessageQueue, apache.rocketmq.v2.MessageQueue.Builder, apache.rocketmq.v2.MessageQueueOrBuilder> messageQueueBuilder_;
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     * @return Whether the messageQueue field is set.
     */
    public boolean hasMessageQueue() {
      return messageQueueBuilder_ != null || messageQueue_ != null;
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     * @return The messageQueue.
     */
    public apache.rocketmq.v2.MessageQueue getMessageQueue() {
      if (messageQueueBuilder_ == null) {
        return messageQueue_ == null ? apache.rocketmq.v2.MessageQueue.getDefaultInstance() : messageQueue_;
      } else {
        return messageQueueBuilder_.getMessage();
      }
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    public Builder setMessageQueue(apache.rocketmq.v2.MessageQueue value) {
      if (messageQueueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        messageQueue_ = value;
        onChanged();
      } else {
        messageQueueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    public Builder setMessageQueue(
        apache.rocketmq.v2.MessageQueue.Builder builderForValue) {
      if (messageQueueBuilder_ == null) {
        messageQueue_ = builderForValue.build();
        onChanged();
      } else {
        messageQueueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    public Builder mergeMessageQueue(apache.rocketmq.v2.MessageQueue value) {
      if (messageQueueBuilder_ == null) {
        if (messageQueue_ != null) {
          messageQueue_ =
            apache.rocketmq.v2.MessageQueue.newBuilder(messageQueue_).mergeFrom(value).buildPartial();
        } else {
          messageQueue_ = value;
        }
        onChanged();
      } else {
        messageQueueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    public Builder clearMessageQueue() {
      if (messageQueueBuilder_ == null) {
        messageQueue_ = null;
        onChanged();
      } else {
        messageQueue_ = null;
        messageQueueBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    public apache.rocketmq.v2.MessageQueue.Builder getMessageQueueBuilder() {
      
      onChanged();
      return getMessageQueueFieldBuilder().getBuilder();
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    public apache.rocketmq.v2.MessageQueueOrBuilder getMessageQueueOrBuilder() {
      if (messageQueueBuilder_ != null) {
        return messageQueueBuilder_.getMessageOrBuilder();
      } else {
        return messageQueue_ == null ?
            apache.rocketmq.v2.MessageQueue.getDefaultInstance() : messageQueue_;
      }
    }
    /**
     * <code>.apache.rocketmq.v2.MessageQueue message_queue = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.MessageQueue, apache.rocketmq.v2.MessageQueue.Builder, apache.rocketmq.v2.MessageQueueOrBuilder> 
        getMessageQueueFieldBuilder() {
      if (messageQueueBuilder_ == null) {
        messageQueueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v2.MessageQueue, apache.rocketmq.v2.MessageQueue.Builder, apache.rocketmq.v2.MessageQueueOrBuilder>(
                getMessageQueue(),
                getParentForChildren(),
                isClean());
        messageQueue_ = null;
      }
      return messageQueueBuilder_;
    }

    private apache.rocketmq.v2.Message orphanedTransactionalMessage_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.Message, apache.rocketmq.v2.Message.Builder, apache.rocketmq.v2.MessageOrBuilder> orphanedTransactionalMessageBuilder_;
    /**
     * <code>.apache.rocketmq.v2.Message orphaned_transactional_message = 2;</code>
     * @return Whether the orphanedTransactionalMessage field is set.
     */
    public boolean hasOrphanedTransactionalMessage() {
      return orphanedTransactionalMessageBuilder_ != null || orphanedTransactionalMessage_ != null;
    }
    /**
     * <code>.apache.rocketmq.v2.Message orphaned_transactional_message = 2;</code>
     * @return The orphanedTransactionalMessage.
     */
    public apache.rocketmq.v2.Message getOrphanedTransactionalMessage() {
      if (orphanedTransactionalMessageBuilder_ == null) {
        return orphanedTransactionalMessage_ == null ? apache.rocketmq.v2.Message.getDefaultInstance() : orphanedTransactionalMessage_;
      } else {
        return orphanedTransactionalMessageBuilder_.getMessage();
      }
    }
    /**
     * <code>.apache.rocketmq.v2.Message orphaned_transactional_message = 2;</code>
     */
    public Builder setOrphanedTransactionalMessage(apache.rocketmq.v2.Message value) {
      if (orphanedTransactionalMessageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        orphanedTransactionalMessage_ = value;
        onChanged();
      } else {
        orphanedTransactionalMessageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.Message orphaned_transactional_message = 2;</code>
     */
    public Builder setOrphanedTransactionalMessage(
        apache.rocketmq.v2.Message.Builder builderForValue) {
      if (orphanedTransactionalMessageBuilder_ == null) {
        orphanedTransactionalMessage_ = builderForValue.build();
        onChanged();
      } else {
        orphanedTransactionalMessageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.Message orphaned_transactional_message = 2;</code>
     */
    public Builder mergeOrphanedTransactionalMessage(apache.rocketmq.v2.Message value) {
      if (orphanedTransactionalMessageBuilder_ == null) {
        if (orphanedTransactionalMessage_ != null) {
          orphanedTransactionalMessage_ =
            apache.rocketmq.v2.Message.newBuilder(orphanedTransactionalMessage_).mergeFrom(value).buildPartial();
        } else {
          orphanedTransactionalMessage_ = value;
        }
        onChanged();
      } else {
        orphanedTransactionalMessageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.Message orphaned_transactional_message = 2;</code>
     */
    public Builder clearOrphanedTransactionalMessage() {
      if (orphanedTransactionalMessageBuilder_ == null) {
        orphanedTransactionalMessage_ = null;
        onChanged();
      } else {
        orphanedTransactionalMessage_ = null;
        orphanedTransactionalMessageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.Message orphaned_transactional_message = 2;</code>
     */
    public apache.rocketmq.v2.Message.Builder getOrphanedTransactionalMessageBuilder() {
      
      onChanged();
      return getOrphanedTransactionalMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.apache.rocketmq.v2.Message orphaned_transactional_message = 2;</code>
     */
    public apache.rocketmq.v2.MessageOrBuilder getOrphanedTransactionalMessageOrBuilder() {
      if (orphanedTransactionalMessageBuilder_ != null) {
        return orphanedTransactionalMessageBuilder_.getMessageOrBuilder();
      } else {
        return orphanedTransactionalMessage_ == null ?
            apache.rocketmq.v2.Message.getDefaultInstance() : orphanedTransactionalMessage_;
      }
    }
    /**
     * <code>.apache.rocketmq.v2.Message orphaned_transactional_message = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.Message, apache.rocketmq.v2.Message.Builder, apache.rocketmq.v2.MessageOrBuilder> 
        getOrphanedTransactionalMessageFieldBuilder() {
      if (orphanedTransactionalMessageBuilder_ == null) {
        orphanedTransactionalMessageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v2.Message, apache.rocketmq.v2.Message.Builder, apache.rocketmq.v2.MessageOrBuilder>(
                getOrphanedTransactionalMessage(),
                getParentForChildren(),
                isClean());
        orphanedTransactionalMessage_ = null;
      }
      return orphanedTransactionalMessageBuilder_;
    }

    private java.lang.Object transactionId_ = "";
    /**
     * <code>string transaction_id = 3;</code>
     * @return The transactionId.
     */
    public java.lang.String getTransactionId() {
      java.lang.Object ref = transactionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transactionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string transaction_id = 3;</code>
     * @return The bytes for transactionId.
     */
    public com.google.protobuf.ByteString
        getTransactionIdBytes() {
      java.lang.Object ref = transactionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        transactionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string transaction_id = 3;</code>
     * @param value The transactionId to set.
     * @return This builder for chaining.
     */
    public Builder setTransactionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      transactionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string transaction_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTransactionId() {
      
      transactionId_ = getDefaultInstance().getTransactionId();
      onChanged();
      return this;
    }
    /**
     * <code>string transaction_id = 3;</code>
     * @param value The bytes for transactionId to set.
     * @return This builder for chaining.
     */
    public Builder setTransactionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      transactionId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v2.RecoverOrphanedTransactionCommand)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v2.RecoverOrphanedTransactionCommand)
  private static final apache.rocketmq.v2.RecoverOrphanedTransactionCommand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v2.RecoverOrphanedTransactionCommand();
  }

  public static apache.rocketmq.v2.RecoverOrphanedTransactionCommand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecoverOrphanedTransactionCommand>
      PARSER = new com.google.protobuf.AbstractParser<RecoverOrphanedTransactionCommand>() {
    @java.lang.Override
    public RecoverOrphanedTransactionCommand parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecoverOrphanedTransactionCommand(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecoverOrphanedTransactionCommand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecoverOrphanedTransactionCommand> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v2.RecoverOrphanedTransactionCommand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

