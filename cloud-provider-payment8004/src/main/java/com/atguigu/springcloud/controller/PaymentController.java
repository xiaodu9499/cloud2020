package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Classname PaymentController
 * @Description
 * @Date 2021/5/11 16:49
 * @Created by xiaodu
 */
@RestController
@Slf4j
public class PaymentController {


    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/payment/zk")
    public String paymentzk() {
        return "springcloud with zookeeper :" + serverPort + "\t" + UUID.randomUUID();
    }

}