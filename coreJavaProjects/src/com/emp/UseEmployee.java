package com.emp;

public class UseEmployee {
	
	static {
		System.out.println("I am a static block");
	}

	public static void main(String[] args) {
		System.out.println("I am main method");
		Employee empObj = new Employee(1, "alice", 10000);
		System.out.println(empObj.id);
		System.out.println(empObj.getName());
		System.out.println(empObj.getSalary());
		
		
		Employee empObj1 = new Employee(2, "Paul", 20000);
		System.out.println(empObj1.id);
		System.out.println(empObj1.getName());
		System.out.println(empObj1.getSalary());
		
		
		Employee empObj2 = new Employee();
		System.out.println(empObj2.id);
		System.out.println(empObj2.getName());
		System.out.println(empObj2.getSalary());
		
		
		empObj1.setSalary(90000);
		System.out.println(empObj);
		System.out.println(empObj1);
		System.out.println(empObj2);
		
		
		System.out.println(empObj1.IncrementSalary());;
		
		
		
		Employee e1 = new Employee(105, "joe", 30000);
		Employee e2 = new Employee(105, "joe", 30000);
	
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1 == e2); // false, not pointing at same refernce
		System.out.println(e1.equals(e2)); // True, overridden equals
		
		e1 = null;
		e2 = null;
		System.gc(); // requesting jvm for garbage collection
		System.out.println("main method completed");
	}

}
