package com.shubham.springboot.paymentservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {

    @Autowired
    @Qualifier("razorpay")
    private IPaymentGateway paymentGateway;

    @Override
    public String getPaymentLink() {
        return paymentGateway.getPaymentLink();
    }
}
