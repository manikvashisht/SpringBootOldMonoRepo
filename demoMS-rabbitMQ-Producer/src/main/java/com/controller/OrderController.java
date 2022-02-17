package com.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.service.OrderService;
import com.common.TransactionRequest;
import com.common.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request) throws JsonProcessingException {
        System.out.println("request"+request);
        return service.saveOrder(request);
    }

    @GetMapping("/getOrder")
    public String getOrder() throws JsonProcessingException {
        return "get order";
    }
}