package com.customer.order.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String customerNumber;

    private String productId;

    private int quantity;

    private Date orderDate;

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

}
