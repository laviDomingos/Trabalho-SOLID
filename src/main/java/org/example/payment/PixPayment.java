package org.example.payment;

import org.example.model.Order;

public class PixPayment implements PaymentMethod {


    @Override
    public void pay(Order order, double amount) {
        System.out.println("Pagando no PIX: " + amount);
    }
}
