package cn.z201.io.learning.rpc.micro.consumer.controller;

import cn.z201.io.api.DefaultDemoServiceI;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author z201.coding@gmail.com
 **/
@RestController
@Slf4j
public class ApiController {

    @Reference(version = "1.0.0")
    private DefaultDemoServiceI defaultDemoService;

    @RequestMapping(value = "")
    public String sayHello() {
        return defaultDemoService.sayHello("consumer");
//        return "consumer";
    }
}
