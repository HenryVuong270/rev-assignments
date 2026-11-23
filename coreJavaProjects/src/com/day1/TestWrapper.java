package com.day1;

public class TestWrapper {

	public static void main(String[] args) {
		// Wrapping a primitive value into corresponding wrapper class
		Integer age = 20;
		Double price = 5.00;
		Character grade = 'A';
		Boolean active = true;
		System.out.println(age);
		System.out.println(price);
		System.out.println(grade);
		System.out.println(active);
		
		int x = 210;
		Integer y = x;
		System.out.println(y);
		
		int z = 2;
		System.out.println(z);
		z = age.intValue();
		
		double p = price;
		System.out.println(p);
		String num = "200";
		int amount = Integer.parseInt(num);
		System.out.println(amount);
	}

}
