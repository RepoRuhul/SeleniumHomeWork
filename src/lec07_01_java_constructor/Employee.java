package lec07_01_java_constructor;

public class Employee {
	// Global variable or Class variable
	public String empName; // Variables are declared
	public int empId;
	public char empSex;
	public boolean fullTimeEmployee;

	// default constructor (no argument constructor) declared
	public Employee() {
		System.out.println("This default Constructor is from Employee class");
	}

	// Parameterized constructor
	public Employee(String empName, int empId, char empSex, boolean fullTimeEmployee) { // They are called local variable or parameter
		this.empName = empName;
		this.empId = empId;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("The Employee Name is: " + empName + ", Employee Id: " + empId+", Employee Sex: " + empSex+" and Full time Employee? Ans: " +fullTimeEmployee); 
		
	}	
	
	// Parameterized method
	public void employee(String empName, int empId, char empSex, boolean fullTimeEmployee) { // They are called local variable or parameter
		// inside the parameterized method, It's not mandatory to make a relation between global and local variable
		this.empName = empName;
		this.empId = empId;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("The Employee Name is: " + empName + ", Employee Id: " + empId+", Employee Sex: " + empSex+" and Full time Employee? Ans: " +fullTimeEmployee); 
		
	}	
	
	

}
