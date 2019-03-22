package cn.z201.io.learning.rpc.micro.consumer.controller;

import cn.z201.io.api.DefaultDemoServiceI;
import cn.z201.io.dto.PersionDTO;
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

    @Reference(version = "1.0.0",group = "demo")
    private DefaultDemoServiceI defaultDemoService;

    @RequestMapping(value = "")
    public String say() {
        return defaultDemoService.say("consumer");
    }

    @RequestMapping(value = "/consumer")
    public PersionDTO sayConsumer() {
        return defaultDemoService.sayConsumer("consumer", 12);
    }
}
