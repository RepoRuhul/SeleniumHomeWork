package lec17_java_oop_abstraction;

// This is an abstract class
// we must have to put abstract keyword in abstract class
// An abstract class can inherit only one abstract class or one regular class by extends key word
// An abstract class can't inherit an Interface by extends key word

// implements keyword is used to inherit Interface in abstract class
// an abstract class can inherit more than one Interface
// an abstract class cannot inherit a regular class or abstract class by implements keyword

public abstract class ElectricCar extends FlyingCar implements HoverCar{
	
	public String nameElectricCar = "Tesla";
	public int costElectricCar = 45000;
	
	// Constructor declared
	public ElectricCar() {
		System.out.println("This constructor is from Abstract class-- Electric Car");
	}
	
	// method declared
	// This is mandatory to put abstract keyword with the abstract method in Abstract Class
	// This is the norm to write at least one abstract method inside abstract class
	public abstract void price();
	
	// method implemented
	public static void battery() {
		System.out.println("The Battery is very efficient");
	}
	
	public abstract String electricCarName(); // return type
	
	// can we create default or static type method in Abstract class like Interface?
	
	// Default methods are allowed only in interfaces.
	
	/*
	public default void noGas() {
		System.out.println("noGas feature from Car Interface");
	}	
	*/
	
	// static method is possible to create, see line 28
	
}
