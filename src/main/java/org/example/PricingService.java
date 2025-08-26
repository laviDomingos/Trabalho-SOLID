package org.example;

import org.example.model.DiscountPolicy;
import org.example.model.Order;
import org.example.model.OrderItem;

import java.util.List;

public class PricingService {

    private final List<DiscountPolicy> discountPolicies;

    public PricingService(List<DiscountPolicy> discountPolicies) {
        this.discountPolicies = discountPolicies;
    }

    public double calculateTotal(Order order) {
        double total = 0;
        for(OrderItem item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }

        for(DiscountPolicy policy : discountPolicies) {
            total = policy.applyDiscount(order, total);
        }
        return total;
    }
}
