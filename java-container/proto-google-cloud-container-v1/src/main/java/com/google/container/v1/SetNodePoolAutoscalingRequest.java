// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * SetNodePoolAutoscalingRequest sets the autoscaler settings of a node pool.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.SetNodePoolAutoscalingRequest}
 */
public  final class SetNodePoolAutoscalingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.SetNodePoolAutoscalingRequest)
    SetNodePoolAutoscalingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetNodePoolAutoscalingRequest.newBuilder() to construct.
  private SetNodePoolAutoscalingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetNodePoolAutoscalingRequest() {
    projectId_ = "";
    zone_ = "";
    clusterId_ = "";
    nodePoolId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetNodePoolAutoscalingRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            projectId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            zone_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            clusterId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            nodePoolId_ = s;
            break;
          }
          case 42: {
            com.google.container.v1.NodePoolAutoscaling.Builder subBuilder = null;
            if (autoscaling_ != null) {
              subBuilder = autoscaling_.toBuilder();
            }
            autoscaling_ = input.readMessage(com.google.container.v1.NodePoolAutoscaling.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(autoscaling_);
              autoscaling_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetNodePoolAutoscalingRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetNodePoolAutoscalingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.SetNodePoolAutoscalingRequest.class, com.google.container.v1.SetNodePoolAutoscalingRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_FIELD_NUMBER = 2;
  private volatile java.lang.Object zone_;
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * </pre>
   *
   * <code>string zone = 2;</code>
   */
  public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * </pre>
   *
   * <code>string zone = 2;</code>
   */
  public com.google.protobuf.ByteString
      getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object clusterId_;
  /**
   * <pre>
   * The name of the cluster to upgrade.
   * </pre>
   *
   * <code>string cluster_id = 3;</code>
   */
  public java.lang.String getClusterId() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the cluster to upgrade.
   * </pre>
   *
   * <code>string cluster_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getClusterIdBytes() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clusterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NODE_POOL_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object nodePoolId_;
  /**
   * <pre>
   * The name of the node pool to upgrade.
   * </pre>
   *
   * <code>string node_pool_id = 4;</code>
   */
  public java.lang.String getNodePoolId() {
    java.lang.Object ref = nodePoolId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nodePoolId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the node pool to upgrade.
   * </pre>
   *
   * <code>string node_pool_id = 4;</code>
   */
  public com.google.protobuf.ByteString
      getNodePoolIdBytes() {
    java.lang.Object ref = nodePoolId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nodePoolId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTOSCALING_FIELD_NUMBER = 5;
  private com.google.container.v1.NodePoolAutoscaling autoscaling_;
  /**
   * <pre>
   * Autoscaling configuration for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
   */
  public boolean hasAutoscaling() {
    return autoscaling_ != null;
  }
  /**
   * <pre>
   * Autoscaling configuration for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
   */
  public com.google.container.v1.NodePoolAutoscaling getAutoscaling() {
    return autoscaling_ == null ? com.google.container.v1.NodePoolAutoscaling.getDefaultInstance() : autoscaling_;
  }
  /**
   * <pre>
   * Autoscaling configuration for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
   */
  public com.google.container.v1.NodePoolAutoscalingOrBuilder getAutoscalingOrBuilder() {
    return getAutoscaling();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!getZoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, zone_);
    }
    if (!getClusterIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, clusterId_);
    }
    if (!getNodePoolIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, nodePoolId_);
    }
    if (autoscaling_ != null) {
      output.writeMessage(5, getAutoscaling());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!getZoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, zone_);
    }
    if (!getClusterIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, clusterId_);
    }
    if (!getNodePoolIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, nodePoolId_);
    }
    if (autoscaling_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getAutoscaling());
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
    if (!(obj instanceof com.google.container.v1.SetNodePoolAutoscalingRequest)) {
      return super.equals(obj);
    }
    com.google.container.v1.SetNodePoolAutoscalingRequest other = (com.google.container.v1.SetNodePoolAutoscalingRequest) obj;

    boolean result = true;
    result = result && getProjectId()
        .equals(other.getProjectId());
    result = result && getZone()
        .equals(other.getZone());
    result = result && getClusterId()
        .equals(other.getClusterId());
    result = result && getNodePoolId()
        .equals(other.getNodePoolId());
    result = result && (hasAutoscaling() == other.hasAutoscaling());
    if (hasAutoscaling()) {
      result = result && getAutoscaling()
          .equals(other.getAutoscaling());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    hash = (37 * hash) + CLUSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClusterId().hashCode();
    hash = (37 * hash) + NODE_POOL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNodePoolId().hashCode();
    if (hasAutoscaling()) {
      hash = (37 * hash) + AUTOSCALING_FIELD_NUMBER;
      hash = (53 * hash) + getAutoscaling().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.SetNodePoolAutoscalingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.SetNodePoolAutoscalingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.SetNodePoolAutoscalingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.SetNodePoolAutoscalingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.SetNodePoolAutoscalingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.SetNodePoolAutoscalingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.SetNodePoolAutoscalingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.SetNodePoolAutoscalingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.SetNodePoolAutoscalingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1.SetNodePoolAutoscalingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.SetNodePoolAutoscalingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.SetNodePoolAutoscalingRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.container.v1.SetNodePoolAutoscalingRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * SetNodePoolAutoscalingRequest sets the autoscaler settings of a node pool.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.SetNodePoolAutoscalingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.SetNodePoolAutoscalingRequest)
      com.google.container.v1.SetNodePoolAutoscalingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetNodePoolAutoscalingRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetNodePoolAutoscalingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.SetNodePoolAutoscalingRequest.class, com.google.container.v1.SetNodePoolAutoscalingRequest.Builder.class);
    }

    // Construct using com.google.container.v1.SetNodePoolAutoscalingRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      projectId_ = "";

      zone_ = "";

      clusterId_ = "";

      nodePoolId_ = "";

      if (autoscalingBuilder_ == null) {
        autoscaling_ = null;
      } else {
        autoscaling_ = null;
        autoscalingBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetNodePoolAutoscalingRequest_descriptor;
    }

    public com.google.container.v1.SetNodePoolAutoscalingRequest getDefaultInstanceForType() {
      return com.google.container.v1.SetNodePoolAutoscalingRequest.getDefaultInstance();
    }

    public com.google.container.v1.SetNodePoolAutoscalingRequest build() {
      com.google.container.v1.SetNodePoolAutoscalingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.container.v1.SetNodePoolAutoscalingRequest buildPartial() {
      com.google.container.v1.SetNodePoolAutoscalingRequest result = new com.google.container.v1.SetNodePoolAutoscalingRequest(this);
      result.projectId_ = projectId_;
      result.zone_ = zone_;
      result.clusterId_ = clusterId_;
      result.nodePoolId_ = nodePoolId_;
      if (autoscalingBuilder_ == null) {
        result.autoscaling_ = autoscaling_;
      } else {
        result.autoscaling_ = autoscalingBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1.SetNodePoolAutoscalingRequest) {
        return mergeFrom((com.google.container.v1.SetNodePoolAutoscalingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.SetNodePoolAutoscalingRequest other) {
      if (other == com.google.container.v1.SetNodePoolAutoscalingRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
        onChanged();
      }
      if (!other.getClusterId().isEmpty()) {
        clusterId_ = other.clusterId_;
        onChanged();
      }
      if (!other.getNodePoolId().isEmpty()) {
        nodePoolId_ = other.nodePoolId_;
        onChanged();
      }
      if (other.hasAutoscaling()) {
        mergeAutoscaling(other.getAutoscaling());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.container.v1.SetNodePoolAutoscalingRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.SetNodePoolAutoscalingRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object zone_ = "";
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public com.google.protobuf.ByteString
        getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public Builder setZone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      zone_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public Builder clearZone() {
      
      zone_ = getDefaultInstance().getZone();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public Builder setZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      zone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object clusterId_ = "";
    /**
     * <pre>
     * The name of the cluster to upgrade.
     * </pre>
     *
     * <code>string cluster_id = 3;</code>
     */
    public java.lang.String getClusterId() {
      java.lang.Object ref = clusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the cluster to upgrade.
     * </pre>
     *
     * <code>string cluster_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getClusterIdBytes() {
      java.lang.Object ref = clusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the cluster to upgrade.
     * </pre>
     *
     * <code>string cluster_id = 3;</code>
     */
    public Builder setClusterId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clusterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the cluster to upgrade.
     * </pre>
     *
     * <code>string cluster_id = 3;</code>
     */
    public Builder clearClusterId() {
      
      clusterId_ = getDefaultInstance().getClusterId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the cluster to upgrade.
     * </pre>
     *
     * <code>string cluster_id = 3;</code>
     */
    public Builder setClusterIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clusterId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object nodePoolId_ = "";
    /**
     * <pre>
     * The name of the node pool to upgrade.
     * </pre>
     *
     * <code>string node_pool_id = 4;</code>
     */
    public java.lang.String getNodePoolId() {
      java.lang.Object ref = nodePoolId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nodePoolId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the node pool to upgrade.
     * </pre>
     *
     * <code>string node_pool_id = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNodePoolIdBytes() {
      java.lang.Object ref = nodePoolId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nodePoolId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the node pool to upgrade.
     * </pre>
     *
     * <code>string node_pool_id = 4;</code>
     */
    public Builder setNodePoolId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nodePoolId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the node pool to upgrade.
     * </pre>
     *
     * <code>string node_pool_id = 4;</code>
     */
    public Builder clearNodePoolId() {
      
      nodePoolId_ = getDefaultInstance().getNodePoolId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the node pool to upgrade.
     * </pre>
     *
     * <code>string node_pool_id = 4;</code>
     */
    public Builder setNodePoolIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nodePoolId_ = value;
      onChanged();
      return this;
    }

    private com.google.container.v1.NodePoolAutoscaling autoscaling_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1.NodePoolAutoscaling, com.google.container.v1.NodePoolAutoscaling.Builder, com.google.container.v1.NodePoolAutoscalingOrBuilder> autoscalingBuilder_;
    /**
     * <pre>
     * Autoscaling configuration for the node pool.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
     */
    public boolean hasAutoscaling() {
      return autoscalingBuilder_ != null || autoscaling_ != null;
    }
    /**
     * <pre>
     * Autoscaling configuration for the node pool.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
     */
    public com.google.container.v1.NodePoolAutoscaling getAutoscaling() {
      if (autoscalingBuilder_ == null) {
        return autoscaling_ == null ? com.google.container.v1.NodePoolAutoscaling.getDefaultInstance() : autoscaling_;
      } else {
        return autoscalingBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Autoscaling configuration for the node pool.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
     */
    public Builder setAutoscaling(com.google.container.v1.NodePoolAutoscaling value) {
      if (autoscalingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        autoscaling_ = value;
        onChanged();
      } else {
        autoscalingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Autoscaling configuration for the node pool.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
     */
    public Builder setAutoscaling(
        com.google.container.v1.NodePoolAutoscaling.Builder builderForValue) {
      if (autoscalingBuilder_ == null) {
        autoscaling_ = builderForValue.build();
        onChanged();
      } else {
        autoscalingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Autoscaling configuration for the node pool.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
     */
    public Builder mergeAutoscaling(com.google.container.v1.NodePoolAutoscaling value) {
      if (autoscalingBuilder_ == null) {
        if (autoscaling_ != null) {
          autoscaling_ =
            com.google.container.v1.NodePoolAutoscaling.newBuilder(autoscaling_).mergeFrom(value).buildPartial();
        } else {
          autoscaling_ = value;
        }
        onChanged();
      } else {
        autoscalingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Autoscaling configuration for the node pool.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
     */
    public Builder clearAutoscaling() {
      if (autoscalingBuilder_ == null) {
        autoscaling_ = null;
        onChanged();
      } else {
        autoscaling_ = null;
        autoscalingBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Autoscaling configuration for the node pool.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
     */
    public com.google.container.v1.NodePoolAutoscaling.Builder getAutoscalingBuilder() {
      
      onChanged();
      return getAutoscalingFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Autoscaling configuration for the node pool.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
     */
    public com.google.container.v1.NodePoolAutoscalingOrBuilder getAutoscalingOrBuilder() {
      if (autoscalingBuilder_ != null) {
        return autoscalingBuilder_.getMessageOrBuilder();
      } else {
        return autoscaling_ == null ?
            com.google.container.v1.NodePoolAutoscaling.getDefaultInstance() : autoscaling_;
      }
    }
    /**
     * <pre>
     * Autoscaling configuration for the node pool.
     * </pre>
     *
     * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1.NodePoolAutoscaling, com.google.container.v1.NodePoolAutoscaling.Builder, com.google.container.v1.NodePoolAutoscalingOrBuilder> 
        getAutoscalingFieldBuilder() {
      if (autoscalingBuilder_ == null) {
        autoscalingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.NodePoolAutoscaling, com.google.container.v1.NodePoolAutoscaling.Builder, com.google.container.v1.NodePoolAutoscalingOrBuilder>(
                getAutoscaling(),
                getParentForChildren(),
                isClean());
        autoscaling_ = null;
      }
      return autoscalingBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.container.v1.SetNodePoolAutoscalingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.SetNodePoolAutoscalingRequest)
  private static final com.google.container.v1.SetNodePoolAutoscalingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.SetNodePoolAutoscalingRequest();
  }

  public static com.google.container.v1.SetNodePoolAutoscalingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetNodePoolAutoscalingRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetNodePoolAutoscalingRequest>() {
    public SetNodePoolAutoscalingRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetNodePoolAutoscalingRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetNodePoolAutoscalingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetNodePoolAutoscalingRequest> getParserForType() {
    return PARSER;
  }

  public com.google.container.v1.SetNodePoolAutoscalingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

