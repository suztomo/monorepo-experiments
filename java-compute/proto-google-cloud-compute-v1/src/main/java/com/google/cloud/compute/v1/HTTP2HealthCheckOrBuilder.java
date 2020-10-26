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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface HTTP2HealthCheckOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HTTP2HealthCheck)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The value of the host header in the HTTP/2 health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
   * </pre>
   *
   * <code>string host = 3208616;</code>
   *
   * @return The host.
   */
  java.lang.String getHost();
  /**
   *
   *
   * <pre>
   * The value of the host header in the HTTP/2 health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used.
   * </pre>
   *
   * <code>string host = 3208616;</code>
   *
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString getHostBytes();

  /**
   *
   *
   * <pre>
   * The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535.
   * </pre>
   *
   * <code>int32 port = 3446913;</code>
   *
   * @return The port.
   */
  int getPort();

  /**
   *
   *
   * <pre>
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
   * </pre>
   *
   * <code>string port_name = 41534345;</code>
   *
   * @return The portName.
   */
  java.lang.String getPortName();
  /**
   *
   *
   * <pre>
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
   * </pre>
   *
   * <code>string port_name = 41534345;</code>
   *
   * @return The bytes for portName.
   */
  com.google.protobuf.ByteString getPortNameBytes();

  /**
   *
   *
   * <pre>
   * Specifies how port is selected for health checking, can be one of following values:
   * USE_FIXED_PORT: The port number in port is used for health checking.
   * USE_NAMED_PORT: The portName is used for health checking.
   * USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking.
   * If not specified, HTTP2 health check follows behavior specified in port and portName fields.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.HTTP2HealthCheck.PortSpecification port_specification = 51590597;
   * </code>
   *
   * @return The enum numeric value on the wire for portSpecification.
   */
  int getPortSpecificationValue();
  /**
   *
   *
   * <pre>
   * Specifies how port is selected for health checking, can be one of following values:
   * USE_FIXED_PORT: The port number in port is used for health checking.
   * USE_NAMED_PORT: The portName is used for health checking.
   * USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking.
   * If not specified, HTTP2 health check follows behavior specified in port and portName fields.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.HTTP2HealthCheck.PortSpecification port_specification = 51590597;
   * </code>
   *
   * @return The portSpecification.
   */
  com.google.cloud.compute.v1.HTTP2HealthCheck.PortSpecification getPortSpecification();

  /**
   *
   *
   * <pre>
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HTTP2HealthCheck.ProxyHeader proxy_header = 160374142;</code>
   *
   * @return The enum numeric value on the wire for proxyHeader.
   */
  int getProxyHeaderValue();
  /**
   *
   *
   * <pre>
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HTTP2HealthCheck.ProxyHeader proxy_header = 160374142;</code>
   *
   * @return The proxyHeader.
   */
  com.google.cloud.compute.v1.HTTP2HealthCheck.ProxyHeader getProxyHeader();

  /**
   *
   *
   * <pre>
   * The request path of the HTTP/2 health check request. The default value is /.
   * </pre>
   *
   * <code>string request_path = 229403605;</code>
   *
   * @return The requestPath.
   */
  java.lang.String getRequestPath();
  /**
   *
   *
   * <pre>
   * The request path of the HTTP/2 health check request. The default value is /.
   * </pre>
   *
   * <code>string request_path = 229403605;</code>
   *
   * @return The bytes for requestPath.
   */
  com.google.protobuf.ByteString getRequestPathBytes();

  /**
   *
   *
   * <pre>
   * The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
   * </pre>
   *
   * <code>string response = 196547649;</code>
   *
   * @return The response.
   */
  java.lang.String getResponse();
  /**
   *
   *
   * <pre>
   * The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII.
   * </pre>
   *
   * <code>string response = 196547649;</code>
   *
   * @return The bytes for response.
   */
  com.google.protobuf.ByteString getResponseBytes();
}
