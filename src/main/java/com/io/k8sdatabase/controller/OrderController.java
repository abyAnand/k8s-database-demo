package com.io.k8sdatabase.controller;

import com.io.k8sdatabase.OrderService;
import com.io.k8sdatabase.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    public OrderService service;

    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        return service.addOrder(order);
    }

    public List<Order> getOrder(){
        return service.getOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id){
        return service.getOrderById(id).orElseGet(null);
    }
}
