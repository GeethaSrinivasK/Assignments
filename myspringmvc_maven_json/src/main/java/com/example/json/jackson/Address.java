package com.example.json.jackson;

public class Address {
	
	private String city;
	private int zipcode;
	private String street_address;
	public Address() {
		super();
	}
	public Address(String city, int zipcode, String street_address) {
		super();
		this.city = city;
		this.zipcode = zipcode;
		this.street_address = street_address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

}
