package lec33_Java_Nested_Class;

public class JFK01 {	// Opening of Outer class body
	// Inner class must be instantiated inside outer class
	TerminalOne t1 = new TerminalOne();
	TerminalTwo t2 = new TerminalTwo();
	TerminalThree t3 = new TerminalThree();
	
	// Method from Outer class
	public void welcome() {
		System.out.println("Welcome to JFK Airport");
	}
	
	// First inner class
	public class TerminalOne { // Opening of Inner class body
		public void destination() {
			System.out.println("Terminal one is for Saudi Airlines");
		}
	} // Closing of Inner class body
	
	// Second inner class
	public class TerminalTwo { 
		public void usAirlines () {
			System.out.println("Terminal two is for Delta International");
		}
	} 
	
	// Third inner class
	public class TerminalThree { 
		public void arabianFlights () {
			System.out.println("Terminal three is for Emirates International");
		}
	} 
	
}	// Closing of Outer class body
