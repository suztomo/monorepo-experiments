/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/package.proto

package io.grafeas.v1;

public interface PackageOccurrenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.PackageOccurrence)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the installed package.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the installed package.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  java.util.List<io.grafeas.v1.Location> getLocationList();
  /**
   *
   *
   * <pre>
   * Required. All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  io.grafeas.v1.Location getLocation(int index);
  /**
   *
   *
   * <pre>
   * Required. All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  int getLocationCount();
  /**
   *
   *
   * <pre>
   * Required. All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  java.util.List<? extends io.grafeas.v1.LocationOrBuilder> getLocationOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. All of the places within the filesystem versions of this package
   * have been found.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Location location = 2;</code>
   */
  io.grafeas.v1.LocationOrBuilder getLocationOrBuilder(int index);
}
