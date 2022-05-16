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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface AnnotateAssessmentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.AnnotateAssessmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Assessment, in the format
   * "projects/{project}/assessments/{assessment}".
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Assessment, in the format
   * "projects/{project}/assessments/{assessment}".
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The annotation that will be assigned to the Event. This field can be left
   * empty to provide reasons that apply to an event without concluding whether
   * the event is legitimate or fraudulent.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AnnotateAssessmentRequest.Annotation annotation = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for annotation.
   */
  int getAnnotationValue();
  /**
   *
   *
   * <pre>
   * Optional. The annotation that will be assigned to the Event. This field can be left
   * empty to provide reasons that apply to an event without concluding whether
   * the event is legitimate or fraudulent.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AnnotateAssessmentRequest.Annotation annotation = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The annotation.
   */
  com.google.recaptchaenterprise.v1.AnnotateAssessmentRequest.Annotation getAnnotation();

  /**
   *
   *
   * <pre>
   * Optional. Optional reasons for the annotation that will be assigned to the Event.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AnnotateAssessmentRequest.Reason reasons = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the reasons.
   */
  java.util.List<com.google.recaptchaenterprise.v1.AnnotateAssessmentRequest.Reason>
      getReasonsList();
  /**
   *
   *
   * <pre>
   * Optional. Optional reasons for the annotation that will be assigned to the Event.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AnnotateAssessmentRequest.Reason reasons = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of reasons.
   */
  int getReasonsCount();
  /**
   *
   *
   * <pre>
   * Optional. Optional reasons for the annotation that will be assigned to the Event.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AnnotateAssessmentRequest.Reason reasons = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The reasons at the given index.
   */
  com.google.recaptchaenterprise.v1.AnnotateAssessmentRequest.Reason getReasons(int index);
  /**
   *
   *
   * <pre>
   * Optional. Optional reasons for the annotation that will be assigned to the Event.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AnnotateAssessmentRequest.Reason reasons = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for reasons.
   */
  java.util.List<java.lang.Integer> getReasonsValueList();
  /**
   *
   *
   * <pre>
   * Optional. Optional reasons for the annotation that will be assigned to the Event.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AnnotateAssessmentRequest.Reason reasons = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of reasons at the given index.
   */
  int getReasonsValue(int index);

  /**
   *
   *
   * <pre>
   * Optional. Optional unique stable hashed user identifier to apply to the assessment.
   * This is an alternative to setting the hashed_account_id in
   * CreateAssessment, for example when the account identifier is not yet known
   * in the initial request. It is recommended that the identifier is hashed
   * using hmac-sha256 with stable secret.
   * </pre>
   *
   * <code>bytes hashed_account_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The hashedAccountId.
   */
  com.google.protobuf.ByteString getHashedAccountId();
}
