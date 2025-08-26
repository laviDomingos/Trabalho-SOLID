package org.example;

import org.example.model.DiscountPolicy;
import org.example.model.Order;

public class CouponDiscountPolicy implements DiscountPolicy {

    private final double porcentage;

    public CouponDiscountPolicy(double porcentage) {
        this.porcentage = porcentage;
    }
    @Override
    public double applyDiscount(Order order, double total) {
        return total * (1 - porcentage);
    }

    public double getPorcentage() {
        return porcentage;
    }
}
