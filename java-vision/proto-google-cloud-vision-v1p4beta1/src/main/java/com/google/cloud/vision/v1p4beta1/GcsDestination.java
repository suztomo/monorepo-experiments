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
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

/**
 *
 *
 * <pre>
 * The Google Cloud Storage location where the output will be written to.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p4beta1.GcsDestination}
 */
public final class GcsDestination extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p4beta1.GcsDestination)
    GcsDestinationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GcsDestination.newBuilder() to construct.
  private GcsDestination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GcsDestination() {
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GcsDestination();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GcsDestination(
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

              uri_ = s;
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
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p4beta1_GcsDestination_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p4beta1_GcsDestination_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p4beta1.GcsDestination.class,
            com.google.cloud.vision.v1p4beta1.GcsDestination.Builder.class);
  }

  public static final int URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object uri_;
  /**
   *
   *
   * <pre>
   * Google Cloud Storage URI prefix where the results will be stored. Results
   * will be in JSON format and preceded by its corresponding input URI prefix.
   * This field can either represent a gcs file prefix or gcs directory. In
   * either case, the uri should be unique because in order to get all of the
   * output files, you will need to do a wildcard gcs search on the uri prefix
   * you provide.
   * Examples:
   * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
   * will be created in gs://bucket-name/here/ and the names of the
   * output files will begin with "filenameprefix".
   * *    Directory Prefix: gs://bucket-name/some/location/   The output files
   * will be created in gs://bucket-name/some/location/ and the names of the
   * output files could be anything because there was no filename prefix
   * specified.
   * If multiple outputs, each response is still AnnotateFileResponse, each of
   * which contains some subset of the full list of AnnotateImageResponse.
   * Multiple outputs can happen if, for example, the output JSON is too large
   * and overflows into multiple sharded files.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Google Cloud Storage URI prefix where the results will be stored. Results
   * will be in JSON format and preceded by its corresponding input URI prefix.
   * This field can either represent a gcs file prefix or gcs directory. In
   * either case, the uri should be unique because in order to get all of the
   * output files, you will need to do a wildcard gcs search on the uri prefix
   * you provide.
   * Examples:
   * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
   * will be created in gs://bucket-name/here/ and the names of the
   * output files will begin with "filenameprefix".
   * *    Directory Prefix: gs://bucket-name/some/location/   The output files
   * will be created in gs://bucket-name/some/location/ and the names of the
   * output files could be anything because there was no filename prefix
   * specified.
   * If multiple outputs, each response is still AnnotateFileResponse, each of
   * which contains some subset of the full list of AnnotateImageResponse.
   * Multiple outputs can happen if, for example, the output JSON is too large
   * and overflows into multiple sharded files.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uri_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uri_);
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
    if (!(obj instanceof com.google.cloud.vision.v1p4beta1.GcsDestination)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p4beta1.GcsDestination other =
        (com.google.cloud.vision.v1p4beta1.GcsDestination) obj;

    if (!getUri().equals(other.getUri())) return false;
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
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p4beta1.GcsDestination parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.GcsDestination parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.GcsDestination parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.GcsDestination parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.GcsDestination parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.GcsDestination parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.GcsDestination parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.GcsDestination parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.GcsDestination parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.GcsDestination parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.GcsDestination parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.GcsDestination parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vision.v1p4beta1.GcsDestination prototype) {
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
   * The Google Cloud Storage location where the output will be written to.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p4beta1.GcsDestination}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p4beta1.GcsDestination)
      com.google.cloud.vision.v1p4beta1.GcsDestinationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_GcsDestination_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_GcsDestination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p4beta1.GcsDestination.class,
              com.google.cloud.vision.v1p4beta1.GcsDestination.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p4beta1.GcsDestination.newBuilder()
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
      uri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_GcsDestination_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.GcsDestination getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p4beta1.GcsDestination.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.GcsDestination build() {
      com.google.cloud.vision.v1p4beta1.GcsDestination result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.GcsDestination buildPartial() {
      com.google.cloud.vision.v1p4beta1.GcsDestination result =
          new com.google.cloud.vision.v1p4beta1.GcsDestination(this);
      result.uri_ = uri_;
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
      if (other instanceof com.google.cloud.vision.v1p4beta1.GcsDestination) {
        return mergeFrom((com.google.cloud.vision.v1p4beta1.GcsDestination) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p4beta1.GcsDestination other) {
      if (other == com.google.cloud.vision.v1p4beta1.GcsDestination.getDefaultInstance())
        return this;
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
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
      com.google.cloud.vision.v1p4beta1.GcsDestination parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1p4beta1.GcsDestination) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     *
     *
     * <pre>
     * Google Cloud Storage URI prefix where the results will be stored. Results
     * will be in JSON format and preceded by its corresponding input URI prefix.
     * This field can either represent a gcs file prefix or gcs directory. In
     * either case, the uri should be unique because in order to get all of the
     * output files, you will need to do a wildcard gcs search on the uri prefix
     * you provide.
     * Examples:
     * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
     * will be created in gs://bucket-name/here/ and the names of the
     * output files will begin with "filenameprefix".
     * *    Directory Prefix: gs://bucket-name/some/location/   The output files
     * will be created in gs://bucket-name/some/location/ and the names of the
     * output files could be anything because there was no filename prefix
     * specified.
     * If multiple outputs, each response is still AnnotateFileResponse, each of
     * which contains some subset of the full list of AnnotateImageResponse.
     * Multiple outputs can happen if, for example, the output JSON is too large
     * and overflows into multiple sharded files.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage URI prefix where the results will be stored. Results
     * will be in JSON format and preceded by its corresponding input URI prefix.
     * This field can either represent a gcs file prefix or gcs directory. In
     * either case, the uri should be unique because in order to get all of the
     * output files, you will need to do a wildcard gcs search on the uri prefix
     * you provide.
     * Examples:
     * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
     * will be created in gs://bucket-name/here/ and the names of the
     * output files will begin with "filenameprefix".
     * *    Directory Prefix: gs://bucket-name/some/location/   The output files
     * will be created in gs://bucket-name/some/location/ and the names of the
     * output files could be anything because there was no filename prefix
     * specified.
     * If multiple outputs, each response is still AnnotateFileResponse, each of
     * which contains some subset of the full list of AnnotateImageResponse.
     * Multiple outputs can happen if, for example, the output JSON is too large
     * and overflows into multiple sharded files.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage URI prefix where the results will be stored. Results
     * will be in JSON format and preceded by its corresponding input URI prefix.
     * This field can either represent a gcs file prefix or gcs directory. In
     * either case, the uri should be unique because in order to get all of the
     * output files, you will need to do a wildcard gcs search on the uri prefix
     * you provide.
     * Examples:
     * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
     * will be created in gs://bucket-name/here/ and the names of the
     * output files will begin with "filenameprefix".
     * *    Directory Prefix: gs://bucket-name/some/location/   The output files
     * will be created in gs://bucket-name/some/location/ and the names of the
     * output files could be anything because there was no filename prefix
     * specified.
     * If multiple outputs, each response is still AnnotateFileResponse, each of
     * which contains some subset of the full list of AnnotateImageResponse.
     * Multiple outputs can happen if, for example, the output JSON is too large
     * and overflows into multiple sharded files.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      uri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage URI prefix where the results will be stored. Results
     * will be in JSON format and preceded by its corresponding input URI prefix.
     * This field can either represent a gcs file prefix or gcs directory. In
     * either case, the uri should be unique because in order to get all of the
     * output files, you will need to do a wildcard gcs search on the uri prefix
     * you provide.
     * Examples:
     * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
     * will be created in gs://bucket-name/here/ and the names of the
     * output files will begin with "filenameprefix".
     * *    Directory Prefix: gs://bucket-name/some/location/   The output files
     * will be created in gs://bucket-name/some/location/ and the names of the
     * output files could be anything because there was no filename prefix
     * specified.
     * If multiple outputs, each response is still AnnotateFileResponse, each of
     * which contains some subset of the full list of AnnotateImageResponse.
     * Multiple outputs can happen if, for example, the output JSON is too large
     * and overflows into multiple sharded files.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUri() {

      uri_ = getDefaultInstance().getUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage URI prefix where the results will be stored. Results
     * will be in JSON format and preceded by its corresponding input URI prefix.
     * This field can either represent a gcs file prefix or gcs directory. In
     * either case, the uri should be unique because in order to get all of the
     * output files, you will need to do a wildcard gcs search on the uri prefix
     * you provide.
     * Examples:
     * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
     * will be created in gs://bucket-name/here/ and the names of the
     * output files will begin with "filenameprefix".
     * *    Directory Prefix: gs://bucket-name/some/location/   The output files
     * will be created in gs://bucket-name/some/location/ and the names of the
     * output files could be anything because there was no filename prefix
     * specified.
     * If multiple outputs, each response is still AnnotateFileResponse, each of
     * which contains some subset of the full list of AnnotateImageResponse.
     * Multiple outputs can happen if, for example, the output JSON is too large
     * and overflows into multiple sharded files.
     * </pre>
     *
     * <code>string uri = 1;</code>
     *
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      uri_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p4beta1.GcsDestination)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.GcsDestination)
  private static final com.google.cloud.vision.v1p4beta1.GcsDestination DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p4beta1.GcsDestination();
  }

  public static com.google.cloud.vision.v1p4beta1.GcsDestination getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsDestination> PARSER =
      new com.google.protobuf.AbstractParser<GcsDestination>() {
        @java.lang.Override
        public GcsDestination parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GcsDestination(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GcsDestination> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsDestination> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.GcsDestination getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
