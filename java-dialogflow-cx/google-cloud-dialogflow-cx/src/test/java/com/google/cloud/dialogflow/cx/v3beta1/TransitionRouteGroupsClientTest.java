/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.dialogflow.cx.v3beta1;

import static com.google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroupsClient.ListTransitionRouteGroupsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class TransitionRouteGroupsClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockTransitionRouteGroups mockTransitionRouteGroups;
  private LocalChannelProvider channelProvider;
  private TransitionRouteGroupsClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockTransitionRouteGroups = new MockTransitionRouteGroups();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockTransitionRouteGroups));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    TransitionRouteGroupsSettings settings =
        TransitionRouteGroupsSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = TransitionRouteGroupsClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void listTransitionRouteGroupsTest() throws Exception {
    TransitionRouteGroup responsesElement = TransitionRouteGroup.newBuilder().build();
    ListTransitionRouteGroupsResponse expectedResponse =
        ListTransitionRouteGroupsResponse.newBuilder()
            .setNextPageToken("")
            .addAllTransitionRouteGroups(Arrays.asList(responsesElement))
            .build();
    mockTransitionRouteGroups.addResponse(expectedResponse);

    FlowName parent = FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]");

    ListTransitionRouteGroupsPagedResponse pagedListResponse =
        client.listTransitionRouteGroups(parent);

    List<TransitionRouteGroup> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTransitionRouteGroupsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTransitionRouteGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTransitionRouteGroupsRequest actualRequest =
        ((ListTransitionRouteGroupsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listTransitionRouteGroupsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTransitionRouteGroups.addException(exception);

    try {
      FlowName parent = FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]");
      client.listTransitionRouteGroups(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listTransitionRouteGroupsTest2() throws Exception {
    TransitionRouteGroup responsesElement = TransitionRouteGroup.newBuilder().build();
    ListTransitionRouteGroupsResponse expectedResponse =
        ListTransitionRouteGroupsResponse.newBuilder()
            .setNextPageToken("")
            .addAllTransitionRouteGroups(Arrays.asList(responsesElement))
            .build();
    mockTransitionRouteGroups.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListTransitionRouteGroupsPagedResponse pagedListResponse =
        client.listTransitionRouteGroups(parent);

    List<TransitionRouteGroup> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTransitionRouteGroupsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTransitionRouteGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTransitionRouteGroupsRequest actualRequest =
        ((ListTransitionRouteGroupsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listTransitionRouteGroupsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTransitionRouteGroups.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listTransitionRouteGroups(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getTransitionRouteGroupTest() throws Exception {
    TransitionRouteGroup expectedResponse =
        TransitionRouteGroup.newBuilder()
            .setName(
                TransitionRouteGroupName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[TRANSITION_ROUTE_GROUP]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .addAllTransitionRoutes(new ArrayList<TransitionRoute>())
            .build();
    mockTransitionRouteGroups.addResponse(expectedResponse);

    TransitionRouteGroupName name =
        TransitionRouteGroupName.of(
            "[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[TRANSITION_ROUTE_GROUP]");

    TransitionRouteGroup actualResponse = client.getTransitionRouteGroup(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTransitionRouteGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTransitionRouteGroupRequest actualRequest =
        ((GetTransitionRouteGroupRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getTransitionRouteGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTransitionRouteGroups.addException(exception);

    try {
      TransitionRouteGroupName name =
          TransitionRouteGroupName.of(
              "[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[TRANSITION_ROUTE_GROUP]");
      client.getTransitionRouteGroup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getTransitionRouteGroupTest2() throws Exception {
    TransitionRouteGroup expectedResponse =
        TransitionRouteGroup.newBuilder()
            .setName(
                TransitionRouteGroupName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[TRANSITION_ROUTE_GROUP]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .addAllTransitionRoutes(new ArrayList<TransitionRoute>())
            .build();
    mockTransitionRouteGroups.addResponse(expectedResponse);

    String name = "name3373707";

    TransitionRouteGroup actualResponse = client.getTransitionRouteGroup(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTransitionRouteGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTransitionRouteGroupRequest actualRequest =
        ((GetTransitionRouteGroupRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getTransitionRouteGroupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTransitionRouteGroups.addException(exception);

    try {
      String name = "name3373707";
      client.getTransitionRouteGroup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createTransitionRouteGroupTest() throws Exception {
    TransitionRouteGroup expectedResponse =
        TransitionRouteGroup.newBuilder()
            .setName(
                TransitionRouteGroupName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[TRANSITION_ROUTE_GROUP]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .addAllTransitionRoutes(new ArrayList<TransitionRoute>())
            .build();
    mockTransitionRouteGroups.addResponse(expectedResponse);

    FlowName parent = FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]");
    TransitionRouteGroup transitionRouteGroup = TransitionRouteGroup.newBuilder().build();

    TransitionRouteGroup actualResponse =
        client.createTransitionRouteGroup(parent, transitionRouteGroup);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTransitionRouteGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateTransitionRouteGroupRequest actualRequest =
        ((CreateTransitionRouteGroupRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(transitionRouteGroup, actualRequest.getTransitionRouteGroup());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createTransitionRouteGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTransitionRouteGroups.addException(exception);

    try {
      FlowName parent = FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]");
      TransitionRouteGroup transitionRouteGroup = TransitionRouteGroup.newBuilder().build();
      client.createTransitionRouteGroup(parent, transitionRouteGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createTransitionRouteGroupTest2() throws Exception {
    TransitionRouteGroup expectedResponse =
        TransitionRouteGroup.newBuilder()
            .setName(
                TransitionRouteGroupName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[TRANSITION_ROUTE_GROUP]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .addAllTransitionRoutes(new ArrayList<TransitionRoute>())
            .build();
    mockTransitionRouteGroups.addResponse(expectedResponse);

    String parent = "parent-995424086";
    TransitionRouteGroup transitionRouteGroup = TransitionRouteGroup.newBuilder().build();

    TransitionRouteGroup actualResponse =
        client.createTransitionRouteGroup(parent, transitionRouteGroup);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTransitionRouteGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateTransitionRouteGroupRequest actualRequest =
        ((CreateTransitionRouteGroupRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(transitionRouteGroup, actualRequest.getTransitionRouteGroup());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createTransitionRouteGroupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTransitionRouteGroups.addException(exception);

    try {
      String parent = "parent-995424086";
      TransitionRouteGroup transitionRouteGroup = TransitionRouteGroup.newBuilder().build();
      client.createTransitionRouteGroup(parent, transitionRouteGroup);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateTransitionRouteGroupTest() throws Exception {
    TransitionRouteGroup expectedResponse =
        TransitionRouteGroup.newBuilder()
            .setName(
                TransitionRouteGroupName.of(
                        "[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[TRANSITION_ROUTE_GROUP]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .addAllTransitionRoutes(new ArrayList<TransitionRoute>())
            .build();
    mockTransitionRouteGroups.addResponse(expectedResponse);

    TransitionRouteGroup transitionRouteGroup = TransitionRouteGroup.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    TransitionRouteGroup actualResponse =
        client.updateTransitionRouteGroup(transitionRouteGroup, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTransitionRouteGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateTransitionRouteGroupRequest actualRequest =
        ((UpdateTransitionRouteGroupRequest) actualRequests.get(0));

    Assert.assertEquals(transitionRouteGroup, actualRequest.getTransitionRouteGroup());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateTransitionRouteGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTransitionRouteGroups.addException(exception);

    try {
      TransitionRouteGroup transitionRouteGroup = TransitionRouteGroup.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateTransitionRouteGroup(transitionRouteGroup, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteTransitionRouteGroupTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockTransitionRouteGroups.addResponse(expectedResponse);

    TransitionRouteGroupName name =
        TransitionRouteGroupName.of(
            "[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[TRANSITION_ROUTE_GROUP]");

    client.deleteTransitionRouteGroup(name);

    List<AbstractMessage> actualRequests = mockTransitionRouteGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteTransitionRouteGroupRequest actualRequest =
        ((DeleteTransitionRouteGroupRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteTransitionRouteGroupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTransitionRouteGroups.addException(exception);

    try {
      TransitionRouteGroupName name =
          TransitionRouteGroupName.of(
              "[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]", "[TRANSITION_ROUTE_GROUP]");
      client.deleteTransitionRouteGroup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteTransitionRouteGroupTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockTransitionRouteGroups.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteTransitionRouteGroup(name);

    List<AbstractMessage> actualRequests = mockTransitionRouteGroups.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteTransitionRouteGroupRequest actualRequest =
        ((DeleteTransitionRouteGroupRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteTransitionRouteGroupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTransitionRouteGroups.addException(exception);

    try {
      String name = "name3373707";
      client.deleteTransitionRouteGroup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
