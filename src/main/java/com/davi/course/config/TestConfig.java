package com.davi.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.davi.course.entities.User;
import com.davi.course.repositories.UserRepository;

@Configuration
@Profile("test")

public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(7L, "Caiio", "caio@gmail.com", "7894", "123");
		User u2 = new User(9L, "Beatriz", "bia@gmail.com", "7894", "123");
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
