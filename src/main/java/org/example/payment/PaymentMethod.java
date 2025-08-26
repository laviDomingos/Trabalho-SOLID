package org.example.payment;

import org.example.model.Order;

public interface PaymentMethod {

    void pay(Order order, double amount);
}
