package com.ecommerce.checkout.service;

import com.ecommerce.checkout.controller.checkout.CheckoutRequest;
import com.ecommerce.checkout.entity.CheckoutEntity;
import com.ecommerce.checkout.repository.CheckoutRepository;
import com.ecommerce.checkout.streaming.CheckoutCreatedSource;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService{

    private final CheckoutRepository checkoutRepository;
    private final CheckoutCreatedSource checkoutCreatedSource;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .status(CheckoutEntity.Status.CREATED)
                .build();
        final CheckoutEntity entity = checkoutRepository.save(checkoutEntity);

        //final CheckoutCreatedEvent checkoutCreatedEvent = new CheckoutCreatedEvent.newBuilder();
                // .setCheckoutCode(entity.getCode())
                 //.setStatus(entity.getStatus().name())
                 //.buider();
       //checkoutCreatedSource.output().send(MessageBuilder.withPayload().build());
        return Optional.of(entity);
    }
}
