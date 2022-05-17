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
// source: google/appengine/v1/deploy.proto

package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * The zip file information for a zip deployment.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.ZipInfo}
 */
public final class ZipInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.ZipInfo)
    ZipInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ZipInfo.newBuilder() to construct.
  private ZipInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ZipInfo() {
    sourceUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ZipInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ZipInfo(
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
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              sourceUrl_ = s;
              break;
            }
          case 32:
            {
              filesCount_ = input.readInt32();
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
    return com.google.appengine.v1.DeployProto
        .internal_static_google_appengine_v1_ZipInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.DeployProto
        .internal_static_google_appengine_v1_ZipInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.ZipInfo.class, com.google.appengine.v1.ZipInfo.Builder.class);
  }

  public static final int SOURCE_URL_FIELD_NUMBER = 3;
  private volatile java.lang.Object sourceUrl_;
  /**
   *
   *
   * <pre>
   * URL of the zip file to deploy from. Must be a URL to a resource in
   * Google Cloud Storage in the form
   * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
   * </pre>
   *
   * <code>string source_url = 3;</code>
   *
   * @return The sourceUrl.
   */
  @java.lang.Override
  public java.lang.String getSourceUrl() {
    java.lang.Object ref = sourceUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceUrl_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URL of the zip file to deploy from. Must be a URL to a resource in
   * Google Cloud Storage in the form
   * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
   * </pre>
   *
   * <code>string source_url = 3;</code>
   *
   * @return The bytes for sourceUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSourceUrlBytes() {
    java.lang.Object ref = sourceUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sourceUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILES_COUNT_FIELD_NUMBER = 4;
  private int filesCount_;
  /**
   *
   *
   * <pre>
   * An estimate of the number of files in a zip for a zip deployment.
   * If set, must be greater than or equal to the actual number of files.
   * Used for optimizing performance; if not provided, deployment may be slow.
   * </pre>
   *
   * <code>int32 files_count = 4;</code>
   *
   * @return The filesCount.
   */
  @java.lang.Override
  public int getFilesCount() {
    return filesCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sourceUrl_);
    }
    if (filesCount_ != 0) {
      output.writeInt32(4, filesCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sourceUrl_);
    }
    if (filesCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, filesCount_);
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
    if (!(obj instanceof com.google.appengine.v1.ZipInfo)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.ZipInfo other = (com.google.appengine.v1.ZipInfo) obj;

    if (!getSourceUrl().equals(other.getSourceUrl())) return false;
    if (getFilesCount() != other.getFilesCount()) return false;
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
    hash = (37 * hash) + SOURCE_URL_FIELD_NUMBER;
    hash = (53 * hash) + getSourceUrl().hashCode();
    hash = (37 * hash) + FILES_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getFilesCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.ZipInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ZipInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ZipInfo parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ZipInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ZipInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ZipInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ZipInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ZipInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.ZipInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ZipInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.ZipInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ZipInfo parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.ZipInfo prototype) {
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
   * The zip file information for a zip deployment.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.ZipInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.ZipInfo)
      com.google.appengine.v1.ZipInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.DeployProto
          .internal_static_google_appengine_v1_ZipInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.DeployProto
          .internal_static_google_appengine_v1_ZipInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.ZipInfo.class, com.google.appengine.v1.ZipInfo.Builder.class);
    }

    // Construct using com.google.appengine.v1.ZipInfo.newBuilder()
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
      sourceUrl_ = "";

      filesCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.DeployProto
          .internal_static_google_appengine_v1_ZipInfo_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.ZipInfo getDefaultInstanceForType() {
      return com.google.appengine.v1.ZipInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.ZipInfo build() {
      com.google.appengine.v1.ZipInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.ZipInfo buildPartial() {
      com.google.appengine.v1.ZipInfo result = new com.google.appengine.v1.ZipInfo(this);
      result.sourceUrl_ = sourceUrl_;
      result.filesCount_ = filesCount_;
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
      if (other instanceof com.google.appengine.v1.ZipInfo) {
        return mergeFrom((com.google.appengine.v1.ZipInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.ZipInfo other) {
      if (other == com.google.appengine.v1.ZipInfo.getDefaultInstance()) return this;
      if (!other.getSourceUrl().isEmpty()) {
        sourceUrl_ = other.sourceUrl_;
        onChanged();
      }
      if (other.getFilesCount() != 0) {
        setFilesCount(other.getFilesCount());
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
      com.google.appengine.v1.ZipInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.ZipInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sourceUrl_ = "";
    /**
     *
     *
     * <pre>
     * URL of the zip file to deploy from. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 3;</code>
     *
     * @return The sourceUrl.
     */
    public java.lang.String getSourceUrl() {
      java.lang.Object ref = sourceUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL of the zip file to deploy from. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 3;</code>
     *
     * @return The bytes for sourceUrl.
     */
    public com.google.protobuf.ByteString getSourceUrlBytes() {
      java.lang.Object ref = sourceUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sourceUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL of the zip file to deploy from. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 3;</code>
     *
     * @param value The sourceUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSourceUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      sourceUrl_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL of the zip file to deploy from. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceUrl() {

      sourceUrl_ = getDefaultInstance().getSourceUrl();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL of the zip file to deploy from. Must be a URL to a resource in
     * Google Cloud Storage in the form
     * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
     * </pre>
     *
     * <code>string source_url = 3;</code>
     *
     * @param value The bytes for sourceUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSourceUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      sourceUrl_ = value;
      onChanged();
      return this;
    }

    private int filesCount_;
    /**
     *
     *
     * <pre>
     * An estimate of the number of files in a zip for a zip deployment.
     * If set, must be greater than or equal to the actual number of files.
     * Used for optimizing performance; if not provided, deployment may be slow.
     * </pre>
     *
     * <code>int32 files_count = 4;</code>
     *
     * @return The filesCount.
     */
    @java.lang.Override
    public int getFilesCount() {
      return filesCount_;
    }
    /**
     *
     *
     * <pre>
     * An estimate of the number of files in a zip for a zip deployment.
     * If set, must be greater than or equal to the actual number of files.
     * Used for optimizing performance; if not provided, deployment may be slow.
     * </pre>
     *
     * <code>int32 files_count = 4;</code>
     *
     * @param value The filesCount to set.
     * @return This builder for chaining.
     */
    public Builder setFilesCount(int value) {

      filesCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An estimate of the number of files in a zip for a zip deployment.
     * If set, must be greater than or equal to the actual number of files.
     * Used for optimizing performance; if not provided, deployment may be slow.
     * </pre>
     *
     * <code>int32 files_count = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilesCount() {

      filesCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.ZipInfo)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.ZipInfo)
  private static final com.google.appengine.v1.ZipInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.ZipInfo();
  }

  public static com.google.appengine.v1.ZipInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ZipInfo> PARSER =
      new com.google.protobuf.AbstractParser<ZipInfo>() {
        @java.lang.Override
        public ZipInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ZipInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ZipInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ZipInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.ZipInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
