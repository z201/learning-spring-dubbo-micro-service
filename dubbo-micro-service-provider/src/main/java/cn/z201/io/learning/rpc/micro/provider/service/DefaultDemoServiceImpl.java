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
package cn.z201.io.learning.rpc.micro.provider.service;

import cn.z201.io.api.DefaultDemoServiceI;
import cn.z201.io.dto.PersionDTO;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcException;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Value;

import java.sql.Time;
import java.sql.Timestamp;


/**
 * Default {@link DefaultDemoServiceImpl}
 * @author z201.coding@gmail.com
 * @see DefaultDemoServiceImpl
 * @since 2.7.0
 */
@Service(version = "1.0.0" ,group = "demo")
public class DefaultDemoServiceImpl implements DefaultDemoServiceI {
    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${spring.name}")
    private String serviceName;

    @Override
    public String say(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }

    @Override
    public PersionDTO sayConsumer(String name, Integer age) {
        return new PersionDTO(serviceName+" : "+age.toString(), new Timestamp(System.currentTimeMillis()));
}

    @Override
    public String error()  {
        throw new RpcException(0,"假装一个异常");
    }
}