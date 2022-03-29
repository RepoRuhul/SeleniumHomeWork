package lec07_02_different_type_of_method;

public class Calculator04 {
	// Global variable or class variable
	// default type of access modifier is used
	byte a = 5; 
	byte b = 2;
	
	// return type method
	// in terms of byte without casting, not possible to execute code, do some research.
	public byte division() {
		byte total1 = (byte) (a/b);
		System.out.println("Division of a and b is: "+total1);
		return total1;
	}
	public byte multiplication() {
		byte total2 = (byte) (a*b);
		System.out.println("Multiplication of a and b is: "+total2);
		return total2;
	}

}
