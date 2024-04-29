package com.davi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davi.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
