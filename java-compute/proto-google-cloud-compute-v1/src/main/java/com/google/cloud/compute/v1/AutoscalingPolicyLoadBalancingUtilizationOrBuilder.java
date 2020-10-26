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

public interface AutoscalingPolicyLoadBalancingUtilizationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that autoscaler should maintain. Must be a positive float value. If not defined, the default is 0.8.
   * </pre>
   *
   * <code>double utilization_target = 215905870;</code>
   *
   * @return The utilizationTarget.
   */
  double getUtilizationTarget();
}
