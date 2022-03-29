package lec17_java_oop_abstraction;

public class TestVehicle {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		// Toyota extends Electric Car,  Constructor call must be the first statement in a constructor of child
		Toyota toyota = new Toyota(); // default constructor of Toyota initialized after parent class is initialized
		Toyota.toyotaInfo(); // if a method is static, no need to create object, the class or Interface can directly call it.
		toyota.toyotaPrice();
		toyota.expensive();
		toyota.canFloat();
		toyota.price();
		toyota.electricCarName();
		toyota.autoPilot();
		toyota.rent();
		toyota.carryingGoods();
		toyota.carryingpassenger();
		toyota.lightWeight();
		toyota.start();
		toyota.stop();
		toyota.brake();
		toyota.flyingFeature();
		toyota.ferrariInfo();
		toyota.mercedezInfo();
		toyota.speed();
		toyota.cost();
		Toyota.battery(); // battery is a static method in Abstract class, Toyota extends that Abstract class, so, Toyota itself can initialize that method, but in terms of Interface, it is not allowed for Toyota
		toyota.honk(); // it can call the default type method of Interface
		// toyota.gear(); // gear () is a static method, static method can't be call by object
		
		System.out.println("\n--------------------- Interface Car ------------------------\n");
		// Cannot instantiate the type Car
		// an interface can't be instantiated, it needs the help of a concrete class, here Toyota is a concrete class
	    // Because Toyota implements Car	
		Car car = new Toyota();
		car.start();
		car.stop();
		car.brake();
		car.honk();
		// car.gear();	// doesn't work	
		Car.gear(); // no need of object, Interface/class can directly call static methods
		car.carryingGoods();
		car.carryingpassenger();
		car.rent();
		System.out.println("The Car invented in: " + Car.bornYear); // final type variable is initialized here.

		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		// Cannot instantiate the type ElectricCar
		// an abstract class can't be instantiated, it needs the help of a concrete class, here Toyota is the concrete class
		ElectricCar electricCar = new Toyota(); // constructor of abstract class is initialized
		electricCar.battery();
		electricCar.price();
		electricCar.electricCarName();	
		electricCar.expensive();
		electricCar.mercedezInfo();
		electricCar.speed();
		electricCar.cost();
		electricCar.ferrariInfo();
		electricCar.flyingFeature();
		electricCar.autoPilot();
		electricCar.canFloat();
		System.out.println("Electric Car name: " + electricCar.nameElectricCar + ", and price: " + electricCar.costElectricCar);
		
		System.out.println("\n--------------------- Not Instantiating here: Drone, FlyingCar, Ferrari, HoverCar, Mercedes, Rocket, Taxi, Truck. But possible ------------------------\n");
		

		
		
		
		
		
		
	}

}
