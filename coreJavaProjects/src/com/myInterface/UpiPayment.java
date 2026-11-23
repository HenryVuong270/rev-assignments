package com.myInterface;

public class UpiPayment implements Payment{
	
	public void pay(double amount) {
		System.out.println("You have made a payment via UPI of : " + amount);
	}
	
}
