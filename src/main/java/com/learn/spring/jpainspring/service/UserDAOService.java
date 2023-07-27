package com.learn.spring.jpainspring.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.learn.spring.jpainspring.entity.PUser;
@Repository
@Transactional
public class UserDAOService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(PUser user) {
		entityManager.persist(user); 
		return user.getUid();
	}
}
