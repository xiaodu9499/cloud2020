package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @Classname PaymentService
 * @Description
 * @Date 2021/5/11 16:48
 * @Created by xiaodu
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
