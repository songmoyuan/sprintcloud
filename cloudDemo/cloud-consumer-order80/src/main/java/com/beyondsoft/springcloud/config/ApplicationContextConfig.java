package com.beyondsoft.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
// ApplicationContext.xml <beab id="" class="">
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced //使用@LoadBalanced注解赋予RestTemplate敷在均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
