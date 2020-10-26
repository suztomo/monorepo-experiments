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

public interface InterconnectCircuitInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectCircuitInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Customer-side demarc ID for this circuit.
   * </pre>
   *
   * <code>string customer_demarc_id = 28771859;</code>
   *
   * @return The customerDemarcId.
   */
  java.lang.String getCustomerDemarcId();
  /**
   *
   *
   * <pre>
   * Customer-side demarc ID for this circuit.
   * </pre>
   *
   * <code>string customer_demarc_id = 28771859;</code>
   *
   * @return The bytes for customerDemarcId.
   */
  com.google.protobuf.ByteString getCustomerDemarcIdBytes();

  /**
   *
   *
   * <pre>
   * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
   * </pre>
   *
   * <code>string google_circuit_id = 262014711;</code>
   *
   * @return The googleCircuitId.
   */
  java.lang.String getGoogleCircuitId();
  /**
   *
   *
   * <pre>
   * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
   * </pre>
   *
   * <code>string google_circuit_id = 262014711;</code>
   *
   * @return The bytes for googleCircuitId.
   */
  com.google.protobuf.ByteString getGoogleCircuitIdBytes();

  /**
   *
   *
   * <pre>
   * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
   * </pre>
   *
   * <code>string google_demarc_id = 448196270;</code>
   *
   * @return The googleDemarcId.
   */
  java.lang.String getGoogleDemarcId();
  /**
   *
   *
   * <pre>
   * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
   * </pre>
   *
   * <code>string google_demarc_id = 448196270;</code>
   *
   * @return The bytes for googleDemarcId.
   */
  com.google.protobuf.ByteString getGoogleDemarcIdBytes();
}
