package com.beyondsoft.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.beyondsoft.springcloud.alibaba.myhandler.CustomerBlockHandler;
import com.beyondsoft.springcloud.entities.CommonResult;
import com.beyondsoft.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException") // 如果违背了sentinel热点规则，则用兜底方法deal_testHotKey处理
    public CommonResult byResource(){
        return new CommonResult(200,"按资源名称限流测试ok",new Payment(2020L,"serial001"));
    }

    public CommonResult handleException(BlockException exception){
        return new CommonResult(444, exception.getClass().getCanonicalName()+"\t服务不可用");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl(){
        return new CommonResult(200,"按Url限流测试ok",new Payment(2020L,"serial002"));
    }

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handleException2")
    public CommonResult customerBlockHandler(){
        return new CommonResult(200,"按客户自定义",new Payment(2020L,"serial003"));
    }
}
