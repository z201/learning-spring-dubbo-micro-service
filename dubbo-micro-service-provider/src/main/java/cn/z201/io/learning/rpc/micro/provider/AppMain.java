package cn.z201.io.learning.rpc.micro.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author z201.coding@gmail.com
 **/
@SpringBootApplication
@ImportResource(value = {
        "classpath:dubbo-provider.xml"
})
public class AppMain {

    public static void main(String[] args) {
        SpringApplication.run(AppMain.class, args);
    }
}
