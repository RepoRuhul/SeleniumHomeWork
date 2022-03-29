package lec17_java_oop_abstraction;

// This is an interface
// An Interface can inherit more than one Interface by extends keyword
// An Interface can't inherit a regular class or an abstract class by extends keyword

// implements keyword can't be used for inheritance in Interface

public interface Car extends Taxi, Truck {
	
	// the variables inside Interface are final and static in nature. (interview question)
	public static final int bornYear = 1859;
	
	// Interfaces cannot have constructors
	/*
	public Car() {
		
	}
	*/
	
	// method is declared inside Interface, not implemented
	// the method which are declared -- called also abstract method
	// This is not mandatory to put abstract keyword with the abstract method in Interface
	public void start(); // void type
	public String stop(); // return type
	public abstract void brake(); // void type
	
	// from Java 1.8, JAVA implemented static and default type method in interface	
	public default void honk() { // this default is not access modifier
		System.out.println("Honk feature from Car Interface");
	}	
	public static void gear() {
		System.out.println("Gear feature from Car Interface");
	}
	
}
