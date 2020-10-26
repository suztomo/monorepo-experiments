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

public interface TestFailureOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TestFailure)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * BackendService or BackendBucket returned by load balancer.
   * </pre>
   *
   * <code>string actual_service = 440379652;</code>
   *
   * @return The actualService.
   */
  java.lang.String getActualService();
  /**
   *
   *
   * <pre>
   * BackendService or BackendBucket returned by load balancer.
   * </pre>
   *
   * <code>string actual_service = 440379652;</code>
   *
   * @return The bytes for actualService.
   */
  com.google.protobuf.ByteString getActualServiceBytes();

  /**
   *
   *
   * <pre>
   * Expected BackendService or BackendBucket resource the given URL should be mapped to.
   * </pre>
   *
   * <code>string expected_service = 133987374;</code>
   *
   * @return The expectedService.
   */
  java.lang.String getExpectedService();
  /**
   *
   *
   * <pre>
   * Expected BackendService or BackendBucket resource the given URL should be mapped to.
   * </pre>
   *
   * <code>string expected_service = 133987374;</code>
   *
   * @return The bytes for expectedService.
   */
  com.google.protobuf.ByteString getExpectedServiceBytes();

  /**
   *
   *
   * <pre>
   * Host portion of the URL.
   * </pre>
   *
   * <code>string host = 3208616;</code>
   *
   * @return The host.
   */
  java.lang.String getHost();
  /**
   *
   *
   * <pre>
   * Host portion of the URL.
   * </pre>
   *
   * <code>string host = 3208616;</code>
   *
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString getHostBytes();

  /**
   *
   *
   * <pre>
   * Path portion including query parameters in the URL.
   * </pre>
   *
   * <code>string path = 3433509;</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   *
   *
   * <pre>
   * Path portion including query parameters in the URL.
   * </pre>
   *
   * <code>string path = 3433509;</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();
}
