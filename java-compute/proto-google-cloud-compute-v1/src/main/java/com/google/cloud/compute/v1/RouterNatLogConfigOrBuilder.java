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

public interface RouterNatLogConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterNatLogConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Indicates whether or not to export logs. This is false by default.
   * </pre>
   *
   * <code>bool enable = 311764355;</code>
   *
   * @return The enable.
   */
  boolean getEnable();

  /**
   *
   *
   * <pre>
   * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values:
   * - ERRORS_ONLY: Export logs only for connection failures.
   * - TRANSLATIONS_ONLY: Export logs only for successful connections.
   * - ALL: Export logs for all connections, successful and unsuccessful.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterNatLogConfig.Filter filter = 336120696;</code>
   *
   * @return The enum numeric value on the wire for filter.
   */
  int getFilterValue();
  /**
   *
   *
   * <pre>
   * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values:
   * - ERRORS_ONLY: Export logs only for connection failures.
   * - TRANSLATIONS_ONLY: Export logs only for successful connections.
   * - ALL: Export logs for all connections, successful and unsuccessful.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterNatLogConfig.Filter filter = 336120696;</code>
   *
   * @return The filter.
   */
  com.google.cloud.compute.v1.RouterNatLogConfig.Filter getFilter();
}
