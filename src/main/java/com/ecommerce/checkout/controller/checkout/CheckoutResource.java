package com.ecommerce.checkout.controller.checkout;

import com.ecommerce.checkout.entity.CheckoutEntity;
import com.ecommerce.checkout.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutService checkoutService;

    @PostMapping("/")
    public ResponseEntity<CheckoutResponse> create(CheckoutRequest checkoutRequest) {
       final CheckoutEntity checkoutEntity = checkoutService.create(checkoutRequest).orElseThrow();
       final CheckoutResponse checkoutResponse = CheckoutResponse.builder()
               .code(checkoutEntity.getCode())
               .build();
        return ResponseEntity.ok().build();
    }
}
