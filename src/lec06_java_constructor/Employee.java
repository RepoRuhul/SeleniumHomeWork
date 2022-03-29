package lec06_java_constructor;

public class Employee {
	// Global variable or Class variable
	public String empName; // Variables are declared
	public int empId;
	public char empSex;
	public boolean fullTimeEmployee;

	// Constructor are 2 types --
	// default constructor (no argument constructor) and parameterized constructor
	// A class can contain one default and one or more than one parameterized constructor
	// Default Constructor must be declared before parameterized constructor.
	// you shouldn't write a parameterized constructor without writing a default constructor. It's a norm.

	// default constructor (no argument constructor) declared
	// a lot of interview question regarding this
	public Employee() {
		System.out.println("This default Constructor is from Employee class");
	}

	// Parameterized Constructor 01 declared
	// Here empName is a parameter
	public Employee(String empName) { // Local variable
		this.empName = empName;
		System.out.println("The Employee Name is: " + empName);
	}

	// Parameterized Constructor 02 declared
	public Employee(String empName, int empId) { // Sequence of parameter and sequence of argument matter
		this.empName = empName;
		this.empId = empId;
		System.out.println("The Employee Name is: " + empName + ", Employee Id: " + empId); // But the sequence of outcome doesn't matter
	}

	// Parameterized Constructor 03 declared
	// local variables are placed in different position
	// Sysout outcome also not similar as above one
	public Employee(String empName, int empId, char empSex) { // Sequence of parameter and sequence of argument matter
		this.empName = empName;
		this.empId = empId;
		this.empSex = empSex;
		System.out.println("The Employee Name is: " + empName + ", Employee Sex: " + empSex + ", Employee Id: " + empId); 
		// But the sequence of outcome doesn't matter
		// that's why I change the sequence
																														
	}

	// Parameterized Constructor 04 declared
	public Employee(String empName, int empId, char empSex, boolean fullTimeEmployee) {
		this.empName = empName;
		this.empId = empId;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("The Employee Name is: " + empName + ", Employee Id: " + empId+", Employee Sex: " + empSex+" and Full time Employee? Ans: " +fullTimeEmployee); 
	}
	
	// Parameterized Constructor 05 declared
	// 04 vs 05 -- just the sequence of parameter changed
	// It is possible to create a parameterized constructor with the same number of variables 
	// but they are organized in a different manner.
	public Employee(String empName, int empId, boolean fullTimeEmployee, char empSex) {
		this.empName = empName;
		this.empId = empId;		
		this.fullTimeEmployee = fullTimeEmployee;
		this.empSex = empSex;
		System.out.println("The Employee Name is: " + empName + ", Employee Id: " + empId+", Employee Sex: " + empSex+" and Full time Employee? Ans: " +fullTimeEmployee); 
	}
	
	
	
	
	

}
