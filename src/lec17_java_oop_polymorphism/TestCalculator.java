package lec17_java_oop_polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		System.out.println("\n-------- Land Calculator --------");
		LandCalculator lc = new LandCalculator();
		lc.landCalculator(34, 66, 21); // return type parameterized method -01 initialized
		lc.landCalculator(22, 87); // return type parameterized method -02 initialized
		lc.landCalculator(61, 76, "45"); // return type parameterized method -03 initialized
		lc.landCalculator(90, "2", 66); // return type parameterized method -04 initialized
		lc.landCalculator(2, 22, 56, 4); // final method -05 initialized
		LandCalculator.landCalculator(8, 4, 33, 6, 41); // static method -06 initialized
		lc.landCalculator(2, 10, 20, 40, 90, 80); // void type parameterized method -07 initialized
		lc.landCalculator(); // void type method -08initialized
		
		System.out.println("\n-------- Modern Calculator --------");
		ModernCalculator mc = new ModernCalculator();
		mc.landCalculator(34, 66, 21); // return type parameterized method -01 initialized
		mc.landCalculator(22, 87); // return type parameterized method -02 initialized
		mc.landCalculator(61, 76, "45"); // return type parameterized method -03 initialized
		mc.landCalculator(90, "2", 66);	// return type parameterized method -04 initialized
		mc.landCalculator(2, 10, 20, 40, 90, 80); // void type parameterized method -07 initialized
		mc.landCalculator(); // void type method -08 initialized
		

	}

}
