package com.oops.encapsulation;


/*
 * POJO class  or Model class: Plain Old Java Object
 * 1. all variables should have private access modifiers
 * 2. add default constructor
 * 3. add parameterized constructor 
 * 4. add getter and setter methods
 * 5. override toString() method
 */
public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private String address;
	private int zipCode;
	private double salary;

	public Employee() {}
	
	public Employee(int empId, String firstName, String lastName, String address, int zipCode, double salary) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.zipCode = zipCode;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", zipCode=" + zipCode + ", salary=" + salary + "]";
	}
	
	
	
}
