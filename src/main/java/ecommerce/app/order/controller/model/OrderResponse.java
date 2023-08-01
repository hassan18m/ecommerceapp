package ecommerce.app.order.controller.model;

import java.math.BigDecimal;

public class OrderResponse extends OrderRequest {

    private Status status;

    public OrderResponse() {
    }

    public OrderResponse(String customerId, BigDecimal totalPrice, PaymentMethod paymentMethod, String promoCode, Status status) {
        super(customerId, totalPrice, paymentMethod, promoCode);
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
