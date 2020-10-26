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

public interface AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the size of the disk in base-2 GB.
   * </pre>
   *
   * <code>string disk_size_gb = 316263735;</code>
   *
   * @return The diskSizeGb.
   */
  java.lang.String getDiskSizeGb();
  /**
   *
   *
   * <pre>
   * Specifies the size of the disk in base-2 GB.
   * </pre>
   *
   * <code>string disk_size_gb = 316263735;</code>
   *
   * @return The bytes for diskSizeGb.
   */
  com.google.protobuf.ByteString getDiskSizeGbBytes();

  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk.Interface interface = 502623545;
   * </code>
   *
   * @return The enum numeric value on the wire for interface.
   */
  int getInterfaceValue();
  /**
   *
   *
   * <pre>
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk.Interface interface = 502623545;
   * </code>
   *
   * @return The interface.
   */
  com.google.cloud.compute.v1.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk
          .Interface
      getInterface();
}
