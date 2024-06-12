package com.yusufakbas.spring_design_pattern.enumfactory.payment.impl;

import com.yusufakbas.spring_design_pattern.enumfactory.payment.Payment;
import org.springframework.stereotype.Service;

@Service
public class WireTransferPayment implements Payment {
    @Override
    public String pay(String orderId, Double amount) {
        return "Payment done with wire transfer in EnumType method orderId: " + orderId + " amount: " + amount ;
    }
}
