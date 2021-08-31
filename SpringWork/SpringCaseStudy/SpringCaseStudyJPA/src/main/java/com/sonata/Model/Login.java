package com.sonata.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	
	@Id
	private long User_ID;
	private String Password;
	
	public Login() {
		
	}

	public long getUser_ID() {
		return User_ID;
	}

	public void setUser_ID(long user_ID) {
		User_ID = user_ID;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Login [User_ID=" + User_ID + ", Password=" + Password + "]";
	}

	
	
	

}
