package com.day1;

public class TestCasting {

	public static void main(String[] args) {
		int num = 200;
		double d = num;
		System.out.println("widening cast from int to double " + d );
		
		double value = 9.87;
		int rounded  = (int) value; //explicit casting
		System.out.println("Double to int conversion: " + rounded);
		
		char ch = 'A';
		int ascii = ch;
		System.out.println("char to int conversion: " + ascii);
		
	}

}
