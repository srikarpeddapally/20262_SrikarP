package com.sonata.Model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	long User_ID;
	String Username;
	String Email;
	long Contact;
	String Role;
	boolean IsActive; 
	Date DOB;
	Date Created_On;
	String Password;
	User()
	{
		
	}
	public long getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(long user_ID) {
		User_ID = user_ID;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getContact() {
		return Contact;
	}
	public void setContact(long contact) {
		Contact = contact;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public boolean isIsActive() {
		return IsActive;
	}
	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Date getCreated_On() {
		return Created_On;
	}
	public void setCreated_On(Date created_On) {
		Created_On = created_On;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "User [User_ID=" + User_ID + ", Username=" + Username + ", Email=" + Email + ", Contact=" + Contact
				+ ", Role=" + Role + ", IsActive=" + IsActive + ", DOB=" + DOB + ", Created_On=" + Created_On
				+ ", Password=" + Password + "]";
	}
	
	
	
	
	
}