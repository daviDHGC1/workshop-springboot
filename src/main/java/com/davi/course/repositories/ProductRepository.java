package com.davi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davi.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
