package com.yusufakbas.spring_design_pattern.enumfactory.payment;

public interface Payment {

    String pay(String orderId, Double amount);
}
