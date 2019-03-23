package cn.z201.io.learning.rpc.micro.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


/**
 * @author z201.coding@gmail.com
 **/
@Slf4j
@EnableAutoConfiguration
public class AppProviderEmailMain {

    public static void main(String[] args) {
        System.setProperty("dubbo.application.logger","slf4j");
        SpringApplication.run(AppProviderEmailMain.class, args);
    }

}
