/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.security.tools.scanmanager.common.model;

/**
 * An enumeration of priorities describing the priority of a scan.
 */
public enum ScanPriority {
    HIGH(1),
    MEDIUM(2),
    LOW(3);

    private final int value;

    ScanPriority(int value) {
        this.value = value;
    }

    /**
     * Get value of a enum.
     *
     * @return value of the enum
     */
    public int getValue() {
        return value;
    }

    /**
     * Get the enum by value.
     *
     * @param value value of the enum
     * @return enum with the requested value
     */
    public static ScanPriority getEnumByValue(int value) {
        for (ScanPriority scanPriority : ScanPriority.values()) {
            if (scanPriority.value == value) {
                return scanPriority;
            }
        }
        return null;
    }
}
