package com.learn.spring.jpainspring;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.spring.jpainspring.entity.PUser;
import com.learn.spring.jpainspring.service.UserDAOService;
import com.learn.spring.jpainspring.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		PUser user = new PUser("Jack", "Banker");
		userRepository.save(user);
		log.info("New User created :" + user);
		
		
		Optional<PUser> pu = userRepository.findById(1L);
		log.info("User found :" + pu);
		
		List<PUser> puList = userRepository.findAll();
		log.info("UserList:" + puList);
	}

}
