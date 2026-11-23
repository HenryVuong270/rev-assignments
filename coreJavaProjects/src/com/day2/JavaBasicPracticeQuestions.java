package com.day2;

public class JavaBasicPracticeQuestions {

	
	public static int reverse (int num) {
		int input1 = 12345;
		int reverse = 0;
		
		
		while(input1 != 0) {
			int digit = input1 % 10;
			reverse = reverse * 10 + digit;
			input1 = input1 / 10;
			
			if (reverse > Integer.MAX_VALUE ||  reverse < Integer.MIN_VALUE) {
				return 0;
			}
			
		}
		return reverse;
	}
	

	
	
	
	
	public static void main(String[] args) {
		System.out.println(reverse(12345));
		
		
	}

}
