/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Subscription payment action response
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PaySubscriptionReceipt.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PaySubscriptionReceipt {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("headerId")
        private String headerId;

        public Builder headerId(String headerId) {
            this.headerId = headerId;
            this.__explicitlySet__.add("headerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("apiToken")
        private String apiToken;

        public Builder apiToken(String apiToken) {
            this.apiToken = apiToken;
            this.__explicitlySet__.add("apiToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userToken")
        private String userToken;

        public Builder userToken(String userToken) {
            this.userToken = userToken;
            this.__explicitlySet__.add("userToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PaySubscriptionReceipt build() {
            PaySubscriptionReceipt __instance__ =
                    new PaySubscriptionReceipt(headerId, apiToken, userToken);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PaySubscriptionReceipt o) {
            Builder copiedBuilder =
                    headerId(o.getHeaderId()).apiToken(o.getApiToken()).userToken(o.getUserToken());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Payment header id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headerId")
    String headerId;

    /**
     * Parameters in a token for Payment Service
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("apiToken")
    String apiToken;

    /**
     * Session token created for Payment Service
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userToken")
    String userToken;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}