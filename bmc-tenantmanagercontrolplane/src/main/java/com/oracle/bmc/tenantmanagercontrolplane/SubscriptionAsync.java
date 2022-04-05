/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;

/**
 * The Organizations API allows you to consolidate multiple OCI tenancies into an organization, and centrally manage your tenancies and its resources.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
public interface SubscriptionAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Assign the tenancy record identified by the compartment ID to the given subscription ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSubscriptionMappingResponse> createSubscriptionMapping(
            CreateSubscriptionMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSubscriptionMappingRequest, CreateSubscriptionMappingResponse>
                    handler);

    /**
     * Delete the subscription mapping details by subscription mapping ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSubscriptionMappingResponse> deleteSubscriptionMapping(
            DeleteSubscriptionMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSubscriptionMappingRequest, DeleteSubscriptionMappingResponse>
                    handler);

    /**
     * Get the assigned subscription details by assigned subscription ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAssignedSubscriptionResponse> getAssignedSubscription(
            GetAssignedSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAssignedSubscriptionRequest, GetAssignedSubscriptionResponse>
                    handler);

    /**
     * Gets the subscription details by subscriptionId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSubscriptionResponse> getSubscription(
            GetSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSubscriptionRequest, GetSubscriptionResponse>
                    handler);

    /**
     * Get the subscription mapping details by subscription mapping ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSubscriptionMappingResponse> getSubscriptionMapping(
            GetSubscriptionMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSubscriptionMappingRequest, GetSubscriptionMappingResponse>
                    handler);

    /**
     * Lists subscriptions that are consumed by the compartment. Only the root compartment is allowed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAssignedSubscriptionsResponse> listAssignedSubscriptions(
            ListAssignedSubscriptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAssignedSubscriptionsRequest, ListAssignedSubscriptionsResponse>
                    handler);

    /**
     * List the available regions based on subscription ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAvailableRegionsResponse> listAvailableRegions(
            ListAvailableRegionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAvailableRegionsRequest, ListAvailableRegionsResponse>
                    handler);

    /**
     * Lists the subscription mappings for all the subscriptions owned by a given compartmentId. Only the root compartment is allowed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSubscriptionMappingsResponse> listSubscriptionMappings(
            ListSubscriptionMappingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSubscriptionMappingsRequest, ListSubscriptionMappingsResponse>
                    handler);

    /**
     * List the subscriptions that a compartment owns. Only the root compartment is allowed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSubscriptionsResponse> listSubscriptions(
            ListSubscriptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSubscriptionsRequest, ListSubscriptionsResponse>
                    handler);
}