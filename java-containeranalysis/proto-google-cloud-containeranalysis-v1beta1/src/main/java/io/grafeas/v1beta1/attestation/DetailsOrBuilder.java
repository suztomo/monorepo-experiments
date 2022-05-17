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
// source: google/devtools/containeranalysis/v1beta1/attestation/attestation.proto

package io.grafeas.v1beta1.attestation;

public interface DetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.attestation.Details)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Attestation for the resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
   *
   * @return Whether the attestation field is set.
   */
  boolean hasAttestation();
  /**
   *
   *
   * <pre>
   * Required. Attestation for the resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
   *
   * @return The attestation.
   */
  io.grafeas.v1beta1.attestation.Attestation getAttestation();
  /**
   *
   *
   * <pre>
   * Required. Attestation for the resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
   */
  io.grafeas.v1beta1.attestation.AttestationOrBuilder getAttestationOrBuilder();
}
