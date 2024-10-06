package com.shubham.springboot.paymentservice.controllers;

import com.shubham.springboot.paymentservice.services.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    IPaymentService paymentService;

    @PostMapping
    public String getPaymentLink(@RequestBody InitializePaymentRequestDto request){
       return paymentService.getPaymentLink(request.getName(),request.getEmail(),request.getPhoneNumber(),request.getOrderId());
    }
}
