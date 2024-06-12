package com.yusufakbas.spring_design_pattern.enumfactory;

import com.yusufakbas.spring_design_pattern.enumfactory.payment.Payment;
import com.yusufakbas.spring_design_pattern.enumfactory.payment.impl.CreditCardPayment;
import com.yusufakbas.spring_design_pattern.enumfactory.payment.impl.WireTransferPayment;

public enum PaymentEnumType {
    CREDIT_CARD("creditCard", new CreditCardPayment()) {
        @Override
        public void output() {
            System.out.println("Payment type: CREDIT_CARD");
        }
    },
    WIRE_TRANSFER("wireTransfer", new WireTransferPayment()) {
        @Override
        public void output() {
            System.out.println("Payment type: WIRE_TRANSFER");
        }
    };

    private final String value;

    private final Payment payment;


    PaymentEnumType(String value, Payment payment) {
        this.value = value;
        this.payment = payment;
    }

    public String getValue() {
        return value;
    }

    public Payment getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return value;
    }


    public static PaymentEnumType getPaymentType(String paymentType) {
        for(PaymentEnumType paymentEnumType : PaymentEnumType.values()) {
            if(paymentEnumType.getValue().equals(paymentType)) {
                return paymentEnumType;
            }
        }
        throw new IllegalArgumentException("Payment type not supported");
    }


    abstract public void output();

}
