package org.example.model;

import org.example.model.Order;

public interface DiscountPolicy {
    double applyDiscount(Order order, double total);
}
