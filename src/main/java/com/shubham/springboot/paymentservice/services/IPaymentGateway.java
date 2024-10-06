package com.shubham.springboot.paymentservice.services;

public interface IPaymentGateway {

    String getPaymentLink(String name,String email,String phoneNumber,String orderId);
}
