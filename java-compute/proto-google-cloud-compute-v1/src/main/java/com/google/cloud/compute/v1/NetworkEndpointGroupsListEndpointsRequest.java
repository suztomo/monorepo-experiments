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
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest}
 */
public final class NetworkEndpointGroupsListEndpointsRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest)
    NetworkEndpointGroupsListEndpointsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NetworkEndpointGroupsListEndpointsRequest.newBuilder() to construct.
  private NetworkEndpointGroupsListEndpointsRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NetworkEndpointGroupsListEndpointsRequest() {
    healthStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NetworkEndpointGroupsListEndpointsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private NetworkEndpointGroupsListEndpointsRequest(
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
          case -1250600536:
            {
              int rawValue = input.readEnum();

              healthStatus_ = rawValue;
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
        .internal_static_google_cloud_compute_v1_NetworkEndpointGroupsListEndpointsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NetworkEndpointGroupsListEndpointsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.class,
            com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus}
   */
  public enum HealthStatus implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_HEALTH_STATUS = 0;</code>
     */
    UNDEFINED_HEALTH_STATUS(0),
    /** <code>SHOW = 2544381;</code> */
    SHOW(2544381),
    /** <code>SKIP = 2547071;</code> */
    SKIP(2547071),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_HEALTH_STATUS = 0;</code>
     */
    public static final int UNDEFINED_HEALTH_STATUS_VALUE = 0;
    /** <code>SHOW = 2544381;</code> */
    public static final int SHOW_VALUE = 2544381;
    /** <code>SKIP = 2547071;</code> */
    public static final int SKIP_VALUE = 2547071;

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
    public static HealthStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HealthStatus forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_HEALTH_STATUS;
        case 2544381:
          return SHOW;
        case 2547071:
          return SKIP;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HealthStatus> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<HealthStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HealthStatus>() {
          public HealthStatus findValueByNumber(int number) {
            return HealthStatus.forNumber(number);
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
      return com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final HealthStatus[] VALUES = values();

    public static HealthStatus valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private HealthStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus)
  }

  public static final int HEALTH_STATUS_FIELD_NUMBER = 380545845;
  private int healthStatus_;
  /**
   *
   *
   * <pre>
   * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus health_status = 380545845;
   * </code>
   *
   * @return The enum numeric value on the wire for healthStatus.
   */
  @java.lang.Override
  public int getHealthStatusValue() {
    return healthStatus_;
  }
  /**
   *
   *
   * <pre>
   * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus health_status = 380545845;
   * </code>
   *
   * @return The healthStatus.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus
      getHealthStatus() {
    @SuppressWarnings("deprecation")
    com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus result =
        com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus.valueOf(
            healthStatus_);
    return result == null
        ? com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus
            .UNRECOGNIZED
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
    if (healthStatus_
        != com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus
            .UNDEFINED_HEALTH_STATUS
            .getNumber()) {
      output.writeEnum(380545845, healthStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (healthStatus_
        != com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus
            .UNDEFINED_HEALTH_STATUS
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(380545845, healthStatus_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest other =
        (com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest) obj;

    if (healthStatus_ != other.healthStatus_) return false;
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
    hash = (37 * hash) + HEALTH_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + healthStatus_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest)
      com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworkEndpointGroupsListEndpointsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworkEndpointGroupsListEndpointsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.class,
              com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.newBuilder()
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
      healthStatus_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NetworkEndpointGroupsListEndpointsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest build() {
      com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest buildPartial() {
      com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest result =
          new com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest(this);
      result.healthStatus_ = healthStatus_;
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
      if (other instanceof com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest) {
        return mergeFrom(
            (com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest other) {
      if (other
          == com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest
              .getDefaultInstance()) return this;
      if (other.healthStatus_ != 0) {
        setHealthStatusValue(other.getHealthStatusValue());
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
      com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int healthStatus_ = 0;
    /**
     *
     *
     * <pre>
     * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus health_status = 380545845;
     * </code>
     *
     * @return The enum numeric value on the wire for healthStatus.
     */
    @java.lang.Override
    public int getHealthStatusValue() {
      return healthStatus_;
    }
    /**
     *
     *
     * <pre>
     * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus health_status = 380545845;
     * </code>
     *
     * @param value The enum numeric value on the wire for healthStatus to set.
     * @return This builder for chaining.
     */
    public Builder setHealthStatusValue(int value) {

      healthStatus_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus health_status = 380545845;
     * </code>
     *
     * @return The healthStatus.
     */
    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus
        getHealthStatus() {
      @SuppressWarnings("deprecation")
      com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus result =
          com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus
              .valueOf(healthStatus_);
      return result == null
          ? com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus
              .UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus health_status = 380545845;
     * </code>
     *
     * @param value The healthStatus to set.
     * @return This builder for chaining.
     */
    public Builder setHealthStatus(
        com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }

      healthStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus health_status = 380545845;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHealthStatus() {

      healthStatus_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest)
  private static final com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest();
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkEndpointGroupsListEndpointsRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<NetworkEndpointGroupsListEndpointsRequest>() {
            @java.lang.Override
            public NetworkEndpointGroupsListEndpointsRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new NetworkEndpointGroupsListEndpointsRequest(input, extensionRegistry);
            }
          };

  public static com.google.protobuf.Parser<NetworkEndpointGroupsListEndpointsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkEndpointGroupsListEndpointsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
