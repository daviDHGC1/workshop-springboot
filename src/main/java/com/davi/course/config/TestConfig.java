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
public class TestConfig implements CommandLineRunner{

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "German Cano", "paidoflamengo@gmail.com", "2188899653", "Lorenzo&leonela");
		User u2 = new User(null, "John Árias", "johnzinhio@hotmail.com", "21555656535", "Fluminense");
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}
