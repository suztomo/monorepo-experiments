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
// source: google/cloud/aiplatform/v1/model_evaluation.proto

package com.google.cloud.aiplatform.v1;

public final class ModelEvaluationProto {
  private ModelEvaluationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelEvaluation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelEvaluation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelEvaluation_ModelEvaluationExplanationSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelEvaluation_ModelEvaluationExplanationSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1/model_evalu"
          + "ation.proto\022\032google.cloud.aiplatform.v1\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032,google/cloud/aiplat"
          + "form/v1/explanation.proto\032\034google/protob"
          + "uf/struct.proto\032\037google/protobuf/timesta"
          + "mp.proto\"\253\005\n\017ModelEvaluation\022\021\n\004name\030\001 \001"
          + "(\tB\003\340A\003\022\032\n\022metrics_schema_uri\030\002 \001(\t\022\'\n\007m"
          + "etrics\030\003 \001(\0132\026.google.protobuf.Value\0224\n\013"
          + "create_time\030\004 \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\003\022\030\n\020slice_dimensions\030\005 \003(\t\022\034\n\024"
          + "data_item_schema_uri\030\006 \001(\t\022\035\n\025annotation"
          + "_schema_uri\030\007 \001(\t\022G\n\021model_explanation\030\010"
          + " \001(\0132,.google.cloud.aiplatform.v1.ModelE"
          + "xplanation\022e\n\021explanation_specs\030\t \003(\0132J."
          + "google.cloud.aiplatform.v1.ModelEvaluati"
          + "on.ModelEvaluationExplanationSpec\032\201\001\n\036Mo"
          + "delEvaluationExplanationSpec\022\030\n\020explanat"
          + "ion_type\030\001 \001(\t\022E\n\020explanation_spec\030\002 \001(\013"
          + "2+.google.cloud.aiplatform.v1.Explanatio"
          + "nSpec:\177\352A|\n)aiplatform.googleapis.com/Mo"
          + "delEvaluation\022Oprojects/{project}/locati"
          + "ons/{location}/models/{model}/evaluation"
          + "s/{evaluation}B\330\001\n\036com.google.cloud.aipl"
          + "atform.v1B\024ModelEvaluationProtoP\001ZDgoogl"
          + "e.golang.org/genproto/googleapis/cloud/a"
          + "iplatform/v1;aiplatform\252\002\032Google.Cloud.A"
          + "IPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V"
          + "1\352\002\035Google::Cloud::AIPlatform::V1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_ModelEvaluation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ModelEvaluation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelEvaluation_descriptor,
            new java.lang.String[] {
              "Name",
              "MetricsSchemaUri",
              "Metrics",
              "CreateTime",
              "SliceDimensions",
              "DataItemSchemaUri",
              "AnnotationSchemaUri",
              "ModelExplanation",
              "ExplanationSpecs",
            });
    internal_static_google_cloud_aiplatform_v1_ModelEvaluation_ModelEvaluationExplanationSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_ModelEvaluation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_ModelEvaluation_ModelEvaluationExplanationSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelEvaluation_ModelEvaluationExplanationSpec_descriptor,
            new java.lang.String[] {
              "ExplanationType", "ExplanationSpec",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
