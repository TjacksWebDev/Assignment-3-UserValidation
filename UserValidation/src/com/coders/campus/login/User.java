package com.coders.campus.login;

public class User {
	private String username;
	private String password;
	private String name;
	
	
	public User(String username, String password, String name) {
		this.username=username;
		this.password=password;
		this.name= name;
	}
	

	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}


	public String getEmail() {
		// TODO Auto-generated method stub
		return username;
	}

}