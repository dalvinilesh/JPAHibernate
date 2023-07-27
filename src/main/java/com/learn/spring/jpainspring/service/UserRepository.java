package com.learn.spring.jpainspring.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.spring.jpainspring.entity.PUser;

public interface UserRepository extends JpaRepository<PUser, Long>{

}
