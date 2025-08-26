package org.example;

import org.example.model.DiscountPolicy;
import org.example.model.Order;

public class StudentDiscountPolicy implements DiscountPolicy {

    @Override
    public double applyDiscount(Order order, double total) {
        if(order.getCustomer().isStudent()) {
            return total * 0.95;
        }
        return total;
    }
}
