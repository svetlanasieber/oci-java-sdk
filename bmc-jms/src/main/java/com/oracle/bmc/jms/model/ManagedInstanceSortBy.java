/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The field to sort managed instances.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public enum ManagedInstanceSortBy {
    TimeFirstSeen("timeFirstSeen"),
    TimeLastSeen("timeLastSeen"),
    ApproximateJreCount("approximateJreCount"),
    ApproximateInstallationCount("approximateInstallationCount"),
    ApproximateApplicationCount("approximateApplicationCount"),
    OsName("osName"),
    ;

    private final String value;
    private static java.util.Map<String, ManagedInstanceSortBy> map;

    static {
        map = new java.util.HashMap<>();
        for (ManagedInstanceSortBy v : ManagedInstanceSortBy.values()) {
            map.put(v.getValue(), v);
        }
    }

    ManagedInstanceSortBy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ManagedInstanceSortBy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ManagedInstanceSortBy: " + key);
    }
}
