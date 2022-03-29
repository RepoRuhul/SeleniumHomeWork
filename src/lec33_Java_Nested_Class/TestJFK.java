package lec33_Java_Nested_Class;

import lec33_Java_Nested_Class.JFK03.TerminalThree;

public class TestJFK {

	public static void main(String[] args) {
		System.out.println("\n-------------- JFK01 --------------\n");
		JFK01 jk01 = new JFK01();
		jk01.welcome();		
		// TerminalOne t1 = new TerminalOne();
		// The reason is: No enclosing instance of type JFK01 is accessible. 
		// Must qualify the allocation with an enclosing instance of type JFK01 
		jk01.t1.destination();
		jk01.t2.usAirlines();
		jk01.t3.arabianFlights();
		
		System.out.println("\n-------------- JFK02 --------------\n");
		JFK02 jk02 = new JFK02();
		jk02.welcome();
		
		System.out.println("\n-------------- JFK02 --------------\n");
		// If the inner class is static, the outer class can call the static inner class and instantiate
		JFK02.TerminalThree jt01 = new JFK02.TerminalThree();
		jt01.arabianFlights();
			
		System.out.println("\n-------------- JFK03 --------------\n");
		JFK03 jk03 = new JFK03();
		jk03.welcome();
		
		System.out.println("\n-------------- JFK03 --------------\n");
		JFK03.TerminalThree jt02 = new JFK03.TerminalThree();
		jt02.arabianFlights();
		TerminalThree.asianFlights();
		
		System.out.println("\n-------------- JFK04 --------------\n");
		JFK04 jk04 = new JFK04();
		jk04.t1.destination();
	}

}
