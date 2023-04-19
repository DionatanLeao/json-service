package com.kafkajsonservice.jsonservice.listener;

import com.kafkajsonservice.jsonservice.model.Payment;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class JsonListener {

    @SneakyThrows
    @KafkaListener(
            topics = "payment-topic",
            groupId = "create-group",
            containerFactory = "jsonContainerFactory")
    public void antiFraud(@Payload Payment payment) {
        log.info("Payment received {}", payment.toString());
        Thread.sleep(2000);
        log.info("Validating fraud ...");
        Thread.sleep(2000);
        log.info("Buy approved ...");
        Thread.sleep(2000);
    }

    @SneakyThrows
    @KafkaListener(
            topics = "payment-topic",
            groupId = "pdf-group",
            containerFactory = "jsonContainerFactory")
    public void pdfGenerator(@Payload Payment payment) {
        log.info("Generating PDF to product id {} ...", payment.getId());
        Thread.sleep(3000);
    }

    @SneakyThrows
    @KafkaListener(
            topics = "payment-topic",
            groupId = "email-group",
            containerFactory = "jsonContainerFactory")
    public void sendEmail() {
        Thread.sleep(3000);
        log.info("Sending confirmation email ...");
    }
}
