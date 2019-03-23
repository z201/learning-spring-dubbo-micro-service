package cn.z201.io.learning.rpc.micro.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author z201.coding@gmail.com
 **/
@SpringBootApplication
@Slf4j
@ImportResource(value = {
        "classpath:dubbo-consumer.xml"
})
public class AppConsumerMain {

    public static void main(String[] args) {
        System.setProperty("dubbo.application.logger","slf4j");
        SpringApplication.run(AppConsumerMain.class, args);
    }



}
