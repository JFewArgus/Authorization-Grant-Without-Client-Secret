/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.oauth2.grant.validator;

import org.apache.oltu.oauth2.as.validator.RefreshTokenValidator;

/**
 * Extended Grant Validator for Refresh Grant Type to remove the strict client authentication. This will be
 * required to enable authorization code grant without client_secret.
 */
public class ExtendedRefreshGrantValidator extends RefreshTokenValidator {
    public ExtendedRefreshGrantValidator() {
        super();
        this.enforceClientAuthentication = false;
    }
}
