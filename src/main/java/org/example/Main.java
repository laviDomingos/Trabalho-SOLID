package org.example;

import org.example.model.Order;
import org.example.model.OrderItem;
import org.example.payment.CreditCardPayment;
import org.example.payment.PaymentMethod;
import org.example.payment.PixPayment;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //CANTINA DO SENAI
        Costumer costumer = new Costumer("Ronaldo", true, "ronaldo@email.com");
        OrderItem item1 = new OrderItem("Sanduíche", 10.0, 2);
        OrderItem item2 = new OrderItem("Pão de Queijo", 4.50, 3);
        Order order = new Order(1, costumer, Arrays.asList(item1, item2));

        //MERCADO
        Costumer costumer2 = new Costumer("Laura", true, "laura@email.com");
        OrderItem item3 = new OrderItem("Pão", 2.50, 6);
        OrderItem item4 = new OrderItem("Refrigerante", 10.30, 3);
        Order order2 = new Order(2, costumer2, Arrays.asList(item3, item4));

        PricingService pricingService = new PricingService(Arrays.asList(new StudentDiscountPolicy()));
        PricingService pricingService2 = new PricingService(Arrays.asList(new StudentDiscountPolicy()));

        PaymentMethod paymentMethod = new PixPayment();
        Notifier notifier = new EmailNotifier();

        PaymentMethod paymentMethod2 = new CreditCardPayment();
        Notifier notifier2 = new EmailNotifier();

        CheckoutService checkout = new CheckoutService(pricingService, paymentMethod, notifier);
        checkout.checkout(order);

        CheckoutService checkout2 = new CheckoutService(pricingService2, paymentMethod2, notifier2);
        checkout2.checkout(order2);


    }
}