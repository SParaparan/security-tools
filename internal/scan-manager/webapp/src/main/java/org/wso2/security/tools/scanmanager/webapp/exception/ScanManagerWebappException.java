/*
*  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.security.tools.scanmanager.webapp.exception;

/**
 * This is the general scan manager webapp exception for all operations dealing with scan manager webapp.
 */
public class ScanManagerWebappException extends Exception {

    /**
     * Constructs a new exception.
     */
    public ScanManagerWebappException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param message Message for the exception
     */
    public ScanManagerWebappException(String message) {
        super(message);
    }

    /**
     * Constructs a new exception with the specified detail message and
     * cause.
     *
     * @param message Message for the exception
     * @param e throwable object
     */
    public ScanManagerWebappException(String message, Throwable e) {
        super(message, e);
    }
}
