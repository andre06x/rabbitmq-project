package com.example.producerservice.controllers;

import com.example.producerservice.dtos.ProductDTO;
import com.example.producerservice.services.ProductService;
import com.example.producerservice.services.StringServices;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/products")
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<ProductDTO> products(@RequestBody ProductDTO dto){
        service.createProduct(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
