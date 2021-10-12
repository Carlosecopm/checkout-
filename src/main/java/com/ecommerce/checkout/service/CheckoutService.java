package com.ecommerce.checkout.service;

import com.ecommerce.checkout.controller.checkout.CheckoutRequest;
import com.ecommerce.checkout.entity.CheckoutEntity;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
