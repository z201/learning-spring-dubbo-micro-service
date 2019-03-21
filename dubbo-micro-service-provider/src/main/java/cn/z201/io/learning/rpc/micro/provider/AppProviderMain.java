package cn.z201.io.learning.rpc.micro.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * @author z201.coding@gmail.com
 **/
@SpringBootApplication
@ImportResource(value = {
        "classpath:dubbo-provider.xml"
})
@Slf4j
public class AppProviderMain {

    public static void main(String[] args) {
        System.setProperty("dubbo.application.logger","slf4j");
        SpringApplication.run(AppProviderMain.class, args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
