package com.customer.order.service;

import com.customer.order.model.Order;
import com.customer.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order){
        order.setOrderDate(new Date());
        Order createdOrder = orderRepository.save(order);
        //async orderMessageService.send(order);
        return createdOrder;
    }

    public List<Order> listOrder(String customerNumber) {

        return orderRepository.findByCustomerNumber(customerNumber);
    }
}
