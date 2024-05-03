package com.davi.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.davi.course.entities.Order;
import com.davi.course.entities.User;
import com.davi.course.repositories.OrderRepository;
import com.davi.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Autowired
	OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "German Cano", "paidoflamengo@gmail.com", "2188899653", "Lorenzo&leonela");
		User u2 = new User(null, "Ganso", "paidovasco@hotmail.com", "21555656535", "Fluminense");
		userRepository.saveAll(Arrays.asList(u1, u2));

		Order o1 = new Order(Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(Instant.parse("2019-07-22T15:21:22Z"), u1);
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}

}
