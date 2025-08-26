package org.example.payment;

import org.example.model.Order;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(Order order, double amount) {
        System.out.println("Pagando no cartão de crédito: " + amount);
    }
}
