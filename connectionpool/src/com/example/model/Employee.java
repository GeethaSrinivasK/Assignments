package com.example.model;

public class Employee {

	private int id;
	private String FirstName;
	private String LastName;
	private int salary;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.salary = salary;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
