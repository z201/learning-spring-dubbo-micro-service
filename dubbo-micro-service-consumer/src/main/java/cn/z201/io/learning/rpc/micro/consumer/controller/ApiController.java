package cn.z201.io.learning.rpc.micro.consumer.controller;


import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.UndeclaredThrowableException;

/**
 * @author z201.coding@gmail.com
 **/
@RestController
@Slf4j
public class ApiController {

    @RequestMapping(value = "")
    public Object index() {
        RpcContext rpcContext = RpcContext.getContext();
        return rpcContext.getUrls();
    }




}
