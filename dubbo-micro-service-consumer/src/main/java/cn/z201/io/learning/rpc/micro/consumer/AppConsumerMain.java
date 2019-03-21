package cn.z201.io.learning.rpc.micro.consumer;

import cn.z201.io.api.DefaultDemoServiceI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;

/**
 * @author z201.coding@gmail.com
 **/
@SpringBootApplication
@Slf4j
@ImportResource(value = {
        "classpath:dubbo-consumer.xml"
})
@Controller
public class AppConsumerMain {

    public static void main(String[] args) {
        System.setProperty("dubbo.application.logger","slf4j");
        SpringApplication.run(AppConsumerMain.class, args);
    }



}
