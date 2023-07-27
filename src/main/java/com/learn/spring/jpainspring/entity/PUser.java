package com.learn.spring.jpainspring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PUser {

	@Id
	@GeneratedValue
	private long uid;
	private String uname;
	private String urole;

	protected PUser() {

	}

	public PUser(String uname, String urole) {
		super();
		this.uname = uname;
		this.urole = urole;
	}

	public long getUid() {
		return uid;
	}

	public String getUname() {
		return uname;
	}

	public String getUrole() {
		return urole;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", urole=" + urole + "]";
	}

	
	
}
