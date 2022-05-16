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
// source: google/cloud/assuredworkloads/v1beta1/assuredworkloads_v1beta1.proto

package com.google.cloud.assuredworkloads.v1beta1;

/**
 *
 *
 * <pre>
 * Request for creating a workload.
 * </pre>
 *
 * Protobuf type {@code google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest}
 */
public final class CreateWorkloadRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest)
    CreateWorkloadRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateWorkloadRequest.newBuilder() to construct.
  private CreateWorkloadRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateWorkloadRequest() {
    parent_ = "";
    externalId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateWorkloadRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateWorkloadRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.assuredworkloads.v1beta1.Workload.Builder subBuilder = null;
              if (workload_ != null) {
                subBuilder = workload_.toBuilder();
              }
              workload_ =
                  input.readMessage(
                      com.google.cloud.assuredworkloads.v1beta1.Workload.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(workload_);
                workload_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              externalId_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.assuredworkloads.v1beta1.AssuredworkloadsProto
        .internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.assuredworkloads.v1beta1.AssuredworkloadsProto
        .internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest.class,
            com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the new Workload's parent.
   * Must be of the form `organizations/{org_id}/locations/{location_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the new Workload's parent.
   * Must be of the form `organizations/{org_id}/locations/{location_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WORKLOAD_FIELD_NUMBER = 2;
  private com.google.cloud.assuredworkloads.v1beta1.Workload workload_;
  /**
   *
   *
   * <pre>
   * Required. Assured Workload to create
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1beta1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workload field is set.
   */
  @java.lang.Override
  public boolean hasWorkload() {
    return workload_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Assured Workload to create
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1beta1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workload.
   */
  @java.lang.Override
  public com.google.cloud.assuredworkloads.v1beta1.Workload getWorkload() {
    return workload_ == null
        ? com.google.cloud.assuredworkloads.v1beta1.Workload.getDefaultInstance()
        : workload_;
  }
  /**
   *
   *
   * <pre>
   * Required. Assured Workload to create
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1beta1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.assuredworkloads.v1beta1.WorkloadOrBuilder getWorkloadOrBuilder() {
    return getWorkload();
  }

  public static final int EXTERNAL_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object externalId_;
  /**
   *
   *
   * <pre>
   * Optional. A identifier associated with the workload and underlying projects
   * which allows for the break down of billing costs for a workload. The value
   * provided for the identifier will add a label to the workload and contained
   * projects with the identifier as the value.
   * </pre>
   *
   * <code>string external_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The externalId.
   */
  @java.lang.Override
  public java.lang.String getExternalId() {
    java.lang.Object ref = externalId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      externalId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. A identifier associated with the workload and underlying projects
   * which allows for the break down of billing costs for a workload. The value
   * provided for the identifier will add a label to the workload and contained
   * projects with the identifier as the value.
   * </pre>
   *
   * <code>string external_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for externalId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExternalIdBytes() {
    java.lang.Object ref = externalId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      externalId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (workload_ != null) {
      output.writeMessage(2, getWorkload());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, externalId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (workload_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getWorkload());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, externalId_);
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
    if (!(obj instanceof com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest other =
        (com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasWorkload() != other.hasWorkload()) return false;
    if (hasWorkload()) {
      if (!getWorkload().equals(other.getWorkload())) return false;
    }
    if (!getExternalId().equals(other.getExternalId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasWorkload()) {
      hash = (37 * hash) + WORKLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getWorkload().hashCode();
    }
    hash = (37 * hash) + EXTERNAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getExternalId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest parseFrom(
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
      com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest prototype) {
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
   * Request for creating a workload.
   * </pre>
   *
   * Protobuf type {@code google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest)
      com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.assuredworkloads.v1beta1.AssuredworkloadsProto
          .internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.assuredworkloads.v1beta1.AssuredworkloadsProto
          .internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest.class,
              com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest.Builder.class);
    }

    // Construct using com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest.newBuilder()
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
      parent_ = "";

      if (workloadBuilder_ == null) {
        workload_ = null;
      } else {
        workload_ = null;
        workloadBuilder_ = null;
      }
      externalId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.assuredworkloads.v1beta1.AssuredworkloadsProto
          .internal_static_google_cloud_assuredworkloads_v1beta1_CreateWorkloadRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest
        getDefaultInstanceForType() {
      return com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest build() {
      com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest buildPartial() {
      com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest result =
          new com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest(this);
      result.parent_ = parent_;
      if (workloadBuilder_ == null) {
        result.workload_ = workload_;
      } else {
        result.workload_ = workloadBuilder_.build();
      }
      result.externalId_ = externalId_;
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
      if (other instanceof com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest) {
        return mergeFrom((com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest other) {
      if (other
          == com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasWorkload()) {
        mergeWorkload(other.getWorkload());
      }
      if (!other.getExternalId().isEmpty()) {
        externalId_ = other.externalId_;
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
      com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the new Workload's parent.
     * Must be of the form `organizations/{org_id}/locations/{location_id}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the new Workload's parent.
     * Must be of the form `organizations/{org_id}/locations/{location_id}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the new Workload's parent.
     * Must be of the form `organizations/{org_id}/locations/{location_id}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the new Workload's parent.
     * Must be of the form `organizations/{org_id}/locations/{location_id}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the new Workload's parent.
     * Must be of the form `organizations/{org_id}/locations/{location_id}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.assuredworkloads.v1beta1.Workload workload_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.assuredworkloads.v1beta1.Workload,
            com.google.cloud.assuredworkloads.v1beta1.Workload.Builder,
            com.google.cloud.assuredworkloads.v1beta1.WorkloadOrBuilder>
        workloadBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Assured Workload to create
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1beta1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the workload field is set.
     */
    public boolean hasWorkload() {
      return workloadBuilder_ != null || workload_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Assured Workload to create
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1beta1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The workload.
     */
    public com.google.cloud.assuredworkloads.v1beta1.Workload getWorkload() {
      if (workloadBuilder_ == null) {
        return workload_ == null
            ? com.google.cloud.assuredworkloads.v1beta1.Workload.getDefaultInstance()
            : workload_;
      } else {
        return workloadBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Assured Workload to create
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1beta1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWorkload(com.google.cloud.assuredworkloads.v1beta1.Workload value) {
      if (workloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workload_ = value;
        onChanged();
      } else {
        workloadBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Assured Workload to create
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1beta1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWorkload(
        com.google.cloud.assuredworkloads.v1beta1.Workload.Builder builderForValue) {
      if (workloadBuilder_ == null) {
        workload_ = builderForValue.build();
        onChanged();
      } else {
        workloadBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Assured Workload to create
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1beta1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeWorkload(com.google.cloud.assuredworkloads.v1beta1.Workload value) {
      if (workloadBuilder_ == null) {
        if (workload_ != null) {
          workload_ =
              com.google.cloud.assuredworkloads.v1beta1.Workload.newBuilder(workload_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          workload_ = value;
        }
        onChanged();
      } else {
        workloadBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Assured Workload to create
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1beta1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearWorkload() {
      if (workloadBuilder_ == null) {
        workload_ = null;
        onChanged();
      } else {
        workload_ = null;
        workloadBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Assured Workload to create
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1beta1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.assuredworkloads.v1beta1.Workload.Builder getWorkloadBuilder() {

      onChanged();
      return getWorkloadFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Assured Workload to create
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1beta1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.assuredworkloads.v1beta1.WorkloadOrBuilder getWorkloadOrBuilder() {
      if (workloadBuilder_ != null) {
        return workloadBuilder_.getMessageOrBuilder();
      } else {
        return workload_ == null
            ? com.google.cloud.assuredworkloads.v1beta1.Workload.getDefaultInstance()
            : workload_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Assured Workload to create
     * </pre>
     *
     * <code>
     * .google.cloud.assuredworkloads.v1beta1.Workload workload = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.assuredworkloads.v1beta1.Workload,
            com.google.cloud.assuredworkloads.v1beta1.Workload.Builder,
            com.google.cloud.assuredworkloads.v1beta1.WorkloadOrBuilder>
        getWorkloadFieldBuilder() {
      if (workloadBuilder_ == null) {
        workloadBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.assuredworkloads.v1beta1.Workload,
                com.google.cloud.assuredworkloads.v1beta1.Workload.Builder,
                com.google.cloud.assuredworkloads.v1beta1.WorkloadOrBuilder>(
                getWorkload(), getParentForChildren(), isClean());
        workload_ = null;
      }
      return workloadBuilder_;
    }

    private java.lang.Object externalId_ = "";
    /**
     *
     *
     * <pre>
     * Optional. A identifier associated with the workload and underlying projects
     * which allows for the break down of billing costs for a workload. The value
     * provided for the identifier will add a label to the workload and contained
     * projects with the identifier as the value.
     * </pre>
     *
     * <code>string external_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The externalId.
     */
    public java.lang.String getExternalId() {
      java.lang.Object ref = externalId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        externalId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A identifier associated with the workload and underlying projects
     * which allows for the break down of billing costs for a workload. The value
     * provided for the identifier will add a label to the workload and contained
     * projects with the identifier as the value.
     * </pre>
     *
     * <code>string external_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for externalId.
     */
    public com.google.protobuf.ByteString getExternalIdBytes() {
      java.lang.Object ref = externalId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        externalId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A identifier associated with the workload and underlying projects
     * which allows for the break down of billing costs for a workload. The value
     * provided for the identifier will add a label to the workload and contained
     * projects with the identifier as the value.
     * </pre>
     *
     * <code>string external_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The externalId to set.
     * @return This builder for chaining.
     */
    public Builder setExternalId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      externalId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A identifier associated with the workload and underlying projects
     * which allows for the break down of billing costs for a workload. The value
     * provided for the identifier will add a label to the workload and contained
     * projects with the identifier as the value.
     * </pre>
     *
     * <code>string external_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExternalId() {

      externalId_ = getDefaultInstance().getExternalId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A identifier associated with the workload and underlying projects
     * which allows for the break down of billing costs for a workload. The value
     * provided for the identifier will add a label to the workload and contained
     * projects with the identifier as the value.
     * </pre>
     *
     * <code>string external_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for externalId to set.
     * @return This builder for chaining.
     */
    public Builder setExternalIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      externalId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest)
  private static final com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest();
  }

  public static com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWorkloadRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateWorkloadRequest>() {
        @java.lang.Override
        public CreateWorkloadRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateWorkloadRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateWorkloadRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWorkloadRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
