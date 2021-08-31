package com.sonata.Resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String name = " Srikar";
	private int age = 23;
	private float height = 5.8f;
	private boolean isProgrammer = true;
	
	private Address address;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isProgrammer() {
		return isProgrammer;
	}

	public void setProgrammer(boolean isProgrammer) {
		this.isProgrammer = isProgrammer;
	}

	public Address getAddress() {
		return address;
	}
	
	@Resource
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	

}
