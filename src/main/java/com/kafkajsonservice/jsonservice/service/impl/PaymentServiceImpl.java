package com.kafkajsonservice.jsonservice.service.impl;

import com.kafkajsonservice.jsonservice.model.Payment;
import com.kafkajsonservice.jsonservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Received the payment {}", payment);

    }
}
