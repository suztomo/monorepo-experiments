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
// source: google/cloud/aiplatform/v1beta1/index.proto

package com.google.cloud.aiplatform.v1beta1;

public final class IndexProto {
  private IndexProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Index_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Index_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Index_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Index_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/aiplatform/v1beta1/index."
          + "proto\022\037google.cloud.aiplatform.v1beta1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\0328google/cloud/aiplatf"
          + "orm/v1beta1/deployed_index_ref.proto\032\034go"
          + "ogle/protobuf/struct.proto\032\037google/proto"
          + "buf/timestamp.proto\"\264\004\n\005Index\022\021\n\004name\030\001 "
          + "\001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\023\n\013d"
          + "escription\030\003 \001(\t\022 \n\023metadata_schema_uri\030"
          + "\004 \001(\tB\003\340A\005\022(\n\010metadata\030\006 \001(\0132\026.google.pr"
          + "otobuf.Value\022P\n\020deployed_indexes\030\007 \003(\01321"
          + ".google.cloud.aiplatform.v1beta1.Deploye"
          + "dIndexRefB\003\340A\003\022\014\n\004etag\030\010 \001(\t\022B\n\006labels\030\t"
          + " \003(\01322.google.cloud.aiplatform.v1beta1.I"
          + "ndex.LabelsEntry\0224\n\013create_time\030\n \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\0224\n\013update"
          + "_time\030\013 \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu"
          + "e\030\002 \001(\t:\0028\001:]\352AZ\n\037aiplatform.googleapis."
          + "com/Index\0227projects/{project}/locations/"
          + "{location}/indexes/{index}B\347\001\n#com.googl"
          + "e.cloud.aiplatform.v1beta1B\nIndexProtoP\001"
          + "ZIgoogle.golang.org/genproto/googleapis/"
          + "cloud/aiplatform/v1beta1;aiplatform\252\002\037Go"
          + "ogle.Cloud.AIPlatform.V1Beta1\312\002\037Google\\C"
          + "loud\\AIPlatform\\V1beta1\352\002\"Google::Cloud:"
          + ":AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.DeployedIndexRefProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Index_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Index_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Index_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "MetadataSchemaUri",
              "Metadata",
              "DeployedIndexes",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Index_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Index_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Index_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Index_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.DeployedIndexRefProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
