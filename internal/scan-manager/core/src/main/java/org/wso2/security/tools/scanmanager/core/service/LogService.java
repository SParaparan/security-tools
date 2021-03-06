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
package org.wso2.security.tools.scanmanager.core.service;

import org.springframework.data.domain.Page;
import org.wso2.security.tools.scanmanager.common.external.model.Log;
import org.wso2.security.tools.scanmanager.common.external.model.Scan;
import org.wso2.security.tools.scanmanager.common.model.LogType;

import java.sql.Timestamp;

/**
 * The log service class that manage the methods of the Scan logs.
 */
public interface LogService {

    /**
     * Insert an error log entity during an exception.
     *
     * @param scan      scan details
     * @param e         throwable error message
     * @return true if a scan id found for the given scan.
     */
    public boolean insertError(Scan scan, Throwable e);

    /**
     * Insert a log entity.
     *
     * @param scan      scan details
     * @param type      log type
     * @param message   log message
     * @return true if a scan id found for the given scan.
     */
    public boolean insert(Scan scan, LogType type, String message);

    /**
     * Insert a log entity with timestamp.
     *
     * @param scan      scan details
     * @param type      log type
     * @param timestamp timestamp for the log
     * @param message   log message
     * @return true if a scan id found for the given scan.
     */
    public boolean insert(Scan scan, LogType type, Timestamp timestamp, String message);

    /**
     * Get logs for a given scan.
     *
     * @param scan       scan object
     * @param pageNumber required page number
     * @param pageSize   required page size
     * @return requested page containing the logs
     */
    public Page<Log> getByScan(Scan scan, Integer pageNumber, Integer pageSize);
}
