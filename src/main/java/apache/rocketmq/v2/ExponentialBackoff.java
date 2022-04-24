// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

/**
 * Protobuf type {@code apache.rocketmq.v2.ExponentialBackoff}
 */
public final class ExponentialBackoff extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v2.ExponentialBackoff)
    ExponentialBackoffOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExponentialBackoff.newBuilder() to construct.
  private ExponentialBackoff(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExponentialBackoff() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExponentialBackoff();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExponentialBackoff(
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
          case 13: {

            initialBackoff_ = input.readFloat();
            break;
          }
          case 21: {

            maxBackoff_ = input.readFloat();
            break;
          }
          case 29: {

            backoffMultiplier_ = input.readFloat();
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
    return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_ExponentialBackoff_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_ExponentialBackoff_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v2.ExponentialBackoff.class, apache.rocketmq.v2.ExponentialBackoff.Builder.class);
  }

  public static final int INITIAL_BACKOFF_FIELD_NUMBER = 1;
  private float initialBackoff_;
  /**
   * <code>float initial_backoff = 1;</code>
   * @return The initialBackoff.
   */
  @java.lang.Override
  public float getInitialBackoff() {
    return initialBackoff_;
  }

  public static final int MAX_BACKOFF_FIELD_NUMBER = 2;
  private float maxBackoff_;
  /**
   * <code>float max_backoff = 2;</code>
   * @return The maxBackoff.
   */
  @java.lang.Override
  public float getMaxBackoff() {
    return maxBackoff_;
  }

  public static final int BACKOFF_MULTIPLIER_FIELD_NUMBER = 3;
  private float backoffMultiplier_;
  /**
   * <code>float backoff_multiplier = 3;</code>
   * @return The backoffMultiplier.
   */
  @java.lang.Override
  public float getBackoffMultiplier() {
    return backoffMultiplier_;
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
    if (java.lang.Float.floatToRawIntBits(initialBackoff_) != 0) {
      output.writeFloat(1, initialBackoff_);
    }
    if (java.lang.Float.floatToRawIntBits(maxBackoff_) != 0) {
      output.writeFloat(2, maxBackoff_);
    }
    if (java.lang.Float.floatToRawIntBits(backoffMultiplier_) != 0) {
      output.writeFloat(3, backoffMultiplier_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(initialBackoff_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, initialBackoff_);
    }
    if (java.lang.Float.floatToRawIntBits(maxBackoff_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, maxBackoff_);
    }
    if (java.lang.Float.floatToRawIntBits(backoffMultiplier_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, backoffMultiplier_);
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
    if (!(obj instanceof apache.rocketmq.v2.ExponentialBackoff)) {
      return super.equals(obj);
    }
    apache.rocketmq.v2.ExponentialBackoff other = (apache.rocketmq.v2.ExponentialBackoff) obj;

    if (java.lang.Float.floatToIntBits(getInitialBackoff())
        != java.lang.Float.floatToIntBits(
            other.getInitialBackoff())) return false;
    if (java.lang.Float.floatToIntBits(getMaxBackoff())
        != java.lang.Float.floatToIntBits(
            other.getMaxBackoff())) return false;
    if (java.lang.Float.floatToIntBits(getBackoffMultiplier())
        != java.lang.Float.floatToIntBits(
            other.getBackoffMultiplier())) return false;
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
    hash = (37 * hash) + INITIAL_BACKOFF_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getInitialBackoff());
    hash = (37 * hash) + MAX_BACKOFF_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMaxBackoff());
    hash = (37 * hash) + BACKOFF_MULTIPLIER_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBackoffMultiplier());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.ExponentialBackoff parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v2.ExponentialBackoff prototype) {
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
   * Protobuf type {@code apache.rocketmq.v2.ExponentialBackoff}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v2.ExponentialBackoff)
      apache.rocketmq.v2.ExponentialBackoffOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_ExponentialBackoff_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_ExponentialBackoff_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v2.ExponentialBackoff.class, apache.rocketmq.v2.ExponentialBackoff.Builder.class);
    }

    // Construct using apache.rocketmq.v2.ExponentialBackoff.newBuilder()
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
      initialBackoff_ = 0F;

      maxBackoff_ = 0F;

      backoffMultiplier_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_ExponentialBackoff_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v2.ExponentialBackoff getDefaultInstanceForType() {
      return apache.rocketmq.v2.ExponentialBackoff.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v2.ExponentialBackoff build() {
      apache.rocketmq.v2.ExponentialBackoff result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v2.ExponentialBackoff buildPartial() {
      apache.rocketmq.v2.ExponentialBackoff result = new apache.rocketmq.v2.ExponentialBackoff(this);
      result.initialBackoff_ = initialBackoff_;
      result.maxBackoff_ = maxBackoff_;
      result.backoffMultiplier_ = backoffMultiplier_;
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
      if (other instanceof apache.rocketmq.v2.ExponentialBackoff) {
        return mergeFrom((apache.rocketmq.v2.ExponentialBackoff)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v2.ExponentialBackoff other) {
      if (other == apache.rocketmq.v2.ExponentialBackoff.getDefaultInstance()) return this;
      if (other.getInitialBackoff() != 0F) {
        setInitialBackoff(other.getInitialBackoff());
      }
      if (other.getMaxBackoff() != 0F) {
        setMaxBackoff(other.getMaxBackoff());
      }
      if (other.getBackoffMultiplier() != 0F) {
        setBackoffMultiplier(other.getBackoffMultiplier());
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
      apache.rocketmq.v2.ExponentialBackoff parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v2.ExponentialBackoff) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float initialBackoff_ ;
    /**
     * <code>float initial_backoff = 1;</code>
     * @return The initialBackoff.
     */
    @java.lang.Override
    public float getInitialBackoff() {
      return initialBackoff_;
    }
    /**
     * <code>float initial_backoff = 1;</code>
     * @param value The initialBackoff to set.
     * @return This builder for chaining.
     */
    public Builder setInitialBackoff(float value) {
      
      initialBackoff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float initial_backoff = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInitialBackoff() {
      
      initialBackoff_ = 0F;
      onChanged();
      return this;
    }

    private float maxBackoff_ ;
    /**
     * <code>float max_backoff = 2;</code>
     * @return The maxBackoff.
     */
    @java.lang.Override
    public float getMaxBackoff() {
      return maxBackoff_;
    }
    /**
     * <code>float max_backoff = 2;</code>
     * @param value The maxBackoff to set.
     * @return This builder for chaining.
     */
    public Builder setMaxBackoff(float value) {
      
      maxBackoff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float max_backoff = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxBackoff() {
      
      maxBackoff_ = 0F;
      onChanged();
      return this;
    }

    private float backoffMultiplier_ ;
    /**
     * <code>float backoff_multiplier = 3;</code>
     * @return The backoffMultiplier.
     */
    @java.lang.Override
    public float getBackoffMultiplier() {
      return backoffMultiplier_;
    }
    /**
     * <code>float backoff_multiplier = 3;</code>
     * @param value The backoffMultiplier to set.
     * @return This builder for chaining.
     */
    public Builder setBackoffMultiplier(float value) {
      
      backoffMultiplier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float backoff_multiplier = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBackoffMultiplier() {
      
      backoffMultiplier_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v2.ExponentialBackoff)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v2.ExponentialBackoff)
  private static final apache.rocketmq.v2.ExponentialBackoff DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v2.ExponentialBackoff();
  }

  public static apache.rocketmq.v2.ExponentialBackoff getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExponentialBackoff>
      PARSER = new com.google.protobuf.AbstractParser<ExponentialBackoff>() {
    @java.lang.Override
    public ExponentialBackoff parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExponentialBackoff(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExponentialBackoff> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExponentialBackoff> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v2.ExponentialBackoff getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

