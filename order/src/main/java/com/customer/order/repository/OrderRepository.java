package com.customer.order.repository;

import com.customer.order.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders, Long> {

    List<Orders> findByCustomerNumber(String customerNumber);
}
