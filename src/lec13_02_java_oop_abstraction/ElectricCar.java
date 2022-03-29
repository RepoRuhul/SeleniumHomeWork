package lec13_02_java_oop_abstraction;

public abstract class ElectricCar {
	
	// method declared
	// This is mandatory to put abstract keyword with the abstract method in Abstract Class
	// This is the norm to write at least one abstract method inside abstract class
	public abstract void price();
	
	// method implemented
	public void battery() {
		System.out.println("The Battery is very efficient");
	}
}
