package lec17_java_oop_abstraction;

public class Ferrari extends Mercedez implements Rocket{
	public void ferrariInfo() {
		System.out.println("Invented in Italy");
	}

	@Override
	public void expensive() {
		System.out.println("expensive method is from Rocket Interface");
		
	}

}
