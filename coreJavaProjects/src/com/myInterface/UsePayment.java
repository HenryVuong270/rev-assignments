package com.myInterface;

public class UsePayment {

	public static void main(String[] args) {
		
		CreditCardPayment ccp = new CreditCardPayment();
		ccp.pay(20);
		
		Payment p1 = new CreditCardPayment();
		p1.pay(5);
		
		Payment p2 = new UpiPayment();
		p2.pay(90);
		
		System.out.println(p2.minPayment);
		System.out.println(Payment.minPayment);
		
		
		//varialbes in interfaces by default are final -> means constant, cannot be changed
//		Payment.minPayment = Payment.minPayment + 100;
	}

}
