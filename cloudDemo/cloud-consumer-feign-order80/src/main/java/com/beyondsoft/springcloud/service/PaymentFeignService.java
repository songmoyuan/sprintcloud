package com.beyondsoft.springcloud.service;

import com.beyondsoft.springcloud.entities.CommonResult;
import com.beyondsoft.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE") //使用Feign，value告诉Feign调用哪个服务
// feign 服务者提供什么调用什么（相当于菜单上有什么我点什么）
public interface PaymentFeignService {
//    CommonResult<Payment>  getPaymentById  (@Param("id") Long id); // 读操作
    @GetMapping(value = "payment/get/{id}")
    public CommonResult<Payment> getPaymentById (@PathVariable("id") Long id);
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
