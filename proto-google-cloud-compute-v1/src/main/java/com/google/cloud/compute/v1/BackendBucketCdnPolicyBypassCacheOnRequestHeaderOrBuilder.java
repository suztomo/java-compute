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

public interface BackendBucketCdnPolicyBypassCacheOnRequestHeaderOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BackendBucketCdnPolicyBypassCacheOnRequestHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The header field name to match on when bypassing cache. Values are case-insensitive.
   * </pre>
   *
   * <code>string header_name = 110223613;</code>
   *
   * @return Whether the headerName field is set.
   */
  boolean hasHeaderName();
  /**
   *
   *
   * <pre>
   * The header field name to match on when bypassing cache. Values are case-insensitive.
   * </pre>
   *
   * <code>string header_name = 110223613;</code>
   *
   * @return The headerName.
   */
  java.lang.String getHeaderName();
  /**
   *
   *
   * <pre>
   * The header field name to match on when bypassing cache. Values are case-insensitive.
   * </pre>
   *
   * <code>string header_name = 110223613;</code>
   *
   * @return The bytes for headerName.
   */
  com.google.protobuf.ByteString getHeaderNameBytes();
}
