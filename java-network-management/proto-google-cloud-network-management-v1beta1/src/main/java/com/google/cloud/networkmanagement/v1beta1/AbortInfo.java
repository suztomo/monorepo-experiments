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
// source: google/cloud/networkmanagement/v1beta1/trace.proto

package com.google.cloud.networkmanagement.v1beta1;

/**
 *
 *
 * <pre>
 * Details of the final state "abort" and associated resource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkmanagement.v1beta1.AbortInfo}
 */
public final class AbortInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkmanagement.v1beta1.AbortInfo)
    AbortInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AbortInfo.newBuilder() to construct.
  private AbortInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AbortInfo() {
    cause_ = 0;
    resourceUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AbortInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AbortInfo(
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
          case 8:
            {
              int rawValue = input.readEnum();

              cause_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              resourceUri_ = s;
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
    return com.google.cloud.networkmanagement.v1beta1.TraceProto
        .internal_static_google_cloud_networkmanagement_v1beta1_AbortInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkmanagement.v1beta1.TraceProto
        .internal_static_google_cloud_networkmanagement_v1beta1_AbortInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkmanagement.v1beta1.AbortInfo.class,
            com.google.cloud.networkmanagement.v1beta1.AbortInfo.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Abort cause types:
   * </pre>
   *
   * Protobuf enum {@code google.cloud.networkmanagement.v1beta1.AbortInfo.Cause}
   */
  public enum Cause implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Cause is unspecified.
     * </pre>
     *
     * <code>CAUSE_UNSPECIFIED = 0;</code>
     */
    CAUSE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Aborted due to unknown network.
     * The reachability analysis cannot proceed because the user does not have
     * access to the host project's network configurations, including firewall
     * rules and routes. This happens when the project is a service project and
     * the endpoints being traced are in the host project's network.
     * </pre>
     *
     * <code>UNKNOWN_NETWORK = 1;</code>
     */
    UNKNOWN_NETWORK(1),
    /**
     *
     *
     * <pre>
     * Aborted because the IP address(es) are unknown.
     * </pre>
     *
     * <code>UNKNOWN_IP = 2;</code>
     */
    UNKNOWN_IP(2),
    /**
     *
     *
     * <pre>
     * Aborted because no project information can be derived from the test
     * input.
     * </pre>
     *
     * <code>UNKNOWN_PROJECT = 3;</code>
     */
    UNKNOWN_PROJECT(3),
    /**
     *
     *
     * <pre>
     * Aborted because the user lacks the permission to access all or part of
     * the network configurations required to run the test.
     * </pre>
     *
     * <code>PERMISSION_DENIED = 4;</code>
     */
    PERMISSION_DENIED(4),
    /**
     *
     *
     * <pre>
     * Aborted because no valid source endpoint is derived from the input test
     * request.
     * </pre>
     *
     * <code>NO_SOURCE_LOCATION = 5;</code>
     */
    NO_SOURCE_LOCATION(5),
    /**
     *
     *
     * <pre>
     * Aborted because the source and/or destination endpoint specified in
     * the test are invalid. The possible reasons that an endpoint is
     * invalid include: malformed IP address; nonexistent instance or
     * network URI; IP address not in the range of specified network URI; and
     * instance not owning the network interface in the specified network.
     * </pre>
     *
     * <code>INVALID_ARGUMENT = 6;</code>
     */
    INVALID_ARGUMENT(6),
    /**
     *
     *
     * <pre>
     * Aborted because traffic is sent from a public IP to an instance without
     * an external IP.
     * </pre>
     *
     * <code>NO_EXTERNAL_IP = 7;</code>
     */
    NO_EXTERNAL_IP(7),
    /**
     *
     *
     * <pre>
     * Aborted because none of the traces matches destination information
     * specified in the input test request.
     * </pre>
     *
     * <code>UNINTENDED_DESTINATION = 8;</code>
     */
    UNINTENDED_DESTINATION(8),
    /**
     *
     *
     * <pre>
     * Aborted because the number of steps in the trace exceeding a certain
     * limit which may be caused by routing loop.
     * </pre>
     *
     * <code>TRACE_TOO_LONG = 9;</code>
     */
    TRACE_TOO_LONG(9),
    /**
     *
     *
     * <pre>
     * Aborted due to internal server error.
     * </pre>
     *
     * <code>INTERNAL_ERROR = 10;</code>
     */
    INTERNAL_ERROR(10),
    /**
     *
     *
     * <pre>
     * Aborted because the source endpoint could not be found.
     * </pre>
     *
     * <code>SOURCE_ENDPOINT_NOT_FOUND = 11;</code>
     */
    SOURCE_ENDPOINT_NOT_FOUND(11),
    /**
     *
     *
     * <pre>
     * Aborted because the source network does not match the source endpoint.
     * </pre>
     *
     * <code>MISMATCHED_SOURCE_NETWORK = 12;</code>
     */
    MISMATCHED_SOURCE_NETWORK(12),
    /**
     *
     *
     * <pre>
     * Aborted because the destination endpoint could not be found.
     * </pre>
     *
     * <code>DESTINATION_ENDPOINT_NOT_FOUND = 13;</code>
     */
    DESTINATION_ENDPOINT_NOT_FOUND(13),
    /**
     *
     *
     * <pre>
     * Aborted because the destination network does not match the destination
     * endpoint.
     * </pre>
     *
     * <code>MISMATCHED_DESTINATION_NETWORK = 14;</code>
     */
    MISMATCHED_DESTINATION_NETWORK(14),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Cause is unspecified.
     * </pre>
     *
     * <code>CAUSE_UNSPECIFIED = 0;</code>
     */
    public static final int CAUSE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Aborted due to unknown network.
     * The reachability analysis cannot proceed because the user does not have
     * access to the host project's network configurations, including firewall
     * rules and routes. This happens when the project is a service project and
     * the endpoints being traced are in the host project's network.
     * </pre>
     *
     * <code>UNKNOWN_NETWORK = 1;</code>
     */
    public static final int UNKNOWN_NETWORK_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Aborted because the IP address(es) are unknown.
     * </pre>
     *
     * <code>UNKNOWN_IP = 2;</code>
     */
    public static final int UNKNOWN_IP_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Aborted because no project information can be derived from the test
     * input.
     * </pre>
     *
     * <code>UNKNOWN_PROJECT = 3;</code>
     */
    public static final int UNKNOWN_PROJECT_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Aborted because the user lacks the permission to access all or part of
     * the network configurations required to run the test.
     * </pre>
     *
     * <code>PERMISSION_DENIED = 4;</code>
     */
    public static final int PERMISSION_DENIED_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Aborted because no valid source endpoint is derived from the input test
     * request.
     * </pre>
     *
     * <code>NO_SOURCE_LOCATION = 5;</code>
     */
    public static final int NO_SOURCE_LOCATION_VALUE = 5;
    /**
     *
     *
     * <pre>
     * Aborted because the source and/or destination endpoint specified in
     * the test are invalid. The possible reasons that an endpoint is
     * invalid include: malformed IP address; nonexistent instance or
     * network URI; IP address not in the range of specified network URI; and
     * instance not owning the network interface in the specified network.
     * </pre>
     *
     * <code>INVALID_ARGUMENT = 6;</code>
     */
    public static final int INVALID_ARGUMENT_VALUE = 6;
    /**
     *
     *
     * <pre>
     * Aborted because traffic is sent from a public IP to an instance without
     * an external IP.
     * </pre>
     *
     * <code>NO_EXTERNAL_IP = 7;</code>
     */
    public static final int NO_EXTERNAL_IP_VALUE = 7;
    /**
     *
     *
     * <pre>
     * Aborted because none of the traces matches destination information
     * specified in the input test request.
     * </pre>
     *
     * <code>UNINTENDED_DESTINATION = 8;</code>
     */
    public static final int UNINTENDED_DESTINATION_VALUE = 8;
    /**
     *
     *
     * <pre>
     * Aborted because the number of steps in the trace exceeding a certain
     * limit which may be caused by routing loop.
     * </pre>
     *
     * <code>TRACE_TOO_LONG = 9;</code>
     */
    public static final int TRACE_TOO_LONG_VALUE = 9;
    /**
     *
     *
     * <pre>
     * Aborted due to internal server error.
     * </pre>
     *
     * <code>INTERNAL_ERROR = 10;</code>
     */
    public static final int INTERNAL_ERROR_VALUE = 10;
    /**
     *
     *
     * <pre>
     * Aborted because the source endpoint could not be found.
     * </pre>
     *
     * <code>SOURCE_ENDPOINT_NOT_FOUND = 11;</code>
     */
    public static final int SOURCE_ENDPOINT_NOT_FOUND_VALUE = 11;
    /**
     *
     *
     * <pre>
     * Aborted because the source network does not match the source endpoint.
     * </pre>
     *
     * <code>MISMATCHED_SOURCE_NETWORK = 12;</code>
     */
    public static final int MISMATCHED_SOURCE_NETWORK_VALUE = 12;
    /**
     *
     *
     * <pre>
     * Aborted because the destination endpoint could not be found.
     * </pre>
     *
     * <code>DESTINATION_ENDPOINT_NOT_FOUND = 13;</code>
     */
    public static final int DESTINATION_ENDPOINT_NOT_FOUND_VALUE = 13;
    /**
     *
     *
     * <pre>
     * Aborted because the destination network does not match the destination
     * endpoint.
     * </pre>
     *
     * <code>MISMATCHED_DESTINATION_NETWORK = 14;</code>
     */
    public static final int MISMATCHED_DESTINATION_NETWORK_VALUE = 14;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Cause valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Cause forNumber(int value) {
      switch (value) {
        case 0:
          return CAUSE_UNSPECIFIED;
        case 1:
          return UNKNOWN_NETWORK;
        case 2:
          return UNKNOWN_IP;
        case 3:
          return UNKNOWN_PROJECT;
        case 4:
          return PERMISSION_DENIED;
        case 5:
          return NO_SOURCE_LOCATION;
        case 6:
          return INVALID_ARGUMENT;
        case 7:
          return NO_EXTERNAL_IP;
        case 8:
          return UNINTENDED_DESTINATION;
        case 9:
          return TRACE_TOO_LONG;
        case 10:
          return INTERNAL_ERROR;
        case 11:
          return SOURCE_ENDPOINT_NOT_FOUND;
        case 12:
          return MISMATCHED_SOURCE_NETWORK;
        case 13:
          return DESTINATION_ENDPOINT_NOT_FOUND;
        case 14:
          return MISMATCHED_DESTINATION_NETWORK;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Cause> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Cause> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Cause>() {
          public Cause findValueByNumber(int number) {
            return Cause.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.networkmanagement.v1beta1.AbortInfo.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Cause[] VALUES = values();

    public static Cause valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Cause(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.networkmanagement.v1beta1.AbortInfo.Cause)
  }

  public static final int CAUSE_FIELD_NUMBER = 1;
  private int cause_;
  /**
   *
   *
   * <pre>
   * Causes that the analysis is aborted.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause cause = 1;</code>
   *
   * @return The enum numeric value on the wire for cause.
   */
  @java.lang.Override
  public int getCauseValue() {
    return cause_;
  }
  /**
   *
   *
   * <pre>
   * Causes that the analysis is aborted.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause cause = 1;</code>
   *
   * @return The cause.
   */
  @java.lang.Override
  public com.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause getCause() {
    @SuppressWarnings("deprecation")
    com.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause result =
        com.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause.valueOf(cause_);
    return result == null
        ? com.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause.UNRECOGNIZED
        : result;
  }

  public static final int RESOURCE_URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object resourceUri_;
  /**
   *
   *
   * <pre>
   * URI of the resource that caused the abort.
   * </pre>
   *
   * <code>string resource_uri = 2;</code>
   *
   * @return The resourceUri.
   */
  @java.lang.Override
  public java.lang.String getResourceUri() {
    java.lang.Object ref = resourceUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URI of the resource that caused the abort.
   * </pre>
   *
   * <code>string resource_uri = 2;</code>
   *
   * @return The bytes for resourceUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceUriBytes() {
    java.lang.Object ref = resourceUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourceUri_ = b;
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
    if (cause_
        != com.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause.CAUSE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, cause_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceUri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cause_
        != com.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause.CAUSE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, cause_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceUri_);
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
    if (!(obj instanceof com.google.cloud.networkmanagement.v1beta1.AbortInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.networkmanagement.v1beta1.AbortInfo other =
        (com.google.cloud.networkmanagement.v1beta1.AbortInfo) obj;

    if (cause_ != other.cause_) return false;
    if (!getResourceUri().equals(other.getResourceUri())) return false;
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
    hash = (37 * hash) + CAUSE_FIELD_NUMBER;
    hash = (53 * hash) + cause_;
    hash = (37 * hash) + RESOURCE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getResourceUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkmanagement.v1beta1.AbortInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1beta1.AbortInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.AbortInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1beta1.AbortInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.AbortInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1beta1.AbortInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.AbortInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1beta1.AbortInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.AbortInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1beta1.AbortInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.AbortInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1beta1.AbortInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.networkmanagement.v1beta1.AbortInfo prototype) {
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
   * Details of the final state "abort" and associated resource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkmanagement.v1beta1.AbortInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkmanagement.v1beta1.AbortInfo)
      com.google.cloud.networkmanagement.v1beta1.AbortInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networkmanagement.v1beta1.TraceProto
          .internal_static_google_cloud_networkmanagement_v1beta1_AbortInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkmanagement.v1beta1.TraceProto
          .internal_static_google_cloud_networkmanagement_v1beta1_AbortInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkmanagement.v1beta1.AbortInfo.class,
              com.google.cloud.networkmanagement.v1beta1.AbortInfo.Builder.class);
    }

    // Construct using com.google.cloud.networkmanagement.v1beta1.AbortInfo.newBuilder()
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
      cause_ = 0;

      resourceUri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networkmanagement.v1beta1.TraceProto
          .internal_static_google_cloud_networkmanagement_v1beta1_AbortInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.AbortInfo getDefaultInstanceForType() {
      return com.google.cloud.networkmanagement.v1beta1.AbortInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.AbortInfo build() {
      com.google.cloud.networkmanagement.v1beta1.AbortInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.AbortInfo buildPartial() {
      com.google.cloud.networkmanagement.v1beta1.AbortInfo result =
          new com.google.cloud.networkmanagement.v1beta1.AbortInfo(this);
      result.cause_ = cause_;
      result.resourceUri_ = resourceUri_;
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
      if (other instanceof com.google.cloud.networkmanagement.v1beta1.AbortInfo) {
        return mergeFrom((com.google.cloud.networkmanagement.v1beta1.AbortInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkmanagement.v1beta1.AbortInfo other) {
      if (other == com.google.cloud.networkmanagement.v1beta1.AbortInfo.getDefaultInstance())
        return this;
      if (other.cause_ != 0) {
        setCauseValue(other.getCauseValue());
      }
      if (!other.getResourceUri().isEmpty()) {
        resourceUri_ = other.resourceUri_;
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
      com.google.cloud.networkmanagement.v1beta1.AbortInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.networkmanagement.v1beta1.AbortInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int cause_ = 0;
    /**
     *
     *
     * <pre>
     * Causes that the analysis is aborted.
     * </pre>
     *
     * <code>.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause cause = 1;</code>
     *
     * @return The enum numeric value on the wire for cause.
     */
    @java.lang.Override
    public int getCauseValue() {
      return cause_;
    }
    /**
     *
     *
     * <pre>
     * Causes that the analysis is aborted.
     * </pre>
     *
     * <code>.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause cause = 1;</code>
     *
     * @param value The enum numeric value on the wire for cause to set.
     * @return This builder for chaining.
     */
    public Builder setCauseValue(int value) {

      cause_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Causes that the analysis is aborted.
     * </pre>
     *
     * <code>.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause cause = 1;</code>
     *
     * @return The cause.
     */
    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause getCause() {
      @SuppressWarnings("deprecation")
      com.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause result =
          com.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause.valueOf(cause_);
      return result == null
          ? com.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Causes that the analysis is aborted.
     * </pre>
     *
     * <code>.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause cause = 1;</code>
     *
     * @param value The cause to set.
     * @return This builder for chaining.
     */
    public Builder setCause(com.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause value) {
      if (value == null) {
        throw new NullPointerException();
      }

      cause_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Causes that the analysis is aborted.
     * </pre>
     *
     * <code>.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause cause = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCause() {

      cause_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object resourceUri_ = "";
    /**
     *
     *
     * <pre>
     * URI of the resource that caused the abort.
     * </pre>
     *
     * <code>string resource_uri = 2;</code>
     *
     * @return The resourceUri.
     */
    public java.lang.String getResourceUri() {
      java.lang.Object ref = resourceUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of the resource that caused the abort.
     * </pre>
     *
     * <code>string resource_uri = 2;</code>
     *
     * @return The bytes for resourceUri.
     */
    public com.google.protobuf.ByteString getResourceUriBytes() {
      java.lang.Object ref = resourceUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourceUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of the resource that caused the abort.
     * </pre>
     *
     * <code>string resource_uri = 2;</code>
     *
     * @param value The resourceUri to set.
     * @return This builder for chaining.
     */
    public Builder setResourceUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      resourceUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of the resource that caused the abort.
     * </pre>
     *
     * <code>string resource_uri = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceUri() {

      resourceUri_ = getDefaultInstance().getResourceUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of the resource that caused the abort.
     * </pre>
     *
     * <code>string resource_uri = 2;</code>
     *
     * @param value The bytes for resourceUri to set.
     * @return This builder for chaining.
     */
    public Builder setResourceUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      resourceUri_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.networkmanagement.v1beta1.AbortInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkmanagement.v1beta1.AbortInfo)
  private static final com.google.cloud.networkmanagement.v1beta1.AbortInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkmanagement.v1beta1.AbortInfo();
  }

  public static com.google.cloud.networkmanagement.v1beta1.AbortInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AbortInfo> PARSER =
      new com.google.protobuf.AbstractParser<AbortInfo>() {
        @java.lang.Override
        public AbortInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AbortInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AbortInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AbortInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkmanagement.v1beta1.AbortInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
