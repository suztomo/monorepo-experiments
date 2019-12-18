/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/webrisk/v1beta1/webrisk.proto

package com.google.webrisk.v1beta1;

public interface ThreatEntryRemovalsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1beta1.ThreatEntryRemovals)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The raw removal indices for a local list.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
   *
   * @return Whether the rawIndices field is set.
   */
  boolean hasRawIndices();
  /**
   *
   *
   * <pre>
   * The raw removal indices for a local list.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
   *
   * @return The rawIndices.
   */
  com.google.webrisk.v1beta1.RawIndices getRawIndices();
  /**
   *
   *
   * <pre>
   * The raw removal indices for a local list.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.RawIndices raw_indices = 1;</code>
   */
  com.google.webrisk.v1beta1.RawIndicesOrBuilder getRawIndicesOrBuilder();

  /**
   *
   *
   * <pre>
   * The encoded local, lexicographically-sorted list indices, using a
   * Golomb-Rice encoding. Used for sending compressed removal indices. The
   * removal indices (uint32) are sorted in ascending order, then delta encoded
   * and stored as encoded_data.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
   *
   * @return Whether the riceIndices field is set.
   */
  boolean hasRiceIndices();
  /**
   *
   *
   * <pre>
   * The encoded local, lexicographically-sorted list indices, using a
   * Golomb-Rice encoding. Used for sending compressed removal indices. The
   * removal indices (uint32) are sorted in ascending order, then delta encoded
   * and stored as encoded_data.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
   *
   * @return The riceIndices.
   */
  com.google.webrisk.v1beta1.RiceDeltaEncoding getRiceIndices();
  /**
   *
   *
   * <pre>
   * The encoded local, lexicographically-sorted list indices, using a
   * Golomb-Rice encoding. Used for sending compressed removal indices. The
   * removal indices (uint32) are sorted in ascending order, then delta encoded
   * and stored as encoded_data.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1beta1.RiceDeltaEncoding rice_indices = 2;</code>
   */
  com.google.webrisk.v1beta1.RiceDeltaEncodingOrBuilder getRiceIndicesOrBuilder();
}
