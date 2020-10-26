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

public interface CustomerEncryptionKeyProtectedDiskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Decrypts data associated with the disk with a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;</code>
   *
   * @return Whether the diskEncryptionKey field is set.
   */
  boolean hasDiskEncryptionKey();
  /**
   *
   *
   * <pre>
   * Decrypts data associated with the disk with a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;</code>
   *
   * @return The diskEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getDiskEncryptionKey();
  /**
   *
   *
   * <pre>
   * Decrypts data associated with the disk with a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 271660677;</code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder getDiskEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>string source = 177235995;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks.
   * </pre>
   *
   * <code>string source = 177235995;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();
}
