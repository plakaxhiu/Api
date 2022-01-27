package com.example.rest.api.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_account")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Basic
	private String username;
	
	@Basic
	private String lastname;
	@Basic
	private String nickname;
	@Basic
	private com.example.rest.api.entity.UserType userType;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public User() {
		super();
	}

	public com.example.rest.api.entity.UserType getUserType() {
		return userType;
	}

	public void setUserType(com.example.rest.api.entity.UserType userType) {
		this.userType = userType;
	}

	

}