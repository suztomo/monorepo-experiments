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

import static com.google.cloud.compute.v1.RegionTargetHttpsProxiesClient.ListPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteRegionTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.GetRegionTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.InsertRegionTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.ListRegionTargetHttpsProxiesRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.SetSslCertificatesRegionTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.SetUrlMapRegionTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.TargetHttpsProxy;
import com.google.cloud.compute.v1.TargetHttpsProxyList;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Compute Engine API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class RegionTargetHttpsProxiesStub implements BackgroundResource {

  public UnaryCallable<DeleteRegionTargetHttpsProxyRequest, Operation> deleteCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteCallable()");
  }

  public UnaryCallable<GetRegionTargetHttpsProxyRequest, TargetHttpsProxy> getCallable() {
    throw new UnsupportedOperationException("Not implemented: getCallable()");
  }

  public UnaryCallable<InsertRegionTargetHttpsProxyRequest, Operation> insertCallable() {
    throw new UnsupportedOperationException("Not implemented: insertCallable()");
  }

  public UnaryCallable<ListRegionTargetHttpsProxiesRequest, ListPagedResponse> listPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listPagedCallable()");
  }

  public UnaryCallable<ListRegionTargetHttpsProxiesRequest, TargetHttpsProxyList> listCallable() {
    throw new UnsupportedOperationException("Not implemented: listCallable()");
  }

  public UnaryCallable<SetSslCertificatesRegionTargetHttpsProxyRequest, Operation>
      setSslCertificatesCallable() {
    throw new UnsupportedOperationException("Not implemented: setSslCertificatesCallable()");
  }

  public UnaryCallable<SetUrlMapRegionTargetHttpsProxyRequest, Operation> setUrlMapCallable() {
    throw new UnsupportedOperationException("Not implemented: setUrlMapCallable()");
  }

  @Override
  public abstract void close();
}
