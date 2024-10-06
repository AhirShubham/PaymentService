package com.shubham.springboot.paymentservice.controllers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitializePaymentRequestDto {

    String name;
    String email;
    String phoneNumber;
    String orderId;
}
