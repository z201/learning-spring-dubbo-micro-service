package cn.z201.io.learning.rpc.micro.provider.service;

import cn.z201.io.api.DefaultDemoServiceI;
import org.springframework.beans.factory.annotation.Value;


/**
 * Default {@link DefaultDemoServiceImpl}
 *
 * @author zengqingfeng
 * @see DefaultDemoServiceImpl
 * @since 2.7.0
 */
public class DefaultDemoServiceImpl implements DefaultDemoServiceI{

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${spring.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}