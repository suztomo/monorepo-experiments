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
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

/**
 *
 *
 * <pre>
 * Contains the current validation results.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1.ValidationResult}
 */
public final class ValidationResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1.ValidationResult)
    ValidationResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ValidationResult.newBuilder() to construct.
  private ValidationResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ValidationResult() {
    validations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ValidationResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ValidationResult(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                validations_ = new java.util.ArrayList<com.google.cloud.datastream.v1.Validation>();
                mutable_bitField0_ |= 0x00000001;
              }
              validations_.add(
                  input.readMessage(
                      com.google.cloud.datastream.v1.Validation.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        validations_ = java.util.Collections.unmodifiableList(validations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datastream.v1.DatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1_ValidationResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1.DatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1_ValidationResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1.ValidationResult.class,
            com.google.cloud.datastream.v1.ValidationResult.Builder.class);
  }

  public static final int VALIDATIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.datastream.v1.Validation> validations_;
  /**
   *
   *
   * <pre>
   * A list of validations (includes both executed as well as not executed
   * validations).
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datastream.v1.Validation> getValidationsList() {
    return validations_;
  }
  /**
   *
   *
   * <pre>
   * A list of validations (includes both executed as well as not executed
   * validations).
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datastream.v1.ValidationOrBuilder>
      getValidationsOrBuilderList() {
    return validations_;
  }
  /**
   *
   *
   * <pre>
   * A list of validations (includes both executed as well as not executed
   * validations).
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
   */
  @java.lang.Override
  public int getValidationsCount() {
    return validations_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of validations (includes both executed as well as not executed
   * validations).
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.Validation getValidations(int index) {
    return validations_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of validations (includes both executed as well as not executed
   * validations).
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1.ValidationOrBuilder getValidationsOrBuilder(int index) {
    return validations_.get(index);
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
    for (int i = 0; i < validations_.size(); i++) {
      output.writeMessage(1, validations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < validations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, validations_.get(i));
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
    if (!(obj instanceof com.google.cloud.datastream.v1.ValidationResult)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1.ValidationResult other =
        (com.google.cloud.datastream.v1.ValidationResult) obj;

    if (!getValidationsList().equals(other.getValidationsList())) return false;
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
    if (getValidationsCount() > 0) {
      hash = (37 * hash) + VALIDATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getValidationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1.ValidationResult parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1.ValidationResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.ValidationResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1.ValidationResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.ValidationResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1.ValidationResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.ValidationResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1.ValidationResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.ValidationResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1.ValidationResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1.ValidationResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1.ValidationResult parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datastream.v1.ValidationResult prototype) {
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
   * Contains the current validation results.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1.ValidationResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1.ValidationResult)
      com.google.cloud.datastream.v1.ValidationResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1_ValidationResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1_ValidationResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1.ValidationResult.class,
              com.google.cloud.datastream.v1.ValidationResult.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1.ValidationResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getValidationsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (validationsBuilder_ == null) {
        validations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        validationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datastream.v1.DatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1_ValidationResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.ValidationResult getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1.ValidationResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.ValidationResult build() {
      com.google.cloud.datastream.v1.ValidationResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1.ValidationResult buildPartial() {
      com.google.cloud.datastream.v1.ValidationResult result =
          new com.google.cloud.datastream.v1.ValidationResult(this);
      int from_bitField0_ = bitField0_;
      if (validationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          validations_ = java.util.Collections.unmodifiableList(validations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.validations_ = validations_;
      } else {
        result.validations_ = validationsBuilder_.build();
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
      if (other instanceof com.google.cloud.datastream.v1.ValidationResult) {
        return mergeFrom((com.google.cloud.datastream.v1.ValidationResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1.ValidationResult other) {
      if (other == com.google.cloud.datastream.v1.ValidationResult.getDefaultInstance())
        return this;
      if (validationsBuilder_ == null) {
        if (!other.validations_.isEmpty()) {
          if (validations_.isEmpty()) {
            validations_ = other.validations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValidationsIsMutable();
            validations_.addAll(other.validations_);
          }
          onChanged();
        }
      } else {
        if (!other.validations_.isEmpty()) {
          if (validationsBuilder_.isEmpty()) {
            validationsBuilder_.dispose();
            validationsBuilder_ = null;
            validations_ = other.validations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            validationsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getValidationsFieldBuilder()
                    : null;
          } else {
            validationsBuilder_.addAllMessages(other.validations_);
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
      com.google.cloud.datastream.v1.ValidationResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datastream.v1.ValidationResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.datastream.v1.Validation> validations_ =
        java.util.Collections.emptyList();

    private void ensureValidationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        validations_ =
            new java.util.ArrayList<com.google.cloud.datastream.v1.Validation>(validations_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datastream.v1.Validation,
            com.google.cloud.datastream.v1.Validation.Builder,
            com.google.cloud.datastream.v1.ValidationOrBuilder>
        validationsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1.Validation> getValidationsList() {
      if (validationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(validations_);
      } else {
        return validationsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public int getValidationsCount() {
      if (validationsBuilder_ == null) {
        return validations_.size();
      } else {
        return validationsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public com.google.cloud.datastream.v1.Validation getValidations(int index) {
      if (validationsBuilder_ == null) {
        return validations_.get(index);
      } else {
        return validationsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public Builder setValidations(int index, com.google.cloud.datastream.v1.Validation value) {
      if (validationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValidationsIsMutable();
        validations_.set(index, value);
        onChanged();
      } else {
        validationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public Builder setValidations(
        int index, com.google.cloud.datastream.v1.Validation.Builder builderForValue) {
      if (validationsBuilder_ == null) {
        ensureValidationsIsMutable();
        validations_.set(index, builderForValue.build());
        onChanged();
      } else {
        validationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public Builder addValidations(com.google.cloud.datastream.v1.Validation value) {
      if (validationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValidationsIsMutable();
        validations_.add(value);
        onChanged();
      } else {
        validationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public Builder addValidations(int index, com.google.cloud.datastream.v1.Validation value) {
      if (validationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValidationsIsMutable();
        validations_.add(index, value);
        onChanged();
      } else {
        validationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public Builder addValidations(
        com.google.cloud.datastream.v1.Validation.Builder builderForValue) {
      if (validationsBuilder_ == null) {
        ensureValidationsIsMutable();
        validations_.add(builderForValue.build());
        onChanged();
      } else {
        validationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public Builder addValidations(
        int index, com.google.cloud.datastream.v1.Validation.Builder builderForValue) {
      if (validationsBuilder_ == null) {
        ensureValidationsIsMutable();
        validations_.add(index, builderForValue.build());
        onChanged();
      } else {
        validationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public Builder addAllValidations(
        java.lang.Iterable<? extends com.google.cloud.datastream.v1.Validation> values) {
      if (validationsBuilder_ == null) {
        ensureValidationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, validations_);
        onChanged();
      } else {
        validationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public Builder clearValidations() {
      if (validationsBuilder_ == null) {
        validations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        validationsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public Builder removeValidations(int index) {
      if (validationsBuilder_ == null) {
        ensureValidationsIsMutable();
        validations_.remove(index);
        onChanged();
      } else {
        validationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public com.google.cloud.datastream.v1.Validation.Builder getValidationsBuilder(int index) {
      return getValidationsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public com.google.cloud.datastream.v1.ValidationOrBuilder getValidationsOrBuilder(int index) {
      if (validationsBuilder_ == null) {
        return validations_.get(index);
      } else {
        return validationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datastream.v1.ValidationOrBuilder>
        getValidationsOrBuilderList() {
      if (validationsBuilder_ != null) {
        return validationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(validations_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public com.google.cloud.datastream.v1.Validation.Builder addValidationsBuilder() {
      return getValidationsFieldBuilder()
          .addBuilder(com.google.cloud.datastream.v1.Validation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public com.google.cloud.datastream.v1.Validation.Builder addValidationsBuilder(int index) {
      return getValidationsFieldBuilder()
          .addBuilder(index, com.google.cloud.datastream.v1.Validation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of validations (includes both executed as well as not executed
     * validations).
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1.Validation validations = 1;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1.Validation.Builder>
        getValidationsBuilderList() {
      return getValidationsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datastream.v1.Validation,
            com.google.cloud.datastream.v1.Validation.Builder,
            com.google.cloud.datastream.v1.ValidationOrBuilder>
        getValidationsFieldBuilder() {
      if (validationsBuilder_ == null) {
        validationsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datastream.v1.Validation,
                com.google.cloud.datastream.v1.Validation.Builder,
                com.google.cloud.datastream.v1.ValidationOrBuilder>(
                validations_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        validations_ = null;
      }
      return validationsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1.ValidationResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1.ValidationResult)
  private static final com.google.cloud.datastream.v1.ValidationResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1.ValidationResult();
  }

  public static com.google.cloud.datastream.v1.ValidationResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidationResult> PARSER =
      new com.google.protobuf.AbstractParser<ValidationResult>() {
        @java.lang.Override
        public ValidationResult parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ValidationResult(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ValidationResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidationResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1.ValidationResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
