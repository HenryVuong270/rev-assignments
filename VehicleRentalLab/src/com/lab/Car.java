package com.lab;

public class Car extends Vehicle{

	double insuranceCharge;
	
	
	public Car(int vehicleNumber, String model, double ratePerDay, int days, double insurnaceCharge) {
		super(vehicleNumber, model, ratePerDay, days);
		this.insuranceCharge = insuranceCharge;
	}


	@Override
	public double calculateRent() {
		return (ratePerDay + insuranceCharge) * days;
		
	}


	@Override
	public void displayDetails() {
//		System.out.println("Vehicle Number: "  + vehicleNumber);
//		System.out.println("Model : " + model);
		System.out.println("Rate per day: " + ratePerDay);
		System.out.println("Days: " + days);
		System.out.println("Insurance charge: " + insuranceCharge);
		
		
		System.out.println("Car | " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + calculateRent() + " | Insurance Charge: "  + insuranceCharge + " | Rate per Day: " + ratePerDay);
	
    
		
		
	}
	
	
	
	
	

}
