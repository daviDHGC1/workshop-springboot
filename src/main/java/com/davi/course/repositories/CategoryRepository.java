package com.davi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davi.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
