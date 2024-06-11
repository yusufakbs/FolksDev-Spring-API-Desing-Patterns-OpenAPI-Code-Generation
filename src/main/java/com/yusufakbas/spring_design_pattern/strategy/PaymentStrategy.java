package com.yusufakbas.spring_design_pattern.strategy;

public interface PaymentStrategy {
    String pay(String orderId, Double amount, String paymentType);
}
