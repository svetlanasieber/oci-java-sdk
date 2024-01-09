/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Position and value for an IN parameter of PL/SQL statement <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlInParamDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlInParamDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"inParamPosition", "inParamValue"})
    public SqlInParamDetails(Integer inParamPosition, String inParamValue) {
        super();
        this.inParamPosition = inParamPosition;
        this.inParamValue = inParamValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Position of IN parameter */
        @com.fasterxml.jackson.annotation.JsonProperty("inParamPosition")
        private Integer inParamPosition;

        /**
         * Position of IN parameter
         *
         * @param inParamPosition the value to set
         * @return this builder
         */
        public Builder inParamPosition(Integer inParamPosition) {
            this.inParamPosition = inParamPosition;
            this.__explicitlySet__.add("inParamPosition");
            return this;
        }
        /** Value of IN parameter */
        @com.fasterxml.jackson.annotation.JsonProperty("inParamValue")
        private String inParamValue;

        /**
         * Value of IN parameter
         *
         * @param inParamValue the value to set
         * @return this builder
         */
        public Builder inParamValue(String inParamValue) {
            this.inParamValue = inParamValue;
            this.__explicitlySet__.add("inParamValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlInParamDetails build() {
            SqlInParamDetails model =
                    new SqlInParamDetails(this.inParamPosition, this.inParamValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlInParamDetails model) {
            if (model.wasPropertyExplicitlySet("inParamPosition")) {
                this.inParamPosition(model.getInParamPosition());
            }
            if (model.wasPropertyExplicitlySet("inParamValue")) {
                this.inParamValue(model.getInParamValue());
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

    /** Position of IN parameter */
    @com.fasterxml.jackson.annotation.JsonProperty("inParamPosition")
    private final Integer inParamPosition;

    /**
     * Position of IN parameter
     *
     * @return the value
     */
    public Integer getInParamPosition() {
        return inParamPosition;
    }

    /** Value of IN parameter */
    @com.fasterxml.jackson.annotation.JsonProperty("inParamValue")
    private final String inParamValue;

    /**
     * Value of IN parameter
     *
     * @return the value
     */
    public String getInParamValue() {
        return inParamValue;
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
        sb.append("SqlInParamDetails(");
        sb.append("super=").append(super.toString());
        sb.append("inParamPosition=").append(String.valueOf(this.inParamPosition));
        sb.append(", inParamValue=").append(String.valueOf(this.inParamValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlInParamDetails)) {
            return false;
        }

        SqlInParamDetails other = (SqlInParamDetails) o;
        return java.util.Objects.equals(this.inParamPosition, other.inParamPosition)
                && java.util.Objects.equals(this.inParamValue, other.inParamValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.inParamPosition == null ? 43 : this.inParamPosition.hashCode());
        result = (result * PRIME) + (this.inParamValue == null ? 43 : this.inParamValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}