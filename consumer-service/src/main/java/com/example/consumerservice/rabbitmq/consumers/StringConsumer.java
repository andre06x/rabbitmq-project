package com.example.consumerservice.rabbitmq.consumers;

import com.example.consumerservice.dtos.ProductDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Log4j2
//@Component
public class StringConsumer {

    @RabbitListener(queues = "product.log")
    public void consumer(Message msg){
        String MQMessage = new String(msg.getBody());
        System.out.println(MQMessage);
    }
}
