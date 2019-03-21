package cn.z201.io.learning.rpc.micro.consumer;

import cn.z201.io.api.DefaultDemoServiceI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author z201.coding@gmail.com
 **/
@RestController
@Slf4j
public class ApiController {

    @Autowired
    private DefaultDemoServiceI defaultDemoService;

    @RequestMapping(value = "")
    public String runner() {
        return defaultDemoService.sayHello("consumer");
    }
}
