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
 * UrlMaps A host-matching rule for a URL. If matched, will use the named PathMatcher to select the BackendService.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.HostRule}
 */
public final class HostRule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.HostRule)
    HostRuleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HostRule.newBuilder() to construct.
  private HostRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HostRule() {
    description_ = "";
    hosts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    pathMatcher_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HostRule();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private HostRule(
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
          case 795737690:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                hosts_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              hosts_.add(s);
              break;
            }
          case -1592461118:
            {
              java.lang.String s = input.readStringRequireUtf8();

              pathMatcher_ = s;
              break;
            }
          case -911466526:
            {
              java.lang.String s = input.readStringRequireUtf8();

              description_ = s;
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
        hosts_ = hosts_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_HostRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_HostRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.HostRule.class,
            com.google.cloud.compute.v1.HostRule.Builder.class);
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 422937596;
  private volatile java.lang.Object description_;
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOSTS_FIELD_NUMBER = 99467211;
  private com.google.protobuf.LazyStringList hosts_;
  /**
   *
   *
   * <pre>
   * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or ..
   * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated string hosts = 99467211;</code>
   *
   * @return A list containing the hosts.
   */
  public com.google.protobuf.ProtocolStringList getHostsList() {
    return hosts_;
  }
  /**
   *
   *
   * <pre>
   * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or ..
   * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated string hosts = 99467211;</code>
   *
   * @return The count of hosts.
   */
  public int getHostsCount() {
    return hosts_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or ..
   * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated string hosts = 99467211;</code>
   *
   * @param index The index of the element to return.
   * @return The hosts at the given index.
   */
  public java.lang.String getHosts(int index) {
    return hosts_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or ..
   * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated string hosts = 99467211;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the hosts at the given index.
   */
  public com.google.protobuf.ByteString getHostsBytes(int index) {
    return hosts_.getByteString(index);
  }

  public static final int PATH_MATCHER_FIELD_NUMBER = 337813272;
  private volatile java.lang.Object pathMatcher_;
  /**
   *
   *
   * <pre>
   * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
   * </pre>
   *
   * <code>string path_matcher = 337813272;</code>
   *
   * @return The pathMatcher.
   */
  @java.lang.Override
  public java.lang.String getPathMatcher() {
    java.lang.Object ref = pathMatcher_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pathMatcher_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
   * </pre>
   *
   * <code>string path_matcher = 337813272;</code>
   *
   * @return The bytes for pathMatcher.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPathMatcherBytes() {
    java.lang.Object ref = pathMatcher_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pathMatcher_ = b;
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
    for (int i = 0; i < hosts_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 99467211, hosts_.getRaw(i));
    }
    if (!getPathMatcherBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 337813272, pathMatcher_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 422937596, description_);
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
      for (int i = 0; i < hosts_.size(); i++) {
        dataSize += computeStringSizeNoTag(hosts_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getHostsList().size();
    }
    if (!getPathMatcherBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(337813272, pathMatcher_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(422937596, description_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.HostRule)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.HostRule other = (com.google.cloud.compute.v1.HostRule) obj;

    if (!getDescription().equals(other.getDescription())) return false;
    if (!getHostsList().equals(other.getHostsList())) return false;
    if (!getPathMatcher().equals(other.getPathMatcher())) return false;
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
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (getHostsCount() > 0) {
      hash = (37 * hash) + HOSTS_FIELD_NUMBER;
      hash = (53 * hash) + getHostsList().hashCode();
    }
    hash = (37 * hash) + PATH_MATCHER_FIELD_NUMBER;
    hash = (53 * hash) + getPathMatcher().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.HostRule parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.HostRule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HostRule parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.HostRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HostRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.HostRule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HostRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HostRule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HostRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HostRule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HostRule parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HostRule parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.HostRule prototype) {
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
   * UrlMaps A host-matching rule for a URL. If matched, will use the named PathMatcher to select the BackendService.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.HostRule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.HostRule)
      com.google.cloud.compute.v1.HostRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_HostRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_HostRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.HostRule.class,
              com.google.cloud.compute.v1.HostRule.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.HostRule.newBuilder()
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
      description_ = "";

      hosts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      pathMatcher_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_HostRule_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HostRule getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.HostRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HostRule build() {
      com.google.cloud.compute.v1.HostRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HostRule buildPartial() {
      com.google.cloud.compute.v1.HostRule result = new com.google.cloud.compute.v1.HostRule(this);
      int from_bitField0_ = bitField0_;
      result.description_ = description_;
      if (((bitField0_ & 0x00000001) != 0)) {
        hosts_ = hosts_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.hosts_ = hosts_;
      result.pathMatcher_ = pathMatcher_;
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
      if (other instanceof com.google.cloud.compute.v1.HostRule) {
        return mergeFrom((com.google.cloud.compute.v1.HostRule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.HostRule other) {
      if (other == com.google.cloud.compute.v1.HostRule.getDefaultInstance()) return this;
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.hosts_.isEmpty()) {
        if (hosts_.isEmpty()) {
          hosts_ = other.hosts_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureHostsIsMutable();
          hosts_.addAll(other.hosts_);
        }
        onChanged();
      }
      if (!other.getPathMatcher().isEmpty()) {
        pathMatcher_ = other.pathMatcher_;
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
      com.google.cloud.compute.v1.HostRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.HostRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object description_ = "";
    /**
     *
     *
     * <pre>
     * An optional description of this resource. Provide this property when you create the resource.
     * </pre>
     *
     * <code>string description = 422937596;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An optional description of this resource. Provide this property when you create the resource.
     * </pre>
     *
     * <code>string description = 422937596;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An optional description of this resource. Provide this property when you create the resource.
     * </pre>
     *
     * <code>string description = 422937596;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      description_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An optional description of this resource. Provide this property when you create the resource.
     * </pre>
     *
     * <code>string description = 422937596;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {

      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An optional description of this resource. Provide this property when you create the resource.
     * </pre>
     *
     * <code>string description = 422937596;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      description_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList hosts_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureHostsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hosts_ = new com.google.protobuf.LazyStringArrayList(hosts_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or ..
     * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
     * </pre>
     *
     * <code>repeated string hosts = 99467211;</code>
     *
     * @return A list containing the hosts.
     */
    public com.google.protobuf.ProtocolStringList getHostsList() {
      return hosts_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or ..
     * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
     * </pre>
     *
     * <code>repeated string hosts = 99467211;</code>
     *
     * @return The count of hosts.
     */
    public int getHostsCount() {
      return hosts_.size();
    }
    /**
     *
     *
     * <pre>
     * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or ..
     * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
     * </pre>
     *
     * <code>repeated string hosts = 99467211;</code>
     *
     * @param index The index of the element to return.
     * @return The hosts at the given index.
     */
    public java.lang.String getHosts(int index) {
      return hosts_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or ..
     * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
     * </pre>
     *
     * <code>repeated string hosts = 99467211;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the hosts at the given index.
     */
    public com.google.protobuf.ByteString getHostsBytes(int index) {
      return hosts_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or ..
     * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
     * </pre>
     *
     * <code>repeated string hosts = 99467211;</code>
     *
     * @param index The index to set the value at.
     * @param value The hosts to set.
     * @return This builder for chaining.
     */
    public Builder setHosts(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureHostsIsMutable();
      hosts_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or ..
     * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
     * </pre>
     *
     * <code>repeated string hosts = 99467211;</code>
     *
     * @param value The hosts to add.
     * @return This builder for chaining.
     */
    public Builder addHosts(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureHostsIsMutable();
      hosts_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or ..
     * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
     * </pre>
     *
     * <code>repeated string hosts = 99467211;</code>
     *
     * @param values The hosts to add.
     * @return This builder for chaining.
     */
    public Builder addAllHosts(java.lang.Iterable<java.lang.String> values) {
      ensureHostsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, hosts_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or ..
     * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
     * </pre>
     *
     * <code>repeated string hosts = 99467211;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHosts() {
      hosts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or ..
     * * based matching is not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
     * </pre>
     *
     * <code>repeated string hosts = 99467211;</code>
     *
     * @param value The bytes of the hosts to add.
     * @return This builder for chaining.
     */
    public Builder addHostsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureHostsIsMutable();
      hosts_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object pathMatcher_ = "";
    /**
     *
     *
     * <pre>
     * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
     * </pre>
     *
     * <code>string path_matcher = 337813272;</code>
     *
     * @return The pathMatcher.
     */
    public java.lang.String getPathMatcher() {
      java.lang.Object ref = pathMatcher_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pathMatcher_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
     * </pre>
     *
     * <code>string path_matcher = 337813272;</code>
     *
     * @return The bytes for pathMatcher.
     */
    public com.google.protobuf.ByteString getPathMatcherBytes() {
      java.lang.Object ref = pathMatcher_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pathMatcher_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
     * </pre>
     *
     * <code>string path_matcher = 337813272;</code>
     *
     * @param value The pathMatcher to set.
     * @return This builder for chaining.
     */
    public Builder setPathMatcher(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      pathMatcher_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
     * </pre>
     *
     * <code>string path_matcher = 337813272;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPathMatcher() {

      pathMatcher_ = getDefaultInstance().getPathMatcher();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
     * </pre>
     *
     * <code>string path_matcher = 337813272;</code>
     *
     * @param value The bytes for pathMatcher to set.
     * @return This builder for chaining.
     */
    public Builder setPathMatcherBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      pathMatcher_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.HostRule)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.HostRule)
  private static final com.google.cloud.compute.v1.HostRule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.HostRule();
  }

  public static com.google.cloud.compute.v1.HostRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HostRule> PARSER =
      new com.google.protobuf.AbstractParser<HostRule>() {
        @java.lang.Override
        public HostRule parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new HostRule(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<HostRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HostRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.HostRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
