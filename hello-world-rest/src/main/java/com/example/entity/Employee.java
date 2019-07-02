package com.example.entity;

public class Employee {

	
	private String firstname;
	private String lastname;
	private double salary;
	//private Address address;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/*public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
	public Employee(String firstname, String lastname, double salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		//this.address = address;
	}
	public Employee() {
		super();
	}
	
}
