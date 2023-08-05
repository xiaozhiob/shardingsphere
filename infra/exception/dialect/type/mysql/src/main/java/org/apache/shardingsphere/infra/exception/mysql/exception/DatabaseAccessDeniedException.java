/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.infra.exception.mysql.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.infra.exception.dialect.exception.SQLDialectException;

/**
 * Database access denied exception.
 */
@RequiredArgsConstructor
@Getter
public final class DatabaseAccessDeniedException extends SQLDialectException {
    
    private static final long serialVersionUID = 4142387446125168244L;
    
    private final String username;
    
    private final String hostname;
    
    private final String databaseName;
}