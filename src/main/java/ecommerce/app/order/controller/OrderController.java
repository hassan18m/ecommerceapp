package ecommerce.app.order.controller;

import ecommerce.app.order.controller.model.OrderRequest;
import ecommerce.app.order.controller.model.OrderResponse;
import ecommerce.app.order.controller.model.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @PostMapping
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest orderRequest) {
        logger.info("Received new order post request with data: {}", orderRequest);
        OrderResponse orderResponse = new OrderResponse(
                orderRequest.getCustomerId(),
                orderRequest.getTotalPrice(),
                orderRequest.getPaymentMethod(),
                orderRequest.getPromoCode(),
                Status.NEW
        );

        return ResponseEntity.ok(orderResponse);
    }
}
