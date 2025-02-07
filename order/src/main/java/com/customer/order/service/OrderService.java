package com.customer.order.service;

import com.customer.order.model.Orders;
import com.customer.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderMessageService orderMessageService;

    public Orders saveOrder(Orders order){
        LocalDateTime currentDateTime = LocalDateTime.now();
        order.setOrderDate(currentDateTime);
        Orders createdOrder = orderRepository.save(order);
        orderMessageService.sendMessage(order);
        return createdOrder;
    }

    public List<Orders> listOrder(String customerNumber) {

        return orderRepository.findByCustomerNumber(customerNumber);
    }
}
