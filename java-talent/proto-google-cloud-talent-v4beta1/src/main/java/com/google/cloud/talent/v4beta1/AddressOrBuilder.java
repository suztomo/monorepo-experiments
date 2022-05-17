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
// source: google/cloud/talent/v4beta1/profile.proto

package com.google.cloud.talent.v4beta1;

public interface AddressOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.Address)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The usage of the address. For example, SCHOOL, WORK, PERSONAL.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ContactInfoUsage usage = 1;</code>
   *
   * @return The enum numeric value on the wire for usage.
   */
  int getUsageValue();
  /**
   *
   *
   * <pre>
   * The usage of the address. For example, SCHOOL, WORK, PERSONAL.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ContactInfoUsage usage = 1;</code>
   *
   * @return The usage.
   */
  com.google.cloud.talent.v4beta1.ContactInfoUsage getUsage();

  /**
   *
   *
   * <pre>
   * Unstructured address.
   * For example, "1600 Amphitheatre Pkwy, Mountain View, CA 94043",
   * "Sunnyvale, California".
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string unstructured_address = 2;</code>
   *
   * @return Whether the unstructuredAddress field is set.
   */
  boolean hasUnstructuredAddress();
  /**
   *
   *
   * <pre>
   * Unstructured address.
   * For example, "1600 Amphitheatre Pkwy, Mountain View, CA 94043",
   * "Sunnyvale, California".
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string unstructured_address = 2;</code>
   *
   * @return The unstructuredAddress.
   */
  java.lang.String getUnstructuredAddress();
  /**
   *
   *
   * <pre>
   * Unstructured address.
   * For example, "1600 Amphitheatre Pkwy, Mountain View, CA 94043",
   * "Sunnyvale, California".
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string unstructured_address = 2;</code>
   *
   * @return The bytes for unstructuredAddress.
   */
  com.google.protobuf.ByteString getUnstructuredAddressBytes();

  /**
   *
   *
   * <pre>
   * Structured address that contains street address, city, state, country,
   * and so on.
   * </pre>
   *
   * <code>.google.type.PostalAddress structured_address = 3;</code>
   *
   * @return Whether the structuredAddress field is set.
   */
  boolean hasStructuredAddress();
  /**
   *
   *
   * <pre>
   * Structured address that contains street address, city, state, country,
   * and so on.
   * </pre>
   *
   * <code>.google.type.PostalAddress structured_address = 3;</code>
   *
   * @return The structuredAddress.
   */
  com.google.type.PostalAddress getStructuredAddress();
  /**
   *
   *
   * <pre>
   * Structured address that contains street address, city, state, country,
   * and so on.
   * </pre>
   *
   * <code>.google.type.PostalAddress structured_address = 3;</code>
   */
  com.google.type.PostalAddressOrBuilder getStructuredAddressOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates if it's the person's current address.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue current = 4;</code>
   *
   * @return Whether the current field is set.
   */
  boolean hasCurrent();
  /**
   *
   *
   * <pre>
   * Indicates if it's the person's current address.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue current = 4;</code>
   *
   * @return The current.
   */
  com.google.protobuf.BoolValue getCurrent();
  /**
   *
   *
   * <pre>
   * Indicates if it's the person's current address.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue current = 4;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getCurrentOrBuilder();

  public com.google.cloud.talent.v4beta1.Address.AddressCase getAddressCase();
}
