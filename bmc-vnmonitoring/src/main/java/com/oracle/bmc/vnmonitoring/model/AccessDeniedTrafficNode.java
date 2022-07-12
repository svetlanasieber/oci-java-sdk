/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the configuration of a traffic node to which the user is denied access.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AccessDeniedTrafficNode.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AccessDeniedTrafficNode extends TrafficNode {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("egressTraffic")
        private EgressTrafficSpec egressTraffic;

        public Builder egressTraffic(EgressTrafficSpec egressTraffic) {
            this.egressTraffic = egressTraffic;
            this.__explicitlySet__.add("egressTraffic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nextHopRoutingAction")
        private RoutingAction nextHopRoutingAction;

        public Builder nextHopRoutingAction(RoutingAction nextHopRoutingAction) {
            this.nextHopRoutingAction = nextHopRoutingAction;
            this.__explicitlySet__.add("nextHopRoutingAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("egressSecurityAction")
        private SecurityAction egressSecurityAction;

        public Builder egressSecurityAction(SecurityAction egressSecurityAction) {
            this.egressSecurityAction = egressSecurityAction;
            this.__explicitlySet__.add("egressSecurityAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ingressSecurityAction")
        private SecurityAction ingressSecurityAction;

        public Builder ingressSecurityAction(SecurityAction ingressSecurityAction) {
            this.ingressSecurityAction = ingressSecurityAction;
            this.__explicitlySet__.add("ingressSecurityAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessDeniedTrafficNode build() {
            AccessDeniedTrafficNode __instance__ =
                    new AccessDeniedTrafficNode(
                            egressTraffic,
                            nextHopRoutingAction,
                            egressSecurityAction,
                            ingressSecurityAction);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessDeniedTrafficNode o) {
            Builder copiedBuilder =
                    egressTraffic(o.getEgressTraffic())
                            .nextHopRoutingAction(o.getNextHopRoutingAction())
                            .egressSecurityAction(o.getEgressSecurityAction())
                            .ingressSecurityAction(o.getIngressSecurityAction());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public AccessDeniedTrafficNode(
            EgressTrafficSpec egressTraffic,
            RoutingAction nextHopRoutingAction,
            SecurityAction egressSecurityAction,
            SecurityAction ingressSecurityAction) {
        super(egressTraffic, nextHopRoutingAction, egressSecurityAction, ingressSecurityAction);
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AccessDeniedTrafficNode(");
        sb.append("super=").append(super.toString());
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessDeniedTrafficNode)) {
            return false;
        }

        AccessDeniedTrafficNode other = (AccessDeniedTrafficNode) o;
        return java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}