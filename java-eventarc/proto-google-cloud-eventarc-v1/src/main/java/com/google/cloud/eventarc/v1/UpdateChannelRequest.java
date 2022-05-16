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
// source: google/cloud/eventarc/v1/eventarc.proto

package com.google.cloud.eventarc.v1;

/**
 *
 *
 * <pre>
 * The request message for the UpdateChannel method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.eventarc.v1.UpdateChannelRequest}
 */
public final class UpdateChannelRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.eventarc.v1.UpdateChannelRequest)
    UpdateChannelRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateChannelRequest.newBuilder() to construct.
  private UpdateChannelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateChannelRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateChannelRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateChannelRequest(
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
              com.google.cloud.eventarc.v1.Channel.Builder subBuilder = null;
              if (channel_ != null) {
                subBuilder = channel_.toBuilder();
              }
              channel_ =
                  input.readMessage(
                      com.google.cloud.eventarc.v1.Channel.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(channel_);
                channel_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          case 24:
            {
              validateOnly_ = input.readBool();
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
    return com.google.cloud.eventarc.v1.EventarcProto
        .internal_static_google_cloud_eventarc_v1_UpdateChannelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.eventarc.v1.EventarcProto
        .internal_static_google_cloud_eventarc_v1_UpdateChannelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.eventarc.v1.UpdateChannelRequest.class,
            com.google.cloud.eventarc.v1.UpdateChannelRequest.Builder.class);
  }

  public static final int CHANNEL_FIELD_NUMBER = 1;
  private com.google.cloud.eventarc.v1.Channel channel_;
  /**
   *
   *
   * <pre>
   * The channel to be updated.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
   *
   * @return Whether the channel field is set.
   */
  @java.lang.Override
  public boolean hasChannel() {
    return channel_ != null;
  }
  /**
   *
   *
   * <pre>
   * The channel to be updated.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
   *
   * @return The channel.
   */
  @java.lang.Override
  public com.google.cloud.eventarc.v1.Channel getChannel() {
    return channel_ == null ? com.google.cloud.eventarc.v1.Channel.getDefaultInstance() : channel_;
  }
  /**
   *
   *
   * <pre>
   * The channel to be updated.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.eventarc.v1.ChannelOrBuilder getChannelOrBuilder() {
    return getChannel();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The fields to be updated; only fields explicitly provided are updated.
   * If no field mask is provided, all provided fields in the request are
   * updated. To update all fields, provide a field mask of "*".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The fields to be updated; only fields explicitly provided are updated.
   * If no field mask is provided, all provided fields in the request are
   * updated. To update all fields, provide a field mask of "*".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The fields to be updated; only fields explicitly provided are updated.
   * If no field mask is provided, all provided fields in the request are
   * updated. To update all fields, provide a field mask of "*".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_;
  /**
   *
   *
   * <pre>
   * Required. If set, validate the request and preview the review, but do not
   * post it.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (channel_ != null) {
      output.writeMessage(1, getChannel());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (channel_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getChannel());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.eventarc.v1.UpdateChannelRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.eventarc.v1.UpdateChannelRequest other =
        (com.google.cloud.eventarc.v1.UpdateChannelRequest) obj;

    if (hasChannel() != other.hasChannel()) return false;
    if (hasChannel()) {
      if (!getChannel().equals(other.getChannel())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    if (hasChannel()) {
      hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
      hash = (53 * hash) + getChannel().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.eventarc.v1.UpdateChannelRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.UpdateChannelRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.UpdateChannelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.UpdateChannelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.UpdateChannelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.UpdateChannelRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.UpdateChannelRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.UpdateChannelRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.UpdateChannelRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.UpdateChannelRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.UpdateChannelRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.UpdateChannelRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.eventarc.v1.UpdateChannelRequest prototype) {
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
   * The request message for the UpdateChannel method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.eventarc.v1.UpdateChannelRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.eventarc.v1.UpdateChannelRequest)
      com.google.cloud.eventarc.v1.UpdateChannelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.eventarc.v1.EventarcProto
          .internal_static_google_cloud_eventarc_v1_UpdateChannelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.eventarc.v1.EventarcProto
          .internal_static_google_cloud_eventarc_v1_UpdateChannelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.eventarc.v1.UpdateChannelRequest.class,
              com.google.cloud.eventarc.v1.UpdateChannelRequest.Builder.class);
    }

    // Construct using com.google.cloud.eventarc.v1.UpdateChannelRequest.newBuilder()
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
      if (channelBuilder_ == null) {
        channel_ = null;
      } else {
        channel_ = null;
        channelBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      validateOnly_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.eventarc.v1.EventarcProto
          .internal_static_google_cloud_eventarc_v1_UpdateChannelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.UpdateChannelRequest getDefaultInstanceForType() {
      return com.google.cloud.eventarc.v1.UpdateChannelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.UpdateChannelRequest build() {
      com.google.cloud.eventarc.v1.UpdateChannelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.UpdateChannelRequest buildPartial() {
      com.google.cloud.eventarc.v1.UpdateChannelRequest result =
          new com.google.cloud.eventarc.v1.UpdateChannelRequest(this);
      if (channelBuilder_ == null) {
        result.channel_ = channel_;
      } else {
        result.channel_ = channelBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.eventarc.v1.UpdateChannelRequest) {
        return mergeFrom((com.google.cloud.eventarc.v1.UpdateChannelRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.eventarc.v1.UpdateChannelRequest other) {
      if (other == com.google.cloud.eventarc.v1.UpdateChannelRequest.getDefaultInstance())
        return this;
      if (other.hasChannel()) {
        mergeChannel(other.getChannel());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
      com.google.cloud.eventarc.v1.UpdateChannelRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.eventarc.v1.UpdateChannelRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.eventarc.v1.Channel channel_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.eventarc.v1.Channel,
            com.google.cloud.eventarc.v1.Channel.Builder,
            com.google.cloud.eventarc.v1.ChannelOrBuilder>
        channelBuilder_;
    /**
     *
     *
     * <pre>
     * The channel to be updated.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
     *
     * @return Whether the channel field is set.
     */
    public boolean hasChannel() {
      return channelBuilder_ != null || channel_ != null;
    }
    /**
     *
     *
     * <pre>
     * The channel to be updated.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
     *
     * @return The channel.
     */
    public com.google.cloud.eventarc.v1.Channel getChannel() {
      if (channelBuilder_ == null) {
        return channel_ == null
            ? com.google.cloud.eventarc.v1.Channel.getDefaultInstance()
            : channel_;
      } else {
        return channelBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The channel to be updated.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
     */
    public Builder setChannel(com.google.cloud.eventarc.v1.Channel value) {
      if (channelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        channel_ = value;
        onChanged();
      } else {
        channelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The channel to be updated.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
     */
    public Builder setChannel(com.google.cloud.eventarc.v1.Channel.Builder builderForValue) {
      if (channelBuilder_ == null) {
        channel_ = builderForValue.build();
        onChanged();
      } else {
        channelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The channel to be updated.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
     */
    public Builder mergeChannel(com.google.cloud.eventarc.v1.Channel value) {
      if (channelBuilder_ == null) {
        if (channel_ != null) {
          channel_ =
              com.google.cloud.eventarc.v1.Channel.newBuilder(channel_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          channel_ = value;
        }
        onChanged();
      } else {
        channelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The channel to be updated.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
     */
    public Builder clearChannel() {
      if (channelBuilder_ == null) {
        channel_ = null;
        onChanged();
      } else {
        channel_ = null;
        channelBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The channel to be updated.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
     */
    public com.google.cloud.eventarc.v1.Channel.Builder getChannelBuilder() {

      onChanged();
      return getChannelFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The channel to be updated.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
     */
    public com.google.cloud.eventarc.v1.ChannelOrBuilder getChannelOrBuilder() {
      if (channelBuilder_ != null) {
        return channelBuilder_.getMessageOrBuilder();
      } else {
        return channel_ == null
            ? com.google.cloud.eventarc.v1.Channel.getDefaultInstance()
            : channel_;
      }
    }
    /**
     *
     *
     * <pre>
     * The channel to be updated.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Channel channel = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.eventarc.v1.Channel,
            com.google.cloud.eventarc.v1.Channel.Builder,
            com.google.cloud.eventarc.v1.ChannelOrBuilder>
        getChannelFieldBuilder() {
      if (channelBuilder_ == null) {
        channelBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.eventarc.v1.Channel,
                com.google.cloud.eventarc.v1.Channel.Builder,
                com.google.cloud.eventarc.v1.ChannelOrBuilder>(
                getChannel(), getParentForChildren(), isClean());
        channel_ = null;
      }
      return channelBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The fields to be updated; only fields explicitly provided are updated.
     * If no field mask is provided, all provided fields in the request are
     * updated. To update all fields, provide a field mask of "*".
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * Required. If set, validate the request and preview the review, but do not
     * post it.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     *
     *
     * <pre>
     * Required. If set, validate the request and preview the review, but do not
     * post it.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. If set, validate the request and preview the review, but do not
     * post it.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {

      validateOnly_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.eventarc.v1.UpdateChannelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.UpdateChannelRequest)
  private static final com.google.cloud.eventarc.v1.UpdateChannelRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.eventarc.v1.UpdateChannelRequest();
  }

  public static com.google.cloud.eventarc.v1.UpdateChannelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateChannelRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateChannelRequest>() {
        @java.lang.Override
        public UpdateChannelRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateChannelRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateChannelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateChannelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.eventarc.v1.UpdateChannelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
