package com.emp.inherit;

import java.util.Scanner;

public class UseEmployee {
	
	public static void main(String[] args) {
		PermanantEmployee p1 = new PermanantEmployee(100, "bob",10000, 3000 );
		System.out.println(p1);
		p1.display();

		TempEmployee t1 = new TempEmployee(101, "alice", 300, 900);
		System.out.println(t1);
		t1.display();
		
		
		//super class reference can refer subclass object
		Employee p2 = new PermanantEmployee(102,"Eve", 80000, 4000);
		Employee t2 = new TempEmployee(103,"Charlie", 80000, 4000);
//		p2 = new TempEmployee(105, "david", 70000, 15, 30000);
		p2.display();
		t2.display();
		
		PermanantEmployee p3 = (PermanantEmployee)p2;
		PermanantEmployee p4 = p1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employee ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println(id);
		
		
		System.out.println("ENter enployee name:" );
		String name = sc.nextLine();
		System.out.println(name);
		
		
		System.out.println("Enter employee salaray: ");
		double salary = sc.nextDouble();
		System.out.println(salary);
		
		sc.close();
		
	}
	
	

}
