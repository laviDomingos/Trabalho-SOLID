package org.example.container;

import org.example.*;
import org.example.payment.CreditCardPayment;
import org.example.payment.MealCardPayment;
import org.example.payment.PaymentMethod;
import org.example.payment.PixPayment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AppConfig {

    public static <OrderRepository> CheckoutService createCheckoutService(String paymentType) {

        PricingService pricingService = new PricingService(Arrays.asList(
                new StudentDiscountPolicy(),
                new CouponDiscountPolicy(0.10) // 10% de desconto opcional
        ));

        PaymentMethod paymentMethod;
        switch (paymentType) {
            case "PIX":
                paymentMethod = new PixPayment();
                break;
            case "CREDIT":
                paymentMethod = new CreditCardPayment();
                break;
            case "MEAL":
                paymentMethod = new MealCardPayment();
                break;
            default:
                throw new RuntimeException("Método de pagamento não suportado");
        }

        Notifier notifier = new EmailNotifier();

        return new CheckoutService(pricingService, paymentMethod, notifier);
    }
}
