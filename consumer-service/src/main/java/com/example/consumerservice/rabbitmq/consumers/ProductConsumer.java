package com.example.consumerservice.rabbitmq.consumers;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ProductConsumer {

    @RabbitListener(queues = {"product.log"})
    public void consumerLog(Message product) throws JsonProcessingException
    {
        log.info("Product is " + product);
    }
}
