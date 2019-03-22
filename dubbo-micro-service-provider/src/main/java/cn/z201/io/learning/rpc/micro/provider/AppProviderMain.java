package cn.z201.io.learning.rpc.micro.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.io.IOException;

/**
 * @author z201.coding@gmail.com
 **/
@Slf4j
@EnableAutoConfiguration
public class AppProviderMain {

    public static void main(String[] args) {
        System.setProperty("dubbo.application.logger","slf4j");
        new SpringApplicationBuilder(AppProviderMain.class).run(args);
    }

}
