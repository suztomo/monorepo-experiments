/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.gaming.v1.stub;

import static com.google.cloud.gaming.v1.RealmsServiceClient.ListRealmsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.gaming.v1.CreateRealmRequest;
import com.google.cloud.gaming.v1.DeleteRealmRequest;
import com.google.cloud.gaming.v1.GetRealmRequest;
import com.google.cloud.gaming.v1.ListRealmsRequest;
import com.google.cloud.gaming.v1.ListRealmsResponse;
import com.google.cloud.gaming.v1.OperationMetadata;
import com.google.cloud.gaming.v1.PreviewRealmUpdateRequest;
import com.google.cloud.gaming.v1.PreviewRealmUpdateResponse;
import com.google.cloud.gaming.v1.Realm;
import com.google.cloud.gaming.v1.UpdateRealmRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link RealmsServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (gameservices.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getRealm to 30 seconds:
 *
 * <pre>{@code
 * RealmsServiceStubSettings.Builder realmsServiceSettingsBuilder =
 *     RealmsServiceStubSettings.newBuilder();
 * realmsServiceSettingsBuilder
 *     .getRealmSettings()
 *     .setRetrySettings(
 *         realmsServiceSettingsBuilder
 *             .getRealmSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * RealmsServiceStubSettings realmsServiceSettings = realmsServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class RealmsServiceStubSettings extends StubSettings<RealmsServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final PagedCallSettings<ListRealmsRequest, ListRealmsResponse, ListRealmsPagedResponse>
      listRealmsSettings;
  private final UnaryCallSettings<GetRealmRequest, Realm> getRealmSettings;
  private final UnaryCallSettings<CreateRealmRequest, Operation> createRealmSettings;
  private final OperationCallSettings<CreateRealmRequest, Realm, OperationMetadata>
      createRealmOperationSettings;
  private final UnaryCallSettings<DeleteRealmRequest, Operation> deleteRealmSettings;
  private final OperationCallSettings<DeleteRealmRequest, Empty, OperationMetadata>
      deleteRealmOperationSettings;
  private final UnaryCallSettings<UpdateRealmRequest, Operation> updateRealmSettings;
  private final OperationCallSettings<UpdateRealmRequest, Realm, OperationMetadata>
      updateRealmOperationSettings;
  private final UnaryCallSettings<PreviewRealmUpdateRequest, PreviewRealmUpdateResponse>
      previewRealmUpdateSettings;

  private static final PagedListDescriptor<ListRealmsRequest, ListRealmsResponse, Realm>
      LIST_REALMS_PAGE_STR_DESC =
          new PagedListDescriptor<ListRealmsRequest, ListRealmsResponse, Realm>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListRealmsRequest injectToken(ListRealmsRequest payload, String token) {
              return ListRealmsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListRealmsRequest injectPageSize(ListRealmsRequest payload, int pageSize) {
              return ListRealmsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListRealmsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListRealmsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Realm> extractResources(ListRealmsResponse payload) {
              return payload.getRealmsList() == null
                  ? ImmutableList.<Realm>of()
                  : payload.getRealmsList();
            }
          };

  private static final PagedListResponseFactory<
          ListRealmsRequest, ListRealmsResponse, ListRealmsPagedResponse>
      LIST_REALMS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListRealmsRequest, ListRealmsResponse, ListRealmsPagedResponse>() {
            @Override
            public ApiFuture<ListRealmsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListRealmsRequest, ListRealmsResponse> callable,
                ListRealmsRequest request,
                ApiCallContext context,
                ApiFuture<ListRealmsResponse> futureResponse) {
              PageContext<ListRealmsRequest, ListRealmsResponse, Realm> pageContext =
                  PageContext.create(callable, LIST_REALMS_PAGE_STR_DESC, request, context);
              return ListRealmsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listRealms. */
  public PagedCallSettings<ListRealmsRequest, ListRealmsResponse, ListRealmsPagedResponse>
      listRealmsSettings() {
    return listRealmsSettings;
  }

  /** Returns the object with the settings used for calls to getRealm. */
  public UnaryCallSettings<GetRealmRequest, Realm> getRealmSettings() {
    return getRealmSettings;
  }

  /** Returns the object with the settings used for calls to createRealm. */
  public UnaryCallSettings<CreateRealmRequest, Operation> createRealmSettings() {
    return createRealmSettings;
  }

  /** Returns the object with the settings used for calls to createRealm. */
  public OperationCallSettings<CreateRealmRequest, Realm, OperationMetadata>
      createRealmOperationSettings() {
    return createRealmOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteRealm. */
  public UnaryCallSettings<DeleteRealmRequest, Operation> deleteRealmSettings() {
    return deleteRealmSettings;
  }

  /** Returns the object with the settings used for calls to deleteRealm. */
  public OperationCallSettings<DeleteRealmRequest, Empty, OperationMetadata>
      deleteRealmOperationSettings() {
    return deleteRealmOperationSettings;
  }

  /** Returns the object with the settings used for calls to updateRealm. */
  public UnaryCallSettings<UpdateRealmRequest, Operation> updateRealmSettings() {
    return updateRealmSettings;
  }

  /** Returns the object with the settings used for calls to updateRealm. */
  public OperationCallSettings<UpdateRealmRequest, Realm, OperationMetadata>
      updateRealmOperationSettings() {
    return updateRealmOperationSettings;
  }

  /** Returns the object with the settings used for calls to previewRealmUpdate. */
  public UnaryCallSettings<PreviewRealmUpdateRequest, PreviewRealmUpdateResponse>
      previewRealmUpdateSettings() {
    return previewRealmUpdateSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RealmsServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcRealmsServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "gameservices.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "gameservices.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(RealmsServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
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

  protected RealmsServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listRealmsSettings = settingsBuilder.listRealmsSettings().build();
    getRealmSettings = settingsBuilder.getRealmSettings().build();
    createRealmSettings = settingsBuilder.createRealmSettings().build();
    createRealmOperationSettings = settingsBuilder.createRealmOperationSettings().build();
    deleteRealmSettings = settingsBuilder.deleteRealmSettings().build();
    deleteRealmOperationSettings = settingsBuilder.deleteRealmOperationSettings().build();
    updateRealmSettings = settingsBuilder.updateRealmSettings().build();
    updateRealmOperationSettings = settingsBuilder.updateRealmOperationSettings().build();
    previewRealmUpdateSettings = settingsBuilder.previewRealmUpdateSettings().build();
  }

  /** Builder for RealmsServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<RealmsServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListRealmsRequest, ListRealmsResponse, ListRealmsPagedResponse>
        listRealmsSettings;
    private final UnaryCallSettings.Builder<GetRealmRequest, Realm> getRealmSettings;
    private final UnaryCallSettings.Builder<CreateRealmRequest, Operation> createRealmSettings;
    private final OperationCallSettings.Builder<CreateRealmRequest, Realm, OperationMetadata>
        createRealmOperationSettings;
    private final UnaryCallSettings.Builder<DeleteRealmRequest, Operation> deleteRealmSettings;
    private final OperationCallSettings.Builder<DeleteRealmRequest, Empty, OperationMetadata>
        deleteRealmOperationSettings;
    private final UnaryCallSettings.Builder<UpdateRealmRequest, Operation> updateRealmSettings;
    private final OperationCallSettings.Builder<UpdateRealmRequest, Realm, OperationMetadata>
        updateRealmOperationSettings;
    private final UnaryCallSettings.Builder<PreviewRealmUpdateRequest, PreviewRealmUpdateResponse>
        previewRealmUpdateSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(10000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listRealmsSettings = PagedCallSettings.newBuilder(LIST_REALMS_PAGE_STR_FACT);
      getRealmSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createRealmSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createRealmOperationSettings = OperationCallSettings.newBuilder();
      deleteRealmSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteRealmOperationSettings = OperationCallSettings.newBuilder();
      updateRealmSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateRealmOperationSettings = OperationCallSettings.newBuilder();
      previewRealmUpdateSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listRealmsSettings,
              getRealmSettings,
              createRealmSettings,
              deleteRealmSettings,
              updateRealmSettings,
              previewRealmUpdateSettings);
      initDefaults(this);
    }

    protected Builder(RealmsServiceStubSettings settings) {
      super(settings);

      listRealmsSettings = settings.listRealmsSettings.toBuilder();
      getRealmSettings = settings.getRealmSettings.toBuilder();
      createRealmSettings = settings.createRealmSettings.toBuilder();
      createRealmOperationSettings = settings.createRealmOperationSettings.toBuilder();
      deleteRealmSettings = settings.deleteRealmSettings.toBuilder();
      deleteRealmOperationSettings = settings.deleteRealmOperationSettings.toBuilder();
      updateRealmSettings = settings.updateRealmSettings.toBuilder();
      updateRealmOperationSettings = settings.updateRealmOperationSettings.toBuilder();
      previewRealmUpdateSettings = settings.previewRealmUpdateSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listRealmsSettings,
              getRealmSettings,
              createRealmSettings,
              deleteRealmSettings,
              updateRealmSettings,
              previewRealmUpdateSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .listRealmsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getRealmSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createRealmSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteRealmSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updateRealmSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .previewRealmUpdateSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createRealmOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<CreateRealmRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Realm.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteRealmOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<DeleteRealmRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .updateRealmOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<UpdateRealmRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Realm.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to listRealms. */
    public PagedCallSettings.Builder<ListRealmsRequest, ListRealmsResponse, ListRealmsPagedResponse>
        listRealmsSettings() {
      return listRealmsSettings;
    }

    /** Returns the builder for the settings used for calls to getRealm. */
    public UnaryCallSettings.Builder<GetRealmRequest, Realm> getRealmSettings() {
      return getRealmSettings;
    }

    /** Returns the builder for the settings used for calls to createRealm. */
    public UnaryCallSettings.Builder<CreateRealmRequest, Operation> createRealmSettings() {
      return createRealmSettings;
    }

    /** Returns the builder for the settings used for calls to createRealm. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<CreateRealmRequest, Realm, OperationMetadata>
        createRealmOperationSettings() {
      return createRealmOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteRealm. */
    public UnaryCallSettings.Builder<DeleteRealmRequest, Operation> deleteRealmSettings() {
      return deleteRealmSettings;
    }

    /** Returns the builder for the settings used for calls to deleteRealm. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteRealmRequest, Empty, OperationMetadata>
        deleteRealmOperationSettings() {
      return deleteRealmOperationSettings;
    }

    /** Returns the builder for the settings used for calls to updateRealm. */
    public UnaryCallSettings.Builder<UpdateRealmRequest, Operation> updateRealmSettings() {
      return updateRealmSettings;
    }

    /** Returns the builder for the settings used for calls to updateRealm. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<UpdateRealmRequest, Realm, OperationMetadata>
        updateRealmOperationSettings() {
      return updateRealmOperationSettings;
    }

    /** Returns the builder for the settings used for calls to previewRealmUpdate. */
    public UnaryCallSettings.Builder<PreviewRealmUpdateRequest, PreviewRealmUpdateResponse>
        previewRealmUpdateSettings() {
      return previewRealmUpdateSettings;
    }

    @Override
    public RealmsServiceStubSettings build() throws IOException {
      return new RealmsServiceStubSettings(this);
    }
  }
}
