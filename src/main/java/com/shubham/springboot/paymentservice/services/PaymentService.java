package com.shubham.springboot.paymentservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {

    @Autowired

    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    @Override
    public String getPaymentLink(String name, String email, String phoneNumber, String orderId) {

        IPaymentGateway paymentGateway = paymentGatewayChooserStrategy.getBestPaymentGateway();
        return paymentGateway.getPaymentLink(name,email,phoneNumber,orderId);
    }
}
