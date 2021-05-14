package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname OrderMaZkMain80
 * @Description
 * @Date 2021/5/13 13:50
 * @Created by xiaodu
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderMaZkMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMaZkMain80.class, args);
    }

}
