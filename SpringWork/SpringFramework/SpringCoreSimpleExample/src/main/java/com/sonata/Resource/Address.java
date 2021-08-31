package com.sonata.Resource;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Address {
	private int streetNumber = 11;
	private String streetName = "Hyd";
	private String city = "Hyd";
	private String country = "IND";
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@PostConstruct
	public void doSomethingAfterConstruct() {
		String oldCity = city;
		city = "Seoul";
		System.out.println("--->Old city = " + oldCity + ", New city = " + city);
	}

	@PreDestroy
	public void doSomethingBeforeDestroy() {
		System.out.println("--->Before Address object is destroyed");
	}
}
