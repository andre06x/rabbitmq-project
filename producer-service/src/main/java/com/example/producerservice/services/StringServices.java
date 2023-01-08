package com.example.producerservice.services;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import static com.example.producerservice.configs.RabbitMQConfig.*;

@Log4j2
@Service
@RequiredArgsConstructor
public class StringServices {

    private final RabbitTemplate rabbitTemplate;

    public void produce(String message){
       log.info("Received message" + message);
       rabbitTemplate.convertAndSend(EXG_NAME_MARKETPLACE, RK_PRODUCT_LOG, message);

    }
}
