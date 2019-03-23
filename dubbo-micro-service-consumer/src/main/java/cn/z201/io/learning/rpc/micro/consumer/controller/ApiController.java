package cn.z201.io.learning.rpc.micro.consumer.controller;

import cn.z201.io.api.DefaultDemoServiceI;
import cn.z201.io.api.DefaultEmailServiceI;
import cn.z201.io.dto.PersionDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.UndeclaredThrowableException;

/**
 * @author z201.coding@gmail.com
 **/
@RestController
@Slf4j
public class ApiController {

    @Reference(version = "1.0.0", group = "demo")
    private DefaultDemoServiceI defaultDemoService;

    @Reference(version = "1.0.0", group = "email")
    DefaultEmailServiceI defaultEmailService;

    @RequestMapping(value = "")
    public String say() {
        return defaultDemoService.say("consumer");
    }

    @RequestMapping(value = "/consumer")
    public PersionDTO sayConsumer() {
        return defaultDemoService.sayConsumer("consumer", 12);
    }

    @RequestMapping(value = "/e")
    public String error() {
        String msg = "ok";
        try {
            defaultDemoService.error();
        } catch (Exception e) {
            if (e instanceof UndeclaredThrowableException) {
                Throwable targetEx = ((UndeclaredThrowableException) e).getUndeclaredThrowable();
                if (targetEx != null) {
                    if (Strings.isBlank(targetEx.getMessage())) {
                        msg = targetEx.getCause().getMessage();
                    } else {
                        msg = targetEx.getMessage();
                    }
                }
            } else {
                msg = e.getMessage();
            }
        }
        return msg;
    }

    @RequestMapping(value = "/email")
    public String email() {
        defaultEmailService.sendSimpleMail("int_java_se@163.com", "test email");
        return "ok";
    }

}
