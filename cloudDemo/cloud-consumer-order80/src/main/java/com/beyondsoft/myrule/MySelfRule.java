package com.beyondsoft.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule(); //定义为随机数，默认是轮询
    }
}
