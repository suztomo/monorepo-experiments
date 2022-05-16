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
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

public interface ListDatasetsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ListDatasetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The datasets read.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Dataset datasets = 1;</code>
   */
  java.util.List<com.google.cloud.automl.v1beta1.Dataset> getDatasetsList();
  /**
   *
   *
   * <pre>
   * The datasets read.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Dataset datasets = 1;</code>
   */
  com.google.cloud.automl.v1beta1.Dataset getDatasets(int index);
  /**
   *
   *
   * <pre>
   * The datasets read.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Dataset datasets = 1;</code>
   */
  int getDatasetsCount();
  /**
   *
   *
   * <pre>
   * The datasets read.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Dataset datasets = 1;</code>
   */
  java.util.List<? extends com.google.cloud.automl.v1beta1.DatasetOrBuilder>
      getDatasetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The datasets read.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.Dataset datasets = 1;</code>
   */
  com.google.cloud.automl.v1beta1.DatasetOrBuilder getDatasetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListDatasetsRequest.page_token][google.cloud.automl.v1beta1.ListDatasetsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to [ListDatasetsRequest.page_token][google.cloud.automl.v1beta1.ListDatasetsRequest.page_token] to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
