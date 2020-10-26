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

public interface InterconnectLocationRegionInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectLocationRegionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
   * </pre>
   *
   * <code>string expected_rtt_ms = 422543866;</code>
   *
   * @return The expectedRttMs.
   */
  java.lang.String getExpectedRttMs();
  /**
   *
   *
   * <pre>
   * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
   * </pre>
   *
   * <code>string expected_rtt_ms = 422543866;</code>
   *
   * @return The bytes for expectedRttMs.
   */
  com.google.protobuf.ByteString getExpectedRttMsBytes();

  /**
   *
   *
   * <pre>
   * Identifies the network presence of this location.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence location_presence = 101517893;
   * </code>
   *
   * @return The enum numeric value on the wire for locationPresence.
   */
  int getLocationPresenceValue();
  /**
   *
   *
   * <pre>
   * Identifies the network presence of this location.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence location_presence = 101517893;
   * </code>
   *
   * @return The locationPresence.
   */
  com.google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence getLocationPresence();

  /**
   *
   *
   * <pre>
   * URL for the region of this location.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * URL for the region of this location.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();
}
