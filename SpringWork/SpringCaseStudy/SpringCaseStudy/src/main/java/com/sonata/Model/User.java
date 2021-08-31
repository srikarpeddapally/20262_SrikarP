package com.sonata.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int User_ID;
	private String Username;
	private String Email;
	private long Contact;
	private String Role;
	private boolean IsActive;
	private Date DOB;
	private Date Created_On;
	private String Password;
	
	public void displayUser() {
		System.out.println(Username);
		System.out.println(Email);
		System.out.println(Contact);
		System.out.println(DOB);
		System.out.println(Role);
		System.out.println(IsActive);
		System.out.println(Created_On);
	}
	
	public User(int user_ID, String username, String email, long contact, String role, boolean isActive, Date dOB,
			Date created_On, String password) {
		User_ID = user_ID;
		Username = username;
		Email = email;
		Contact = contact;
		Role = role;
		IsActive = isActive;
		DOB = dOB;
		Created_On = created_On;
		Password = password;
	}

	public int getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(int user_ID) {
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
				+ ", Role=" + Role + ", IsActive=" + IsActive + ", DOB=" + DOB + ", Created_On=" + Created_On + "]";
	}
	
	public User(){
		
	}
	
	
}
