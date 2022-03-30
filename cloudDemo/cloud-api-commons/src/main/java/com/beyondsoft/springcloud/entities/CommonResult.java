package com.beyondsoft.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//和前端交互
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    private Integer  code; // 类似于404类型的数字编码
    private String   message; //字符串类型的消息
    private T        date; //T:通用泛型匹配符

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
