package ecommerce.app.customer.controller.model;

import com.google.gson.Gson;

public class CustomerRequest {
    private static final Gson gson = new Gson();
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private short birthDate;
    private Gender gender;
    private String country;//technically should be enum

    public CustomerRequest() {
    }

    public CustomerRequest(String firstName, String lastName, String email, String phoneNumber, short birthDate, Gender gender, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.gender = gender;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public short getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(short birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return gson.toJson(this);
    }
}
