package com.shubham.springboot.paymentservice.services;

import com.razorpay.RazorpayClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayChooserStrategy {


    @Autowired
    RazorpayPaymentGateway razorpayPaymentGateway;

    @Autowired
    StripePaymentGateway stripePaymentGateway;

    IPaymentGateway getBestPaymentGateway(){
        return stripePaymentGateway;
    }


}
