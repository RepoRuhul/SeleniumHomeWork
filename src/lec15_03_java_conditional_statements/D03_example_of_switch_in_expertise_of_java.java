package lec15_03_java_conditional_statements;

public class D03_example_of_switch_in_expertise_of_java {

public static void main(String[] args) {
		
		String myLevelOfJava = "Intermediate";

		switch (myLevelOfJava) {
		
		case "Beginner":
			System.out.println("I am at beginning");
			break;

		case "Intermediate":
			System.out.println("I am at Intermediate level");;
			break;

		case "Expert":
			System.out.println("I am an expert of Java");
			break;

		case "Excellent":
			System.out.println("I have a Java certification from Oracle");
			break;

		default:
			System.out.println("I am a drop out");
			break;
		}

	}

}
