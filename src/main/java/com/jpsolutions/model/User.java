package com.jpsolutions.model;

import com.jpsolutions.dto.UserDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class User{

	@Id
	@GeneratedValue   
	private Long id;
	private String email;
	private String password;
	private String name;
	
	public User() {};
	
	public User(UserDto dto) {
		this.email = dto.getEmail();
		this.password = dto.getPassword();
		this.name = dto.getName();
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}