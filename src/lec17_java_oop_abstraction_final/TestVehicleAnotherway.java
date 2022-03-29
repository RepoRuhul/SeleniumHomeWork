package lec17_java_oop_abstraction_final;

// High level, just keep the code

public class TestVehicleAnotherway {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		
		Toyota toyota = new Toyota(); 
		toyota.toyotaInfo(); 
		toyota.start();
		toyota.stop();
		toyota.brake();
		toyota.battery();
		toyota.honk(); 
		toyota.price();
		
		System.out.println("\n--------------------- Interface Car ------------------------\n");	
		Car car = new Car() { // Instantiated by anonymous inner class Car
			
			@Override
			public String stop() {
				String m = "stop method from Car Interface";
				System.out.println(m);
				return m;
			}
			
			@Override
			public void start() {
				System.out.println("start method from Car Interface");
				
			}
			
			@Override
			public void brake() {
				System.out.println("brake method from Car Interface");
				
			}
		};
		car.honk();
		Car.gear();
		
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		ElectricCar electricCar = new ElectricCar() {
			
			@Override
			public void price() {
				System.out.println("price method From Electric Car Abstract class");
				
			}
		};
		electricCar.battery();
		
	}

}
