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

public interface AssessmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.Assessment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name for the Assessment in the format
   * "projects/{project}/assessments/{assessment}".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name for the Assessment in the format
   * "projects/{project}/assessments/{assessment}".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The event being assessed.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.Event event = 2;</code>
   *
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   *
   *
   * <pre>
   * The event being assessed.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.Event event = 2;</code>
   *
   * @return The event.
   */
  com.google.recaptchaenterprise.v1.Event getEvent();
  /**
   *
   *
   * <pre>
   * The event being assessed.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.Event event = 2;</code>
   */
  com.google.recaptchaenterprise.v1.EventOrBuilder getEventOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The risk analysis result for the event being assessed.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.RiskAnalysis risk_analysis = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the riskAnalysis field is set.
   */
  boolean hasRiskAnalysis();
  /**
   *
   *
   * <pre>
   * Output only. The risk analysis result for the event being assessed.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.RiskAnalysis risk_analysis = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The riskAnalysis.
   */
  com.google.recaptchaenterprise.v1.RiskAnalysis getRiskAnalysis();
  /**
   *
   *
   * <pre>
   * Output only. The risk analysis result for the event being assessed.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.RiskAnalysis risk_analysis = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.recaptchaenterprise.v1.RiskAnalysisOrBuilder getRiskAnalysisOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Properties of the provided event token.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TokenProperties token_properties = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the tokenProperties field is set.
   */
  boolean hasTokenProperties();
  /**
   *
   *
   * <pre>
   * Output only. Properties of the provided event token.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TokenProperties token_properties = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The tokenProperties.
   */
  com.google.recaptchaenterprise.v1.TokenProperties getTokenProperties();
  /**
   *
   *
   * <pre>
   * Output only. Properties of the provided event token.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TokenProperties token_properties = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.recaptchaenterprise.v1.TokenPropertiesOrBuilder getTokenPropertiesOrBuilder();

  /**
   *
   *
   * <pre>
   * Assessment returned by Account Defender when a hashed_account_id is
   * provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment account_defender_assessment = 6;
   * </code>
   *
   * @return Whether the accountDefenderAssessment field is set.
   */
  boolean hasAccountDefenderAssessment();
  /**
   *
   *
   * <pre>
   * Assessment returned by Account Defender when a hashed_account_id is
   * provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment account_defender_assessment = 6;
   * </code>
   *
   * @return The accountDefenderAssessment.
   */
  com.google.recaptchaenterprise.v1.AccountDefenderAssessment getAccountDefenderAssessment();
  /**
   *
   *
   * <pre>
   * Assessment returned by Account Defender when a hashed_account_id is
   * provided.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment account_defender_assessment = 6;
   * </code>
   */
  com.google.recaptchaenterprise.v1.AccountDefenderAssessmentOrBuilder
      getAccountDefenderAssessmentOrBuilder();
}
