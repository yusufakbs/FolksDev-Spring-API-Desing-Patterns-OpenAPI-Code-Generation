package com.yusufakbas.spring_design_pattern.strategy.impl;

import com.yusufakbas.spring_design_pattern.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service("wireCard")
public class WireTransferStrategy implements PaymentStrategy {

    @Override
    public String pay(String orderId, Double amount, String paymentType) {
        return "Payment done with wire transfer for orderId: " + orderId + " amount: " + amount + " payment type: " + paymentType;
    }
}
