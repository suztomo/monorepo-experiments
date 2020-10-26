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

public interface RouterInterfaceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterInterface)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
   * </pre>
   *
   * <code>string ip_range = 145092645;</code>
   *
   * @return The ipRange.
   */
  java.lang.String getIpRange();
  /**
   *
   *
   * <pre>
   * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
   * </pre>
   *
   * <code>string ip_range = 145092645;</code>
   *
   * @return The bytes for ipRange.
   */
  com.google.protobuf.ByteString getIpRangeBytes();

  /**
   *
   *
   * <pre>
   * URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
   * </pre>
   *
   * <code>string linked_interconnect_attachment = 501085518;</code>
   *
   * @return The linkedInterconnectAttachment.
   */
  java.lang.String getLinkedInterconnectAttachment();
  /**
   *
   *
   * <pre>
   * URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
   * </pre>
   *
   * <code>string linked_interconnect_attachment = 501085518;</code>
   *
   * @return The bytes for linkedInterconnectAttachment.
   */
  com.google.protobuf.ByteString getLinkedInterconnectAttachmentBytes();

  /**
   *
   *
   * <pre>
   * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
   * </pre>
   *
   * <code>string linked_vpn_tunnel = 352296953;</code>
   *
   * @return The linkedVpnTunnel.
   */
  java.lang.String getLinkedVpnTunnel();
  /**
   *
   *
   * <pre>
   * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
   * </pre>
   *
   * <code>string linked_vpn_tunnel = 352296953;</code>
   *
   * @return The bytes for linkedVpnTunnel.
   */
  com.google.protobuf.ByteString getLinkedVpnTunnelBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The resource that configures and manages this interface.
   * - MANAGED_BY_USER is the default value and can be managed directly by users.
   * - MANAGED_BY_ATTACHMENT is an interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterInterface.ManagementType management_type = 173703606;
   * </code>
   *
   * @return The enum numeric value on the wire for managementType.
   */
  int getManagementTypeValue();
  /**
   *
   *
   * <pre>
   * [Output Only] The resource that configures and manages this interface.
   * - MANAGED_BY_USER is the default value and can be managed directly by users.
   * - MANAGED_BY_ATTACHMENT is an interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterInterface.ManagementType management_type = 173703606;
   * </code>
   *
   * @return The managementType.
   */
  com.google.cloud.compute.v1.RouterInterface.ManagementType getManagementType();

  /**
   *
   *
   * <pre>
   * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
