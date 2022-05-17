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
// source: google/cloud/gkehub/v1beta1/membership.proto

package com.google.cloud.gkehub.v1beta1;

public interface GenerateConnectManifestRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta1.GenerateConnectManifestRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Membership resource name the Agent will associate with, in
   * the format `projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The Membership resource name the Agent will associate with, in
   * the format `projects/&#42;&#47;locations/&#42;&#47;memberships/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The connect agent to generate manifest for.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1beta1.ConnectAgent connect_agent = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the connectAgent field is set.
   */
  boolean hasConnectAgent();
  /**
   *
   *
   * <pre>
   * Optional. The connect agent to generate manifest for.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1beta1.ConnectAgent connect_agent = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The connectAgent.
   */
  com.google.cloud.gkehub.v1beta1.ConnectAgent getConnectAgent();
  /**
   *
   *
   * <pre>
   * Optional. The connect agent to generate manifest for.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1beta1.ConnectAgent connect_agent = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkehub.v1beta1.ConnectAgentOrBuilder getConnectAgentOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Connect agent version to use. Defaults to the most current
   * version.
   * </pre>
   *
   * <code>string version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Optional. The Connect agent version to use. Defaults to the most current
   * version.
   * </pre>
   *
   * <code>string version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. If true, generate the resources for upgrade only. Some resources
   * generated only for installation (e.g. secrets) will be excluded.
   * </pre>
   *
   * <code>bool is_upgrade = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The isUpgrade.
   */
  boolean getIsUpgrade();

  /**
   *
   *
   * <pre>
   * Optional. The registry to fetch the connect agent image from. Defaults to
   * gcr.io/gkeconnect.
   * </pre>
   *
   * <code>string registry = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The registry.
   */
  java.lang.String getRegistry();
  /**
   *
   *
   * <pre>
   * Optional. The registry to fetch the connect agent image from. Defaults to
   * gcr.io/gkeconnect.
   * </pre>
   *
   * <code>string registry = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for registry.
   */
  com.google.protobuf.ByteString getRegistryBytes();

  /**
   *
   *
   * <pre>
   * Optional. The image pull secret content for the registry, if not public.
   * </pre>
   *
   * <code>bytes image_pull_secret_content = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The imagePullSecretContent.
   */
  com.google.protobuf.ByteString getImagePullSecretContent();
}
