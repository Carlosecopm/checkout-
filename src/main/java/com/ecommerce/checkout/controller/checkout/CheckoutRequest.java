package com.ecommerce.checkout.controller.checkout;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutRequest implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String cpmplement;
    private String country;
    private String state;
    private String cep;
    private Boolean saveAddress;
    private Boolean saveInto;
    private String paymentMethod;
    private String cardNome;
    private String cardNumber;
    private String cardData;
    private String cardCvv;

}
