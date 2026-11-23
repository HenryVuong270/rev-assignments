package com.myInterface;

public class CreditCardPayment implements Payment{

	public void pay(double amount) {
		System.out.println("You have made the payment via credit card of amount + " + amount);
	}
	
	
}
