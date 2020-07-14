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
// source: google/cloud/functions/v1/functions.proto

package com.google.cloud.functions.v1;

/**
 *
 *
 * <pre>
 * Response of `CallFunction` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.functions.v1.CallFunctionResponse}
 */
public final class CallFunctionResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.functions.v1.CallFunctionResponse)
    CallFunctionResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CallFunctionResponse.newBuilder() to construct.
  private CallFunctionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CallFunctionResponse() {
    executionId_ = "";
    result_ = "";
    error_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CallFunctionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CallFunctionResponse(
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

              executionId_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              result_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              error_ = s;
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
    return com.google.cloud.functions.v1.FunctionsProto
        .internal_static_google_cloud_functions_v1_CallFunctionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.functions.v1.FunctionsProto
        .internal_static_google_cloud_functions_v1_CallFunctionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.functions.v1.CallFunctionResponse.class,
            com.google.cloud.functions.v1.CallFunctionResponse.Builder.class);
  }

  public static final int EXECUTION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object executionId_;
  /**
   *
   *
   * <pre>
   * Execution id of function invocation.
   * </pre>
   *
   * <code>string execution_id = 1;</code>
   *
   * @return The executionId.
   */
  @java.lang.Override
  public java.lang.String getExecutionId() {
    java.lang.Object ref = executionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      executionId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Execution id of function invocation.
   * </pre>
   *
   * <code>string execution_id = 1;</code>
   *
   * @return The bytes for executionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExecutionIdBytes() {
    java.lang.Object ref = executionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      executionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private volatile java.lang.Object result_;
  /**
   *
   *
   * <pre>
   * Result populated for successful execution of synchronous function. Will
   * not be populated if function does not return a result through context.
   * </pre>
   *
   * <code>string result = 2;</code>
   *
   * @return The result.
   */
  @java.lang.Override
  public java.lang.String getResult() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      result_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Result populated for successful execution of synchronous function. Will
   * not be populated if function does not return a result through context.
   * </pre>
   *
   * <code>string result = 2;</code>
   *
   * @return The bytes for result.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResultBytes() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      result_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_FIELD_NUMBER = 3;
  private volatile java.lang.Object error_;
  /**
   *
   *
   * <pre>
   * Either system or user-function generated error. Set if execution
   * was not successful.
   * </pre>
   *
   * <code>string error = 3;</code>
   *
   * @return The error.
   */
  @java.lang.Override
  public java.lang.String getError() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      error_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Either system or user-function generated error. Set if execution
   * was not successful.
   * </pre>
   *
   * <code>string error = 3;</code>
   *
   * @return The bytes for error.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getErrorBytes() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      error_ = b;
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
    if (!getExecutionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, executionId_);
    }
    if (!getResultBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, result_);
    }
    if (!getErrorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, error_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getExecutionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, executionId_);
    }
    if (!getResultBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, result_);
    }
    if (!getErrorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, error_);
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
    if (!(obj instanceof com.google.cloud.functions.v1.CallFunctionResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.functions.v1.CallFunctionResponse other =
        (com.google.cloud.functions.v1.CallFunctionResponse) obj;

    if (!getExecutionId().equals(other.getExecutionId())) return false;
    if (!getResult().equals(other.getResult())) return false;
    if (!getError().equals(other.getError())) return false;
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
    hash = (37 * hash) + EXECUTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getExecutionId().hashCode();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult().hashCode();
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.functions.v1.CallFunctionResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v1.CallFunctionResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.CallFunctionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v1.CallFunctionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.CallFunctionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v1.CallFunctionResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.CallFunctionResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v1.CallFunctionResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.CallFunctionResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v1.CallFunctionResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v1.CallFunctionResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v1.CallFunctionResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.functions.v1.CallFunctionResponse prototype) {
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
   * Response of `CallFunction` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.functions.v1.CallFunctionResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.functions.v1.CallFunctionResponse)
      com.google.cloud.functions.v1.CallFunctionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.functions.v1.FunctionsProto
          .internal_static_google_cloud_functions_v1_CallFunctionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.functions.v1.FunctionsProto
          .internal_static_google_cloud_functions_v1_CallFunctionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.functions.v1.CallFunctionResponse.class,
              com.google.cloud.functions.v1.CallFunctionResponse.Builder.class);
    }

    // Construct using com.google.cloud.functions.v1.CallFunctionResponse.newBuilder()
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
      executionId_ = "";

      result_ = "";

      error_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.functions.v1.FunctionsProto
          .internal_static_google_cloud_functions_v1_CallFunctionResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.CallFunctionResponse getDefaultInstanceForType() {
      return com.google.cloud.functions.v1.CallFunctionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.CallFunctionResponse build() {
      com.google.cloud.functions.v1.CallFunctionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.functions.v1.CallFunctionResponse buildPartial() {
      com.google.cloud.functions.v1.CallFunctionResponse result =
          new com.google.cloud.functions.v1.CallFunctionResponse(this);
      result.executionId_ = executionId_;
      result.result_ = result_;
      result.error_ = error_;
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
      if (other instanceof com.google.cloud.functions.v1.CallFunctionResponse) {
        return mergeFrom((com.google.cloud.functions.v1.CallFunctionResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.functions.v1.CallFunctionResponse other) {
      if (other == com.google.cloud.functions.v1.CallFunctionResponse.getDefaultInstance())
        return this;
      if (!other.getExecutionId().isEmpty()) {
        executionId_ = other.executionId_;
        onChanged();
      }
      if (!other.getResult().isEmpty()) {
        result_ = other.result_;
        onChanged();
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
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
      com.google.cloud.functions.v1.CallFunctionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.functions.v1.CallFunctionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object executionId_ = "";
    /**
     *
     *
     * <pre>
     * Execution id of function invocation.
     * </pre>
     *
     * <code>string execution_id = 1;</code>
     *
     * @return The executionId.
     */
    public java.lang.String getExecutionId() {
      java.lang.Object ref = executionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        executionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Execution id of function invocation.
     * </pre>
     *
     * <code>string execution_id = 1;</code>
     *
     * @return The bytes for executionId.
     */
    public com.google.protobuf.ByteString getExecutionIdBytes() {
      java.lang.Object ref = executionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        executionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Execution id of function invocation.
     * </pre>
     *
     * <code>string execution_id = 1;</code>
     *
     * @param value The executionId to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      executionId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Execution id of function invocation.
     * </pre>
     *
     * <code>string execution_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExecutionId() {

      executionId_ = getDefaultInstance().getExecutionId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Execution id of function invocation.
     * </pre>
     *
     * <code>string execution_id = 1;</code>
     *
     * @param value The bytes for executionId to set.
     * @return This builder for chaining.
     */
    public Builder setExecutionIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      executionId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object result_ = "";
    /**
     *
     *
     * <pre>
     * Result populated for successful execution of synchronous function. Will
     * not be populated if function does not return a result through context.
     * </pre>
     *
     * <code>string result = 2;</code>
     *
     * @return The result.
     */
    public java.lang.String getResult() {
      java.lang.Object ref = result_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        result_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Result populated for successful execution of synchronous function. Will
     * not be populated if function does not return a result through context.
     * </pre>
     *
     * <code>string result = 2;</code>
     *
     * @return The bytes for result.
     */
    public com.google.protobuf.ByteString getResultBytes() {
      java.lang.Object ref = result_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Result populated for successful execution of synchronous function. Will
     * not be populated if function does not return a result through context.
     * </pre>
     *
     * <code>string result = 2;</code>
     *
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      result_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Result populated for successful execution of synchronous function. Will
     * not be populated if function does not return a result through context.
     * </pre>
     *
     * <code>string result = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResult() {

      result_ = getDefaultInstance().getResult();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Result populated for successful execution of synchronous function. Will
     * not be populated if function does not return a result through context.
     * </pre>
     *
     * <code>string result = 2;</code>
     *
     * @param value The bytes for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      result_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object error_ = "";
    /**
     *
     *
     * <pre>
     * Either system or user-function generated error. Set if execution
     * was not successful.
     * </pre>
     *
     * <code>string error = 3;</code>
     *
     * @return The error.
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Either system or user-function generated error. Set if execution
     * was not successful.
     * </pre>
     *
     * <code>string error = 3;</code>
     *
     * @return The bytes for error.
     */
    public com.google.protobuf.ByteString getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Either system or user-function generated error. Set if execution
     * was not successful.
     * </pre>
     *
     * <code>string error = 3;</code>
     *
     * @param value The error to set.
     * @return This builder for chaining.
     */
    public Builder setError(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      error_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Either system or user-function generated error. Set if execution
     * was not successful.
     * </pre>
     *
     * <code>string error = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearError() {

      error_ = getDefaultInstance().getError();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Either system or user-function generated error. Set if execution
     * was not successful.
     * </pre>
     *
     * <code>string error = 3;</code>
     *
     * @param value The bytes for error to set.
     * @return This builder for chaining.
     */
    public Builder setErrorBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      error_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.functions.v1.CallFunctionResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.functions.v1.CallFunctionResponse)
  private static final com.google.cloud.functions.v1.CallFunctionResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.functions.v1.CallFunctionResponse();
  }

  public static com.google.cloud.functions.v1.CallFunctionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CallFunctionResponse> PARSER =
      new com.google.protobuf.AbstractParser<CallFunctionResponse>() {
        @java.lang.Override
        public CallFunctionResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CallFunctionResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CallFunctionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CallFunctionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.functions.v1.CallFunctionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
