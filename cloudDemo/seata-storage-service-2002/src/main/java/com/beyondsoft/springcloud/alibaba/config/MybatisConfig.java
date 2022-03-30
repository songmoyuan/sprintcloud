package com.beyondsoft.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

public class MybatisConfig {
    @Configuration
    @MapperScan({"com.beyondsoft.springcloud.alibaba.dao"})
    public class MyBatisConfig {
    }
}
