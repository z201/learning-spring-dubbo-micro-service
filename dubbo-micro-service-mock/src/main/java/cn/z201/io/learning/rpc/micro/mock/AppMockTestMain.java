package cn.z201.io.learning.rpc.micro.mock;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author z201.coding@gmail.com
 **/
@EnableAutoConfiguration
public class AppMockTestMain {

    public static void main(String[] args) {
        System.setProperty("dubbo.application.logger","slf4j");
        SpringApplication.run(AppMockTestMain.class, args);
    }


}
