package lec17_java_oop_abstraction;

public abstract class FlyingCar extends Ferrari {

	public void flyingFeature() {
		System.out.println("Flying feature of the flying Car");
	}

	public abstract void autoPilot(); // void type

}
