package com.day2;

public class TestControlFLowCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 62;
		int day = 3;
		int age = 25;
		
		if(marks > 60) {
			System.out.println("Pass");
		}
		
		if(age > 18) {
			System.out.println("you are elegible for voting");
			System.out.println("hello");
		}
		else {
			System.out.println("Ineligible for voting");
		}
		
		if(marks >= 98) {
			System.out.println("A");
		}else if (marks >= 75) {
			System.out.println("B");
		}else if  (marks >= 60) {
			System.out.println("C");
		}else {
			System.out.println("Fail");
		}
		
		if(age >= 18 && marks >= 75) {
			System.out.println("Adult and scored good marks");
		}
		else {
			System.out.println("You are underage");
		}
		
		if(age > 18) {
			if (marks >= 75) {
				System.out.println("Adult and good marks");
				
			}
			else {
				System.out.println("adult and failed");
			}
		}
		else {
			
		}
		
		String dayName = null;
		
		switch(day) {
		case 1: 
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		default:
			dayName = "Sunday";
		}
		System.out.println(dayName);
		
		
	}

}
