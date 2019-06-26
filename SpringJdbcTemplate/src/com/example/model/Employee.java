package com.example.model;

public class Employee {

	private int empId;
	private String empfirstName;
	private String empLastname;
   private int Salary;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpfirstName() {
	return empfirstName;
}
public void setEmpfirstName(String empfirstName) {
	this.empfirstName = empfirstName;
}
public String getEmpLastname() {
	return empLastname;
}
public void setEmpLastname(String empLastname) {
	this.empLastname = empLastname;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empfirstName=" + empfirstName + ", empLastname=" + empLastname + ", Salary="
			+ Salary + "]";
}
public int getSalary() {
	return Salary;
}
public void setSalary(int salary) {
	Salary = salary;
}
public Employee() {
	super();
}
public Employee(int empId, String empfirstName, String empLastname, int salary) {
	super();
	this.empId = empId;
	this.empfirstName = empfirstName;
	this.empLastname = empLastname;
	Salary = salary;
}
   
}
