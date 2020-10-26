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
 * A request message for Images.TestIamPermissions. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.TestIamPermissionsImageRequest}
 */
public final class TestIamPermissionsImageRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.TestIamPermissionsImageRequest)
    TestIamPermissionsImageRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TestIamPermissionsImageRequest.newBuilder() to construct.
  private TestIamPermissionsImageRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TestIamPermissionsImageRequest() {
    project_ = "";
    resource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TestIamPermissionsImageRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TestIamPermissionsImageRequest(
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
          case 1566449778:
            {
              java.lang.String s = input.readStringRequireUtf8();

              resource_ = s;
              break;
            }
          case 1820481738:
            {
              java.lang.String s = input.readStringRequireUtf8();

              project_ = s;
              break;
            }
          case -781249230:
            {
              com.google.cloud.compute.v1.TestPermissionsRequest.Builder subBuilder = null;
              if (testPermissionsRequestResource_ != null) {
                subBuilder = testPermissionsRequestResource_.toBuilder();
              }
              testPermissionsRequestResource_ =
                  input.readMessage(
                      com.google.cloud.compute.v1.TestPermissionsRequest.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(testPermissionsRequestResource_);
                testPermissionsRequestResource_ = subBuilder.buildPartial();
              }

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
        .internal_static_google_cloud_compute_v1_TestIamPermissionsImageRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_TestIamPermissionsImageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.TestIamPermissionsImageRequest.class,
            com.google.cloud.compute.v1.TestIamPermissionsImageRequest.Builder.class);
  }

  public static final int PROJECT_FIELD_NUMBER = 227560217;
  private volatile java.lang.Object project_;
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_FIELD_NUMBER = 195806222;
  private volatile java.lang.Object resource_;
  /**
   *
   *
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEST_PERMISSIONS_REQUEST_RESOURCE_FIELD_NUMBER = 439214758;
  private com.google.cloud.compute.v1.TestPermissionsRequest testPermissionsRequestResource_;
  /**
   * <code>
   * .google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758;
   * </code>
   *
   * @return Whether the testPermissionsRequestResource field is set.
   */
  @java.lang.Override
  public boolean hasTestPermissionsRequestResource() {
    return testPermissionsRequestResource_ != null;
  }
  /**
   * <code>
   * .google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758;
   * </code>
   *
   * @return The testPermissionsRequestResource.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.TestPermissionsRequest getTestPermissionsRequestResource() {
    return testPermissionsRequestResource_ == null
        ? com.google.cloud.compute.v1.TestPermissionsRequest.getDefaultInstance()
        : testPermissionsRequestResource_;
  }
  /**
   * <code>
   * .google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.TestPermissionsRequestOrBuilder
      getTestPermissionsRequestResourceOrBuilder() {
    return getTestPermissionsRequestResource();
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
    if (!getResourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 195806222, resource_);
    }
    if (!getProjectBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227560217, project_);
    }
    if (testPermissionsRequestResource_ != null) {
      output.writeMessage(439214758, getTestPermissionsRequestResource());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(195806222, resource_);
    }
    if (!getProjectBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227560217, project_);
    }
    if (testPermissionsRequestResource_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              439214758, getTestPermissionsRequestResource());
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
    if (!(obj instanceof com.google.cloud.compute.v1.TestIamPermissionsImageRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.TestIamPermissionsImageRequest other =
        (com.google.cloud.compute.v1.TestIamPermissionsImageRequest) obj;

    if (!getProject().equals(other.getProject())) return false;
    if (!getResource().equals(other.getResource())) return false;
    if (hasTestPermissionsRequestResource() != other.hasTestPermissionsRequestResource())
      return false;
    if (hasTestPermissionsRequestResource()) {
      if (!getTestPermissionsRequestResource().equals(other.getTestPermissionsRequestResource()))
        return false;
    }
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
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    if (hasTestPermissionsRequestResource()) {
      hash = (37 * hash) + TEST_PERMISSIONS_REQUEST_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getTestPermissionsRequestResource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsImageRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsImageRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsImageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsImageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsImageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsImageRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsImageRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsImageRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsImageRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsImageRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsImageRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsImageRequest parseFrom(
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
      com.google.cloud.compute.v1.TestIamPermissionsImageRequest prototype) {
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
   * A request message for Images.TestIamPermissions. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.TestIamPermissionsImageRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.TestIamPermissionsImageRequest)
      com.google.cloud.compute.v1.TestIamPermissionsImageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TestIamPermissionsImageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TestIamPermissionsImageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.TestIamPermissionsImageRequest.class,
              com.google.cloud.compute.v1.TestIamPermissionsImageRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.TestIamPermissionsImageRequest.newBuilder()
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
      project_ = "";

      resource_ = "";

      if (testPermissionsRequestResourceBuilder_ == null) {
        testPermissionsRequestResource_ = null;
      } else {
        testPermissionsRequestResource_ = null;
        testPermissionsRequestResourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_TestIamPermissionsImageRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TestIamPermissionsImageRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.TestIamPermissionsImageRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TestIamPermissionsImageRequest build() {
      com.google.cloud.compute.v1.TestIamPermissionsImageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TestIamPermissionsImageRequest buildPartial() {
      com.google.cloud.compute.v1.TestIamPermissionsImageRequest result =
          new com.google.cloud.compute.v1.TestIamPermissionsImageRequest(this);
      result.project_ = project_;
      result.resource_ = resource_;
      if (testPermissionsRequestResourceBuilder_ == null) {
        result.testPermissionsRequestResource_ = testPermissionsRequestResource_;
      } else {
        result.testPermissionsRequestResource_ = testPermissionsRequestResourceBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.TestIamPermissionsImageRequest) {
        return mergeFrom((com.google.cloud.compute.v1.TestIamPermissionsImageRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.TestIamPermissionsImageRequest other) {
      if (other == com.google.cloud.compute.v1.TestIamPermissionsImageRequest.getDefaultInstance())
        return this;
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        onChanged();
      }
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        onChanged();
      }
      if (other.hasTestPermissionsRequestResource()) {
        mergeTestPermissionsRequestResource(other.getTestPermissionsRequestResource());
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
      com.google.cloud.compute.v1.TestIamPermissionsImageRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.TestIamPermissionsImageRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object project_ = "";
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      project_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProject() {

      project_ = getDefaultInstance().getProject();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      project_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resource_ = "";
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      resource_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResource() {

      resource_ = getDefaultInstance().getResource();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      resource_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.compute.v1.TestPermissionsRequest testPermissionsRequestResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.TestPermissionsRequest,
            com.google.cloud.compute.v1.TestPermissionsRequest.Builder,
            com.google.cloud.compute.v1.TestPermissionsRequestOrBuilder>
        testPermissionsRequestResourceBuilder_;
    /**
     * <code>
     * .google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758;
     * </code>
     *
     * @return Whether the testPermissionsRequestResource field is set.
     */
    public boolean hasTestPermissionsRequestResource() {
      return testPermissionsRequestResourceBuilder_ != null
          || testPermissionsRequestResource_ != null;
    }
    /**
     * <code>
     * .google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758;
     * </code>
     *
     * @return The testPermissionsRequestResource.
     */
    public com.google.cloud.compute.v1.TestPermissionsRequest getTestPermissionsRequestResource() {
      if (testPermissionsRequestResourceBuilder_ == null) {
        return testPermissionsRequestResource_ == null
            ? com.google.cloud.compute.v1.TestPermissionsRequest.getDefaultInstance()
            : testPermissionsRequestResource_;
      } else {
        return testPermissionsRequestResourceBuilder_.getMessage();
      }
    }
    /**
     * <code>
     * .google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758;
     * </code>
     */
    public Builder setTestPermissionsRequestResource(
        com.google.cloud.compute.v1.TestPermissionsRequest value) {
      if (testPermissionsRequestResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        testPermissionsRequestResource_ = value;
        onChanged();
      } else {
        testPermissionsRequestResourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>
     * .google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758;
     * </code>
     */
    public Builder setTestPermissionsRequestResource(
        com.google.cloud.compute.v1.TestPermissionsRequest.Builder builderForValue) {
      if (testPermissionsRequestResourceBuilder_ == null) {
        testPermissionsRequestResource_ = builderForValue.build();
        onChanged();
      } else {
        testPermissionsRequestResourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>
     * .google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758;
     * </code>
     */
    public Builder mergeTestPermissionsRequestResource(
        com.google.cloud.compute.v1.TestPermissionsRequest value) {
      if (testPermissionsRequestResourceBuilder_ == null) {
        if (testPermissionsRequestResource_ != null) {
          testPermissionsRequestResource_ =
              com.google.cloud.compute.v1.TestPermissionsRequest.newBuilder(
                      testPermissionsRequestResource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          testPermissionsRequestResource_ = value;
        }
        onChanged();
      } else {
        testPermissionsRequestResourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>
     * .google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758;
     * </code>
     */
    public Builder clearTestPermissionsRequestResource() {
      if (testPermissionsRequestResourceBuilder_ == null) {
        testPermissionsRequestResource_ = null;
        onChanged();
      } else {
        testPermissionsRequestResource_ = null;
        testPermissionsRequestResourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>
     * .google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758;
     * </code>
     */
    public com.google.cloud.compute.v1.TestPermissionsRequest.Builder
        getTestPermissionsRequestResourceBuilder() {

      onChanged();
      return getTestPermissionsRequestResourceFieldBuilder().getBuilder();
    }
    /**
     * <code>
     * .google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758;
     * </code>
     */
    public com.google.cloud.compute.v1.TestPermissionsRequestOrBuilder
        getTestPermissionsRequestResourceOrBuilder() {
      if (testPermissionsRequestResourceBuilder_ != null) {
        return testPermissionsRequestResourceBuilder_.getMessageOrBuilder();
      } else {
        return testPermissionsRequestResource_ == null
            ? com.google.cloud.compute.v1.TestPermissionsRequest.getDefaultInstance()
            : testPermissionsRequestResource_;
      }
    }
    /**
     * <code>
     * .google.cloud.compute.v1.TestPermissionsRequest test_permissions_request_resource = 439214758;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.TestPermissionsRequest,
            com.google.cloud.compute.v1.TestPermissionsRequest.Builder,
            com.google.cloud.compute.v1.TestPermissionsRequestOrBuilder>
        getTestPermissionsRequestResourceFieldBuilder() {
      if (testPermissionsRequestResourceBuilder_ == null) {
        testPermissionsRequestResourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.TestPermissionsRequest,
                com.google.cloud.compute.v1.TestPermissionsRequest.Builder,
                com.google.cloud.compute.v1.TestPermissionsRequestOrBuilder>(
                getTestPermissionsRequestResource(), getParentForChildren(), isClean());
        testPermissionsRequestResource_ = null;
      }
      return testPermissionsRequestResourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.TestIamPermissionsImageRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.TestIamPermissionsImageRequest)
  private static final com.google.cloud.compute.v1.TestIamPermissionsImageRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.TestIamPermissionsImageRequest();
  }

  public static com.google.cloud.compute.v1.TestIamPermissionsImageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestIamPermissionsImageRequest> PARSER =
      new com.google.protobuf.AbstractParser<TestIamPermissionsImageRequest>() {
        @java.lang.Override
        public TestIamPermissionsImageRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TestIamPermissionsImageRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TestIamPermissionsImageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestIamPermissionsImageRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.TestIamPermissionsImageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
