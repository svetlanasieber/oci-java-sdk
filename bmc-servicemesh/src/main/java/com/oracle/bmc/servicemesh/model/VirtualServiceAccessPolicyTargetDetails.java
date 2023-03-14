/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Virtual service target which communicates with other virtual services in a mesh. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VirtualServiceAccessPolicyTargetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class VirtualServiceAccessPolicyTargetDetails extends AccessPolicyTargetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the virtual service resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("virtualServiceId")
        private String virtualServiceId;

        /**
         * The OCID of the virtual service resource.
         *
         * @param virtualServiceId the value to set
         * @return this builder
         */
        public Builder virtualServiceId(String virtualServiceId) {
            this.virtualServiceId = virtualServiceId;
            this.__explicitlySet__.add("virtualServiceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualServiceAccessPolicyTargetDetails build() {
            VirtualServiceAccessPolicyTargetDetails model =
                    new VirtualServiceAccessPolicyTargetDetails(this.virtualServiceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualServiceAccessPolicyTargetDetails model) {
            if (model.wasPropertyExplicitlySet("virtualServiceId")) {
                this.virtualServiceId(model.getVirtualServiceId());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public VirtualServiceAccessPolicyTargetDetails(String virtualServiceId) {
        super();
        this.virtualServiceId = virtualServiceId;
    }

    /** The OCID of the virtual service resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("virtualServiceId")
    private final String virtualServiceId;

    /**
     * The OCID of the virtual service resource.
     *
     * @return the value
     */
    public String getVirtualServiceId() {
        return virtualServiceId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VirtualServiceAccessPolicyTargetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", virtualServiceId=").append(String.valueOf(this.virtualServiceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualServiceAccessPolicyTargetDetails)) {
            return false;
        }

        VirtualServiceAccessPolicyTargetDetails other = (VirtualServiceAccessPolicyTargetDetails) o;
        return java.util.Objects.equals(this.virtualServiceId, other.virtualServiceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.virtualServiceId == null ? 43 : this.virtualServiceId.hashCode());
        return result;
    }
}