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
// source: google/cloud/metastore/v1alpha/metastore.proto

package com.google.cloud.metastore.v1alpha;

public interface MetadataExportOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1alpha.MetadataExport)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. A Cloud Storage URI of a folder that metadata are exported to, in the
   * form of `gs://&lt;bucket_name&gt;/&lt;path_inside_bucket&gt;/&lt;export_folder&gt;`, where
   * `&lt;export_folder&gt;` is automatically generated.
   * </pre>
   *
   * <code>string destination_gcs_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the destinationGcsUri field is set.
   */
  boolean hasDestinationGcsUri();
  /**
   *
   *
   * <pre>
   * Output only. A Cloud Storage URI of a folder that metadata are exported to, in the
   * form of `gs://&lt;bucket_name&gt;/&lt;path_inside_bucket&gt;/&lt;export_folder&gt;`, where
   * `&lt;export_folder&gt;` is automatically generated.
   * </pre>
   *
   * <code>string destination_gcs_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The destinationGcsUri.
   */
  java.lang.String getDestinationGcsUri();
  /**
   *
   *
   * <pre>
   * Output only. A Cloud Storage URI of a folder that metadata are exported to, in the
   * form of `gs://&lt;bucket_name&gt;/&lt;path_inside_bucket&gt;/&lt;export_folder&gt;`, where
   * `&lt;export_folder&gt;` is automatically generated.
   * </pre>
   *
   * <code>string destination_gcs_uri = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for destinationGcsUri.
   */
  com.google.protobuf.ByteString getDestinationGcsUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the export started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the export started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the export started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the export ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the export ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the export ended.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the export.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.MetadataExport.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the export.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.MetadataExport.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.metastore.v1alpha.MetadataExport.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The type of the database dump.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.DatabaseDumpSpec.Type database_dump_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for databaseDumpType.
   */
  int getDatabaseDumpTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. The type of the database dump.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.DatabaseDumpSpec.Type database_dump_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The databaseDumpType.
   */
  com.google.cloud.metastore.v1alpha.DatabaseDumpSpec.Type getDatabaseDumpType();

  public com.google.cloud.metastore.v1alpha.MetadataExport.DestinationCase getDestinationCase();
}
