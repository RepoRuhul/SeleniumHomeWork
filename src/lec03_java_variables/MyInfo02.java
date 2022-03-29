package lec03_java_variables;

public class MyInfo02 {
	// In the class body, First Variable, Then Constructor and then Method
	// And they should be above main method
	// Variable is also called field
	
	// all the variables start with lower case
	// The most common variables used are String, int, char and boolean -- always used
	
	// Here variable is declared, how? We didn't give a value for the variable Name
	public String schoolName; // not used here
	
	// Below all the variables are initialized, how? We assign a value for the variable Name	
	 
	
	// String type variable contain anything inside double quotation 
	// String itself is a class, represents for String type variable here
	// String is not a pure primitive data type, important interview question
	
	// public, private, protected, default = accessibility, String = type of Variable, name is the name of the String type variable
	// String type variable is initialized inside double quotation
	public String name1 = "Tofael Kabir"; 
	private String name2 = "Tofael Kabir"; 
	protected String name3 = "Tofael Kabir"; 
	String name4 = "Tofael Kabir"; //default type accessibility, nothing is written
	
	// int (integer) = type of variable, myYearlySalary is the name of the int type variable
	// int type variable is initialized without any quotation
	public int myYearlySalary = 400006550;
	
	// char (character) = type of variable, sex is the name of the char type variable
	// char type variable is initialized inside single quotation, and represented by upper case single character/letter
	public char sex = 'M';
	
	// boolean = type of variable, usCitizen is the name of the boolean type variable
	// boolean type variable is initialized without any quotation, represented by true or false
	public boolean usCitizen = false;

	public static void main(String[] args) {
		// not doing any execution, so no sysout
	}

}
