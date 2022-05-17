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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 *
 *
 * <pre>
 * UpgradeResourceType is the resource type that is upgrading. It is used
 * in upgrade notifications.
 * </pre>
 *
 * Protobuf enum {@code google.container.v1.UpgradeResourceType}
 */
public enum UpgradeResourceType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value. This shouldn't be used.
   * </pre>
   *
   * <code>UPGRADE_RESOURCE_TYPE_UNSPECIFIED = 0;</code>
   */
  UPGRADE_RESOURCE_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Master / control plane
   * </pre>
   *
   * <code>MASTER = 1;</code>
   */
  MASTER(1),
  /**
   *
   *
   * <pre>
   * Node pool
   * </pre>
   *
   * <code>NODE_POOL = 2;</code>
   */
  NODE_POOL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value. This shouldn't be used.
   * </pre>
   *
   * <code>UPGRADE_RESOURCE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int UPGRADE_RESOURCE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Master / control plane
   * </pre>
   *
   * <code>MASTER = 1;</code>
   */
  public static final int MASTER_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Node pool
   * </pre>
   *
   * <code>NODE_POOL = 2;</code>
   */
  public static final int NODE_POOL_VALUE = 2;

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
  public static UpgradeResourceType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UpgradeResourceType forNumber(int value) {
    switch (value) {
      case 0:
        return UPGRADE_RESOURCE_TYPE_UNSPECIFIED;
      case 1:
        return MASTER;
      case 2:
        return NODE_POOL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UpgradeResourceType>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<UpgradeResourceType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UpgradeResourceType>() {
            public UpgradeResourceType findValueByNumber(int number) {
              return UpgradeResourceType.forNumber(number);
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
    return com.google.container.v1.ClusterServiceProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final UpgradeResourceType[] VALUES = values();

  public static UpgradeResourceType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private UpgradeResourceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.container.v1.UpgradeResourceType)
}
