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
package org.apache.dubbo.common.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * Indicate alias for field when generic invoking. <br>
 *
 *
 * <p>
 *     sometimes you receive json string which contains non-camelcase key name,e.g. order_id,
 *     but the java bean needs camelcase name,e.g orderId, you should convert manually each other,
 *     basing GenericFeature annotation it could be converted automatically.
 * </p>
 *
 */
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GenericFeature {
    String alias();
    boolean ignore() default false;
    boolean numberAsString() default false;
    String  dateFormatter() default "";
    boolean nullNotRealize() default false;
    boolean nullNotGeneralize() default false;
    boolean nullDateAsZeroGeneralize() default false;
}
