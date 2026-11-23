package com.lab;

public class Bike extends Vehicle{
	
	
	public Bike(int vehicleNumber, String model, double ratePerDay, int days) {
		super(vehicleNumber, model, ratePerDay, days);
		
	}


	@Override
	public double calculateRent() {
		// TODO Auto-generated method stub
		double total = ratePerDay * days;
		return total - (total * 0.10);
		
		
	}


	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Bike | " + vehicleNumber
                + " | " + model
                + " | Days: " + days
                + " | Rent: " + calculateRent());
    }

	
	
}
