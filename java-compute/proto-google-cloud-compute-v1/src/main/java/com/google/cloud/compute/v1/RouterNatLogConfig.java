/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Configuration of logging on a NAT.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.RouterNatLogConfig}
 */
public final class RouterNatLogConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.RouterNatLogConfig)
    RouterNatLogConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RouterNatLogConfig.newBuilder() to construct.
  private RouterNatLogConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RouterNatLogConfig() {
    filter_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RouterNatLogConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RouterNatLogConfig(
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
          case -1800852456:
            {
              enable_ = input.readBool();
              break;
            }
          case -1606001728:
            {
              int rawValue = input.readEnum();

              filter_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_RouterNatLogConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_RouterNatLogConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.RouterNatLogConfig.class,
            com.google.cloud.compute.v1.RouterNatLogConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values:
   * - ERRORS_ONLY: Export logs only for connection failures.
   * - TRANSLATIONS_ONLY: Export logs only for successful connections.
   * - ALL: Export logs for all connections, successful and unsuccessful.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.RouterNatLogConfig.Filter}
   */
  public enum Filter implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_FILTER = 0;</code>
     */
    UNDEFINED_FILTER(0),
    /** <code>ALL = 64897;</code> */
    ALL(64897),
    /** <code>ERRORS_ONLY = 307484672;</code> */
    ERRORS_ONLY(307484672),
    /** <code>TRANSLATIONS_ONLY = 357212649;</code> */
    TRANSLATIONS_ONLY(357212649),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_FILTER = 0;</code>
     */
    public static final int UNDEFINED_FILTER_VALUE = 0;
    /** <code>ALL = 64897;</code> */
    public static final int ALL_VALUE = 64897;
    /** <code>ERRORS_ONLY = 307484672;</code> */
    public static final int ERRORS_ONLY_VALUE = 307484672;
    /** <code>TRANSLATIONS_ONLY = 357212649;</code> */
    public static final int TRANSLATIONS_ONLY_VALUE = 357212649;

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
    public static Filter valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Filter forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_FILTER;
        case 64897:
          return ALL;
        case 307484672:
          return ERRORS_ONLY;
        case 357212649:
          return TRANSLATIONS_ONLY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Filter> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Filter> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Filter>() {
          public Filter findValueByNumber(int number) {
            return Filter.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.compute.v1.RouterNatLogConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final Filter[] VALUES = values();

    public static Filter valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Filter(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.RouterNatLogConfig.Filter)
  }

  public static final int ENABLE_FIELD_NUMBER = 311764355;
  private boolean enable_;
  /**
   *
   *
   * <pre>
   * Indicates whether or not to export logs. This is false by default.
   * </pre>
   *
   * <code>bool enable = 311764355;</code>
   *
   * @return The enable.
   */
  @java.lang.Override
  public boolean getEnable() {
    return enable_;
  }

  public static final int FILTER_FIELD_NUMBER = 336120696;
  private int filter_;
  /**
   *
   *
   * <pre>
   * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values:
   * - ERRORS_ONLY: Export logs only for connection failures.
   * - TRANSLATIONS_ONLY: Export logs only for successful connections.
   * - ALL: Export logs for all connections, successful and unsuccessful.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterNatLogConfig.Filter filter = 336120696;</code>
   *
   * @return The enum numeric value on the wire for filter.
   */
  @java.lang.Override
  public int getFilterValue() {
    return filter_;
  }
  /**
   *
   *
   * <pre>
   * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values:
   * - ERRORS_ONLY: Export logs only for connection failures.
   * - TRANSLATIONS_ONLY: Export logs only for successful connections.
   * - ALL: Export logs for all connections, successful and unsuccessful.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterNatLogConfig.Filter filter = 336120696;</code>
   *
   * @return The filter.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.RouterNatLogConfig.Filter getFilter() {
    @SuppressWarnings("deprecation")
    com.google.cloud.compute.v1.RouterNatLogConfig.Filter result =
        com.google.cloud.compute.v1.RouterNatLogConfig.Filter.valueOf(filter_);
    return result == null
        ? com.google.cloud.compute.v1.RouterNatLogConfig.Filter.UNRECOGNIZED
        : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (enable_ != false) {
      output.writeBool(311764355, enable_);
    }
    if (filter_
        != com.google.cloud.compute.v1.RouterNatLogConfig.Filter.UNDEFINED_FILTER.getNumber()) {
      output.writeEnum(336120696, filter_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enable_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(311764355, enable_);
    }
    if (filter_
        != com.google.cloud.compute.v1.RouterNatLogConfig.Filter.UNDEFINED_FILTER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(336120696, filter_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.RouterNatLogConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.RouterNatLogConfig other =
        (com.google.cloud.compute.v1.RouterNatLogConfig) obj;

    if (getEnable() != other.getEnable()) return false;
    if (filter_ != other.filter_) return false;
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
    hash = (37 * hash) + ENABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnable());
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + filter_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.RouterNatLogConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RouterNatLogConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RouterNatLogConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RouterNatLogConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RouterNatLogConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RouterNatLogConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RouterNatLogConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RouterNatLogConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RouterNatLogConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RouterNatLogConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RouterNatLogConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RouterNatLogConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.compute.v1.RouterNatLogConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Configuration of logging on a NAT.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.RouterNatLogConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.RouterNatLogConfig)
      com.google.cloud.compute.v1.RouterNatLogConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RouterNatLogConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RouterNatLogConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.RouterNatLogConfig.class,
              com.google.cloud.compute.v1.RouterNatLogConfig.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.RouterNatLogConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      enable_ = false;

      filter_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RouterNatLogConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RouterNatLogConfig getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.RouterNatLogConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RouterNatLogConfig build() {
      com.google.cloud.compute.v1.RouterNatLogConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RouterNatLogConfig buildPartial() {
      com.google.cloud.compute.v1.RouterNatLogConfig result =
          new com.google.cloud.compute.v1.RouterNatLogConfig(this);
      result.enable_ = enable_;
      result.filter_ = filter_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.RouterNatLogConfig) {
        return mergeFrom((com.google.cloud.compute.v1.RouterNatLogConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.RouterNatLogConfig other) {
      if (other == com.google.cloud.compute.v1.RouterNatLogConfig.getDefaultInstance()) return this;
      if (other.getEnable() != false) {
        setEnable(other.getEnable());
      }
      if (other.filter_ != 0) {
        setFilterValue(other.getFilterValue());
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
      com.google.cloud.compute.v1.RouterNatLogConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.RouterNatLogConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enable_;
    /**
     *
     *
     * <pre>
     * Indicates whether or not to export logs. This is false by default.
     * </pre>
     *
     * <code>bool enable = 311764355;</code>
     *
     * @return The enable.
     */
    @java.lang.Override
    public boolean getEnable() {
      return enable_;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether or not to export logs. This is false by default.
     * </pre>
     *
     * <code>bool enable = 311764355;</code>
     *
     * @param value The enable to set.
     * @return This builder for chaining.
     */
    public Builder setEnable(boolean value) {

      enable_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether or not to export logs. This is false by default.
     * </pre>
     *
     * <code>bool enable = 311764355;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnable() {

      enable_ = false;
      onChanged();
      return this;
    }

    private int filter_ = 0;
    /**
     *
     *
     * <pre>
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values:
     * - ERRORS_ONLY: Export logs only for connection failures.
     * - TRANSLATIONS_ONLY: Export logs only for successful connections.
     * - ALL: Export logs for all connections, successful and unsuccessful.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.RouterNatLogConfig.Filter filter = 336120696;</code>
     *
     * @return The enum numeric value on the wire for filter.
     */
    @java.lang.Override
    public int getFilterValue() {
      return filter_;
    }
    /**
     *
     *
     * <pre>
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values:
     * - ERRORS_ONLY: Export logs only for connection failures.
     * - TRANSLATIONS_ONLY: Export logs only for successful connections.
     * - ALL: Export logs for all connections, successful and unsuccessful.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.RouterNatLogConfig.Filter filter = 336120696;</code>
     *
     * @param value The enum numeric value on the wire for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterValue(int value) {

      filter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values:
     * - ERRORS_ONLY: Export logs only for connection failures.
     * - TRANSLATIONS_ONLY: Export logs only for successful connections.
     * - ALL: Export logs for all connections, successful and unsuccessful.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.RouterNatLogConfig.Filter filter = 336120696;</code>
     *
     * @return The filter.
     */
    @java.lang.Override
    public com.google.cloud.compute.v1.RouterNatLogConfig.Filter getFilter() {
      @SuppressWarnings("deprecation")
      com.google.cloud.compute.v1.RouterNatLogConfig.Filter result =
          com.google.cloud.compute.v1.RouterNatLogConfig.Filter.valueOf(filter_);
      return result == null
          ? com.google.cloud.compute.v1.RouterNatLogConfig.Filter.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values:
     * - ERRORS_ONLY: Export logs only for connection failures.
     * - TRANSLATIONS_ONLY: Export logs only for successful connections.
     * - ALL: Export logs for all connections, successful and unsuccessful.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.RouterNatLogConfig.Filter filter = 336120696;</code>
     *
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(com.google.cloud.compute.v1.RouterNatLogConfig.Filter value) {
      if (value == null) {
        throw new NullPointerException();
      }

      filter_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values:
     * - ERRORS_ONLY: Export logs only for connection failures.
     * - TRANSLATIONS_ONLY: Export logs only for successful connections.
     * - ALL: Export logs for all connections, successful and unsuccessful.
     * </pre>
     *
     * <code>.google.cloud.compute.v1.RouterNatLogConfig.Filter filter = 336120696;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilter() {

      filter_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.RouterNatLogConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.RouterNatLogConfig)
  private static final com.google.cloud.compute.v1.RouterNatLogConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.RouterNatLogConfig();
  }

  public static com.google.cloud.compute.v1.RouterNatLogConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouterNatLogConfig> PARSER =
      new com.google.protobuf.AbstractParser<RouterNatLogConfig>() {
        @java.lang.Override
        public RouterNatLogConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RouterNatLogConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RouterNatLogConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouterNatLogConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.RouterNatLogConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
