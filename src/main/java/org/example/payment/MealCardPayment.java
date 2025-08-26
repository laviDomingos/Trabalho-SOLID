package org.example.payment;

import org.example.model.Order;

public class MealCardPayment implements PaymentMethod {

    @Override
    public void pay(Order order, double amount) {
        System.out.println("Pagando via MealCard R$: " + amount);
    }
}
