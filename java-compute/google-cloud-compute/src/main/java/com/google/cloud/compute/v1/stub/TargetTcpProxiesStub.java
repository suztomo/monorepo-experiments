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

import static com.google.cloud.compute.v1.TargetTcpProxiesClient.ListPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteTargetTcpProxyRequest;
import com.google.cloud.compute.v1.GetTargetTcpProxyRequest;
import com.google.cloud.compute.v1.InsertTargetTcpProxyRequest;
import com.google.cloud.compute.v1.ListTargetTcpProxiesRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.SetBackendServiceTargetTcpProxyRequest;
import com.google.cloud.compute.v1.SetProxyHeaderTargetTcpProxyRequest;
import com.google.cloud.compute.v1.TargetTcpProxy;
import com.google.cloud.compute.v1.TargetTcpProxyList;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Compute Engine API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class TargetTcpProxiesStub implements BackgroundResource {

  public UnaryCallable<DeleteTargetTcpProxyRequest, Operation> deleteCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteCallable()");
  }

  public UnaryCallable<GetTargetTcpProxyRequest, TargetTcpProxy> getCallable() {
    throw new UnsupportedOperationException("Not implemented: getCallable()");
  }

  public UnaryCallable<InsertTargetTcpProxyRequest, Operation> insertCallable() {
    throw new UnsupportedOperationException("Not implemented: insertCallable()");
  }

  public UnaryCallable<ListTargetTcpProxiesRequest, ListPagedResponse> listPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listPagedCallable()");
  }

  public UnaryCallable<ListTargetTcpProxiesRequest, TargetTcpProxyList> listCallable() {
    throw new UnsupportedOperationException("Not implemented: listCallable()");
  }

  public UnaryCallable<SetBackendServiceTargetTcpProxyRequest, Operation>
      setBackendServiceCallable() {
    throw new UnsupportedOperationException("Not implemented: setBackendServiceCallable()");
  }

  public UnaryCallable<SetProxyHeaderTargetTcpProxyRequest, Operation> setProxyHeaderCallable() {
    throw new UnsupportedOperationException("Not implemented: setProxyHeaderCallable()");
  }

  @Override
  public abstract void close();
}
