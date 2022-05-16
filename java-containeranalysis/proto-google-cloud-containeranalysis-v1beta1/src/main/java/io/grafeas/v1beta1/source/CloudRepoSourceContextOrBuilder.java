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
// source: google/devtools/containeranalysis/v1beta1/source/source.proto

package io.grafeas.v1beta1.source;

public interface CloudRepoSourceContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.source.CloudRepoSourceContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The ID of the repo.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.RepoId repo_id = 1;</code>
   *
   * @return Whether the repoId field is set.
   */
  boolean hasRepoId();
  /**
   *
   *
   * <pre>
   * The ID of the repo.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.RepoId repo_id = 1;</code>
   *
   * @return The repoId.
   */
  io.grafeas.v1beta1.source.RepoId getRepoId();
  /**
   *
   *
   * <pre>
   * The ID of the repo.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.RepoId repo_id = 1;</code>
   */
  io.grafeas.v1beta1.source.RepoIdOrBuilder getRepoIdOrBuilder();

  /**
   *
   *
   * <pre>
   * A revision ID.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();
  /**
   *
   *
   * <pre>
   * A revision ID.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();

  /**
   *
   *
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext alias_context = 3;</code>
   *
   * @return Whether the aliasContext field is set.
   */
  boolean hasAliasContext();
  /**
   *
   *
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext alias_context = 3;</code>
   *
   * @return The aliasContext.
   */
  io.grafeas.v1beta1.source.AliasContext getAliasContext();
  /**
   *
   *
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext alias_context = 3;</code>
   */
  io.grafeas.v1beta1.source.AliasContextOrBuilder getAliasContextOrBuilder();

  public io.grafeas.v1beta1.source.CloudRepoSourceContext.RevisionCase getRevisionCase();
}
