package org.example;

import org.example.model.Order;
import org.example.model.OrderItem;
import org.example.payment.PaymentMethod;

public class CheckoutService {
    private final PricingService pricingService;
    private final PaymentMethod paymentMethod;
    private final Notifier notifier;

    public CheckoutService(PricingService pricingService, PaymentMethod paymentMethod, Notifier notifier) {
        this.pricingService = pricingService;
        this.paymentMethod = paymentMethod;
        this.notifier = notifier;
    }

    public double checkout(Order order) {
        System.out.println("[Checkout] iniciando pedido " + order.getId());

        // Calcula total com possíveis descontos
        double total = pricingService.calculateTotal(order);

        // Executa pagamento via estratégia
        paymentMethod.pay(order, total);

        // Notifica cliente
        notifier.notify(order.getCustomer().getEmail(),
                "Pedido aprovado: R$" + total);

        return total;
    }

}
