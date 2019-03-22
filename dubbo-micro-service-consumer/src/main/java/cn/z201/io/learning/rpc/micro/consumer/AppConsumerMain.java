package cn.z201.io.learning.rpc.micro.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author z201.coding@gmail.com
 **/
@EnableAutoConfiguration
@Slf4j
@ComponentScan({"cn.z201.io.learning.rpc.micro.consumer"})
public class AppConsumerMain {

    public static void main(String[] args) {
        System.setProperty("dubbo.application.logger","slf4j");
        SpringApplication.run(AppConsumerMain.class, args);
    }

}
