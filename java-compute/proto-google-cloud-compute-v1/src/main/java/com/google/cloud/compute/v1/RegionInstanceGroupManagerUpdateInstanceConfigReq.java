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
 * RegionInstanceGroupManagers.updatePerInstanceConfigs
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq}
 */
public final class RegionInstanceGroupManagerUpdateInstanceConfigReq
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq)
    RegionInstanceGroupManagerUpdateInstanceConfigReqOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RegionInstanceGroupManagerUpdateInstanceConfigReq.newBuilder() to construct.
  private RegionInstanceGroupManagerUpdateInstanceConfigReq(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RegionInstanceGroupManagerUpdateInstanceConfigReq() {
    perInstanceConfigs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RegionInstanceGroupManagerUpdateInstanceConfigReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RegionInstanceGroupManagerUpdateInstanceConfigReq(
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
          case -84847286:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                perInstanceConfigs_ =
                    new java.util.ArrayList<com.google.cloud.compute.v1.PerInstanceConfig>();
                mutable_bitField0_ |= 0x00000001;
              }
              perInstanceConfigs_.add(
                  input.readMessage(
                      com.google.cloud.compute.v1.PerInstanceConfig.parser(), extensionRegistry));
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
        perInstanceConfigs_ = java.util.Collections.unmodifiableList(perInstanceConfigs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_RegionInstanceGroupManagerUpdateInstanceConfigReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_RegionInstanceGroupManagerUpdateInstanceConfigReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq.class,
            com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq.Builder
                .class);
  }

  public static final int PER_INSTANCE_CONFIGS_FIELD_NUMBER = 526265001;
  private java.util.List<com.google.cloud.compute.v1.PerInstanceConfig> perInstanceConfigs_;
  /**
   *
   *
   * <pre>
   * The list of per-instance configs to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.PerInstanceConfig> getPerInstanceConfigsList() {
    return perInstanceConfigs_;
  }
  /**
   *
   *
   * <pre>
   * The list of per-instance configs to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.PerInstanceConfigOrBuilder>
      getPerInstanceConfigsOrBuilderList() {
    return perInstanceConfigs_;
  }
  /**
   *
   *
   * <pre>
   * The list of per-instance configs to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
   * </code>
   */
  @java.lang.Override
  public int getPerInstanceConfigsCount() {
    return perInstanceConfigs_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of per-instance configs to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.PerInstanceConfig getPerInstanceConfigs(int index) {
    return perInstanceConfigs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of per-instance configs to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.PerInstanceConfigOrBuilder getPerInstanceConfigsOrBuilder(
      int index) {
    return perInstanceConfigs_.get(index);
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
    for (int i = 0; i < perInstanceConfigs_.size(); i++) {
      output.writeMessage(526265001, perInstanceConfigs_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < perInstanceConfigs_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              526265001, perInstanceConfigs_.get(i));
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
    if (!(obj
        instanceof com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq other =
        (com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq) obj;

    if (!getPerInstanceConfigsList().equals(other.getPerInstanceConfigsList())) return false;
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
    if (getPerInstanceConfigsCount() > 0) {
      hash = (37 * hash) + PER_INSTANCE_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getPerInstanceConfigsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      parseFrom(
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
      com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq prototype) {
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
   * RegionInstanceGroupManagers.updatePerInstanceConfigs
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq)
      com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RegionInstanceGroupManagerUpdateInstanceConfigReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RegionInstanceGroupManagerUpdateInstanceConfigReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq.class,
              com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPerInstanceConfigsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (perInstanceConfigsBuilder_ == null) {
        perInstanceConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        perInstanceConfigsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RegionInstanceGroupManagerUpdateInstanceConfigReq_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq build() {
      com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
        buildPartial() {
      com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq result =
          new com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq(this);
      int from_bitField0_ = bitField0_;
      if (perInstanceConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          perInstanceConfigs_ = java.util.Collections.unmodifiableList(perInstanceConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.perInstanceConfigs_ = perInstanceConfigs_;
      } else {
        result.perInstanceConfigs_ = perInstanceConfigsBuilder_.build();
      }
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
      if (other
          instanceof
          com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq) {
        return mergeFrom(
            (com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq other) {
      if (other
          == com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
              .getDefaultInstance()) return this;
      if (perInstanceConfigsBuilder_ == null) {
        if (!other.perInstanceConfigs_.isEmpty()) {
          if (perInstanceConfigs_.isEmpty()) {
            perInstanceConfigs_ = other.perInstanceConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePerInstanceConfigsIsMutable();
            perInstanceConfigs_.addAll(other.perInstanceConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.perInstanceConfigs_.isEmpty()) {
          if (perInstanceConfigsBuilder_.isEmpty()) {
            perInstanceConfigsBuilder_.dispose();
            perInstanceConfigsBuilder_ = null;
            perInstanceConfigs_ = other.perInstanceConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            perInstanceConfigsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPerInstanceConfigsFieldBuilder()
                    : null;
          } else {
            perInstanceConfigsBuilder_.addAllMessages(other.perInstanceConfigs_);
          }
        }
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
      com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq parsedMessage =
          null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.compute.v1.PerInstanceConfig> perInstanceConfigs_ =
        java.util.Collections.emptyList();

    private void ensurePerInstanceConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        perInstanceConfigs_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.PerInstanceConfig>(
                perInstanceConfigs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.PerInstanceConfig,
            com.google.cloud.compute.v1.PerInstanceConfig.Builder,
            com.google.cloud.compute.v1.PerInstanceConfigOrBuilder>
        perInstanceConfigsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.PerInstanceConfig>
        getPerInstanceConfigsList() {
      if (perInstanceConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(perInstanceConfigs_);
      } else {
        return perInstanceConfigsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public int getPerInstanceConfigsCount() {
      if (perInstanceConfigsBuilder_ == null) {
        return perInstanceConfigs_.size();
      } else {
        return perInstanceConfigsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfig getPerInstanceConfigs(int index) {
      if (perInstanceConfigsBuilder_ == null) {
        return perInstanceConfigs_.get(index);
      } else {
        return perInstanceConfigsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder setPerInstanceConfigs(
        int index, com.google.cloud.compute.v1.PerInstanceConfig value) {
      if (perInstanceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.set(index, value);
        onChanged();
      } else {
        perInstanceConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder setPerInstanceConfigs(
        int index, com.google.cloud.compute.v1.PerInstanceConfig.Builder builderForValue) {
      if (perInstanceConfigsBuilder_ == null) {
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        perInstanceConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder addPerInstanceConfigs(com.google.cloud.compute.v1.PerInstanceConfig value) {
      if (perInstanceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.add(value);
        onChanged();
      } else {
        perInstanceConfigsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder addPerInstanceConfigs(
        int index, com.google.cloud.compute.v1.PerInstanceConfig value) {
      if (perInstanceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.add(index, value);
        onChanged();
      } else {
        perInstanceConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder addPerInstanceConfigs(
        com.google.cloud.compute.v1.PerInstanceConfig.Builder builderForValue) {
      if (perInstanceConfigsBuilder_ == null) {
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        perInstanceConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder addPerInstanceConfigs(
        int index, com.google.cloud.compute.v1.PerInstanceConfig.Builder builderForValue) {
      if (perInstanceConfigsBuilder_ == null) {
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        perInstanceConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder addAllPerInstanceConfigs(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.PerInstanceConfig> values) {
      if (perInstanceConfigsBuilder_ == null) {
        ensurePerInstanceConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, perInstanceConfigs_);
        onChanged();
      } else {
        perInstanceConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder clearPerInstanceConfigs() {
      if (perInstanceConfigsBuilder_ == null) {
        perInstanceConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        perInstanceConfigsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder removePerInstanceConfigs(int index) {
      if (perInstanceConfigsBuilder_ == null) {
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.remove(index);
        onChanged();
      } else {
        perInstanceConfigsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfig.Builder getPerInstanceConfigsBuilder(
        int index) {
      return getPerInstanceConfigsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfigOrBuilder getPerInstanceConfigsOrBuilder(
        int index) {
      if (perInstanceConfigsBuilder_ == null) {
        return perInstanceConfigs_.get(index);
      } else {
        return perInstanceConfigsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.PerInstanceConfigOrBuilder>
        getPerInstanceConfigsOrBuilderList() {
      if (perInstanceConfigsBuilder_ != null) {
        return perInstanceConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(perInstanceConfigs_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfig.Builder addPerInstanceConfigsBuilder() {
      return getPerInstanceConfigsFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.PerInstanceConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfig.Builder addPerInstanceConfigsBuilder(
        int index) {
      return getPerInstanceConfigsFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.PerInstanceConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configs to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.PerInstanceConfig.Builder>
        getPerInstanceConfigsBuilderList() {
      return getPerInstanceConfigsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.PerInstanceConfig,
            com.google.cloud.compute.v1.PerInstanceConfig.Builder,
            com.google.cloud.compute.v1.PerInstanceConfigOrBuilder>
        getPerInstanceConfigsFieldBuilder() {
      if (perInstanceConfigsBuilder_ == null) {
        perInstanceConfigsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.PerInstanceConfig,
                com.google.cloud.compute.v1.PerInstanceConfig.Builder,
                com.google.cloud.compute.v1.PerInstanceConfigOrBuilder>(
                perInstanceConfigs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        perInstanceConfigs_ = null;
      }
      return perInstanceConfigsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq)
  private static final com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq();
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegionInstanceGroupManagerUpdateInstanceConfigReq>
      PARSER =
          new com.google.protobuf.AbstractParser<
              RegionInstanceGroupManagerUpdateInstanceConfigReq>() {
            @java.lang.Override
            public RegionInstanceGroupManagerUpdateInstanceConfigReq parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new RegionInstanceGroupManagerUpdateInstanceConfigReq(
                  input, extensionRegistry);
            }
          };

  public static com.google.protobuf.Parser<RegionInstanceGroupManagerUpdateInstanceConfigReq>
      parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegionInstanceGroupManagerUpdateInstanceConfigReq>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.RegionInstanceGroupManagerUpdateInstanceConfigReq
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
