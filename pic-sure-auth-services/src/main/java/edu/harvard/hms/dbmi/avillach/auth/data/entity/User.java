package edu.harvard.hms.dbmi.avillach.auth.data.entity;

import javax.persistence.Entity;

import edu.harvard.dbmi.avillach.data.entity.BaseEntity;

@Entity(name = "user")
public class User extends BaseEntity {
	
	private String userId;

	private String subject;
	
	private String roles;
	
	public String getUserId() {
		return userId;
	}

	public User setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getSubject() {
		return subject;
	}

	public User setSubject(String subject) {
		this.subject = subject;
		return this;
	}

	public String getRoles() {
		return roles;
	}

	public User setRoles(String roles) {
		this.roles = roles;
		return this;
	}
}
