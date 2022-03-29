package lec17_java_oop_abstraction;

public class Mercedez extends SolarCar {
	public void mercedezInfo() {
		System.out.println("Invented in Germany");
	}

	@Override
	public void speed() {
		System.out.println("speed method From Solar Car Abstract class");
		
	}

	@Override
	public int cost() {
		int finalCost = 56000;
		System.out.println(finalCost);
		return finalCost;
	}


}
