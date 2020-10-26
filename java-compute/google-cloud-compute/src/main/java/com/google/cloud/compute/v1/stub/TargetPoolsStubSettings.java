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

import static com.google.cloud.compute.v1.TargetPoolsClient.AggregatedListPagedResponse;
import static com.google.cloud.compute.v1.TargetPoolsClient.ListPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AddHealthCheckTargetPoolRequest;
import com.google.cloud.compute.v1.AddInstanceTargetPoolRequest;
import com.google.cloud.compute.v1.AggregatedListTargetPoolsRequest;
import com.google.cloud.compute.v1.DeleteTargetPoolRequest;
import com.google.cloud.compute.v1.GetHealthTargetPoolRequest;
import com.google.cloud.compute.v1.GetTargetPoolRequest;
import com.google.cloud.compute.v1.InsertTargetPoolRequest;
import com.google.cloud.compute.v1.ListTargetPoolsRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.RemoveHealthCheckTargetPoolRequest;
import com.google.cloud.compute.v1.RemoveInstanceTargetPoolRequest;
import com.google.cloud.compute.v1.SetBackupTargetPoolRequest;
import com.google.cloud.compute.v1.TargetPool;
import com.google.cloud.compute.v1.TargetPoolAggregatedList;
import com.google.cloud.compute.v1.TargetPoolInstanceHealth;
import com.google.cloud.compute.v1.TargetPoolList;
import com.google.cloud.compute.v1.TargetPoolsScopedList;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link TargetPoolsStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (compute.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of addHealthCheck to 30 seconds:
 *
 * <pre>
 * <code>
 * TargetPoolsStubSettings.Builder targetPoolsSettingsBuilder =
 *     TargetPoolsStubSettings.newBuilder();
 * targetPoolsSettingsBuilder
 *     .addHealthCheckSettings()
 *     .setRetrySettings(
 *         targetPoolsSettingsBuilder.addHealthCheckSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * TargetPoolsStubSettings targetPoolsSettings = targetPoolsSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class TargetPoolsStubSettings extends StubSettings<TargetPoolsStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/compute.readonly")
          .build();

  private final UnaryCallSettings<AddHealthCheckTargetPoolRequest, Operation>
      addHealthCheckSettings;
  private final UnaryCallSettings<AddInstanceTargetPoolRequest, Operation> addInstanceSettings;
  private final PagedCallSettings<
          AggregatedListTargetPoolsRequest, TargetPoolAggregatedList, AggregatedListPagedResponse>
      aggregatedListSettings;
  private final UnaryCallSettings<DeleteTargetPoolRequest, Operation> deleteSettings;
  private final UnaryCallSettings<GetTargetPoolRequest, TargetPool> getSettings;
  private final UnaryCallSettings<GetHealthTargetPoolRequest, TargetPoolInstanceHealth>
      getHealthSettings;
  private final UnaryCallSettings<InsertTargetPoolRequest, Operation> insertSettings;
  private final PagedCallSettings<ListTargetPoolsRequest, TargetPoolList, ListPagedResponse>
      listSettings;
  private final UnaryCallSettings<RemoveHealthCheckTargetPoolRequest, Operation>
      removeHealthCheckSettings;
  private final UnaryCallSettings<RemoveInstanceTargetPoolRequest, Operation>
      removeInstanceSettings;
  private final UnaryCallSettings<SetBackupTargetPoolRequest, Operation> setBackupSettings;

  /** Returns the object with the settings used for calls to addHealthCheck. */
  public UnaryCallSettings<AddHealthCheckTargetPoolRequest, Operation> addHealthCheckSettings() {
    return addHealthCheckSettings;
  }

  /** Returns the object with the settings used for calls to addInstance. */
  public UnaryCallSettings<AddInstanceTargetPoolRequest, Operation> addInstanceSettings() {
    return addInstanceSettings;
  }

  /** Returns the object with the settings used for calls to aggregatedList. */
  public PagedCallSettings<
          AggregatedListTargetPoolsRequest, TargetPoolAggregatedList, AggregatedListPagedResponse>
      aggregatedListSettings() {
    return aggregatedListSettings;
  }

  /** Returns the object with the settings used for calls to delete. */
  public UnaryCallSettings<DeleteTargetPoolRequest, Operation> deleteSettings() {
    return deleteSettings;
  }

  /** Returns the object with the settings used for calls to get. */
  public UnaryCallSettings<GetTargetPoolRequest, TargetPool> getSettings() {
    return getSettings;
  }

  /** Returns the object with the settings used for calls to getHealth. */
  public UnaryCallSettings<GetHealthTargetPoolRequest, TargetPoolInstanceHealth>
      getHealthSettings() {
    return getHealthSettings;
  }

  /** Returns the object with the settings used for calls to insert. */
  public UnaryCallSettings<InsertTargetPoolRequest, Operation> insertSettings() {
    return insertSettings;
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<ListTargetPoolsRequest, TargetPoolList, ListPagedResponse>
      listSettings() {
    return listSettings;
  }

  /** Returns the object with the settings used for calls to removeHealthCheck. */
  public UnaryCallSettings<RemoveHealthCheckTargetPoolRequest, Operation>
      removeHealthCheckSettings() {
    return removeHealthCheckSettings;
  }

  /** Returns the object with the settings used for calls to removeInstance. */
  public UnaryCallSettings<RemoveInstanceTargetPoolRequest, Operation> removeInstanceSettings() {
    return removeInstanceSettings;
  }

  /** Returns the object with the settings used for calls to setBackup. */
  public UnaryCallSettings<SetBackupTargetPoolRequest, Operation> setBackupSettings() {
    return setBackupSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TargetPoolsStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonTargetPoolsStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "compute.googleapis.com";
  }

  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return 443;
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(TargetPoolsStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected TargetPoolsStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    addHealthCheckSettings = settingsBuilder.addHealthCheckSettings().build();
    addInstanceSettings = settingsBuilder.addInstanceSettings().build();
    aggregatedListSettings = settingsBuilder.aggregatedListSettings().build();
    deleteSettings = settingsBuilder.deleteSettings().build();
    getSettings = settingsBuilder.getSettings().build();
    getHealthSettings = settingsBuilder.getHealthSettings().build();
    insertSettings = settingsBuilder.insertSettings().build();
    listSettings = settingsBuilder.listSettings().build();
    removeHealthCheckSettings = settingsBuilder.removeHealthCheckSettings().build();
    removeInstanceSettings = settingsBuilder.removeInstanceSettings().build();
    setBackupSettings = settingsBuilder.setBackupSettings().build();
  }

  private static final PagedListDescriptor<
          AggregatedListTargetPoolsRequest,
          TargetPoolAggregatedList,
          Entry<String, TargetPoolsScopedList>>
      AGGREGATED_LIST_PAGE_STR_DESC =
          new PagedListDescriptor<
              AggregatedListTargetPoolsRequest,
              TargetPoolAggregatedList,
              Entry<String, TargetPoolsScopedList>>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public AggregatedListTargetPoolsRequest injectToken(
                AggregatedListTargetPoolsRequest payload, String token) {
              return AggregatedListTargetPoolsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public AggregatedListTargetPoolsRequest injectPageSize(
                AggregatedListTargetPoolsRequest payload, int pageSize) {
              return AggregatedListTargetPoolsRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(AggregatedListTargetPoolsRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(TargetPoolAggregatedList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Entry<String, TargetPoolsScopedList>> extractResources(
                TargetPoolAggregatedList payload) {
              return payload.getItemsMap() != null
                  ? payload.getItemsMap().entrySet()
                  : ImmutableList.<Entry<String, TargetPoolsScopedList>>of();
            }
          };

  private static final PagedListDescriptor<ListTargetPoolsRequest, TargetPoolList, TargetPool>
      LIST_PAGE_STR_DESC =
          new PagedListDescriptor<ListTargetPoolsRequest, TargetPoolList, TargetPool>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTargetPoolsRequest injectToken(
                ListTargetPoolsRequest payload, String token) {
              return ListTargetPoolsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTargetPoolsRequest injectPageSize(
                ListTargetPoolsRequest payload, int pageSize) {
              return ListTargetPoolsRequest.newBuilder(payload).setMaxResults(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTargetPoolsRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(TargetPoolList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TargetPool> extractResources(TargetPoolList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<TargetPool>of();
            }
          };

  private static final PagedListResponseFactory<
          AggregatedListTargetPoolsRequest, TargetPoolAggregatedList, AggregatedListPagedResponse>
      AGGREGATED_LIST_PAGE_STR_FACT =
          new PagedListResponseFactory<
              AggregatedListTargetPoolsRequest,
              TargetPoolAggregatedList,
              AggregatedListPagedResponse>() {
            @Override
            public ApiFuture<AggregatedListPagedResponse> getFuturePagedResponse(
                UnaryCallable<AggregatedListTargetPoolsRequest, TargetPoolAggregatedList> callable,
                AggregatedListTargetPoolsRequest request,
                ApiCallContext context,
                ApiFuture<TargetPoolAggregatedList> futureResponse) {
              PageContext<
                      AggregatedListTargetPoolsRequest,
                      TargetPoolAggregatedList,
                      Entry<String, TargetPoolsScopedList>>
                  pageContext =
                      PageContext.create(callable, AGGREGATED_LIST_PAGE_STR_DESC, request, context);
              return AggregatedListPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListTargetPoolsRequest, TargetPoolList, ListPagedResponse>
      LIST_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTargetPoolsRequest, TargetPoolList, ListPagedResponse>() {
            @Override
            public ApiFuture<ListPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTargetPoolsRequest, TargetPoolList> callable,
                ListTargetPoolsRequest request,
                ApiCallContext context,
                ApiFuture<TargetPoolList> futureResponse) {
              PageContext<ListTargetPoolsRequest, TargetPoolList, TargetPool> pageContext =
                  PageContext.create(callable, LIST_PAGE_STR_DESC, request, context);
              return ListPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for TargetPoolsStubSettings. */
  public static class Builder extends StubSettings.Builder<TargetPoolsStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<AddHealthCheckTargetPoolRequest, Operation>
        addHealthCheckSettings;
    private final UnaryCallSettings.Builder<AddInstanceTargetPoolRequest, Operation>
        addInstanceSettings;
    private final PagedCallSettings.Builder<
            AggregatedListTargetPoolsRequest, TargetPoolAggregatedList, AggregatedListPagedResponse>
        aggregatedListSettings;
    private final UnaryCallSettings.Builder<DeleteTargetPoolRequest, Operation> deleteSettings;
    private final UnaryCallSettings.Builder<GetTargetPoolRequest, TargetPool> getSettings;
    private final UnaryCallSettings.Builder<GetHealthTargetPoolRequest, TargetPoolInstanceHealth>
        getHealthSettings;
    private final UnaryCallSettings.Builder<InsertTargetPoolRequest, Operation> insertSettings;
    private final PagedCallSettings.Builder<
            ListTargetPoolsRequest, TargetPoolList, ListPagedResponse>
        listSettings;
    private final UnaryCallSettings.Builder<RemoveHealthCheckTargetPoolRequest, Operation>
        removeHealthCheckSettings;
    private final UnaryCallSettings.Builder<RemoveInstanceTargetPoolRequest, Operation>
        removeInstanceSettings;
    private final UnaryCallSettings.Builder<SetBackupTargetPoolRequest, Operation>
        setBackupSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      addHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      addInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      aggregatedListSettings = PagedCallSettings.newBuilder(AGGREGATED_LIST_PAGE_STR_FACT);

      deleteSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getHealthSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listSettings = PagedCallSettings.newBuilder(LIST_PAGE_STR_FACT);

      removeHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      removeInstanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setBackupSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              addHealthCheckSettings,
              addInstanceSettings,
              aggregatedListSettings,
              deleteSettings,
              getSettings,
              getHealthSettings,
              insertSettings,
              listSettings,
              removeHealthCheckSettings,
              removeInstanceSettings,
              setBackupSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .addHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .addInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .aggregatedListSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getHealthSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .removeHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .removeInstanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setBackupSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(TargetPoolsStubSettings settings) {
      super(settings);

      addHealthCheckSettings = settings.addHealthCheckSettings.toBuilder();
      addInstanceSettings = settings.addInstanceSettings.toBuilder();
      aggregatedListSettings = settings.aggregatedListSettings.toBuilder();
      deleteSettings = settings.deleteSettings.toBuilder();
      getSettings = settings.getSettings.toBuilder();
      getHealthSettings = settings.getHealthSettings.toBuilder();
      insertSettings = settings.insertSettings.toBuilder();
      listSettings = settings.listSettings.toBuilder();
      removeHealthCheckSettings = settings.removeHealthCheckSettings.toBuilder();
      removeInstanceSettings = settings.removeInstanceSettings.toBuilder();
      setBackupSettings = settings.setBackupSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              addHealthCheckSettings,
              addInstanceSettings,
              aggregatedListSettings,
              deleteSettings,
              getSettings,
              getHealthSettings,
              insertSettings,
              listSettings,
              removeHealthCheckSettings,
              removeInstanceSettings,
              setBackupSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to addHealthCheck. */
    public UnaryCallSettings.Builder<AddHealthCheckTargetPoolRequest, Operation>
        addHealthCheckSettings() {
      return addHealthCheckSettings;
    }

    /** Returns the builder for the settings used for calls to addInstance. */
    public UnaryCallSettings.Builder<AddInstanceTargetPoolRequest, Operation>
        addInstanceSettings() {
      return addInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to aggregatedList. */
    public PagedCallSettings.Builder<
            AggregatedListTargetPoolsRequest, TargetPoolAggregatedList, AggregatedListPagedResponse>
        aggregatedListSettings() {
      return aggregatedListSettings;
    }

    /** Returns the builder for the settings used for calls to delete. */
    public UnaryCallSettings.Builder<DeleteTargetPoolRequest, Operation> deleteSettings() {
      return deleteSettings;
    }

    /** Returns the builder for the settings used for calls to get. */
    public UnaryCallSettings.Builder<GetTargetPoolRequest, TargetPool> getSettings() {
      return getSettings;
    }

    /** Returns the builder for the settings used for calls to getHealth. */
    public UnaryCallSettings.Builder<GetHealthTargetPoolRequest, TargetPoolInstanceHealth>
        getHealthSettings() {
      return getHealthSettings;
    }

    /** Returns the builder for the settings used for calls to insert. */
    public UnaryCallSettings.Builder<InsertTargetPoolRequest, Operation> insertSettings() {
      return insertSettings;
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<ListTargetPoolsRequest, TargetPoolList, ListPagedResponse>
        listSettings() {
      return listSettings;
    }

    /** Returns the builder for the settings used for calls to removeHealthCheck. */
    public UnaryCallSettings.Builder<RemoveHealthCheckTargetPoolRequest, Operation>
        removeHealthCheckSettings() {
      return removeHealthCheckSettings;
    }

    /** Returns the builder for the settings used for calls to removeInstance. */
    public UnaryCallSettings.Builder<RemoveInstanceTargetPoolRequest, Operation>
        removeInstanceSettings() {
      return removeInstanceSettings;
    }

    /** Returns the builder for the settings used for calls to setBackup. */
    public UnaryCallSettings.Builder<SetBackupTargetPoolRequest, Operation> setBackupSettings() {
      return setBackupSettings;
    }

    @Override
    public TargetPoolsStubSettings build() throws IOException {
      return new TargetPoolsStubSettings(this);
    }
  }
}
