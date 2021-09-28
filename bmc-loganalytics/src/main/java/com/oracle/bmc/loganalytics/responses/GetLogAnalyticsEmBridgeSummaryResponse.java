/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetLogAnalyticsEmBridgeSummaryResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned LogAnalyticsEmBridgeSummaryReport instance.
     */
    private com.oracle.bmc.loganalytics.model.LogAnalyticsEmBridgeSummaryReport
            logAnalyticsEmBridgeSummaryReport;

    private GetLogAnalyticsEmBridgeSummaryResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.LogAnalyticsEmBridgeSummaryReport
                    logAnalyticsEmBridgeSummaryReport) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.logAnalyticsEmBridgeSummaryReport = logAnalyticsEmBridgeSummaryReport;
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
        public Builder copy(GetLogAnalyticsEmBridgeSummaryResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            logAnalyticsEmBridgeSummaryReport(o.getLogAnalyticsEmBridgeSummaryReport());

            return this;
        }

        public GetLogAnalyticsEmBridgeSummaryResponse build() {
            return new GetLogAnalyticsEmBridgeSummaryResponse(
                    __httpStatusCode__, opcRequestId, logAnalyticsEmBridgeSummaryReport);
        }
    }
}
