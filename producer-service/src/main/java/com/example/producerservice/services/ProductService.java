package com.example.producerservice.services;

import com.example.producerservice.dtos.ProductDTO;
import com.example.producerservice.dtos.TesteDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import static com.example.producerservice.configs.RabbitMQConfig.*;

@Log4j2
@Service
@RequiredArgsConstructor
public class ProductService {

    private final RabbitTemplate rabbitTemplate;

    public void createProduct(ProductDTO dto){
        log.info("Sending a message to exchange" + dto.toString());
        rabbitTemplate.convertAndSend(EXG_NAME_MARKETPLACE, RK_PRODUCT_LOG, dto.toString());

    }

}
