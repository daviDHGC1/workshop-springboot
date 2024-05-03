package com.davi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
