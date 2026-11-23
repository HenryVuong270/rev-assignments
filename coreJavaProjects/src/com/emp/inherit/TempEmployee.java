package com.emp.inherit;

public class TempEmployee extends Employee{
	private int workingDays;
	private double perDayRate;

	public TempEmployee(int id, String name, int workingDays, double perDayRate) {
		super(id, name, workingDays * perDayRate);
		this.workingDays = workingDays;
		this.perDayRate = perDayRate;
	}
	
	@Override
	public double calculateSalary() {
		return workingDays * perDayRate;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + this.workingDays + " " + this.perDayRate;
		
	}
	
	@Override
	public void display() {
		System.out.println( this.workingDays + " " + this.perDayRate);

	}
	
}
