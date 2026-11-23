package com.abstract1;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee e1 = new PermanentEmployee(100, "alice", 60000, 10000);
		System.out.println(e1.calculateSalary());
	}

}
