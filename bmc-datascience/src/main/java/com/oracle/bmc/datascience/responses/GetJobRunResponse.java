/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.responses;

import com.oracle.bmc.datascience.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetJobRunResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See [ETags for Optimistic Concurrency Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
     *
     */
    private String etag;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact
     * Oracle about a particular request, then provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned JobRun instance.
     */
    private com.oracle.bmc.datascience.model.JobRun jobRun;

    private GetJobRunResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.datascience.model.JobRun jobRun) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.jobRun = jobRun;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetJobRunResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            jobRun(o.getJobRun());

            return this;
        }

        public GetJobRunResponse build() {
            return new GetJobRunResponse(__httpStatusCode__, etag, opcRequestId, jobRun);
        }
    }
}
