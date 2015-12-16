/*
 *  Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.carbon.mss.internal.router;

import com.google.common.collect.ImmutableMap;
import org.wso2.carbon.mss.ServiceContext;

import java.util.Map;

/**
 * BasicHandlerContext returns an empty runtime arguments.
 */
public class BasicServiceContext implements ServiceContext {
    private final MicroserviceMetadata httpResourceHandler;

    public BasicServiceContext(MicroserviceMetadata httpResourceHandler) {
        this.httpResourceHandler = httpResourceHandler;
    }

    @Override
    public Map<String, String> getRuntimeArguments() {
        return ImmutableMap.of();
    }

    @Override
    public MicroserviceMetadata getHttpResourceHandler() {
        return httpResourceHandler;
    }
}
