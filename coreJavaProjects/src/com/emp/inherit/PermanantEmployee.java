package com.emp.inherit;

public class PermanantEmployee extends Employee{
	private double bonus;
	
	public  PermanantEmployee(double bonus) {
		super();
		this.bonus = bonus;
		
	}
	
	
	public PermanantEmployee(int id, String name, double salary, double bonus) {
		
		super(id, name, salary);
		this.bonus = bonus;
		
	}
	
	@Override 
	public double calculateSalary() {
		return getSalary() + bonus;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
		
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.id + " " + this.getName() + this.getSalary());
		
	}
	
	
}