package com.beyondsoft.springcloud.service.impl;

import com.beyondsoft.springcloud.dao.PaymentDao;
import com.beyondsoft.springcloud.entities.Payment;
import com.beyondsoft.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource //java自带的依赖注入@Autowired是spring的依赖注入，功能一样
    private PaymentDao paymentDao;
    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id){

        return paymentDao.getPaymentById(id);
    }
}
