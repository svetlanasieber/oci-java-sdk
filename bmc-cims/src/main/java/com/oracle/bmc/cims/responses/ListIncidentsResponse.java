/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.responses;

import com.oracle.bmc.cims.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListIncidentsResponse {

    /**
     * OPC Request Id
     */
    private String opcRequestId;

    /**
     * OPC next page
     */
    private String opcNextPage;

    /**
     * e-Tag
     */
    private String etag;

    /**
     * A list of IncidentSummary instances.
     */
    private java.util.List<IncidentSummary> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListIncidentsResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            etag(o.getEtag());
            items(o.getItems());

            return this;
        }
    }
}