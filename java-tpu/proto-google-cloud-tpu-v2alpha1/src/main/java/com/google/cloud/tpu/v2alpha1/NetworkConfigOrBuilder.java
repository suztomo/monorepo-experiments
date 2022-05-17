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
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

package com.google.cloud.tpu.v2alpha1;

public interface NetworkConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.NetworkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the network for the TPU node. It must be a preexisting Google
   * Compute Engine network. If none is provided, "default" will be used.
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * The name of the network for the TPU node. It must be a preexisting Google
   * Compute Engine network. If none is provided, "default" will be used.
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * The name of the subnetwork for the TPU node. It must be a preexisting
   * Google Compute Engine subnetwork. If none is provided, "default" will be
   * used.
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * The name of the subnetwork for the TPU node. It must be a preexisting
   * Google Compute Engine subnetwork. If none is provided, "default" will be
   * used.
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * Indicates that external IP addresses would be associated with the TPU
   * workers. If set to false, the specified subnetwork or network should have
   * Private Google Access enabled.
   * </pre>
   *
   * <code>bool enable_external_ips = 3;</code>
   *
   * @return The enableExternalIps.
   */
  boolean getEnableExternalIps();
}
