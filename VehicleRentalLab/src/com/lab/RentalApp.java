package com.lab;

import java.util.Scanner;

public class RentalApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		
		System.out.println("How many vehicles are being rented?: ");
		int numVehicles = sc.nextInt();
		
		Vehicle[] vehicles = new Vehicle[numVehicles];
		
		for(int i = 0; i < numVehicles; i++) {
			int type;
			
			while(true) {
				System.out.println("Enter type 1-Car, 2-Bike: ");
				type = sc.nextInt();
				
				if (type == 1 || type == 2) {
					break;
				}
				else {
					System.out.println("invalid vehicle please try again");
				}
				
			}
			
			
			sc.nextLine();
			System.out.println("ENter vehicle number: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter model: ");
			String model = sc.nextLine();
			
			System.out.println("ENter rate per day: ");
			double rate = sc.nextDouble();
			
			System.out.println("Enter days: ");
			int days = sc.nextInt();
			
			
			if(type == 1) {
				System.out.println("Enter insurnace per Day: ");
				double insurance = sc.nextDouble();
				
				vehicles[i] = new Car(number, model, rate, days, insurance);
				
			}
			else {
				vehicles[i] = new Bike(number, model, rate, days);
				
			}
	
		}
		
		double totalRent = 0;
		
		for(Vehicle v: vehicles) {
			v.displayDetails();
			totalRent += v.calculateRent();
		}
		
		System.out.println("Total rent: " + totalRent);
		
		sc.close();
	}

}
