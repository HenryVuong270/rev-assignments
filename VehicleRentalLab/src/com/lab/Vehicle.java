package com.lab;

public class Vehicle {
	protected int vehicleNumber;
	protected String model;
	protected double ratePerDay;
	protected int days;
	
	public Vehicle(int vehicleNumber, String model, double ratePerDay, int days) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.ratePerDay = ratePerDay;
		this.days = days;
	}
	
	public double calculateRent() {
		return ratePerDay * days;
		
	}
	
	public void displayDetails() {
		System.out.println("Vehicle Number: "  + vehicleNumber);
		System.out.println("Model : " + model);
		System.out.println("Rate per day: " + ratePerDay);
		System.out.println("Days: " + days);
	}
	
}
