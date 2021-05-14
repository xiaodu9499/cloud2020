package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname OrderZkController
 * @Description
 * @Date 2021/5/13 13:52
 * @Created by xiaodu
 */
@Slf4j
@RestController
public class OrderZkController {
    public static final String PAYMENT_URL = "http://cloud-provider-payment";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String create() {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
    }


}
