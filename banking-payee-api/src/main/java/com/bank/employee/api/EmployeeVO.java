package com.bank.employee.api;

public class EmployeeVO {
	private int id;
	private String name;
	private String email;
	private double balance;
	private int phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", name=" + name + ", email=" + email + ", balance=" + balance + ", phone="
				+ phone + "]";
	}
	
	
	

}
