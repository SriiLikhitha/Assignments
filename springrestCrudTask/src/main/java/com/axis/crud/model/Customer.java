package com.axis.crud.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer 
{
	
	@Id
	private String id;
	private String username;
	private String password;
	private String email;
	public String getId()
	{
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
