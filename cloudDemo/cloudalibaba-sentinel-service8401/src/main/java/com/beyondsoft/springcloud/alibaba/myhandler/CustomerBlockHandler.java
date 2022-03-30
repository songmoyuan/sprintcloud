package com.beyondsoft.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.beyondsoft.springcloud.entities.CommonResult;
import com.beyondsoft.springcloud.entities.Payment;

public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(444,"按客户自定义，global handleException-----1");
    }
    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(444,"按客户自定义，global handleException-----2");
    }
}
