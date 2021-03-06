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
package cn.z201.io.api;

import cn.z201.io.dto.PersionDTO;
import org.apache.dubbo.rpc.RpcException;

/**
 * Demo Service interface
 *
 * @author zengqingfeng
 * @since 2.7.0
 */
public interface DefaultDemoServiceI {

    /**
     * 测试字符串
     * @param name
     * @return
     */
    String say(String name) throws RpcException;

    /**
     * 测试多参数
     * @param name
     * @param age
     * @return
     */
    PersionDTO sayConsumer(String name , Integer age) throws RpcException;

    /**
     * 抛出一个异常
     * @return
     * @throws RpcException
     */
    String error() throws RpcException;

}