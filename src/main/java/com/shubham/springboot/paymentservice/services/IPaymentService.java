package com.shubham.springboot.paymentservice.services;

import com.shubham.springboot.paymentservice.controllers.InitializePaymentRequestDto;

public interface IPaymentService {

    String getPaymentLink();
}
