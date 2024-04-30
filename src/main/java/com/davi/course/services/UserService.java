package com.davi.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davi.course.entities.User;
import com.davi.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepositorry;
	
	public List<User> findAll(){
		return userRepositorry.findAll();
	}

}
