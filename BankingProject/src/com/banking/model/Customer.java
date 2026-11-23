package com.banking.model;

public class Customer {
	
	//TODO: add customer
	//TODO: view customer details
	
	private String name; 
	private String email; 
	private String phoneNumber;
	private int customerId = 0;
	
	public Customer(String name, String email, String phoneNumber) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.customerId = customerId++;
		
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return customerId;
	}

	public void setId(int id) {
		this.customerId = id;
	}
	
	
	//TODO: store customer details in DB, display confirmation message
	
	

}
