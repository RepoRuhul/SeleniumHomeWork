package lec16_java_oop_abstraction;

// A regular class
// A regular class can inherit only one regular class or one abstract class by extends keyword
// A regular class can't inherit an Interface by extends keyword

// implements keyword is used to inherit Interface in regular class
// a regular class can inherit more than one Interface
// a regular class cannot inherit a regular class or abstract class by implements keyword

public class Toyota extends ElectricCar implements Car, Drone{
	// method is implemented inside class, not declared
	// also called non abstract method
	public void toyotaInfo() {
		System.out.println("This method is from Toyota class");
	}
	
	public int toyotaPrice() {
		int price = 45000;
		System.out.println(price);
		return price;
	}

	@Override
	public void expensive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canFloat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String electricCarName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void autoPilot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carryingpassenger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carryingGoods() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lightWeight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}
	
}
