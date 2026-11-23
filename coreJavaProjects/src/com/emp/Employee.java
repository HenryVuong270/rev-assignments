package com.emp;

import java.util.Objects;

public class Employee {

	public int id;
	private String name;
	private double salary;
	
	static int number = 100;
	

	
	public Employee() { //no argument constructor
		this.id = 1;
		//this.id = number++;
		this.name = "alice";
		this.salary = 3000;
	}
	
	public Employee(String name, double salary) {
		this.id = number++;
		this.name = name;
		this.salary = salary;
	}
	
	
	public Employee(int id, String name, double salary) {
		this.id = id;
//		this.id = number++;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
//		System.out.println("Im a toString in employee class");
		return this.id + " " +  this.name + " " + this.salary;
	}
	
	double IncrementSalary(){
		return salary + (salary * 0.20);
	}

	//to fetch the name property outside of the class
	public String getName() {
		return name;
	}

	//for updating the private property the name
	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(id), name, Double.valueOf(salary));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
//				&& salary == other.salary;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Employee " + id + " is garbage collected");
	}
	
	
	
	
}
