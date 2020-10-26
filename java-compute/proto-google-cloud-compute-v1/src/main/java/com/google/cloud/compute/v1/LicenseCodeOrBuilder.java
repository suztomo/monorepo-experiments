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

public interface LicenseCodeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.LicenseCode)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Description of this License Code.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * [Output Only] Description of this License Code.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#licenseCode for licenses.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#licenseCode for licenses.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] URL and description aliases of Licenses with the same License Code.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LicenseCodeLicenseAlias license_alias = 43550930;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.LicenseCodeLicenseAlias> getLicenseAliasList();
  /**
   *
   *
   * <pre>
   * [Output Only] URL and description aliases of Licenses with the same License Code.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LicenseCodeLicenseAlias license_alias = 43550930;
   * </code>
   */
  com.google.cloud.compute.v1.LicenseCodeLicenseAlias getLicenseAlias(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] URL and description aliases of Licenses with the same License Code.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LicenseCodeLicenseAlias license_alias = 43550930;
   * </code>
   */
  int getLicenseAliasCount();
  /**
   *
   *
   * <pre>
   * [Output Only] URL and description aliases of Licenses with the same License Code.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LicenseCodeLicenseAlias license_alias = 43550930;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.LicenseCodeLicenseAliasOrBuilder>
      getLicenseAliasOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] URL and description aliases of Licenses with the same License Code.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LicenseCodeLicenseAlias license_alias = 43550930;
   * </code>
   */
  com.google.cloud.compute.v1.LicenseCodeLicenseAliasOrBuilder getLicenseAliasOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Name of the resource. The name is 1-20 characters long and must be a valid 64 bit integer.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * [Output Only] Name of the resource. The name is 1-20 characters long and must be a valid 64 bit integer.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Current state of this License Code.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LicenseCode.State state = 109757585;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * [Output Only] Current state of this License Code.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.LicenseCode.State state = 109757585;</code>
   *
   * @return The state.
   */
  com.google.cloud.compute.v1.LicenseCode.State getState();

  /**
   *
   *
   * <pre>
   * [Output Only] If true, the license will remain attached when creating images or snapshots from disks. Otherwise, the license is not transferred.
   * </pre>
   *
   * <code>bool transferable = 4349893;</code>
   *
   * @return The transferable.
   */
  boolean getTransferable();
}
