package com.sonata.Model;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class User {
	@NotNull
	private String userid;
	@NotNull
	private String password;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	

}
