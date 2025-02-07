package com.customer.order.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String customerNumber;

    private String productId;

    private int quantity;

    private LocalDateTime orderDate;

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

}
