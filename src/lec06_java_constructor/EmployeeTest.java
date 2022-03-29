package lec06_java_constructor;

public class EmployeeTest {
	public static void main(String[] args) {
		// default Constructor is initialized
		Employee employee01 = new Employee(); 
		// Here Tofael is an argument, in Employee class, empName was a parameter and that is String type
		//Parameterized Constructor 01 is initialized	
		Employee employee02 = new Employee("Tofael");	
		//Parameterized Constructor 01 is initialized	
		Employee employee03 = new Employee("Awal");	
		//Parameterized Constructor 02 is initialized	
		Employee employee04 = new Employee("Nuzaira", 748);
		//Parameterized Constructor 03 is initialized	
		Employee employee05 = new Employee("Nabila", 148, 'F');
		//Parameterized Constructor 04 is initialized	
		Employee employee06 = new Employee("Raihan", 248, 'M', true);
		//Parameterized Constructor 04 is initialized	
		Employee employee07 = new Employee("Asma", 448, 'F', false);
		//Parameterized Constructor 05 is initialized	
		Employee employee08 = new Employee("Nasir", 990, true, 'M');
		
		// summary:
		// we must have to put the argument in a sequence like the way local variable (parameter) declared in constructor
		// it doesn't matter the sequence of variable declared inside sysout
		// It is possible to create a parameterized constructor with the same number of variables but they are organized in a different manner.

	}

}
