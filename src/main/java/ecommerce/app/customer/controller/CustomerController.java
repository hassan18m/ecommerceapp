package ecommerce.app.customer.controller;

import ecommerce.app.customer.controller.model.CustomerRequest;
import ecommerce.app.customer.controller.model.CustomerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @PostMapping
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerRequest customerRequest) {
        logger.info("Received new customer post request with data: {}", customerRequest);
        CustomerResponse customerResponse = new CustomerResponse(
                "1",
                customerRequest.getFirstName(),
                customerRequest.getLastName(),
                customerRequest.getEmail(),
                customerRequest.getPhoneNumber(),
                customerRequest.getBirthDate(),
                customerRequest.getGender(),
                customerRequest.getCountry()
        );

        return ResponseEntity.ok(customerResponse);
    }
}
