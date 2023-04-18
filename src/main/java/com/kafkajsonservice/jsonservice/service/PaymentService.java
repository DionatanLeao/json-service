package com.kafkajsonservice.jsonservice.service;

import com.kafkajsonservice.jsonservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
