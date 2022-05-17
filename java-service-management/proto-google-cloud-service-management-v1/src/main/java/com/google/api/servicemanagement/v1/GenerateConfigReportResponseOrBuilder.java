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
// source: google/api/servicemanagement/v1/servicemanager.proto

package com.google.api.servicemanagement.v1;

public interface GenerateConfigReportResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.GenerateConfigReportResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the service this report belongs to.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   *
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   *
   *
   * <pre>
   * Name of the service this report belongs to.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   *
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString getServiceNameBytes();

  /**
   *
   *
   * <pre>
   * ID of the service configuration this report belongs to.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * ID of the service configuration this report belongs to.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * list of ChangeReport, each corresponding to comparison between two
   * service configurations.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ChangeReport change_reports = 3;</code>
   */
  java.util.List<com.google.api.servicemanagement.v1.ChangeReport> getChangeReportsList();
  /**
   *
   *
   * <pre>
   * list of ChangeReport, each corresponding to comparison between two
   * service configurations.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ChangeReport change_reports = 3;</code>
   */
  com.google.api.servicemanagement.v1.ChangeReport getChangeReports(int index);
  /**
   *
   *
   * <pre>
   * list of ChangeReport, each corresponding to comparison between two
   * service configurations.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ChangeReport change_reports = 3;</code>
   */
  int getChangeReportsCount();
  /**
   *
   *
   * <pre>
   * list of ChangeReport, each corresponding to comparison between two
   * service configurations.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ChangeReport change_reports = 3;</code>
   */
  java.util.List<? extends com.google.api.servicemanagement.v1.ChangeReportOrBuilder>
      getChangeReportsOrBuilderList();
  /**
   *
   *
   * <pre>
   * list of ChangeReport, each corresponding to comparison between two
   * service configurations.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.ChangeReport change_reports = 3;</code>
   */
  com.google.api.servicemanagement.v1.ChangeReportOrBuilder getChangeReportsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Errors / Linter warnings associated with the service definition this
   * report
   * belongs to.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Diagnostic diagnostics = 4;</code>
   */
  java.util.List<com.google.api.servicemanagement.v1.Diagnostic> getDiagnosticsList();
  /**
   *
   *
   * <pre>
   * Errors / Linter warnings associated with the service definition this
   * report
   * belongs to.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Diagnostic diagnostics = 4;</code>
   */
  com.google.api.servicemanagement.v1.Diagnostic getDiagnostics(int index);
  /**
   *
   *
   * <pre>
   * Errors / Linter warnings associated with the service definition this
   * report
   * belongs to.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Diagnostic diagnostics = 4;</code>
   */
  int getDiagnosticsCount();
  /**
   *
   *
   * <pre>
   * Errors / Linter warnings associated with the service definition this
   * report
   * belongs to.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Diagnostic diagnostics = 4;</code>
   */
  java.util.List<? extends com.google.api.servicemanagement.v1.DiagnosticOrBuilder>
      getDiagnosticsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Errors / Linter warnings associated with the service definition this
   * report
   * belongs to.
   * </pre>
   *
   * <code>repeated .google.api.servicemanagement.v1.Diagnostic diagnostics = 4;</code>
   */
  com.google.api.servicemanagement.v1.DiagnosticOrBuilder getDiagnosticsOrBuilder(int index);
}
