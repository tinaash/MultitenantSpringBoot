package com.kgisl.tech.spring.model;

public class User {

	public String id;
	public String name;
	public String access;
	public String emailId;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public User(String id, String name, String access, String emailId) {
		this.id = id;
		this.name = name;
		this.access = access;
		this.emailId = emailId;
	}

}