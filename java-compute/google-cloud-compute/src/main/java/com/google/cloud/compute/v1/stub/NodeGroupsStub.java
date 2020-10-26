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
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.NodeGroupsClient.AggregatedListPagedResponse;
import static com.google.cloud.compute.v1.NodeGroupsClient.ListNodesPagedResponse;
import static com.google.cloud.compute.v1.NodeGroupsClient.ListPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AddNodesNodeGroupRequest;
import com.google.cloud.compute.v1.AggregatedListNodeGroupsRequest;
import com.google.cloud.compute.v1.DeleteNodeGroupRequest;
import com.google.cloud.compute.v1.DeleteNodesNodeGroupRequest;
import com.google.cloud.compute.v1.GetIamPolicyNodeGroupRequest;
import com.google.cloud.compute.v1.GetNodeGroupRequest;
import com.google.cloud.compute.v1.InsertNodeGroupRequest;
import com.google.cloud.compute.v1.ListNodeGroupsRequest;
import com.google.cloud.compute.v1.ListNodesNodeGroupsRequest;
import com.google.cloud.compute.v1.NodeGroup;
import com.google.cloud.compute.v1.NodeGroupAggregatedList;
import com.google.cloud.compute.v1.NodeGroupList;
import com.google.cloud.compute.v1.NodeGroupsListNodes;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchNodeGroupRequest;
import com.google.cloud.compute.v1.Policy;
import com.google.cloud.compute.v1.SetIamPolicyNodeGroupRequest;
import com.google.cloud.compute.v1.SetNodeTemplateNodeGroupRequest;
import com.google.cloud.compute.v1.TestIamPermissionsNodeGroupRequest;
import com.google.cloud.compute.v1.TestPermissionsResponse;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Compute Engine API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class NodeGroupsStub implements BackgroundResource {

  public UnaryCallable<AddNodesNodeGroupRequest, Operation> addNodesCallable() {
    throw new UnsupportedOperationException("Not implemented: addNodesCallable()");
  }

  public UnaryCallable<AggregatedListNodeGroupsRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListPagedCallable()");
  }

  public UnaryCallable<AggregatedListNodeGroupsRequest, NodeGroupAggregatedList>
      aggregatedListCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListCallable()");
  }

  public UnaryCallable<DeleteNodeGroupRequest, Operation> deleteCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteCallable()");
  }

  public UnaryCallable<DeleteNodesNodeGroupRequest, Operation> deleteNodesCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteNodesCallable()");
  }

  public UnaryCallable<GetNodeGroupRequest, NodeGroup> getCallable() {
    throw new UnsupportedOperationException("Not implemented: getCallable()");
  }

  public UnaryCallable<GetIamPolicyNodeGroupRequest, Policy> getIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: getIamPolicyCallable()");
  }

  public UnaryCallable<InsertNodeGroupRequest, Operation> insertCallable() {
    throw new UnsupportedOperationException("Not implemented: insertCallable()");
  }

  public UnaryCallable<ListNodeGroupsRequest, ListPagedResponse> listPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listPagedCallable()");
  }

  public UnaryCallable<ListNodeGroupsRequest, NodeGroupList> listCallable() {
    throw new UnsupportedOperationException("Not implemented: listCallable()");
  }

  public UnaryCallable<ListNodesNodeGroupsRequest, ListNodesPagedResponse>
      listNodesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listNodesPagedCallable()");
  }

  public UnaryCallable<ListNodesNodeGroupsRequest, NodeGroupsListNodes> listNodesCallable() {
    throw new UnsupportedOperationException("Not implemented: listNodesCallable()");
  }

  public UnaryCallable<PatchNodeGroupRequest, Operation> patchCallable() {
    throw new UnsupportedOperationException("Not implemented: patchCallable()");
  }

  public UnaryCallable<SetIamPolicyNodeGroupRequest, Policy> setIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: setIamPolicyCallable()");
  }

  public UnaryCallable<SetNodeTemplateNodeGroupRequest, Operation> setNodeTemplateCallable() {
    throw new UnsupportedOperationException("Not implemented: setNodeTemplateCallable()");
  }

  public UnaryCallable<TestIamPermissionsNodeGroupRequest, TestPermissionsResponse>
      testIamPermissionsCallable() {
    throw new UnsupportedOperationException("Not implemented: testIamPermissionsCallable()");
  }

  @Override
  public abstract void close();
}
