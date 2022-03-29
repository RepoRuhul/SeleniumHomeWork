package lec17_java_oop_abstraction;

// A regular class
// A regular class can inherit only one regular class or one abstract class by extends keyword
// A regular class can't inherit an Interface by extends keyword

// implements keyword is used to inherit Interface in regular class
// a regular class can inherit more than one Interface
// a regular class cannot inherit a regular class or abstract class by implements keyword

public class Toyota extends ElectricCar implements Car, Drone{
	
	public Toyota() {
		System.out.println("This constructor is from Toyota class");
	}
	
	// method is implemented inside class, not declared
	// also called non abstract method
	public static void toyotaInfo() { // static method
		System.out.println("This method is from Toyota class");
	}
	
	// can we create default or static type method in Abstract class like Interface?
	
	// Default methods are allowed only in interfaces, static method showed in line 19
	/*
	public default void fuel() {
		System.out.println("fuel feature from Car Interface");
	}	
	*/
	
	public int toyotaPrice() {
		int price = 45000;
		System.out.println("The price for Toyota is: "+price);
		return price;
	}

	@Override
	public void expensive() {
		System.out.println("expensive method from rocket Interface");
		
		
	}

	@Override
	public void canFloat() {
		System.out.println("canFloat method from HoverCar Interface");
		
	}

	@Override
	public void price() {
		System.out.println("price method From Electric Car Abstract class");
		
	}

	@Override
	public String electricCarName() {
		String name1 = "Arcimoto";
		System.out.println(name1);
		return name1;
	}

	@Override
	public void autoPilot() {
		System.out.println("autoPilot method from Flying Car Abstract class");
		
	}

	@Override
	public void rent() {
		System.out.println("rent method from Taxi Interface");
		
	}

	@Override
	public void carryingpassenger() {
		System.out.println("carryingPassenger method from Taxi Interface");
		
	}

	@Override
	public void carryingGoods() {
		System.out.println("carryingGoods method from Truck Interface");
		
	}

	@Override
	public void lightWeight() {
		System.out.println("lightWeight method from Drone Interface");
		
	}

	@Override
	public void start() {
		System.out.println("start method from Car Interface");
		
	}

	@Override
	public String stop() {
		String m = "stop method from Car Interface";
		System.out.println(m);
		return m;
	}

	@Override
	public void brake() {
		System.out.println("brake method from Car Interface");
		
	}
	
}
