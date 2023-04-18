package com.kafkajsonservice.jsonservice.resource.impl;

import com.kafkajsonservice.jsonservice.model.Payment;
import com.kafkajsonservice.jsonservice.resource.PaymentResource;
import com.kafkajsonservice.jsonservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentResourceImpl implements PaymentResource {

    @Autowired
    private PaymentService service;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        service.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
