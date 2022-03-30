package com.beyondsoft.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.beyondsoft.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
