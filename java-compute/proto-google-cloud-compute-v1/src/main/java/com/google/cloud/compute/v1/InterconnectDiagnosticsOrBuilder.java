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

public interface InterconnectDiagnosticsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectDiagnostics)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of InterconnectDiagnostics.ARPEntry objects, describing individual neighbors currently seen by the Google router in the ARP cache for the Interconnect. This will be empty when the Interconnect is not bundled.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectDiagnosticsARPEntry arp_caches = 414591761;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry> getArpCachesList();
  /**
   *
   *
   * <pre>
   * A list of InterconnectDiagnostics.ARPEntry objects, describing individual neighbors currently seen by the Google router in the ARP cache for the Interconnect. This will be empty when the Interconnect is not bundled.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectDiagnosticsARPEntry arp_caches = 414591761;
   * </code>
   */
  com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntry getArpCaches(int index);
  /**
   *
   *
   * <pre>
   * A list of InterconnectDiagnostics.ARPEntry objects, describing individual neighbors currently seen by the Google router in the ARP cache for the Interconnect. This will be empty when the Interconnect is not bundled.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectDiagnosticsARPEntry arp_caches = 414591761;
   * </code>
   */
  int getArpCachesCount();
  /**
   *
   *
   * <pre>
   * A list of InterconnectDiagnostics.ARPEntry objects, describing individual neighbors currently seen by the Google router in the ARP cache for the Interconnect. This will be empty when the Interconnect is not bundled.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectDiagnosticsARPEntry arp_caches = 414591761;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntryOrBuilder>
      getArpCachesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of InterconnectDiagnostics.ARPEntry objects, describing individual neighbors currently seen by the Google router in the ARP cache for the Interconnect. This will be empty when the Interconnect is not bundled.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectDiagnosticsARPEntry arp_caches = 414591761;
   * </code>
   */
  com.google.cloud.compute.v1.InterconnectDiagnosticsARPEntryOrBuilder getArpCachesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A list of InterconnectDiagnostics.LinkStatus objects, describing the status for each link on the Interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus links = 102977465;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus> getLinksList();
  /**
   *
   *
   * <pre>
   * A list of InterconnectDiagnostics.LinkStatus objects, describing the status for each link on the Interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus links = 102977465;
   * </code>
   */
  com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus getLinks(int index);
  /**
   *
   *
   * <pre>
   * A list of InterconnectDiagnostics.LinkStatus objects, describing the status for each link on the Interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus links = 102977465;
   * </code>
   */
  int getLinksCount();
  /**
   *
   *
   * <pre>
   * A list of InterconnectDiagnostics.LinkStatus objects, describing the status for each link on the Interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus links = 102977465;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatusOrBuilder>
      getLinksOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of InterconnectDiagnostics.LinkStatus objects, describing the status for each link on the Interconnect.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InterconnectDiagnosticsLinkStatus links = 102977465;
   * </code>
   */
  com.google.cloud.compute.v1.InterconnectDiagnosticsLinkStatusOrBuilder getLinksOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The MAC address of the Interconnect's bundle interface.
   * </pre>
   *
   * <code>string mac_address = 332540164;</code>
   *
   * @return The macAddress.
   */
  java.lang.String getMacAddress();
  /**
   *
   *
   * <pre>
   * The MAC address of the Interconnect's bundle interface.
   * </pre>
   *
   * <code>string mac_address = 332540164;</code>
   *
   * @return The bytes for macAddress.
   */
  com.google.protobuf.ByteString getMacAddressBytes();
}
