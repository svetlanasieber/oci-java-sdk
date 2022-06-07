/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.responses;

import com.oracle.bmc.resourcemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class ChangePrivateEndpointCompartmentResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId"})
    private ChangePrivateEndpointCompartmentResponse(int __httpStatusCode__, String opcRequestId) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ChangePrivateEndpointCompartmentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());

            return this;
        }

        public ChangePrivateEndpointCompartmentResponse build() {
            return new ChangePrivateEndpointCompartmentResponse(__httpStatusCode__, opcRequestId);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangePrivateEndpointCompartmentResponse)) {
            return false;
        }

        ChangePrivateEndpointCompartmentResponse other =
                (ChangePrivateEndpointCompartmentResponse) o;
        return super.equals(o) && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}