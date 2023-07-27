package com.learn.spring.jpainspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.spring.jpainspring.entity.PUser;
import com.learn.spring.jpainspring.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	@Autowired
	private UserDAOService userDAOService;
	@Override
	public void run(String... args) throws Exception {
		PUser user = new PUser("Nilesh", "Admin");
		long insert = userDAOService.insert(user);
		log.info("New User created :" + user + " | id:" + insert);
	}

}
