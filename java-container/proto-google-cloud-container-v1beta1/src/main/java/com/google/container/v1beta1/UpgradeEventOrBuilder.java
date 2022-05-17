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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface UpgradeEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.UpgradeEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource type that is upgrading.
   * </pre>
   *
   * <code>.google.container.v1beta1.UpgradeResourceType resource_type = 1;</code>
   *
   * @return The enum numeric value on the wire for resourceType.
   */
  int getResourceTypeValue();
  /**
   *
   *
   * <pre>
   * The resource type that is upgrading.
   * </pre>
   *
   * <code>.google.container.v1beta1.UpgradeResourceType resource_type = 1;</code>
   *
   * @return The resourceType.
   */
  com.google.container.v1beta1.UpgradeResourceType getResourceType();

  /**
   *
   *
   * <pre>
   * The operation associated with this upgrade.
   * </pre>
   *
   * <code>string operation = 2;</code>
   *
   * @return The operation.
   */
  java.lang.String getOperation();
  /**
   *
   *
   * <pre>
   * The operation associated with this upgrade.
   * </pre>
   *
   * <code>string operation = 2;</code>
   *
   * @return The bytes for operation.
   */
  com.google.protobuf.ByteString getOperationBytes();

  /**
   *
   *
   * <pre>
   * The time when the operation was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp operation_start_time = 3;</code>
   *
   * @return Whether the operationStartTime field is set.
   */
  boolean hasOperationStartTime();
  /**
   *
   *
   * <pre>
   * The time when the operation was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp operation_start_time = 3;</code>
   *
   * @return The operationStartTime.
   */
  com.google.protobuf.Timestamp getOperationStartTime();
  /**
   *
   *
   * <pre>
   * The time when the operation was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp operation_start_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getOperationStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The current version before the upgrade.
   * </pre>
   *
   * <code>string current_version = 4;</code>
   *
   * @return The currentVersion.
   */
  java.lang.String getCurrentVersion();
  /**
   *
   *
   * <pre>
   * The current version before the upgrade.
   * </pre>
   *
   * <code>string current_version = 4;</code>
   *
   * @return The bytes for currentVersion.
   */
  com.google.protobuf.ByteString getCurrentVersionBytes();

  /**
   *
   *
   * <pre>
   * The target version for the upgrade.
   * </pre>
   *
   * <code>string target_version = 5;</code>
   *
   * @return The targetVersion.
   */
  java.lang.String getTargetVersion();
  /**
   *
   *
   * <pre>
   * The target version for the upgrade.
   * </pre>
   *
   * <code>string target_version = 5;</code>
   *
   * @return The bytes for targetVersion.
   */
  com.google.protobuf.ByteString getTargetVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional relative path to the resource. For example in node pool upgrades,
   * the relative path of the node pool.
   * </pre>
   *
   * <code>string resource = 6;</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * Optional relative path to the resource. For example in node pool upgrades,
   * the relative path of the node pool.
   * </pre>
   *
   * <code>string resource = 6;</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();
}
