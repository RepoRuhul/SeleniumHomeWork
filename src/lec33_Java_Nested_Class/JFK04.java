package lec33_Java_Nested_Class;

public class JFK04 {	
	// Inner class must be instantiated inside outer class
	TerminalOne t1 = new TerminalOne();
	TerminalTwo t2 = new TerminalTwo();
	TerminalThree t3 = new TerminalThree();
	
	// Method from Outer class
	public void welcome() {
		System.out.println("Welcome to JFK Airport");	
	}
	
	// First inner class
	public class TerminalOne { 
		public void destination() {
			System.out.println("Terminal one is for Saudi Airlines");
			welcome();  // inner class method can access the outer class method directly
			t2.usAirlines(); // inner class method can access other inner class method by their object
			t3.arabianFlights();
			TerminalThree.asianFlights(); // as the method is static, so called by Class itself
		}
	} 
	
	// Second inner class
	public class TerminalTwo { 
		public void usAirlines () {
			System.out.println("Terminal two is for Delta International");
		}
	} 
	
	// Static Nested class
	public static class TerminalThree { 
		public void arabianFlights () {
			System.out.println("Terminal three is for Emirates International");
		}
		
		public static void asianFlights () {
			System.out.println("Terminal three is also for Thai International");
		}
	} 
	
}	
