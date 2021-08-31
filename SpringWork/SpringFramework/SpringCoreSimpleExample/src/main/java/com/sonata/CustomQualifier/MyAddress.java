package com.sonata.CustomQualifier;

public class MyAddress implements AddressInterface {

	@Override
	public String getWholeAddress() {
		String wholeAddress = "My Address = " + getStreetNumber() + " " +
				getStreetName() + " " +
				getCity() + " " +
				getCountry();
		return wholeAddress;
	}
	
	private int streetNumber = 1;
	private String streetName = "dalal street";
	private String city = "mumbai";
	private String country = "ind";
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
	
	
}
