package com.gl.ITAdmin.beans;

public class Employee {
	private String firstName;
	private String lastName;
	private String department;
	private String emailid;
	private String password;
	
	public Employee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getDepartment() {
		return department;
	}
	
	public String getEmailid() {
		return emailid;
	}
	
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}	
	
}
