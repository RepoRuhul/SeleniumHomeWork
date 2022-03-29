package lec16_java_oop_abstraction;

public abstract class SolarCar {
	
	public String nameString;
	public int cost;
	
	public SolarCar() {
		System.out.println("Can it be initialized?");
	}
	
	public abstract void speed();
	public abstract int cost();

}
