package com.shubham.springboot.paymentservice.services;

public interface IPaymentService {

    String getPaymentLink(String name, String email, String phoneNumber, String orderId);
}
