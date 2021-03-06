package com.sonata.Inject;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	
	private String name = "Srikar";
	private int age =22;
	private float height = 5.6f;
	private boolean isProgrammer = true;
	
	@Inject
	@Qualifier("myaddress")
	private AddressInterface address;

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

	public AddressInterface getAddress() {
		return address;
	}

	public void setAddress(AddressInterface address) {
		this.address = address;
	}


	
	
	
	
}
