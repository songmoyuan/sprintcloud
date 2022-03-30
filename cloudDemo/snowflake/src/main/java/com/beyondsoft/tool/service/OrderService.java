package com.beyondsoft.tool.service;

import com.beyondsoft.tool.util.IdGeneratorSnowflake;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class OrderService {
    @Autowired
    private IdGeneratorSnowflake idGenerator;

    public String getIdBySnowFlake(){
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i <=20 ; i++) {
            threadPool.submit(()->{
                System.out.println(idGenerator.snowflakeId());
            });
        }
        threadPool.shutdown();
        return "hello SnowFlake";
    }
}
