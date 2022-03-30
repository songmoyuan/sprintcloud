package com.beyondsoft.springcloud.dao;

import com.beyondsoft.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

// dao层是和数据库打交道的
@Mapper
public interface PaymentDao {
    public  int  create(Payment payment); // 写操作
    public  Payment getPaymentById  (@Param("id") Long id); // 读操作
}
