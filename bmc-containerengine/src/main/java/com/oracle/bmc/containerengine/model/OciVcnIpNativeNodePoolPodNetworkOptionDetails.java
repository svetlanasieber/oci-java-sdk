/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Network options specific to using the OCI VCN Native CNI
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OciVcnIpNativeNodePoolPodNetworkOptionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "cniType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OciVcnIpNativeNodePoolPodNetworkOptionDetails
        extends NodePoolPodNetworkOptionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The max number of pods per node in the node pool. This value will be limited by the number of VNICs attachable to the node pool shape
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxPodsPerNode")
        private Integer maxPodsPerNode;

        /**
         * The max number of pods per node in the node pool. This value will be limited by the number of VNICs attachable to the node pool shape
         *
         * @param maxPodsPerNode the value to set
         * @return this builder
         **/
        public Builder maxPodsPerNode(Integer maxPodsPerNode) {
            this.maxPodsPerNode = maxPodsPerNode;
            this.__explicitlySet__.add("maxPodsPerNode");
            return this;
        }
        /**
         * The OCIDs of the Network Security Group(s) to associate pods for this node pool with. For more information about NSGs, see {@link NetworkSecurityGroup}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("podNsgIds")
        private java.util.List<String> podNsgIds;

        /**
         * The OCIDs of the Network Security Group(s) to associate pods for this node pool with. For more information about NSGs, see {@link NetworkSecurityGroup}.
         *
         * @param podNsgIds the value to set
         * @return this builder
         **/
        public Builder podNsgIds(java.util.List<String> podNsgIds) {
            this.podNsgIds = podNsgIds;
            this.__explicitlySet__.add("podNsgIds");
            return this;
        }
        /**
         * The OCIDs of the subnets in which to place pods for this node pool. This can be one of the node pool subnet IDs
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("podSubnetIds")
        private java.util.List<String> podSubnetIds;

        /**
         * The OCIDs of the subnets in which to place pods for this node pool. This can be one of the node pool subnet IDs
         *
         * @param podSubnetIds the value to set
         * @return this builder
         **/
        public Builder podSubnetIds(java.util.List<String> podSubnetIds) {
            this.podSubnetIds = podSubnetIds;
            this.__explicitlySet__.add("podSubnetIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciVcnIpNativeNodePoolPodNetworkOptionDetails build() {
            OciVcnIpNativeNodePoolPodNetworkOptionDetails __instance__ =
                    new OciVcnIpNativeNodePoolPodNetworkOptionDetails(
                            maxPodsPerNode, podNsgIds, podSubnetIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciVcnIpNativeNodePoolPodNetworkOptionDetails o) {
            Builder copiedBuilder =
                    maxPodsPerNode(o.getMaxPodsPerNode())
                            .podNsgIds(o.getPodNsgIds())
                            .podSubnetIds(o.getPodSubnetIds());

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
    public OciVcnIpNativeNodePoolPodNetworkOptionDetails(
            Integer maxPodsPerNode,
            java.util.List<String> podNsgIds,
            java.util.List<String> podSubnetIds) {
        super();
        this.maxPodsPerNode = maxPodsPerNode;
        this.podNsgIds = podNsgIds;
        this.podSubnetIds = podSubnetIds;
    }

    /**
     * The max number of pods per node in the node pool. This value will be limited by the number of VNICs attachable to the node pool shape
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxPodsPerNode")
    private final Integer maxPodsPerNode;

    /**
     * The max number of pods per node in the node pool. This value will be limited by the number of VNICs attachable to the node pool shape
     *
     * @return the value
     **/
    public Integer getMaxPodsPerNode() {
        return maxPodsPerNode;
    }

    /**
     * The OCIDs of the Network Security Group(s) to associate pods for this node pool with. For more information about NSGs, see {@link NetworkSecurityGroup}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("podNsgIds")
    private final java.util.List<String> podNsgIds;

    /**
     * The OCIDs of the Network Security Group(s) to associate pods for this node pool with. For more information about NSGs, see {@link NetworkSecurityGroup}.
     *
     * @return the value
     **/
    public java.util.List<String> getPodNsgIds() {
        return podNsgIds;
    }

    /**
     * The OCIDs of the subnets in which to place pods for this node pool. This can be one of the node pool subnet IDs
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("podSubnetIds")
    private final java.util.List<String> podSubnetIds;

    /**
     * The OCIDs of the subnets in which to place pods for this node pool. This can be one of the node pool subnet IDs
     *
     * @return the value
     **/
    public java.util.List<String> getPodSubnetIds() {
        return podSubnetIds;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OciVcnIpNativeNodePoolPodNetworkOptionDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", maxPodsPerNode=").append(String.valueOf(this.maxPodsPerNode));
        sb.append(", podNsgIds=").append(String.valueOf(this.podNsgIds));
        sb.append(", podSubnetIds=").append(String.valueOf(this.podSubnetIds));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciVcnIpNativeNodePoolPodNetworkOptionDetails)) {
            return false;
        }

        OciVcnIpNativeNodePoolPodNetworkOptionDetails other =
                (OciVcnIpNativeNodePoolPodNetworkOptionDetails) o;
        return java.util.Objects.equals(this.maxPodsPerNode, other.maxPodsPerNode)
                && java.util.Objects.equals(this.podNsgIds, other.podNsgIds)
                && java.util.Objects.equals(this.podSubnetIds, other.podSubnetIds)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maxPodsPerNode == null ? 43 : this.maxPodsPerNode.hashCode());
        result = (result * PRIME) + (this.podNsgIds == null ? 43 : this.podNsgIds.hashCode());
        result = (result * PRIME) + (this.podSubnetIds == null ? 43 : this.podSubnetIds.hashCode());
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