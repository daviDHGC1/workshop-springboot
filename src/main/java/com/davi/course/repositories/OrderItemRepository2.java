package com.davi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davi.course.entities.OrderItem;
import com.davi.course.entities.pk.OrderItemPK;

public interface OrderItemRepository2 extends JpaRepository<OrderItem, OrderItemPK> {

}
