package cn.z201.io.learning.rpc.micro.mock;

import cn.z201.io.api.DefaultDemoServiceI;
import cn.z201.io.api.DefaultEmailServiceI;
import cn.z201.io.dto.PersionDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.logging.log4j.util.Strings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.UndeclaredThrowableException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppMockTestMain.class)
@Slf4j
public class AppMockTestMainTest {

    @Reference(version = "1.0.0", group = "demo")
    private DefaultDemoServiceI defaultDemoService;

    @Reference(version = "1.0.0", group = "email")
    DefaultEmailServiceI defaultEmailService;

    @Test
    public void sayConsumer() {
        log.info("obj : {}" , defaultDemoService.sayConsumer("consumer", 12));;
    }

    @Test
    public void error() {
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
        log.info("msg: {}" , msg);
    }

    @Test
    public void email() {
        defaultEmailService.sendSimpleMail("int_java_se@163.com", "一份普通的邮件");
    }


}