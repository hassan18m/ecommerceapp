package ecommerce.app.order.controller.model;

import com.google.gson.Gson;

import java.math.BigDecimal;

public class OrderRequest {
    Gson gson = new Gson();
    private String customerId;
    private BigDecimal totalPrice;
    private PaymentMethod paymentMethod;
    private String promoCode;

    public OrderRequest() {
    }

    public OrderRequest(String customerId, BigDecimal totalPrice, PaymentMethod paymentMethod, String promoCode) {
        this.customerId = customerId;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.promoCode = promoCode;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    @Override
    public String toString() {
        return gson.toJson(this);
    }
}
