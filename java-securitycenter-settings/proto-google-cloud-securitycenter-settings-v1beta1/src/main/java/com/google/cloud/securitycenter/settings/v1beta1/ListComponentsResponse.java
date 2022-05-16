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
// source: google/cloud/securitycenter/settings/v1beta1/securitycenter_settings_service.proto

package com.google.cloud.securitycenter.settings.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for ListComponents.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse}
 */
public final class ListComponentsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse)
    ListComponentsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListComponentsResponse.newBuilder() to construct.
  private ListComponentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListComponentsResponse() {
    components_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListComponentsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListComponentsResponse(
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
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                components_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              components_.add(s);
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
        components_ = components_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
        .internal_static_google_cloud_securitycenter_settings_v1beta1_ListComponentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
        .internal_static_google_cloud_securitycenter_settings_v1beta1_ListComponentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse.class,
            com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse.Builder.class);
  }

  public static final int COMPONENTS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList components_;
  /**
   *
   *
   * <pre>
   * The components from the specified organization.
   * </pre>
   *
   * <code>repeated string components = 1;</code>
   *
   * @return A list containing the components.
   */
  public com.google.protobuf.ProtocolStringList getComponentsList() {
    return components_;
  }
  /**
   *
   *
   * <pre>
   * The components from the specified organization.
   * </pre>
   *
   * <code>repeated string components = 1;</code>
   *
   * @return The count of components.
   */
  public int getComponentsCount() {
    return components_.size();
  }
  /**
   *
   *
   * <pre>
   * The components from the specified organization.
   * </pre>
   *
   * <code>repeated string components = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The components at the given index.
   */
  public java.lang.String getComponents(int index) {
    return components_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The components from the specified organization.
   * </pre>
   *
   * <code>repeated string components = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the components at the given index.
   */
  public com.google.protobuf.ByteString getComponentsBytes(int index) {
    return components_.getByteString(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < components_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, components_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < components_.size(); i++) {
        dataSize += computeStringSizeNoTag(components_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getComponentsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse other =
        (com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse) obj;

    if (!getComponentsList().equals(other.getComponentsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getComponentsCount() > 0) {
      hash = (37 * hash) + COMPONENTS_FIELD_NUMBER;
      hash = (53 * hash) + getComponentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse parseFrom(
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
      com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse prototype) {
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
   * Response message for ListComponents.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse)
      com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
          .internal_static_google_cloud_securitycenter_settings_v1beta1_ListComponentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
          .internal_static_google_cloud_securitycenter_settings_v1beta1_ListComponentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse.class,
              com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse.newBuilder()
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
      components_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
          .internal_static_google_cloud_securitycenter_settings_v1beta1_ListComponentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse build() {
      com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse buildPartial() {
      com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse result =
          new com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        components_ = components_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.components_ = components_;
      result.nextPageToken_ = nextPageToken_;
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
          instanceof com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse) {
        return mergeFrom(
            (com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse other) {
      if (other
          == com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse
              .getDefaultInstance()) return this;
      if (!other.components_.isEmpty()) {
        if (components_.isEmpty()) {
          components_ = other.components_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureComponentsIsMutable();
          components_.addAll(other.components_);
        }
        onChanged();
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse)
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

    private com.google.protobuf.LazyStringList components_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureComponentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        components_ = new com.google.protobuf.LazyStringArrayList(components_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * The components from the specified organization.
     * </pre>
     *
     * <code>repeated string components = 1;</code>
     *
     * @return A list containing the components.
     */
    public com.google.protobuf.ProtocolStringList getComponentsList() {
      return components_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * The components from the specified organization.
     * </pre>
     *
     * <code>repeated string components = 1;</code>
     *
     * @return The count of components.
     */
    public int getComponentsCount() {
      return components_.size();
    }
    /**
     *
     *
     * <pre>
     * The components from the specified organization.
     * </pre>
     *
     * <code>repeated string components = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The components at the given index.
     */
    public java.lang.String getComponents(int index) {
      return components_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The components from the specified organization.
     * </pre>
     *
     * <code>repeated string components = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the components at the given index.
     */
    public com.google.protobuf.ByteString getComponentsBytes(int index) {
      return components_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The components from the specified organization.
     * </pre>
     *
     * <code>repeated string components = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The components to set.
     * @return This builder for chaining.
     */
    public Builder setComponents(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureComponentsIsMutable();
      components_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The components from the specified organization.
     * </pre>
     *
     * <code>repeated string components = 1;</code>
     *
     * @param value The components to add.
     * @return This builder for chaining.
     */
    public Builder addComponents(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureComponentsIsMutable();
      components_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The components from the specified organization.
     * </pre>
     *
     * <code>repeated string components = 1;</code>
     *
     * @param values The components to add.
     * @return This builder for chaining.
     */
    public Builder addAllComponents(java.lang.Iterable<java.lang.String> values) {
      ensureComponentsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, components_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The components from the specified organization.
     * </pre>
     *
     * <code>repeated string components = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearComponents() {
      components_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The components from the specified organization.
     * </pre>
     *
     * <code>repeated string components = 1;</code>
     *
     * @param value The bytes of the components to add.
     * @return This builder for chaining.
     */
    public Builder addComponentsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureComponentsIsMutable();
      components_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse)
  private static final com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse();
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListComponentsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListComponentsResponse>() {
        @java.lang.Override
        public ListComponentsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListComponentsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListComponentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListComponentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.settings.v1beta1.ListComponentsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
