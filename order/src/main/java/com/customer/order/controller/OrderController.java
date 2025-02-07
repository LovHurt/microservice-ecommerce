package com.customer.order.controller;

import com.customer.order.model.Orders;
import com.customer.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    //createorder
    @PostMapping
    public Orders createOrder(@RequestBody Orders order) {
        return orderService.saveOrder(order);
    }

    //listorders
    @GetMapping
    public List<Orders> listOrders(@RequestParam String customerNumber) {
        return orderService.listOrder(customerNumber);
    }
}
