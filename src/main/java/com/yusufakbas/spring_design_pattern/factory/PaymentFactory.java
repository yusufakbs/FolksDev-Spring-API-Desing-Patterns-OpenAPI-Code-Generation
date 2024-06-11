package com.yusufakbas.spring_design_pattern.factory;

import com.yusufakbas.spring_design_pattern.dto.PaymentRequest;

public interface PaymentFactory {
    String executePayment(PaymentRequest paymentRequest);
}
