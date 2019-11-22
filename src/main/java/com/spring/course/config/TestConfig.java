package com.spring.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.course.entities.User;
import com.spring.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Alexandre", "alexandre@gmail.com", "99999999", "12345");
		User u2 = new User(null, "Marcia", "marcia@gmail.com", "88888888", "678910");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
