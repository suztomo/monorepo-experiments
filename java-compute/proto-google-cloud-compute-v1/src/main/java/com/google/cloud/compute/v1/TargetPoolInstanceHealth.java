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
 * Protobuf type {@code google.cloud.compute.v1.TargetPoolInstanceHealth}
 */
public final class TargetPoolInstanceHealth extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.TargetPoolInstanceHealth)
    TargetPoolInstanceHealthOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TargetPoolInstanceHealth.newBuilder() to construct.
  private TargetPoolInstanceHealth(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TargetPoolInstanceHealth() {
    healthStatus_ = java.util.Collections.emptyList();
    kind_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TargetPoolInstanceHealth();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TargetPoolInstanceHealth(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 26336418:
            {
              java.lang.String s = input.readStringRequireUtf8();

              kind_ = s;
              break;
            }
          case -1250600534:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                healthStatus_ = new java.util.ArrayList<com.google.cloud.compute.v1.HealthStatus>();
                mutable_bitField0_ |= 0x00000001;
              }
              healthStatus_.add(
                  input.readMessage(
                      com.google.cloud.compute.v1.HealthStatus.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        healthStatus_ = java.util.Collections.unmodifiableList(healthStatus_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_TargetPoolInstanceHealth_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_TargetPoolInstanceHealth_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.TargetPoolInstanceHealth.class,
            com.google.cloud.compute.v1.TargetPoolInstanceHealth.Builder.class);
  }

  public static final int HEALTH_STATUS_FIELD_NUMBER = 380545845;
  private java.util.List<com.google.cloud.compute.v1.HealthStatus> healthStatus_;
  /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.HealthStatus> getHealthStatusList() {
    return healthStatus_;
  }
  /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.HealthStatusOrBuilder>
      getHealthStatusOrBuilderList() {
    return healthStatus_;
  }
  /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
  @java.lang.Override
  public int getHealthStatusCount() {
    return healthStatus_.size();
  }
  /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
  @java.lang.Override
  public com.google.cloud.compute.v1.HealthStatus getHealthStatus(int index) {
    return healthStatus_.get(index);
  }
  /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
  @java.lang.Override
  public com.google.cloud.compute.v1.HealthStatusOrBuilder getHealthStatusOrBuilder(int index) {
    return healthStatus_.get(index);
  }

  public static final int KIND_FIELD_NUMBER = 3292052;
  private volatile java.lang.Object kind_;
  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The kind.
   */
  @java.lang.Override
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      kind_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getKindBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3292052, kind_);
    }
    for (int i = 0; i < healthStatus_.size(); i++) {
      output.writeMessage(380545845, healthStatus_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKindBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3292052, kind_);
    }
    for (int i = 0; i < healthStatus_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(380545845, healthStatus_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.TargetPoolInstanceHealth)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.TargetPoolInstanceHealth other =
        (com.google.cloud.compute.v1.TargetPoolInstanceHealth) obj;

    if (!getHealthStatusList().equals(other.getHealthStatusList())) return false;
    if (!getKind().equals(other.getKind())) return false;
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
    if (getHealthStatusCount() > 0) {
      hash = (37 * hash) + HEALTH_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getHealthStatusList().hashCode();
    }
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.TargetPoolInstanceHealth parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TargetPoolInstanceHealth parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolInstanceHealth parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TargetPoolInstanceHealth parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolInstanceHealth parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TargetPoolInstanceHealth parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolInstanceHealth parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TargetPoolInstanceHealth parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolInstanceHealth parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TargetPoolInstanceHealth parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TargetPoolInstanceHealth parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TargetPoolInstanceHealth parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.TargetPoolInstanceHealth prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.TargetPoolInstanceHealth}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.TargetPoolInstanceHealth)
      com.google.cloud.compute.v1.TargetPoolInstanceHealthOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TargetPoolInstanceHealth_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TargetPoolInstanceHealth_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.TargetPoolInstanceHealth.class,
              com.google.cloud.compute.v1.TargetPoolInstanceHealth.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.TargetPoolInstanceHealth.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getHealthStatusFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (healthStatusBuilder_ == null) {
        healthStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        healthStatusBuilder_.clear();
      }
      kind_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TargetPoolInstanceHealth_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetPoolInstanceHealth getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.TargetPoolInstanceHealth.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetPoolInstanceHealth build() {
      com.google.cloud.compute.v1.TargetPoolInstanceHealth result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetPoolInstanceHealth buildPartial() {
      com.google.cloud.compute.v1.TargetPoolInstanceHealth result =
          new com.google.cloud.compute.v1.TargetPoolInstanceHealth(this);
      int from_bitField0_ = bitField0_;
      if (healthStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          healthStatus_ = java.util.Collections.unmodifiableList(healthStatus_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.healthStatus_ = healthStatus_;
      } else {
        result.healthStatus_ = healthStatusBuilder_.build();
      }
      result.kind_ = kind_;
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
      if (other instanceof com.google.cloud.compute.v1.TargetPoolInstanceHealth) {
        return mergeFrom((com.google.cloud.compute.v1.TargetPoolInstanceHealth) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.TargetPoolInstanceHealth other) {
      if (other == com.google.cloud.compute.v1.TargetPoolInstanceHealth.getDefaultInstance())
        return this;
      if (healthStatusBuilder_ == null) {
        if (!other.healthStatus_.isEmpty()) {
          if (healthStatus_.isEmpty()) {
            healthStatus_ = other.healthStatus_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHealthStatusIsMutable();
            healthStatus_.addAll(other.healthStatus_);
          }
          onChanged();
        }
      } else {
        if (!other.healthStatus_.isEmpty()) {
          if (healthStatusBuilder_.isEmpty()) {
            healthStatusBuilder_.dispose();
            healthStatusBuilder_ = null;
            healthStatus_ = other.healthStatus_;
            bitField0_ = (bitField0_ & ~0x00000001);
            healthStatusBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getHealthStatusFieldBuilder()
                    : null;
          } else {
            healthStatusBuilder_.addAllMessages(other.healthStatus_);
          }
        }
      }
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
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
      com.google.cloud.compute.v1.TargetPoolInstanceHealth parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.TargetPoolInstanceHealth) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.compute.v1.HealthStatus> healthStatus_ =
        java.util.Collections.emptyList();

    private void ensureHealthStatusIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        healthStatus_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.HealthStatus>(healthStatus_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.HealthStatus,
            com.google.cloud.compute.v1.HealthStatus.Builder,
            com.google.cloud.compute.v1.HealthStatusOrBuilder>
        healthStatusBuilder_;

    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public java.util.List<com.google.cloud.compute.v1.HealthStatus> getHealthStatusList() {
      if (healthStatusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(healthStatus_);
      } else {
        return healthStatusBuilder_.getMessageList();
      }
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public int getHealthStatusCount() {
      if (healthStatusBuilder_ == null) {
        return healthStatus_.size();
      } else {
        return healthStatusBuilder_.getCount();
      }
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public com.google.cloud.compute.v1.HealthStatus getHealthStatus(int index) {
      if (healthStatusBuilder_ == null) {
        return healthStatus_.get(index);
      } else {
        return healthStatusBuilder_.getMessage(index);
      }
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public Builder setHealthStatus(int index, com.google.cloud.compute.v1.HealthStatus value) {
      if (healthStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHealthStatusIsMutable();
        healthStatus_.set(index, value);
        onChanged();
      } else {
        healthStatusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public Builder setHealthStatus(
        int index, com.google.cloud.compute.v1.HealthStatus.Builder builderForValue) {
      if (healthStatusBuilder_ == null) {
        ensureHealthStatusIsMutable();
        healthStatus_.set(index, builderForValue.build());
        onChanged();
      } else {
        healthStatusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public Builder addHealthStatus(com.google.cloud.compute.v1.HealthStatus value) {
      if (healthStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHealthStatusIsMutable();
        healthStatus_.add(value);
        onChanged();
      } else {
        healthStatusBuilder_.addMessage(value);
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public Builder addHealthStatus(int index, com.google.cloud.compute.v1.HealthStatus value) {
      if (healthStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHealthStatusIsMutable();
        healthStatus_.add(index, value);
        onChanged();
      } else {
        healthStatusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public Builder addHealthStatus(
        com.google.cloud.compute.v1.HealthStatus.Builder builderForValue) {
      if (healthStatusBuilder_ == null) {
        ensureHealthStatusIsMutable();
        healthStatus_.add(builderForValue.build());
        onChanged();
      } else {
        healthStatusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public Builder addHealthStatus(
        int index, com.google.cloud.compute.v1.HealthStatus.Builder builderForValue) {
      if (healthStatusBuilder_ == null) {
        ensureHealthStatusIsMutable();
        healthStatus_.add(index, builderForValue.build());
        onChanged();
      } else {
        healthStatusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public Builder addAllHealthStatus(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.HealthStatus> values) {
      if (healthStatusBuilder_ == null) {
        ensureHealthStatusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, healthStatus_);
        onChanged();
      } else {
        healthStatusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public Builder clearHealthStatus() {
      if (healthStatusBuilder_ == null) {
        healthStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        healthStatusBuilder_.clear();
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public Builder removeHealthStatus(int index) {
      if (healthStatusBuilder_ == null) {
        ensureHealthStatusIsMutable();
        healthStatus_.remove(index);
        onChanged();
      } else {
        healthStatusBuilder_.remove(index);
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public com.google.cloud.compute.v1.HealthStatus.Builder getHealthStatusBuilder(int index) {
      return getHealthStatusFieldBuilder().getBuilder(index);
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public com.google.cloud.compute.v1.HealthStatusOrBuilder getHealthStatusOrBuilder(int index) {
      if (healthStatusBuilder_ == null) {
        return healthStatus_.get(index);
      } else {
        return healthStatusBuilder_.getMessageOrBuilder(index);
      }
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public java.util.List<? extends com.google.cloud.compute.v1.HealthStatusOrBuilder>
        getHealthStatusOrBuilderList() {
      if (healthStatusBuilder_ != null) {
        return healthStatusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(healthStatus_);
      }
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public com.google.cloud.compute.v1.HealthStatus.Builder addHealthStatusBuilder() {
      return getHealthStatusFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.HealthStatus.getDefaultInstance());
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public com.google.cloud.compute.v1.HealthStatus.Builder addHealthStatusBuilder(int index) {
      return getHealthStatusFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.HealthStatus.getDefaultInstance());
    }
    /** <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code> */
    public java.util.List<com.google.cloud.compute.v1.HealthStatus.Builder>
        getHealthStatusBuilderList() {
      return getHealthStatusFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.HealthStatus,
            com.google.cloud.compute.v1.HealthStatus.Builder,
            com.google.cloud.compute.v1.HealthStatusOrBuilder>
        getHealthStatusFieldBuilder() {
      if (healthStatusBuilder_ == null) {
        healthStatusBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.HealthStatus,
                com.google.cloud.compute.v1.HealthStatus.Builder,
                com.google.cloud.compute.v1.HealthStatusOrBuilder>(
                healthStatus_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        healthStatus_ = null;
      }
      return healthStatusBuilder_;
    }

    private java.lang.Object kind_ = "";
    /**
     *
     *
     * <pre>
     * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance.
     * </pre>
     *
     * <code>string kind = 3292052;</code>
     *
     * @return The kind.
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance.
     * </pre>
     *
     * <code>string kind = 3292052;</code>
     *
     * @return The bytes for kind.
     */
    public com.google.protobuf.ByteString getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance.
     * </pre>
     *
     * <code>string kind = 3292052;</code>
     *
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      kind_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance.
     * </pre>
     *
     * <code>string kind = 3292052;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKind() {

      kind_ = getDefaultInstance().getKind();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the health of an instance.
     * </pre>
     *
     * <code>string kind = 3292052;</code>
     *
     * @param value The bytes for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      kind_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.TargetPoolInstanceHealth)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.TargetPoolInstanceHealth)
  private static final com.google.cloud.compute.v1.TargetPoolInstanceHealth DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.TargetPoolInstanceHealth();
  }

  public static com.google.cloud.compute.v1.TargetPoolInstanceHealth getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetPoolInstanceHealth> PARSER =
      new com.google.protobuf.AbstractParser<TargetPoolInstanceHealth>() {
        @java.lang.Override
        public TargetPoolInstanceHealth parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TargetPoolInstanceHealth(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TargetPoolInstanceHealth> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetPoolInstanceHealth> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.TargetPoolInstanceHealth getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
