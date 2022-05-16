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
// source: google/cloud/talent/v4beta1/job_service.proto

package com.google.cloud.talent.v4beta1;

public final class JobServiceProto {
  private JobServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CreateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_GetJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_GetJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_DeleteJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeleteJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_BatchDeleteJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_BatchDeleteJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_CustomRankingInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_CustomRankingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_MatchingJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_MatchingJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_CommuteInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_CommuteInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_BatchCreateJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_BatchCreateJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_BatchUpdateJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_BatchUpdateJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_JobOperationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_JobOperationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_JobOperationResult_JobResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_JobOperationResult_JobResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/talent/v4beta1/job_servic"
          + "e.proto\022\033google.cloud.talent.v4beta1\032\034go"
          + "ogle/api/annotations.proto\032\027google/api/c"
          + "lient.proto\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032(google/"
          + "cloud/talent/v4beta1/common.proto\032)googl"
          + "e/cloud/talent/v4beta1/filters.proto\032+go"
          + "ogle/cloud/talent/v4beta1/histogram.prot"
          + "o\032%google/cloud/talent/v4beta1/job.proto"
          + "\032#google/longrunning/operations.proto\032\031g"
          + "oogle/protobuf/any.proto\032\036google/protobu"
          + "f/duration.proto\032\033google/protobuf/empty."
          + "proto\032 google/protobuf/field_mask.proto\032"
          + "\027google/rpc/status.proto\"w\n\020CreateJobReq"
          + "uest\022/\n\006parent\030\001 \001(\tB\037\340A\002\372A\031\022\027jobs.googl"
          + "eapis.com/Job\0222\n\003job\030\002 \001(\0132 .google.clou"
          + "d.talent.v4beta1.JobB\003\340A\002\">\n\rGetJobReque"
          + "st\022-\n\004name\030\001 \001(\tB\037\340A\002\372A\031\n\027jobs.googleapi"
          + "s.com/Job\"w\n\020UpdateJobRequest\0222\n\003job\030\001 \001"
          + "(\0132 .google.cloud.talent.v4beta1.JobB\003\340A"
          + "\002\022/\n\013update_mask\030\002 \001(\0132\032.google.protobuf"
          + ".FieldMask\"A\n\020DeleteJobRequest\022-\n\004name\030\001"
          + " \001(\tB\037\340A\002\372A\031\n\027jobs.googleapis.com/Job\"^\n"
          + "\026BatchDeleteJobsRequest\022/\n\006parent\030\001 \001(\tB"
          + "\037\340A\002\372A\031\022\027jobs.googleapis.com/Job\022\023\n\006filt"
          + "er\030\002 \001(\tB\003\340A\002\"\266\001\n\017ListJobsRequest\022/\n\006par"
          + "ent\030\001 \001(\tB\037\340A\002\372A\031\022\027jobs.googleapis.com/J"
          + "ob\022\023\n\006filter\030\002 \001(\tB\003\340A\002\022\022\n\npage_token\030\003 "
          + "\001(\t\022\021\n\tpage_size\030\004 \001(\005\0226\n\010job_view\030\005 \001(\016"
          + "2$.google.cloud.talent.v4beta1.JobView\"\234"
          + "\001\n\020ListJobsResponse\022.\n\004jobs\030\001 \003(\0132 .goog"
          + "le.cloud.talent.v4beta1.Job\022\027\n\017next_page"
          + "_token\030\002 \001(\t\022?\n\010metadata\030\003 \001(\0132-.google."
          + "cloud.talent.v4beta1.ResponseMetadata\"\320\t"
          + "\n\021SearchJobsRequest\022/\n\006parent\030\001 \001(\tB\037\340A\002"
          + "\372A\031\022\027jobs.googleapis.com/Job\022N\n\013search_m"
          + "ode\030\002 \001(\01629.google.cloud.talent.v4beta1."
          + "SearchJobsRequest.SearchMode\022K\n\020request_"
          + "metadata\030\003 \001(\0132,.google.cloud.talent.v4b"
          + "eta1.RequestMetadataB\003\340A\002\0228\n\tjob_query\030\004"
          + " \001(\0132%.google.cloud.talent.v4beta1.JobQu"
          + "ery\022\031\n\021enable_broadening\030\005 \001(\010\022#\n\033requir"
          + "e_precise_result_size\030\006 \001(\010\022F\n\021histogram"
          + "_queries\030\007 \003(\0132+.google.cloud.talent.v4b"
          + "eta1.HistogramQuery\0226\n\010job_view\030\010 \001(\0162$."
          + "google.cloud.talent.v4beta1.JobView\022\016\n\006o"
          + "ffset\030\t \001(\005\022\021\n\tpage_size\030\n \001(\005\022\022\n\npage_t"
          + "oken\030\013 \001(\t\022\020\n\010order_by\030\014 \001(\t\022b\n\025diversif"
          + "ication_level\030\r \001(\0162C.google.cloud.talen"
          + "t.v4beta1.SearchJobsRequest.Diversificat"
          + "ionLevel\022]\n\023custom_ranking_info\030\016 \001(\0132@."
          + "google.cloud.talent.v4beta1.SearchJobsRe"
          + "quest.CustomRankingInfo\022\035\n\025disable_keywo"
          + "rd_match\030\020 \001(\010\032\232\002\n\021CustomRankingInfo\022o\n\020"
          + "importance_level\030\001 \001(\0162P.google.cloud.ta"
          + "lent.v4beta1.SearchJobsRequest.CustomRan"
          + "kingInfo.ImportanceLevelB\003\340A\002\022\037\n\022ranking"
          + "_expression\030\002 \001(\tB\003\340A\002\"s\n\017ImportanceLeve"
          + "l\022 \n\034IMPORTANCE_LEVEL_UNSPECIFIED\020\000\022\010\n\004N"
          + "ONE\020\001\022\007\n\003LOW\020\002\022\010\n\004MILD\020\003\022\n\n\006MEDIUM\020\004\022\010\n\004"
          + "HIGH\020\005\022\013\n\007EXTREME\020\006\"R\n\nSearchMode\022\033\n\027SEA"
          + "RCH_MODE_UNSPECIFIED\020\000\022\016\n\nJOB_SEARCH\020\001\022\027"
          + "\n\023FEATURED_JOB_SEARCH\020\002\"W\n\024Diversificati"
          + "onLevel\022%\n!DIVERSIFICATION_LEVEL_UNSPECI"
          + "FIED\020\000\022\014\n\010DISABLED\020\001\022\n\n\006SIMPLE\020\002\"\327\006\n\022Sea"
          + "rchJobsResponse\022R\n\rmatching_jobs\030\001 \003(\0132;"
          + ".google.cloud.talent.v4beta1.SearchJobsR"
          + "esponse.MatchingJob\022R\n\027histogram_query_r"
          + "esults\030\002 \003(\01321.google.cloud.talent.v4bet"
          + "a1.HistogramQueryResult\022\027\n\017next_page_tok"
          + "en\030\003 \001(\t\022?\n\020location_filters\030\004 \003(\0132%.goo"
          + "gle.cloud.talent.v4beta1.Location\022\034\n\024est"
          + "imated_total_size\030\005 \001(\005\022\022\n\ntotal_size\030\006 "
          + "\001(\005\022?\n\010metadata\030\007 \001(\0132-.google.cloud.tal"
          + "ent.v4beta1.ResponseMetadata\022\"\n\032broadene"
          + "d_query_jobs_count\030\010 \001(\005\022I\n\020spell_correc"
          + "tion\030\t \001(\0132/.google.cloud.talent.v4beta1"
          + ".SpellingCorrection\032\334\001\n\013MatchingJob\022-\n\003j"
          + "ob\030\001 \001(\0132 .google.cloud.talent.v4beta1.J"
          + "ob\022\023\n\013job_summary\030\002 \001(\t\022\031\n\021job_title_sni"
          + "ppet\030\003 \001(\t\022\033\n\023search_text_snippet\030\004 \001(\t\022"
          + "Q\n\014commute_info\030\005 \001(\0132;.google.cloud.tal"
          + "ent.v4beta1.SearchJobsResponse.CommuteIn"
          + "fo\032~\n\013CommuteInfo\022;\n\014job_location\030\001 \001(\0132"
          + "%.google.cloud.talent.v4beta1.Location\0222"
          + "\n\017travel_duration\030\002 \001(\0132\031.google.protobu"
          + "f.Duration\"~\n\026BatchCreateJobsRequest\022/\n\006"
          + "parent\030\001 \001(\tB\037\340A\002\372A\031\022\027jobs.googleapis.co"
          + "m/Job\0223\n\004jobs\030\002 \003(\0132 .google.cloud.talen"
          + "t.v4beta1.JobB\003\340A\002\"\257\001\n\026BatchUpdateJobsRe"
          + "quest\022/\n\006parent\030\001 \001(\tB\037\340A\002\372A\031\022\027jobs.goog"
          + "leapis.com/Job\0223\n\004jobs\030\002 \003(\0132 .google.cl"
          + "oud.talent.v4beta1.JobB\003\340A\002\022/\n\013update_ma"
          + "sk\030\003 \001(\0132\032.google.protobuf.FieldMask\"\304\001\n"
          + "\022JobOperationResult\022N\n\013job_results\030\001 \003(\013"
          + "29.google.cloud.talent.v4beta1.JobOperat"
          + "ionResult.JobResult\032^\n\tJobResult\022-\n\003job\030"
          + "\001 \001(\0132 .google.cloud.talent.v4beta1.Job\022"
          + "\"\n\006status\030\002 \001(\0132\022.google.rpc.Status*v\n\007J"
          + "obView\022\030\n\024JOB_VIEW_UNSPECIFIED\020\000\022\024\n\020JOB_"
          + "VIEW_ID_ONLY\020\001\022\024\n\020JOB_VIEW_MINIMAL\020\002\022\022\n\016"
          + "JOB_VIEW_SMALL\020\003\022\021\n\rJOB_VIEW_FULL\020\0042\316\022\n\n"
          + "JobService\022\311\001\n\tCreateJob\022-.google.cloud."
          + "talent.v4beta1.CreateJobRequest\032 .google"
          + ".cloud.talent.v4beta1.Job\"k\202\323\344\223\002X\"+/v4be"
          + "ta1/{parent=projects/*/tenants/*}/jobs:\001"
          + "*Z&\"!/v4beta1/{parent=projects/*}/jobs:\001"
          + "*\332A\nparent,job\022\233\002\n\017BatchCreateJobs\0223.goo"
          + "gle.cloud.talent.v4beta1.BatchCreateJobs"
          + "Request\032\035.google.longrunning.Operation\"\263"
          + "\001\202\323\344\223\002p\"7/v4beta1/{parent=projects/*/ten"
          + "ants/*}/jobs:batchCreate:\001*Z2\"-/v4beta1/"
          + "{parent=projects/*}/jobs:batchCreate:\001*\332"
          + "A\013parent,jobs\312A,\n\022JobOperationResult\022\026Ba"
          + "tchOperationMetadata\022\267\001\n\006GetJob\022*.google"
          + ".cloud.talent.v4beta1.GetJobRequest\032 .go"
          + "ogle.cloud.talent.v4beta1.Job\"_\202\323\344\223\002R\022+/"
          + "v4beta1/{name=projects/*/tenants/*/jobs/"
          + "*}Z#\022!/v4beta1/{name=projects/*/jobs/*}\332"
          + "A\004name\022\312\001\n\tUpdateJob\022-.google.cloud.tale"
          + "nt.v4beta1.UpdateJobRequest\032 .google.clo"
          + "ud.talent.v4beta1.Job\"l\202\323\344\223\002`2//v4beta1/"
          + "{job.name=projects/*/tenants/*/jobs/*}:\001"
          + "*Z*2%/v4beta1/{job.name=projects/*/jobs/"
          + "*}:\001*\332A\003job\022\233\002\n\017BatchUpdateJobs\0223.google"
          + ".cloud.talent.v4beta1.BatchUpdateJobsReq"
          + "uest\032\035.google.longrunning.Operation\"\263\001\202\323"
          + "\344\223\002p\"7/v4beta1/{parent=projects/*/tenant"
          + "s/*}/jobs:batchUpdate:\001*Z2\"-/v4beta1/{pa"
          + "rent=projects/*}/jobs:batchUpdate:\001*\332A\013p"
          + "arent,jobs\312A,\n\022JobOperationResult\022\026Batch"
          + "OperationMetadata\022\263\001\n\tDeleteJob\022-.google"
          + ".cloud.talent.v4beta1.DeleteJobRequest\032\026"
          + ".google.protobuf.Empty\"_\202\323\344\223\002R*+/v4beta1"
          + "/{name=projects/*/tenants/*/jobs/*}Z#*!/"
          + "v4beta1/{name=projects/*/jobs/*}\332A\004name\022"
          + "\344\001\n\017BatchDeleteJobs\0223.google.cloud.talen"
          + "t.v4beta1.BatchDeleteJobsRequest\032\026.googl"
          + "e.protobuf.Empty\"\203\001\202\323\344\223\002m\"7/v4beta1/{par"
          + "ent=projects/*/tenants/*}/jobs:batchDele"
          + "te:\001*Z/\"-/v4beta1/{parent=projects/*}/jo"
          + "bs:batchDelete\332A\rparent,filter\022\321\001\n\010ListJ"
          + "obs\022,.google.cloud.talent.v4beta1.ListJo"
          + "bsRequest\032-.google.cloud.talent.v4beta1."
          + "ListJobsResponse\"h\202\323\344\223\002R\022+/v4beta1/{pare"
          + "nt=projects/*/tenants/*}/jobsZ#\022!/v4beta"
          + "1/{parent=projects/*}/jobs\332A\rparent,filt"
          + "er\022\333\001\n\nSearchJobs\022..google.cloud.talent."
          + "v4beta1.SearchJobsRequest\032/.google.cloud"
          + ".talent.v4beta1.SearchJobsResponse\"l\202\323\344\223"
          + "\002f\"2/v4beta1/{parent=projects/*/tenants/"
          + "*}/jobs:search:\001*Z-\"(/v4beta1/{parent=pr"
          + "ojects/*}/jobs:search:\001*\022\363\001\n\022SearchJobsF"
          + "orAlert\022..google.cloud.talent.v4beta1.Se"
          + "archJobsRequest\032/.google.cloud.talent.v4"
          + "beta1.SearchJobsResponse\"|\202\323\344\223\002v\":/v4bet"
          + "a1/{parent=projects/*/tenants/*}/jobs:se"
          + "archForAlert:\001*Z5\"0/v4beta1/{parent=proj"
          + "ects/*}/jobs:searchForAlert:\001*\032l\312A\023jobs."
          + "googleapis.com\322AShttps://www.googleapis."
          + "com/auth/cloud-platform,https://www.goog"
          + "leapis.com/auth/jobsB}\n\037com.google.cloud"
          + ".talent.v4beta1B\017JobServiceProtoP\001ZAgoog"
          + "le.golang.org/genproto/googleapis/cloud/"
          + "talent/v4beta1;talent\242\002\003CTSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.FiltersProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.HistogramProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.JobResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4beta1_CreateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CreateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CreateJobRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Job",
            });
    internal_static_google_cloud_talent_v4beta1_GetJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_GetJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_GetJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_UpdateJobRequest_descriptor,
            new java.lang.String[] {
              "Job", "UpdateMask",
            });
    internal_static_google_cloud_talent_v4beta1_DeleteJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_DeleteJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_DeleteJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_BatchDeleteJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_BatchDeleteJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_BatchDeleteJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter",
            });
    internal_static_google_cloud_talent_v4beta1_ListJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_ListJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageToken", "PageSize", "JobView",
            });
    internal_static_google_cloud_talent_v4beta1_ListJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_talent_v4beta1_ListJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListJobsResponse_descriptor,
            new java.lang.String[] {
              "Jobs", "NextPageToken", "Metadata",
            });
    internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "SearchMode",
              "RequestMetadata",
              "JobQuery",
              "EnableBroadening",
              "RequirePreciseResultSize",
              "HistogramQueries",
              "JobView",
              "Offset",
              "PageSize",
              "PageToken",
              "OrderBy",
              "DiversificationLevel",
              "CustomRankingInfo",
              "DisableKeywordMatch",
            });
    internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_CustomRankingInfo_descriptor =
        internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_CustomRankingInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchJobsRequest_CustomRankingInfo_descriptor,
            new java.lang.String[] {
              "ImportanceLevel", "RankingExpression",
            });
    internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_descriptor,
            new java.lang.String[] {
              "MatchingJobs",
              "HistogramQueryResults",
              "NextPageToken",
              "LocationFilters",
              "EstimatedTotalSize",
              "TotalSize",
              "Metadata",
              "BroadenedQueryJobsCount",
              "SpellCorrection",
            });
    internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_MatchingJob_descriptor =
        internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_MatchingJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_MatchingJob_descriptor,
            new java.lang.String[] {
              "Job", "JobSummary", "JobTitleSnippet", "SearchTextSnippet", "CommuteInfo",
            });
    internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_CommuteInfo_descriptor =
        internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_CommuteInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SearchJobsResponse_CommuteInfo_descriptor,
            new java.lang.String[] {
              "JobLocation", "TravelDuration",
            });
    internal_static_google_cloud_talent_v4beta1_BatchCreateJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_talent_v4beta1_BatchCreateJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_BatchCreateJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Jobs",
            });
    internal_static_google_cloud_talent_v4beta1_BatchUpdateJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_talent_v4beta1_BatchUpdateJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_BatchUpdateJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Jobs", "UpdateMask",
            });
    internal_static_google_cloud_talent_v4beta1_JobOperationResult_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_talent_v4beta1_JobOperationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_JobOperationResult_descriptor,
            new java.lang.String[] {
              "JobResults",
            });
    internal_static_google_cloud_talent_v4beta1_JobOperationResult_JobResult_descriptor =
        internal_static_google_cloud_talent_v4beta1_JobOperationResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_talent_v4beta1_JobOperationResult_JobResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_JobOperationResult_JobResult_descriptor,
            new java.lang.String[] {
              "Job", "Status",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.cloud.talent.v4beta1.FiltersProto.getDescriptor();
    com.google.cloud.talent.v4beta1.HistogramProto.getDescriptor();
    com.google.cloud.talent.v4beta1.JobResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
