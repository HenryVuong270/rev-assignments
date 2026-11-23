package com.day2;

public class TestMethod {

	public static int add() {
		
		return 5 + 10;
	}
	
	public static int add(int a , int b) {
		return a + b;
	}
	
	public static int mul() {
		return 3 *4 ;
		
	}
	
	public static int mul (int a, int b) {
		return a * b;
	}
	
	public static int div() {
		return 4/2;
		
	}
	
	public static int div (int a, int b) {
		if (b == 0) {
			System.out.println("cant divide by 0");
			return -1 ;
		}
		return a / b;
	}
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(add());
		System.out.println(add(a,b));
		System.out.println(mul());
		System.out.println(mul(2,8));
		System.out.println(div());
		System.out.println(div(4,0));
	}

}
