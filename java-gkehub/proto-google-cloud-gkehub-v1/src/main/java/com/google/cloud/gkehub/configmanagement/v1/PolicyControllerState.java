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
// source: google/cloud/gkehub/v1/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1;

/**
 *
 *
 * <pre>
 * State for PolicyControllerState.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1.PolicyControllerState}
 */
public final class PolicyControllerState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1.PolicyControllerState)
    PolicyControllerStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PolicyControllerState.newBuilder() to construct.
  private PolicyControllerState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PolicyControllerState() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PolicyControllerState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PolicyControllerState(
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
              com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion.Builder
                  subBuilder = null;
              if (version_ != null) {
                subBuilder = version_.toBuilder();
              }
              version_ =
                  input.readMessage(
                      com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(version_);
                version_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState.Builder
                  subBuilder = null;
              if (deploymentState_ != null) {
                subBuilder = deploymentState_.toBuilder();
              }
              deploymentState_ =
                  input.readMessage(
                      com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState
                          .parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(deploymentState_);
                deploymentState_ = subBuilder.buildPartial();
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
    return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1_PolicyControllerState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1_PolicyControllerState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState.class,
            com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version_;
  /**
   *
   *
   * <pre>
   * The version of Gatekeeper Policy Controller deployed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version = 1;</code>
   *
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return version_ != null;
  }
  /**
   *
   *
   * <pre>
   * The version of Gatekeeper Policy Controller deployed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version = 1;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion getVersion() {
    return version_ == null
        ? com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion.getDefaultInstance()
        : version_;
  }
  /**
   *
   *
   * <pre>
   * The version of Gatekeeper Policy Controller deployed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersionOrBuilder
      getVersionOrBuilder() {
    return getVersion();
  }

  public static final int DEPLOYMENT_STATE_FIELD_NUMBER = 2;
  private com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deploymentState_;
  /**
   *
   *
   * <pre>
   * The state about the policy controller installation.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deployment_state = 2;
   * </code>
   *
   * @return Whether the deploymentState field is set.
   */
  @java.lang.Override
  public boolean hasDeploymentState() {
    return deploymentState_ != null;
  }
  /**
   *
   *
   * <pre>
   * The state about the policy controller installation.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deployment_state = 2;
   * </code>
   *
   * @return The deploymentState.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState
      getDeploymentState() {
    return deploymentState_ == null
        ? com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState.getDefaultInstance()
        : deploymentState_;
  }
  /**
   *
   *
   * <pre>
   * The state about the policy controller installation.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deployment_state = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentStateOrBuilder
      getDeploymentStateOrBuilder() {
    return getDeploymentState();
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
    if (version_ != null) {
      output.writeMessage(1, getVersion());
    }
    if (deploymentState_ != null) {
      output.writeMessage(2, getDeploymentState());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getVersion());
    }
    if (deploymentState_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDeploymentState());
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
    if (!(obj instanceof com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState other =
        (com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState) obj;

    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion().equals(other.getVersion())) return false;
    }
    if (hasDeploymentState() != other.hasDeploymentState()) return false;
    if (hasDeploymentState()) {
      if (!getDeploymentState().equals(other.getDeploymentState())) return false;
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
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    if (hasDeploymentState()) {
      hash = (37 * hash) + DEPLOYMENT_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getDeploymentState().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState parseFrom(
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
      com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState prototype) {
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
   * State for PolicyControllerState.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.configmanagement.v1.PolicyControllerState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1.PolicyControllerState)
      com.google.cloud.gkehub.configmanagement.v1.PolicyControllerStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1_PolicyControllerState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1_PolicyControllerState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState.class,
              com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState.Builder.class);
    }

    // Construct using
    // com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState.newBuilder()
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
      if (versionBuilder_ == null) {
        version_ = null;
      } else {
        version_ = null;
        versionBuilder_ = null;
      }
      if (deploymentStateBuilder_ == null) {
        deploymentState_ = null;
      } else {
        deploymentState_ = null;
        deploymentStateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1_PolicyControllerState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState
        getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState build() {
      com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState result =
          new com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState(this);
      if (versionBuilder_ == null) {
        result.version_ = version_;
      } else {
        result.version_ = versionBuilder_.build();
      }
      if (deploymentStateBuilder_ == null) {
        result.deploymentState_ = deploymentState_;
      } else {
        result.deploymentState_ = deploymentStateBuilder_.build();
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
      if (other instanceof com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState) {
        return mergeFrom((com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState other) {
      if (other
          == com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState.getDefaultInstance())
        return this;
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
      }
      if (other.hasDeploymentState()) {
        mergeDeploymentState(other.getDeploymentState());
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
      com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion,
            com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion.Builder,
            com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersionOrBuilder>
        versionBuilder_;
    /**
     *
     *
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version = 1;</code>
     *
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return versionBuilder_ != null || version_ != null;
    }
    /**
     *
     *
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version = 1;</code>
     *
     * @return The version.
     */
    public com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null
            ? com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion
                .getDefaultInstance()
            : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version = 1;</code>
     */
    public Builder setVersion(
        com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
        onChanged();
      } else {
        versionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version = 1;</code>
     */
    public Builder setVersion(
        com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion.Builder
            builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
        onChanged();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version = 1;</code>
     */
    public Builder mergeVersion(
        com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion value) {
      if (versionBuilder_ == null) {
        if (version_ != null) {
          version_ =
              com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion.newBuilder(
                      version_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          version_ = value;
        }
        onChanged();
      } else {
        versionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version = 1;</code>
     */
    public Builder clearVersion() {
      if (versionBuilder_ == null) {
        version_ = null;
        onChanged();
      } else {
        version_ = null;
        versionBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version = 1;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion.Builder
        getVersionBuilder() {

      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version = 1;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersionOrBuilder
        getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null
            ? com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion
                .getDefaultInstance()
            : version_;
      }
    }
    /**
     *
     *
     * <pre>
     * The version of Gatekeeper Policy Controller deployed.
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion version = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion,
            com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion.Builder,
            com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersionOrBuilder>
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion,
                com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersion.Builder,
                com.google.cloud.gkehub.configmanagement.v1.PolicyControllerVersionOrBuilder>(
                getVersion(), getParentForChildren(), isClean());
        version_ = null;
      }
      return versionBuilder_;
    }

    private com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deploymentState_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState,
            com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState.Builder,
            com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentStateOrBuilder>
        deploymentStateBuilder_;
    /**
     *
     *
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deployment_state = 2;
     * </code>
     *
     * @return Whether the deploymentState field is set.
     */
    public boolean hasDeploymentState() {
      return deploymentStateBuilder_ != null || deploymentState_ != null;
    }
    /**
     *
     *
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deployment_state = 2;
     * </code>
     *
     * @return The deploymentState.
     */
    public com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState
        getDeploymentState() {
      if (deploymentStateBuilder_ == null) {
        return deploymentState_ == null
            ? com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState
                .getDefaultInstance()
            : deploymentState_;
      } else {
        return deploymentStateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deployment_state = 2;
     * </code>
     */
    public Builder setDeploymentState(
        com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState value) {
      if (deploymentStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deploymentState_ = value;
        onChanged();
      } else {
        deploymentStateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deployment_state = 2;
     * </code>
     */
    public Builder setDeploymentState(
        com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState.Builder
            builderForValue) {
      if (deploymentStateBuilder_ == null) {
        deploymentState_ = builderForValue.build();
        onChanged();
      } else {
        deploymentStateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deployment_state = 2;
     * </code>
     */
    public Builder mergeDeploymentState(
        com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState value) {
      if (deploymentStateBuilder_ == null) {
        if (deploymentState_ != null) {
          deploymentState_ =
              com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState.newBuilder(
                      deploymentState_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          deploymentState_ = value;
        }
        onChanged();
      } else {
        deploymentStateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deployment_state = 2;
     * </code>
     */
    public Builder clearDeploymentState() {
      if (deploymentStateBuilder_ == null) {
        deploymentState_ = null;
        onChanged();
      } else {
        deploymentState_ = null;
        deploymentStateBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deployment_state = 2;
     * </code>
     */
    public com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState.Builder
        getDeploymentStateBuilder() {

      onChanged();
      return getDeploymentStateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deployment_state = 2;
     * </code>
     */
    public com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentStateOrBuilder
        getDeploymentStateOrBuilder() {
      if (deploymentStateBuilder_ != null) {
        return deploymentStateBuilder_.getMessageOrBuilder();
      } else {
        return deploymentState_ == null
            ? com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState
                .getDefaultInstance()
            : deploymentState_;
      }
    }
    /**
     *
     *
     * <pre>
     * The state about the policy controller installation.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState deployment_state = 2;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState,
            com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState.Builder,
            com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentStateOrBuilder>
        getDeploymentStateFieldBuilder() {
      if (deploymentStateBuilder_ == null) {
        deploymentStateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState,
                com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentState.Builder,
                com.google.cloud.gkehub.configmanagement.v1.GatekeeperDeploymentStateOrBuilder>(
                getDeploymentState(), getParentForChildren(), isClean());
        deploymentState_ = null;
      }
      return deploymentStateBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1.PolicyControllerState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1.PolicyControllerState)
  private static final com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState();
  }

  public static com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyControllerState> PARSER =
      new com.google.protobuf.AbstractParser<PolicyControllerState>() {
        @java.lang.Override
        public PolicyControllerState parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PolicyControllerState(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PolicyControllerState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyControllerState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.PolicyControllerState
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
