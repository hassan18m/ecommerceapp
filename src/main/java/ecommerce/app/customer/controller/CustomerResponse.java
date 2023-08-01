package ecommerce.app.customer.controller;

public class CustomerResponse extends CustomerRequest {
    private String id;

    public CustomerResponse() {
    }

    public CustomerResponse(String id, String firstName, String lastName, String email, String phoneNumber, short birthDate, String gender, String country) {
        super(firstName, lastName, email, phoneNumber, birthDate, gender, country);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
