package lec15_02_java_oop_abstraction;

// This is an abstract class
// we must have to put abstract keyword in abstract class
// An abstract class can inherit only one abstract class or one regular class by extends key word
// An abstract class can't inherit an Interface by extends key word

public abstract class ElectricCar extends Toyota {
	
	// method declared
	// This is mandatory to put abstract keyword with the abstract method in Abstract Class
	// This is the norm to write at least one abstract method inside abstract class
	public abstract void price();
	
	// method implemented
	public void battery() {
		System.out.println("The Battery is very efficient");
	}
	
	public abstract String electricCarName(); // return type
	
}
