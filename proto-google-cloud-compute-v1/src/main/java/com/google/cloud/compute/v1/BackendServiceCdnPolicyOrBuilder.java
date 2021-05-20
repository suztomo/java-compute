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

public interface BackendServiceCdnPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BackendServiceCdnPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode settings.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.BackendServiceCdnPolicyBypassCacheOnRequestHeader bypass_cache_on_request_headers = 486203082;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.BackendServiceCdnPolicyBypassCacheOnRequestHeader>
      getBypassCacheOnRequestHeadersList();
  /**
   *
   *
   * <pre>
   * Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode settings.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.BackendServiceCdnPolicyBypassCacheOnRequestHeader bypass_cache_on_request_headers = 486203082;
   * </code>
   */
  com.google.cloud.compute.v1.BackendServiceCdnPolicyBypassCacheOnRequestHeader
      getBypassCacheOnRequestHeaders(int index);
  /**
   *
   *
   * <pre>
   * Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode settings.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.BackendServiceCdnPolicyBypassCacheOnRequestHeader bypass_cache_on_request_headers = 486203082;
   * </code>
   */
  int getBypassCacheOnRequestHeadersCount();
  /**
   *
   *
   * <pre>
   * Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode settings.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.BackendServiceCdnPolicyBypassCacheOnRequestHeader bypass_cache_on_request_headers = 486203082;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.compute.v1
                  .BackendServiceCdnPolicyBypassCacheOnRequestHeaderOrBuilder>
      getBypassCacheOnRequestHeadersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode settings.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.BackendServiceCdnPolicyBypassCacheOnRequestHeader bypass_cache_on_request_headers = 486203082;
   * </code>
   */
  com.google.cloud.compute.v1.BackendServiceCdnPolicyBypassCacheOnRequestHeaderOrBuilder
      getBypassCacheOnRequestHeadersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The CacheKeyPolicy for this CdnPolicy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CacheKeyPolicy cache_key_policy = 159263727;</code>
   *
   * @return Whether the cacheKeyPolicy field is set.
   */
  boolean hasCacheKeyPolicy();
  /**
   *
   *
   * <pre>
   * The CacheKeyPolicy for this CdnPolicy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CacheKeyPolicy cache_key_policy = 159263727;</code>
   *
   * @return The cacheKeyPolicy.
   */
  com.google.cloud.compute.v1.CacheKeyPolicy getCacheKeyPolicy();
  /**
   *
   *
   * <pre>
   * The CacheKeyPolicy for this CdnPolicy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CacheKeyPolicy cache_key_policy = 159263727;</code>
   */
  com.google.cloud.compute.v1.CacheKeyPolicyOrBuilder getCacheKeyPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the cache setting for all responses from this backend. The possible values are:
   * USE_ORIGIN_HEADERS Requires the origin to set valid caching headers to cache content. Responses without these headers will not be cached at Google's edge, and will require a full trip to the origin on every request, potentially impacting performance and increasing load on the origin server.
   * FORCE_CACHE_ALL Cache all content, ignoring any "private", "no-store" or "no-cache" directives in Cache-Control response headers. Warning: this may result in Cloud CDN caching private, per-user (user identifiable) content.
   * CACHE_ALL_STATIC Automatically cache static content, including common image formats, media (video and audio), and web assets (JavaScript and CSS). Requests and responses that are marked as uncacheable, as well as dynamic content (including HTML), will not be cached.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.BackendServiceCdnPolicy.CacheMode cache_mode = 28877888;</code>
   *
   * @return Whether the cacheMode field is set.
   */
  boolean hasCacheMode();
  /**
   *
   *
   * <pre>
   * Specifies the cache setting for all responses from this backend. The possible values are:
   * USE_ORIGIN_HEADERS Requires the origin to set valid caching headers to cache content. Responses without these headers will not be cached at Google's edge, and will require a full trip to the origin on every request, potentially impacting performance and increasing load on the origin server.
   * FORCE_CACHE_ALL Cache all content, ignoring any "private", "no-store" or "no-cache" directives in Cache-Control response headers. Warning: this may result in Cloud CDN caching private, per-user (user identifiable) content.
   * CACHE_ALL_STATIC Automatically cache static content, including common image formats, media (video and audio), and web assets (JavaScript and CSS). Requests and responses that are marked as uncacheable, as well as dynamic content (including HTML), will not be cached.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.BackendServiceCdnPolicy.CacheMode cache_mode = 28877888;</code>
   *
   * @return The enum numeric value on the wire for cacheMode.
   */
  int getCacheModeValue();
  /**
   *
   *
   * <pre>
   * Specifies the cache setting for all responses from this backend. The possible values are:
   * USE_ORIGIN_HEADERS Requires the origin to set valid caching headers to cache content. Responses without these headers will not be cached at Google's edge, and will require a full trip to the origin on every request, potentially impacting performance and increasing load on the origin server.
   * FORCE_CACHE_ALL Cache all content, ignoring any "private", "no-store" or "no-cache" directives in Cache-Control response headers. Warning: this may result in Cloud CDN caching private, per-user (user identifiable) content.
   * CACHE_ALL_STATIC Automatically cache static content, including common image formats, media (video and audio), and web assets (JavaScript and CSS). Requests and responses that are marked as uncacheable, as well as dynamic content (including HTML), will not be cached.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.BackendServiceCdnPolicy.CacheMode cache_mode = 28877888;</code>
   *
   * @return The cacheMode.
   */
  com.google.cloud.compute.v1.BackendServiceCdnPolicy.CacheMode getCacheMode();

  /**
   *
   *
   * <pre>
   * Specifies a separate client (e.g. browser client) maximum TTL. This is used to clamp the max-age (or Expires) value sent to the client. With FORCE_CACHE_ALL, the lesser of client_ttl and default_ttl is used for the response max-age directive, along with a "public" directive. For cacheable content in CACHE_ALL_STATIC mode, client_ttl clamps the max-age from the origin (if specified), or else sets the response max-age directive to the lesser of the client_ttl and default_ttl, and also ensures a "public" cache-control directive is present. If a client TTL is not specified, a default value (1 hour) will be used. The maximum allowed value is 86400s (1 day).
   * </pre>
   *
   * <code>int32 client_ttl = 29034360;</code>
   *
   * @return Whether the clientTtl field is set.
   */
  boolean hasClientTtl();
  /**
   *
   *
   * <pre>
   * Specifies a separate client (e.g. browser client) maximum TTL. This is used to clamp the max-age (or Expires) value sent to the client. With FORCE_CACHE_ALL, the lesser of client_ttl and default_ttl is used for the response max-age directive, along with a "public" directive. For cacheable content in CACHE_ALL_STATIC mode, client_ttl clamps the max-age from the origin (if specified), or else sets the response max-age directive to the lesser of the client_ttl and default_ttl, and also ensures a "public" cache-control directive is present. If a client TTL is not specified, a default value (1 hour) will be used. The maximum allowed value is 86400s (1 day).
   * </pre>
   *
   * <code>int32 client_ttl = 29034360;</code>
   *
   * @return The clientTtl.
   */
  int getClientTtl();

  /**
   *
   *
   * <pre>
   * Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age). Setting a TTL of "0" means "always revalidate". The value of defaultTTL cannot be set to a value greater than that of maxTTL, but can be equal. When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses. The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
   * </pre>
   *
   * <code>int32 default_ttl = 100253422;</code>
   *
   * @return Whether the defaultTtl field is set.
   */
  boolean hasDefaultTtl();
  /**
   *
   *
   * <pre>
   * Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age). Setting a TTL of "0" means "always revalidate". The value of defaultTTL cannot be set to a value greater than that of maxTTL, but can be equal. When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses. The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
   * </pre>
   *
   * <code>int32 default_ttl = 100253422;</code>
   *
   * @return The defaultTtl.
   */
  int getDefaultTtl();

  /**
   *
   *
   * <pre>
   * Specifies the maximum allowed TTL for cached content served by this origin. Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTTL seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive. Headers sent to the client will not be modified. Setting a TTL of "0" means "always revalidate". The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
   * </pre>
   *
   * <code>int32 max_ttl = 307578001;</code>
   *
   * @return Whether the maxTtl field is set.
   */
  boolean hasMaxTtl();
  /**
   *
   *
   * <pre>
   * Specifies the maximum allowed TTL for cached content served by this origin. Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTTL seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive. Headers sent to the client will not be modified. Setting a TTL of "0" means "always revalidate". The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
   * </pre>
   *
   * <code>int32 max_ttl = 307578001;</code>
   *
   * @return The maxTtl.
   */
  int getMaxTtl();

  /**
   *
   *
   * <pre>
   * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency. When the cache mode is set to CACHE_ALL_STATIC or USE_ORIGIN_HEADERS, negative caching applies to responses with the specified response code that lack any Cache-Control, Expires, or Pragma: no-cache directives. When the cache mode is set to FORCE_CACHE_ALL, negative caching applies to all responses with the specified response code, and override any caching headers. By default, Cloud CDN will apply the following default TTLs to these status codes: HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s HTTP 405 (Method Not Found), 421 (Misdirected Request), 501 (Not Implemented): 60s. These defaults can be overridden in negative_caching_policy.
   * </pre>
   *
   * <code>bool negative_caching = 336110005;</code>
   *
   * @return Whether the negativeCaching field is set.
   */
  boolean hasNegativeCaching();
  /**
   *
   *
   * <pre>
   * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency. When the cache mode is set to CACHE_ALL_STATIC or USE_ORIGIN_HEADERS, negative caching applies to responses with the specified response code that lack any Cache-Control, Expires, or Pragma: no-cache directives. When the cache mode is set to FORCE_CACHE_ALL, negative caching applies to all responses with the specified response code, and override any caching headers. By default, Cloud CDN will apply the following default TTLs to these status codes: HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s HTTP 405 (Method Not Found), 421 (Misdirected Request), 501 (Not Implemented): 60s. These defaults can be overridden in negative_caching_policy.
   * </pre>
   *
   * <code>bool negative_caching = 336110005;</code>
   *
   * @return The negativeCaching.
   */
  boolean getNegativeCaching();

  /**
   *
   *
   * <pre>
   * Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled will use Cloud CDN's default cache TTLs. Note that when specifying an explicit negative_caching_policy, you should take care to specify a cache TTL for all response codes that you wish to cache. Cloud CDN will not apply any default negative caching when a policy exists.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.BackendServiceCdnPolicyNegativeCachingPolicy negative_caching_policy = 155359996;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.BackendServiceCdnPolicyNegativeCachingPolicy>
      getNegativeCachingPolicyList();
  /**
   *
   *
   * <pre>
   * Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled will use Cloud CDN's default cache TTLs. Note that when specifying an explicit negative_caching_policy, you should take care to specify a cache TTL for all response codes that you wish to cache. Cloud CDN will not apply any default negative caching when a policy exists.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.BackendServiceCdnPolicyNegativeCachingPolicy negative_caching_policy = 155359996;
   * </code>
   */
  com.google.cloud.compute.v1.BackendServiceCdnPolicyNegativeCachingPolicy getNegativeCachingPolicy(
      int index);
  /**
   *
   *
   * <pre>
   * Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled will use Cloud CDN's default cache TTLs. Note that when specifying an explicit negative_caching_policy, you should take care to specify a cache TTL for all response codes that you wish to cache. Cloud CDN will not apply any default negative caching when a policy exists.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.BackendServiceCdnPolicyNegativeCachingPolicy negative_caching_policy = 155359996;
   * </code>
   */
  int getNegativeCachingPolicyCount();
  /**
   *
   *
   * <pre>
   * Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled will use Cloud CDN's default cache TTLs. Note that when specifying an explicit negative_caching_policy, you should take care to specify a cache TTL for all response codes that you wish to cache. Cloud CDN will not apply any default negative caching when a policy exists.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.BackendServiceCdnPolicyNegativeCachingPolicy negative_caching_policy = 155359996;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.compute.v1.BackendServiceCdnPolicyNegativeCachingPolicyOrBuilder>
      getNegativeCachingPolicyOrBuilderList();
  /**
   *
   *
   * <pre>
   * Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled will use Cloud CDN's default cache TTLs. Note that when specifying an explicit negative_caching_policy, you should take care to specify a cache TTL for all response codes that you wish to cache. Cloud CDN will not apply any default negative caching when a policy exists.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.BackendServiceCdnPolicyNegativeCachingPolicy negative_caching_policy = 155359996;
   * </code>
   */
  com.google.cloud.compute.v1.BackendServiceCdnPolicyNegativeCachingPolicyOrBuilder
      getNegativeCachingPolicyOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If true then Cloud CDN will combine multiple concurrent cache fill requests into a small number of requests to the origin.
   * </pre>
   *
   * <code>bool request_coalescing = 532808276;</code>
   *
   * @return Whether the requestCoalescing field is set.
   */
  boolean hasRequestCoalescing();
  /**
   *
   *
   * <pre>
   * If true then Cloud CDN will combine multiple concurrent cache fill requests into a small number of requests to the origin.
   * </pre>
   *
   * <code>bool request_coalescing = 532808276;</code>
   *
   * @return The requestCoalescing.
   */
  boolean getRequestCoalescing();

  /**
   *
   *
   * <pre>
   * Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache. This setting defines the default "max-stale" duration for any cached responses that do not specify a max-stale directive. Stale responses that exceed the TTL configured here will not be served. The default limit (max-stale) is 86400s (1 day), which will allow stale content to be served up to this limit beyond the max-age (or s-max-age) of a cached response. The maximum allowed value is 604800 (1 week). Set this to zero (0) to disable serve-while-stale.
   * </pre>
   *
   * <code>int32 serve_while_stale = 236682203;</code>
   *
   * @return Whether the serveWhileStale field is set.
   */
  boolean hasServeWhileStale();
  /**
   *
   *
   * <pre>
   * Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache. This setting defines the default "max-stale" duration for any cached responses that do not specify a max-stale directive. Stale responses that exceed the TTL configured here will not be served. The default limit (max-stale) is 86400s (1 day), which will allow stale content to be served up to this limit beyond the max-age (or s-max-age) of a cached response. The maximum allowed value is 604800 (1 week). Set this to zero (0) to disable serve-while-stale.
   * </pre>
   *
   * <code>int32 serve_while_stale = 236682203;</code>
   *
   * @return The serveWhileStale.
   */
  int getServeWhileStale();

  /**
   *
   *
   * <pre>
   * Maximum number of seconds the response to a signed URL request will be considered fresh. After this time period, the response will be revalidated before being served. Defaults to 1hr (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as though all responses from this backend had a "Cache-Control: public, max-age=[TTL]" header, regardless of any existing Cache-Control header. The actual headers served in responses will not be altered.
   * </pre>
   *
   * <code>string signed_url_cache_max_age_sec = 269374534;</code>
   *
   * @return Whether the signedUrlCacheMaxAgeSec field is set.
   */
  boolean hasSignedUrlCacheMaxAgeSec();
  /**
   *
   *
   * <pre>
   * Maximum number of seconds the response to a signed URL request will be considered fresh. After this time period, the response will be revalidated before being served. Defaults to 1hr (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as though all responses from this backend had a "Cache-Control: public, max-age=[TTL]" header, regardless of any existing Cache-Control header. The actual headers served in responses will not be altered.
   * </pre>
   *
   * <code>string signed_url_cache_max_age_sec = 269374534;</code>
   *
   * @return The signedUrlCacheMaxAgeSec.
   */
  java.lang.String getSignedUrlCacheMaxAgeSec();
  /**
   *
   *
   * <pre>
   * Maximum number of seconds the response to a signed URL request will be considered fresh. After this time period, the response will be revalidated before being served. Defaults to 1hr (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as though all responses from this backend had a "Cache-Control: public, max-age=[TTL]" header, regardless of any existing Cache-Control header. The actual headers served in responses will not be altered.
   * </pre>
   *
   * <code>string signed_url_cache_max_age_sec = 269374534;</code>
   *
   * @return The bytes for signedUrlCacheMaxAgeSec.
   */
  com.google.protobuf.ByteString getSignedUrlCacheMaxAgeSecBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Names of the keys for signing request URLs.
   * </pre>
   *
   * <code>repeated string signed_url_key_names = 371848885;</code>
   *
   * @return A list containing the signedUrlKeyNames.
   */
  java.util.List<java.lang.String> getSignedUrlKeyNamesList();
  /**
   *
   *
   * <pre>
   * [Output Only] Names of the keys for signing request URLs.
   * </pre>
   *
   * <code>repeated string signed_url_key_names = 371848885;</code>
   *
   * @return The count of signedUrlKeyNames.
   */
  int getSignedUrlKeyNamesCount();
  /**
   *
   *
   * <pre>
   * [Output Only] Names of the keys for signing request URLs.
   * </pre>
   *
   * <code>repeated string signed_url_key_names = 371848885;</code>
   *
   * @param index The index of the element to return.
   * @return The signedUrlKeyNames at the given index.
   */
  java.lang.String getSignedUrlKeyNames(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] Names of the keys for signing request URLs.
   * </pre>
   *
   * <code>repeated string signed_url_key_names = 371848885;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the signedUrlKeyNames at the given index.
   */
  com.google.protobuf.ByteString getSignedUrlKeyNamesBytes(int index);
}
