package lec33_Java_Nested_Class;

public class JFK02 {	
	// Inner class must be instantiated inside outer class
	TerminalOne t1 = new TerminalOne();
	TerminalTwo t2 = new TerminalTwo();
	TerminalThree t3 = new TerminalThree();
	
	// Method from Outer class
	public void welcome() {
		System.out.println("Welcome to JFK Airport");
		t1.destination();
		t2.usAirlines();
		t3.arabianFlights();
	}
	
	// First inner class
	public class TerminalOne { 
		public void destination() {
			System.out.println("Terminal one is for Saudi Airlines");
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
	} 
	
}	
